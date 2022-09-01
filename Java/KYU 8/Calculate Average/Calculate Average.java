public class Kata{
    public static double find_average(int[] array){
      double suma = 0;
      double contador = 0;
      
      for (int i=0; i<array.length; i++){
        suma = suma + array[i];
        contador = contador + 1;
      }
      return suma/contador;
    }
  }