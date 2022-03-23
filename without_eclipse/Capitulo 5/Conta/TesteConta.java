  
  class TesteConta { 
       public static void main(String[] args) {
       
       	Conta minhaConta = new Conta();
       	minhaConta.setNumero(1234);
       	minhaConta.setTitular("Renan");
       	minhaConta.setAgencia("4321");
       	minhaConta.setSaldo(1000.00); //Não faz sentido
       	
       	Data data = new Data(15, 03, 2021);
    		minhaConta.setDataDeAbertura(data);
       	
       	minhaConta.saca(200.00);
       	System.out.println(minhaConta.recuperaDadosParaImpressao());
       	System.out.println();
       	
       	minhaConta.deposita(600.00);
       	System.out.println(minhaConta.recuperaDadosParaImpressao());
       	System.out.println();
       	
       	minhaConta.getRendimento();
       	System.out.println(minhaConta.recuperaDadosParaImpressao());
       	
       }
}
