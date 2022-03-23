  
  class TesteConta { 
       public static void main(String[] args) {
       
       	Conta minhaConta = new Conta();
       	minhaConta.numero = 1234;
       	minhaConta.titular = "Renan";
       	minhaConta.agencia = "4321";
       	minhaConta.saldo = 1000.00; //Não faz sentido
       	
       	Data data = new Data();
       	data.dia = 15;
       	data.mes = 06;
       	data.ano = 2021;
    		minhaConta.dataAbertura = data;
       	
       	minhaConta.sacar(200.00);
       	System.out.println(minhaConta.recuperaDadosParaImpressao());
       	System.out.println();
       	
       	minhaConta.depositar(600.00);
       	System.out.println(minhaConta.recuperaDadosParaImpressao());
       	System.out.println();
       	
       	minhaConta.calculaRendimento();
       	System.out.println(minhaConta.recuperaDadosParaImpressao());
       	
       }
}
