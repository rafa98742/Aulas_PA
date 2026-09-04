package herança;

public class Aluno extends Pessoa {
    // variavel privada/Particular
    private String Matricula;
    //classe para Herdar o nome e a idade da Classe Pessoa e adicionando a Matricula
    public Aluno(
    String nome,
    int idade,
    String Matricula){
        //Chama conecta as variaveeis da classe Pessoa
        super(nome, idade);
        this.Matricula = Matricula;
    }
    //Classe para retornar a matricula para o usuario
    public String getMatricula(){
        return Matricula;
    }
    // Classe para mostrar quando chamar Aprender O nome do aluno mais o que esta fazendo
    public void Aprender(){
        System.out.println(getNome()+ " Esta aprendendo");
    }
    public void ApresentarAluno(){
        Apresentar();
        System.out.println("Matricula: " + Matricula);
    }
}