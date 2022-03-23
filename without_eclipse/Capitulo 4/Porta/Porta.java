  
  class Porta {
        
       boolean aberta;
       String cor;
       double dimensaoX;
       double dimensaoY;
       double dimensaoZ;
       
       void abre(){
          this.aberta = true;
       }
       
       void fecha(){
          this.aberta = false;
       }
       
       void pinta(String novaCor){
          this.cor = novaCor;
       }
       
       boolean estaAberta(){
          if(aberta == false){
             return false;
          }else return true;
       }
       
       String imprimePorta(){
       return "Aberta: " + estaAberta() + 
       "\nCor: " + this.cor + 
       "\nDimensões: X:" + this.dimensaoX + ", Y:" + this.dimensaoY + ", Z:" 	+ this.dimensaoZ;
       }
  }

