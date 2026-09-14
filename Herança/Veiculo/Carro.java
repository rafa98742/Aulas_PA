
package automovel;
// Classe Filha que herda da classe Veiculo e adiciona atributos específicos para carros
public class carro extends Veiculo { // Extends é usado para herdar a classe Veiculo e adicionar atributos específicos para carros
    private String Portas; // (-) Atributo privado: guardo o Nome de texto (String)
    private String Tipo_Conbustivel;// (-) Atributo privado: guardo o Nome de texto (String)
    
    // (+) Publico: Aqui é onde tem que colocar e ira aparecer no Scanner e é Obrigatorio ter o mesmo nome da classe que ira trabalhar e as Variaveis que foram criadas na classe carro e heradadas da classe Veiculo
    public carro(String Marca,String Modelo, double Tanque,
            String cor, int Ano,String Portas, String Tipo_Conbustivel){
        super(Marca, Modelo, Tanque, cor, Ano); // Super é usado para chamar a classe Veiculo e herdar os atributos dela
        this.Portas = Portas; // This significa que eu estou trabalhando com apenas essa variavel para não se misturar com as outras
        this.Tipo_Conbustivel = Tipo_Conbustivel;
    }    
    public String getPortas(){// (+) Publico: Metodo de culsulta Ira mostra a quantidade de portas do carro do usuario quando for pedido
        // Return é usado para volta para o usuario a variavel Portas do carro
        return Portas;
    }
     public String getTipoC(){
        return Tipo_Conbustivel;
    }
     public void AbastecerCarro(double incremento) {//(+) Publico: Metodo que ira abastecer o carro
        System.out.println("Abastecendo carro com " + incremento + " litros."); // Recebe quanto a quantidade de litros deve aumentar, e soma ao valor atual.
    }
     public String Info(){ // (+) Publico: Metodo de culsulta Ira mostra as informações do carro do usuario quando for pedido
        return super.Info() + ", Portas: " + Portas + ", TipoCombustivel: " + Tipo_Conbustivel; // Retorna as informações do carro, incluindo as informações herdadas da classe Veiculo e os atributos específicos do carro
    }
}
