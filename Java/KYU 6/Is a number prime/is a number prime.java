public class Prime {
    public static boolean isPrime(int num) {
      
      boolean prime = false;
      int contador = 0;
      int i = 1;
      
      while(num%2 != 0 && i<=num && contador < 3){
        if(num%i == 0){
          contador = contador + 1;
        }
        i = i + 1;
      }
      if(contador == 2 || num == 2){
        prime = true;
      }
      
      return prime;
    }
  }