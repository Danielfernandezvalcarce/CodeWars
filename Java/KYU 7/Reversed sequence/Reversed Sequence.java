import java.util.ArrayList;
public class Sequence{

  public static int[] reverse(int n){
    //your code
    int[] numeros = new int[n];
    int m = n;
    numeros[0]=n;
    
    for(int i = 1; i < n; i++){
      m = m-1;
      numeros[i]= m;
    }
    return numeros;
  }

}