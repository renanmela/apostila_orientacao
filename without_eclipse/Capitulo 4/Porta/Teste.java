  
  class Teste { 
       public static void main(String[] args) {
       
       	Porta porta = new Porta();
       	porta.pinta("Azul");
       	porta.dimensaoX = 0.80;
       	porta.dimensaoY = 2.00;
       	porta.dimensaoZ = 0.10;
       	
       	porta.abre();
       	
       	System.out.println(porta.imprimePorta());
       	System.out.println();
       	
       	porta.pinta("Marrom");
       	porta.dimensaoY = 1.90;
       	porta.dimensaoZ = 0.15;
       	
       	porta.fecha();
       	
       	System.out.println(porta.imprimePorta());
       }
}
