
package automovel;
// Classe Filha que herda da classe Veiculo e adiciona atributos específicos para motos
public class Moto extends Veiculo{ // Extends é usado para herdar a classe Veiculo e adicionar atributos específicos para motos
    private int Cilindradas; // (-) Atributo privado: guardo o valor inserido da Cilindradas (int)
    private String Tipo; // (-) Atributo privado: guardo o Nome de texto (String)
    
    // (+) Publico: Aqui é onde tem que colocar e ira aparecer no Scanner e é Obrigatorio ter o mesmo nome da classe que ira trabalhar e as Variaveis que foram criadas na classe Moto e heradadas da classe Veiculo
     public Moto(String Marca,String Modelo, double Tanque,
            String cor, int Ano,int Cilindradas,String Tipo ){
        super(Marca, Modelo, Tanque, cor, Ano);// Super é usado para chamar a classe Veiculo e herdar os atributos dela
        // This significa que eu estou trabalhando com apenas essa variavel para não se misturar com as outras
        this.Cilindradas = Cilindradas ;
        this.Tipo = Tipo;
     }
     public int getCilindradas(){// (+) Publico: Metodo de culsulta Ira mostra a quantidade de cilindradas da moto do usuario quando for pedido
        // Return é usado para volta para o usuario a variavel Cilindradas da moto
        return Cilindradas;
    }
     public String getTipo(){
        return Tipo;
    }
     public void AbastecerMoto(double incremento) {//(+) Publico: Metodo que ira abastecer a moto
        System.out.println("Abastecendo moto com " + incremento + " litros."); // Recebe quanto a quantidade de litros deve aumentar, e soma ao valor atual.
    }
     public String InfoMoto(){// (+) Publico: Metodo de culsulta Ira mostra as informações da moto do usuario quando for pedido
           return super.Info() + ", Cilindradas: " + Cilindradas + ", Tipo: " + Tipo;
    }
}
