public class Cliente {

    private String nome;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) throws Exception {
        if (idade < 18) {
            throw new Exception("Cliente não pode ser menor de idade");
        }
        this.idade = idade;
    }
}
