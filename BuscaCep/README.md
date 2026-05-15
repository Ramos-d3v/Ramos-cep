# 📍 Ramos-CEP - Consulta de Endereços em Java

Este projeto é uma aplicação de linha de comando (CLI) desenvolvida em Java para consulta de endereços brasileiros através do CEP, consumindo a API pública do [ViaCEP](https://viacep.com.br/).

## 🚀 Funcionalidades
- Validação de formato de CEP (8 dígitos numéricos).
- Consumo de API REST utilizando `HttpClient` nativo do Java.
- Conversão de JSON para objetos Java (Records) utilizando a biblioteca **Gson**.
- Tratamento de erros para CEPs inexistentes ou formatos inválidos.

## 🛠️ Tecnologias Utilizadas
- **Java 21** (ou superior)
- **Gson 2.14.0** (Google) para processamento de JSON.
- **HttpClient API** para requisições assíncronas/síncronas.

## 📂 Estrutura do Projeto
O projeto segue uma organização clara de responsabilidades:
- `br.com.ramoscep.models`: Contém o Record `Endereco` com anotações `@SerializedName`.
- `br.com.ramoscep.services`:
    - `ConsumoAPi`: Gerencia a conexão HTTP.
    - `ConverteDados`: Classe genérica para desserialização de JSON.
- `br.com.ramoscep.main`: Classe principal com a lógica de execução e interação com o usuário.

## 🔧 Como Executar
1. Certifique-se de ter o **JDK 21** instalado.
2. Adicione o JAR do **Gson 2.14.0** ao seu classpath (incluído na pasta de bibliotecas do projeto).
3. Compile e execute a classe `BuscaCepRamos.java`.

### Exemplo de Uso:
```text
iniciando o sistema...
Coloque o seu cep:
01001000

========CEP ENCONTRADO======= 
cep: 01001-000, 
rua: Praça da Sé, 
bairro: Sé, 
cidade: São Paulo