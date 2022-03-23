  
  class TesteConta2 { 
       public static void main(String[] args) {

    		Conta c2 = new Conta();     
    		c2.titular = "Danilo";
    		c2.saldo = 100;
    		
    		Conta c1 = new Conta();
    		c1.titular = "Hugo";
    		c1.saldo = 100;

    		c2 = c1;

    		if (c1 == c2) { //compara a referencia do objeto
        		System.out.println("iguais");
    		} else {
        		System.out.println("diferentes");       
    		}
    		
    		Data data = new Data();
    		data.dia = 15;
       	data.mes = 06;
       	data.ano = 2021;
    		c1.dataAbertura = data;
       	
       }
}
