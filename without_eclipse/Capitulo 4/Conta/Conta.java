  
  class Conta {
        
       int numero;
       String titular;
       String agencia;
       double saldo;
       Data dataAbertura;
       
       void sacar(double quantidade){
       	this.saldo = this.saldo - quantidade;
       }
       
       void depositar(double quantidade){
       	this.saldo = this.saldo + quantidade; 
       }
       
       double calculaRendimento(){
       return this.saldo = this.saldo + (this.saldo * 0.1); 
       }
       
       String recuperaDadosParaImpressao(){
       return "Numero: " + this.numero + 
       "\nNome do Titular: " + this.titular + 
       "\nAgencia: " + this.agencia + 
       "\nSaldo: " + this.saldo +
       "\nData: " + this.dataAbertura.formatada();
       }
}
