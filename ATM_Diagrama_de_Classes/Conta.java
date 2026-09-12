
package atm;

public class sistema {
// private é quando vc deseja fazer dessa varivel privada para os usuario ela só é chamada quando do usuario desejar    
private int Numero; //(-) Atributo privado: guarda o numero inteiro (INT)
private double saldo; //(-) Atributo privado: guarda o saldo de numero quebrado (Double)
private String Nome;// (-) Atributo privado: guardo o Nome de texto (String)
// Logica do deposito do usuario
public void Depositar(double valor){//(+) Publico: Metodo publico recebe o valor a depositar e não retorna
    // Se o valor for menor ou igual a 0
    if (valor <= 0){
        // Ira Retornar esta mensagem para o Usuario
        System.out.println("valor do deposito Invalido");
        // Se não, Retornara isto para o Usuario
    }else{
        // Logica de Deposito Saldo ira receber Ele mais o valor Depositado
        saldo = saldo + valor;
        System.out.println("valor depositado com sucesso");
    }
}
public sistema(int Numero, String Nome){// (+) Publico: Aqui é onde tem que colocar e ira aparecer no Scanner e é Obrigatorio ter o mesmo nome da classe que ira trabalhar
    System.out.println("O Numero da sua conta é: " + Numero);
    // This significa que eu estou trabalhando com apenas essa variavel para não se misturar com as outras
    // Ela sempre vira Receber Ela, que significa o que o usuaria digitar
    this.Numero = Numero;
    System.out.println("Nome do Usuario: " +  Nome);
    this.Nome = Nome;
}
public boolean Sacar(double valor){//(+) Publico: Metodo do verdadeiro ou falso (Boolean) dentro dele a variavel que o usuario ira digitar
    // Se valor que o usuario digitar for Menor (>) do que o saldo da conta 
    if(valor > saldo){
        // retornara essa mensagem
        System.out.println("Saque Invalido");
        // e Sera falsa por causa do (Boolean)
        return false;
        // Se não Ira retorna isso para o usuario
    }else{
        // Logica de Saque,saldo da conta ira receber Ele Menos o valor que usuario digitar
        saldo = saldo - valor;
        System.out.println("Saque realizado com Sucesso");
        // E Sera Verdadira Essa codição
        return true;
    }   
}
public double Consulta(){//(+) Publico: Metodo de culsulta Ira mostra o saldo da conta do usuario quando for pedido
    // Return é usado para volta para o usuario a variavel saldo da conta
    return saldo;
}
public void Exibir(){//(+) Metodo que exibi os dados da conta da Pessoa 
    // Mensagens que Apareceram para o usuario quando chamar seus dados
    System.out.println("O Numero da sua conta é: " + Numero);
    System.out.println("Nome do Usuario: " +  Nome);
    System.out.println("O valor atual é de: " + saldo);
}
}