package herança;

public class Professor extends Pessoa {
    private  String Materia;
    
    public Professor(
    String nome,
    int idade,
    String Materia){
        super(nome, idade);
        this.Materia = Materia;
    }
    public String getMateria(){
        return Materia;
    }
    public void Ensinar(){
        System.out.println(getNome()+" Esta Ensinando");
    }
    public void ApresentarProf(){
        Apresentar();
        System.out.println("Materia: " + Materia);
    }
}
