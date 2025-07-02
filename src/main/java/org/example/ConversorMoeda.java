package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoeda {
    private static final String API_KEY = "7e227b51666db25dd5244e14";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public ConversorMoeda(String de, String para, double valor) {
    }

    public static double converter(String de, String para, double valor) {
        URI endereco = URI.create(BASE_URL + API_KEY + "/pair/" + de + "/" + para);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            JsonObject json = gson.fromJson(response.body(), JsonObject.class);

            if (json.has("conversion_rate")) {
                double taxa = json.get("conversion_rate").getAsDouble();
                return valor * taxa;
            } else {
                System.out.println("Erro: resposta da API não contém 'conversion_rate'");
                return -1;
            }
        } catch (Exception e) {
            System.out.println("Erro ao converter moeda: " + e.getMessage());
            return -1;
        }
    }
}
