  
  class Teste { 
       public static void main(String[] args) {
       	
       	Casa house = new Casa();
       	
       	house.pinta("Amarela");
       	house.porta1.abre();
       	house.porta2.fecha();
       	house.porta3.abre();
       	
       	System.out.println();
       	System.out.println("Cor:" + house.cor);
       	System.out.println("Portas abertas:" + house.quantasPortasEstaoAbertas());
       }
}
