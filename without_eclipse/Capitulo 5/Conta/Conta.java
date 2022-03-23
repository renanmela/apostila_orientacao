  
  public class Conta {
    
    private int identificador;
    private static int proximoIdentificador;
    private static int totalDeContas;
    
    private int numero;
    private String titular;
    private String agencia;
    private double saldo;
    private double limite;
    Data dataAbertura;
    
    Conta() {
        this.identificador = proximoIdentificador++;
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }
    
    Conta(String novoTitular) {
        this.titular = novoTitular;
        this.identificador = proximoIdentificador++;
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }
    
    public void saca(double valor) {
        //posso sacar até saldo
        if (valor > this.saldo){ 
            System.out.println("Inválido! Valor maior do que o saldo!");
        } else {
            this.saldo = this.saldo - valor;
        }
    }	
    
    public void deposita(double valor) {
        //posso sacar até saldo
        this.saldo = this.saldo + valor;
    }
    
    public void getRendimento() {
        //posso sacar até saldo
        this.saldo = this.saldo + (this.saldo * 0.1);
    }
    
    public double getIdentificador() {
        return this.identificador;
    }
    
    public static int getTotalDeContas() {
    return Conta.totalDeContas;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public int getNumero(int numero) {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setDataDeAbertura(Data data) {
        this.dataAbertura = data;
    }
    
    String recuperaDadosParaImpressao(){
       return "Numero: " + this.numero + 
       "\nNome do Titular: " + this.titular + 
       "\nAgencia: " + this.agencia + 
       "\nSaldo: " + this.saldo +
       "\nData: " + this.dataAbertura.formatada();
       }
}

