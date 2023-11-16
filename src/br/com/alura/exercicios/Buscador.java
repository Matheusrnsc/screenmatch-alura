package br.com.alura.exercicios;

import com.google.gson.Gson;
import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Buscador {
    private int cep;

    public Buscador() throws IOException, InterruptedException {
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getCep() {
        return cep;
    }

    public String botaCep(Integer cep) {
        return "https://viacep.com.br/ws/" + getCep() + "/json/";
    }

    public Endereco voltaCep() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(this.botaCep(this.getCep())))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        // conversão do resposnse para json
        return new Gson().fromJson(response.body(), Endereco.class);
    }
}

