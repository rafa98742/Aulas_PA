
package poocarro;

public class POOCarro {

    public static void main(String[] args) {
        // Vamos Utilizar o Carro
        Carro carro01 = new Carro();
        // Estamos Instanciando o Carro colocando o new
        carro01.Marca = "VW";
        carro01.Modelo = "Fusca";
        carro01.Ano = 1964;
        carro01.Acelerar();
        carro01.exibirInfo();
        //Colocando o . vc esta os Atributos criado anteriormente
        Carro carro02 = new Carro();
        // Criamos outra Instancia Para outro Objeto
        carro02.Marca = "Fiat";
        carro02.Modelo = "Uno";
        carro02.Ano = 1985;
        carro02.exibirInfo();
    }
    
}
