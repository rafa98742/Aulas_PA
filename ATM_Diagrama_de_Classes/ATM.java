package atm;

public class ATM {

    public static void main(String[] args) {
        // O Scanner tem que ser exatamente igual o nome da sua classe criada
        sistema conta = new sistema (2007,"Rafael");// Aqui vc ira colocar aquele metodo da classe onde vc colocou (INT numero, String Nome)
        conta.Depositar(200);// depois que vc deu o nome do seu Scanner vc sempre ira chamar com (nome_colocado + . ) para chamar seus metodos
        conta.Sacar(50);
        conta.Exibir();
    }
    
}
