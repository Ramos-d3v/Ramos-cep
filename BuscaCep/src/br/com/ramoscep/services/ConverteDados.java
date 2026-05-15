package br.com.ramoscep.services;

import br.com.ramoscep.models.Endereco;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class ConverteDados {
    Gson gson = new Gson();

    public <T> T obterDados(String json, Class<T> classe){
        try{
            return gson.fromJson(json, classe);
        } catch (JsonSyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
