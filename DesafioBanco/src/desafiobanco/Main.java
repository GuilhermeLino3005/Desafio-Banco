package desafiobanco;
public class Main {
     public static void main(String[] args) {
          Cliente guilherme = new Cliente();
          guilherme.setNome("Guilherme");

          Conta corrente = new ContaCorrente(guilherme);
          corrente.depositar(100);
          
          Conta poupanca = new ContaPoupanca(guilherme);
          poupanca.depositar(100);
         
          corrente.imprimirExtrato();
          poupanca.imprimirExtrato();

          corrente.transferir(100, poupanca);
          
          corrente.imprimirExtrato();
          poupanca.imprimirExtrato();


     }
}
