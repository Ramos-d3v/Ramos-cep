package br.com.ramoscep.models;

import com.google.gson.annotations.SerializedName;


public record Endereco(String cep,
                       @SerializedName("logradouro")
                       String rua,
                       String complemento,
                       String bairro,
                       @SerializedName("localidade")
                       String cidade,
                       String uf,
                       String estado) {

    @Override
    public String toString() {
        return "========CEP ENCONTRADO======= "
                + "\ncep: " + cep +
                ", \nrua: " + rua +
                ", \ncomplemento: " + complemento +
                ", \nbairro: " + bairro +
                ", \ncidade: " + cidade;
    }
}
