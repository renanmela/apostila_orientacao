  
  class Fibonacci {
       
       int calculaFibonacci(int vezes){
           int fibonacci = 0;
           int anterior = 0;
           for(int i = 0; i < vezes; i++){
              fibonacci += anterior;
              anterior = fibonacci - anterior;
              if(fibonacci == 0){
              fibonacci++;
              }
              
           }
           return fibonacci;
       }
       
       public static int calculaFibonacci2(int n) {
           return (n <= 2) ? 1 : calculaFibonacci(n-1) + calculaFibonacci(n-2);
  }
}
