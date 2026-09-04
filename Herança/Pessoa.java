package herança;

public class Pessoa {
    //Criação das variaveis Privadas
    private String nome;
    private int idade;
    //classe para chamer e Referenciar o nome a idade
    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    // classe para retornar para o usuario o nome 
    public String getNome(){
        return nome;
    }
    //classe para retornar a Idade Para o usuario
    public int getIdade (){
        return idade;
        
    }
    //Classe para Mostrar na tela Para pessoa 
    public void Apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    
}