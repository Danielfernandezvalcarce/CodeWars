public class BitCounting {

    public static int countBits(int n){
      // Show me the code!
      int contador = 0;
      
      String toBinary = Integer.toBinaryString(n);
      
      for(int i=0; i<toBinary.length(); i++){
        if(toBinary.charAt(i) == '1'){
          contador = contador + 1;
        }
      }
      return contador;
    }
    
  }