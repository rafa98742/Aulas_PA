//Isso é o modelo
package poocarro;
 
public class Carro {
    //Atributos/objetos do carro
    String Marca;
    String Modelo;
    int Ano;
    double velocidadeAtual = 0;
    boolean motorLigado = false;
    
    void Acelerar(){
        //Ação do carro
        System.out.println("Estamos Acelerando o carro!");
        
    }
    // Chamando as Informação do objeto, Objeto/carro01
    void exibirInfo(){
        System.out.println("Marca:" + Marca + " Modelo:" + Modelo + " Ano:" + Ano);
    }
    
}
