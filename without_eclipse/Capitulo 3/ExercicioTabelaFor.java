  
  class ExercicioTabelaFor {
        public static void main(String[] args) {
		
		int resultado = 0;
            	for(int i = 1; i<=4; i++){
            		for(int j = 1; j <= i; j++){
            			
            			resultado = i * j;
            			System.out.print(resultado + " ");
            			
            		}
            		System.out.println();
            	}
        }
    }
