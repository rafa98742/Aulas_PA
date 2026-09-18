package sistemadecomandas;

public class Comanda {
    private int ID;
    private int NumeroComanda;
    private Itens[]ItemConsumacao;
    
    public Comanda(int ID){
        this.ID = ID;
        this.NumeroComanda = NumeroComanda;
        this.ItemConsumacao = new Itens[0];
    }
    public int getID(){
        return ID;
    }
    public void adicionarItem(Itens ItemConsumacao){
        Itens[] novoArray = new Itens[this.ItemConsumacao.length + 1];
        
        for(int i = 0; i < this.ItemConsumacao.length; i ++){
            novoArray[i] = this.ItemConsumacao[i];
        }
        novoArray[novoArray.length - 1] = ItemConsumacao;
        this.ItemConsumacao = novoArray;
    }
    public int getNumeroComanda(){
        return NumeroComanda;
    }
    public double CalcularTotalComanda(){
        double total = 0;
        for(int i = 0; i < ItemConsumacao.length; i++){
            total = ItemConsumacao[i]getSubTotal();
        }
        return total;
    }
    public int getNumerocomanda(){
       return NumeroComanda; 
    }
    public Itens[] getItemConsumacao(){
        return ItemConsumacao;
    }
}