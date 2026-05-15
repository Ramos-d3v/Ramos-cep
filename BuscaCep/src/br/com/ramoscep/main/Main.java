package br.com.ramoscep.main;

import br.com.ramoscep.models.Endereco;
import br.com.ramoscep.services.ConsumoAPi;
import br.com.ramoscep.services.ConverteDados;
import com.google.gson.Gson;

import java.util.Scanner;

public class Main {

    private final Scanner input = new Scanner(System.in);
    private final ConsumoAPi consumo = new ConsumoAPi();
    private final Gson gson = new Gson();
    private final ConverteDados conversor = new ConverteDados();

    public void run(){
        System.out.println("iniciando o sistema...");

        System.out.println("Coloque o seu cep");
        String cep = input.nextLine();

        if (!cep.matches("[0-9]{8}")){
            System.out.println("cep inválido");
            input.close();
            System.out.println("Finalizando o sistema...");
        }



        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        String json = consumo.obterDados(url);
        System.out.println(json);

        Endereco endereco = conversor.obterDados(json, Endereco.class);

        if (endereco.erro()){
            System.out.println("cep não encontrado");
            input.close();
            System.out.println("Finalizando o sistema...");
            return;
        }


        System.out.println(endereco.toString());

        input.close();
        System.out.println("Finalizando o sistema...");
    }
}
