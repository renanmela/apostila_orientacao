  
  class ExercicioFibonacci {
        public static void main(String[] args) {
		
            	System.out.println("Fibonacci até 100");
            	int fibonacci = 1;
            	int anterior = 0;
	    	for(;fibonacci<=100;){	
            		fibonacci += anterior;
            		anterior = fibonacci - anterior;
            		System.out.println(fibonacci);
            	}
        }
    }
