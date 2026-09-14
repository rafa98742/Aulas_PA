
package automovel;
// Classe pai que as outras classes irão heradar por serem Automoveis
public class Veiculo {
    // variaveis que serão utilizadas nas classes filhas e estão privadas 
    private String Marca; // (-) Atributo privado: guardo o Nome de texto (String)
    private String Modelo; // (-) Atributo privado: guardo o Nome de texto (String)
    private double Tanque; // (-) Atributo privado: guarda o valor inserido do Tanque (double)
    private String cor; // (-) Atributo privado: guardo o Nome de texto (String)
    private int Ano; // (-) Atributo privado: guarda o ano do veiculo (int)
    private double Velocidade = 0; // (-) Atributo privado: guarda o valor inserido da Velocidade (double)
    boolean motorLigado = false; // (-) Atributo privado: Se o motor está ligado verdadeiro ou falso (boolean)
    
    // (+) Publico: Aqui é onde tem que colocar e ira aparecer no Scanner e é Obrigatorio ter o mesmo nome da classe que ira trabalhar
    public Veiculo (String Marca,String Modelo, double Tanque,
            String cor, int Ano){
        // This significa que eu estou trabalhando com apenas essa variavel para não se misturar com as outras
        // Ela sempre vira Receber Ela, que significa o que o usuaria digitar
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Tanque = Tanque;
        this.cor = cor;
        this.Ano = Ano;
    }
    public String getMarca(){//(+) Publico: Metodo de culsulta Ira mostra a marca do veiculo do usuario quando for pedido
    // Return é usado para volta para o usuario a variavel marca do veiculo
        return Marca;
    }
    public String getModelo(){
        return Modelo;
    }
    public double getTanque(){
        return Tanque;
    }
    public String getcor(){
        return cor;
    }
    public int getAno(){
        return Ano;
    }
    public double getVelocidade(){
        return Velocidade;
    }
    public void acelerar(double incremento) {//(+) Publico: Metodo que ira acelerar o veiculo
        // Recebe quanto a velocidade deve aumentar, e soma ao valor atual.
        this.Velocidade = this.Velocidade + incremento;
        System.out.println("Acelerando... velocidade atual: " + this.Velocidade);
    }
    public String Info(){//(+) Publico: Metodo de culsulta Ira mostra as informações do veiculo do usuario quando for pedido
         return "Marca: " + Marca + ", Modelo: " + Modelo + ", Cor: " + cor + ", Ano: " + Ano; 
    }
    public void Apresentar(){//(+) Publico: Metodo que exibi os dados do veiculo da Pessoa
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Tanque: " + Tanque);
        System.out.println("cor: " + cor);
        System.out.println("Ano: " + Ano);
    }
}
