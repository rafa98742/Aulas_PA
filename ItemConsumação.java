
package sistemadecomandas;

public class ItemConsumação {
    private String Nome;
    private double Preço;
    private int quantidade;
    
    public void ItemConsumacao(String Nome,double Preço,int quantidade){
        this.Nome = Nome;
        this.Preço = Preço;
        this.quantidade = quantidade;
    }
    
    public String getNome(){
        return Nome;
    }
    public double getPreço(){
        return Preço;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public double getSubtotal(){
       return 
    }
}
