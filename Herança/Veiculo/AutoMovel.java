package automovel;
// Classe para Chamar as variaveis e Apresentar para o usuario
public class AutoMovel {

    public static void main(String[] args) {
        // Scanner com o nome da variavel da classe carro e chamando as variaveis que foram criadas na classe carro
       carro test = new carro("Toyota", "Corolla", 55.0, "Preto", 2023,"4 portas", "Flex"); // Vc tem que colocar o mesmo nome da classe que vc quer chamar e as variaveis que foram criadas na classe carro
       test.Apresentar(); // Chama o metodo Apresentar da classe carro e exibi as informações do carro para o usuario com o nome que vc colocou no escaner para representar o carro
       test.AbastecerCarro(20);
       test.getTanque();
       
        System.out.println("---------Test Moto---------");
        // Scanner com o nome da variavel da classe Moto e chamando as variaveis que foram criadas na classe Moto
        Moto Verif = new Moto ("Generica", "ModeloX", 50.0, "Prata", 2020, 20, "Etanol"); // Vc tem que colocar o mesmo nome da classe que vc quer chamar e as variaveis que foram criadas na classe Moto
        Verif.Apresentar();// Chama o metodo Apresentar da classe Moto e exibi as informações da Moto para o usuario com o nome que vc colocou no escaner para representar a Moto
        Verif.acelerar(20);
        Verif.getVelocidade();
    }
    
}
