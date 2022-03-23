  
  class Teste { 
       public static void main(String[] args) {
       
       	Pessoa rodrigo = new Pessoa();
       	rodrigo.idade = 19;
       	
       	System.out.println("Idade: " + rodrigo.idade);
       	
       	rodrigo.fazAniversario();
       	
       	System.out.println("Nova idade: " + rodrigo.idade);
       }
}
