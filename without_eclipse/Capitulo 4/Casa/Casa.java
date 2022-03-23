  
  class Casa {
        
       String cor;
       Porta porta1 = new Porta();
       Porta porta2 = new Porta();
       Porta porta3 = new Porta();
       
       void pinta(String novaCor){
          this.cor = novaCor;
       }
       
       int quantasPortasEstaoAbertas(){
          int contador = 0;
          if(porta1.estaAberta() == true ){
             contador++;
          }
          if(porta2.estaAberta() == true){
             contador++;
          }
          if(porta3.estaAberta() == true){
             contador++;
          }
          return contador;
       }
       
  }

