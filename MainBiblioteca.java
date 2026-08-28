
package javaapplication4;

public class LivroBiblioteca {
    private String titulo;
    private String autor;
    private boolean disponivel = true;
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
    if(titulo!= null && !titulo.isEmpty()){
    this.titulo = titulo;
    }else{
      System.out.println("Titulo Invàlido");      
        }
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        if(autor!= null && !autor.isEmpty()){
        this.autor = autor;
        }else{
          System.out.println("Autor Invàlido");      
        }
    }
    
    public boolean estaDisponivel(){
        return disponivel;
    }
    
    public void PegarEmprestado(){
        if(disponivel){
            disponivel = false;
            System.out.println("Vôce pegou emprestado o livro: " + titulo);
        }else{
            System.out.println("O livro" + titulo + "Não está disponivel");
        }
    }
    
    public void deVolver(){
        if(!disponivel){
            disponivel = true;
            System.out.println("Voce devolveu o livro: " + titulo);
        }else{
            System.out.println("O livro: " + titulo + " já esta disponivel");
        }
    }
}