public class Square {    
    public static boolean isSquare(int n) {   
      
      boolean resultado = false;
      
      if(n<0){
        resultado=false;
      }
      
      int i = 0;
      
      while(resultado == false && i<=n){
        if(i*i == n){
          resultado = true;
        }else{
          resultado = false;
          i++;
        }
      }     
      return resultado;
    }
}