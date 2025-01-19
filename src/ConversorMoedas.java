import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ConversorMoedas {

    private static final String URL_API = "http://api.exchangerate.host/live?access_key=661ef57a2465c761f43fe09890eb72f8";


    public double realizarConversao(int opcao, double valor) {
        try {

            String json = buscarDadosApi();
            RespostaTaxas taxas = parseJson(json);


            if (!taxas.isSuccess()) {
                System.out.println("Erro: A API não retornou sucesso.");
                return -1;
            }


            double taxa = selecionarTaxa(opcao, taxas);

            if (taxa == 0) {
                return -1;
            }


            return valor * taxa;
        } catch (Exception e) {
            System.out.println("Erro ao processar a conversão: " + e.getMessage());
            return -1;
        }
    }


    private String buscarDadosApi() throws IOException, InterruptedException {
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(URL_API))
                .GET()
                .build();

        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
        System.out.println("JSON retornado pela API: " + resposta.body());
        return resposta.body();
    }


    private RespostaTaxas parseJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, RespostaTaxas.class);
    }


    private double selecionarTaxa(int opcao, RespostaTaxas taxas) {
        if (taxas == null || taxas.getQuotes() == null) {
            System.out.println("Erro: Dados da API estão nulos ou incompletos.");
            return 0;
        }

        switch (opcao) {
            case 1:
                return taxas.getQuotes().getOrDefault("USDBRL", 0.0);
            case 2:
                return 1 / taxas.getQuotes().getOrDefault("USDBRL", 1.0);
            case 3:
                return taxas.getQuotes().getOrDefault("USDARS", 0.0);
            case 4:
                return 1 / taxas.getQuotes().getOrDefault("USDARS", 1.0);
            case 5:
                return taxas.getQuotes().getOrDefault("USDCLP", 0.0);
            case 6:
                return 1 / taxas.getQuotes().getOrDefault("USDCLP", 1.0);
            default:
                return 0;
        }
    }
}
