
package sistemadecomandas;

public class Pedido {
    private int ID;
    private Comanda[]comanda;
    
    public int getID(){
        return ID;
    }
     public Comanda[] getComanda(){
         return comanda;
     }
   public void adicionarComanda(Comanda comanda){
        Comanda[] novoArray = new Comanda[this.comanda.length + 1];
        
        for(int i = 0; i < this.comanda.length; i ++){
            novoArray[i] = this.comanda[i];
        }
        novoArray[novoArray.length - 1] = comanda;
        this.comanda = novoArray;
        // arrume
    }
     
    public double Calcular_Total_Pedido(double Valor){
       
    }
}
