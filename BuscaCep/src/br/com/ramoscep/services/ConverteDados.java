package br.com.ramoscep.services;

import br.com.ramoscep.models.Endereco;
import com.google.gson.Gson;

public class ConverteDados {
    Gson gson = new Gson();

    public <T> T obterDados(String json, Class<T> classe){
        return gson.fromJson(json, classe);
    }
}
