package herança;

public class Herança {

    public static void main(String[] args) {
         Aluno aluno = new Aluno("Rafael",19,"Legal72");
         Professor professor = new Professor("Koro - Sensei",20,"Assassinato");
         aluno.Aprender();
         aluno.ApresentarAluno();
         
         System.out.println("");
         System.out.println("-----------------------------");
         System.out.println("");
         
         professor.Ensinar();
         professor.ApresentarProf();
    }
    
}
