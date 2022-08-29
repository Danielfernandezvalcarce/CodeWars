class Solution {
    public static String whoLikesIt(String... names) {
      String fin = "";
      int tamaño = names.length;
      String t = String.valueOf(tamaño-2);
      
      if(tamaño == 0){
        fin = "no one likes this";
      }else if(tamaño == 1){
        fin = names[0] + " likes this";
      }else if(tamaño == 2){
        fin = names[0] + " and " + names[1] + " like this";
      }else if(tamaño == 3){
        fin = names[0] + ", " + names[1] + " and " + names[2] + " like this";
      }else{
        fin = names[0] + ", " + names[1] + " and " + t + " others like this";
      }
      
        return fin;
    }
}
