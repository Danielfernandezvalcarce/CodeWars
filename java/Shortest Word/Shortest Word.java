public class Kata {
    public static int findShort(String s) {
      int c = 0;
      int l = s.length();
      s = s + " ";
      
      for (int i=0; i<s.length(); i++){
          if(s.charAt(i) != ' '){
            c = c +1;
          }else{
            if(c<l){
              l = c;
            }else{
              c = 0;
            }
          }
      }
      return l;
      
    }
}