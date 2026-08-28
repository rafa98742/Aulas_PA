package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
        LivroBiblioteca livro01 = new LivroBiblioteca ();
        LivroBiblioteca livro02 = new LivroBiblioteca ();
        LivroBiblioteca livro03 = new LivroBiblioteca ();
        
        livro01.setTitulo("Memorias postumas de Brascubas");
        System.out.println(livro01.getTitulo());
        livro01.setAutor("Marchado de Assis");
        System.out.println(livro01.getAutor());
        
        livro02.setTitulo("Sitio do pica-pau Amarelo");
        System.out.println(livro02.getTitulo());
        livro02.setAutor("Monteiro Lobato");
        System.out.println(livro02.getAutor());
        
        livro03.setTitulo("Vidas Secas");
        System.out.println(livro03.getTitulo());
        livro03.setAutor("Graciliano Ramos");
        System.out.println(livro03.getAutor());   
        
        System.out.println(livro01.estaDisponivel());
        livro01.PegarEmprestado();
        System.out.println(livro01.estaDisponivel());
        livro01.deVolver();
        System.out.println(livro01.estaDisponivel());
    }
    
}