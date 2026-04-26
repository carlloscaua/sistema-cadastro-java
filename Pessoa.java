public class Pessoa {
    
    String nome;
    int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void exibir(){
        System.out.println("Nome: " + nome + "Idade: " + idade);
    }
    
}
