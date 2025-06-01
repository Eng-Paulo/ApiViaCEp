
public record Endereco(String cep, String logradouro, String complemento,
                       String bairro, String localidade, String uf) {
    @Override
    public String toString() {
        return String.format(
                "Logradouro= %s, Bairro= %s, Localidade= %s, UF= %s, Cep= %s, Complemento= %s",
                logradouro, bairro, localidade, uf, cep, complemento
        );
    }
}


