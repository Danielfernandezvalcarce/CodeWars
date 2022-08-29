public class TenMinWalk {
    public static boolean isValid(char[] walk) {
      
      boolean valido = false;
        
        int x=0;
        int y=0;
        
      if(walk.length == 10){
        for(int i = 0; i<walk.length; i++){
          if(walk[i] == 'n'){
            y=y+1;
          }else if(walk[i] == 's'){
            y=y-1;
          }else if(walk[i] == 'e'){
            x=x+1;
          }else if(walk[i] == 'w'){
            x=x-1;
          }
        }
        if(x==0 && y==0){
          valido = true;
        }
      }    
      return valido;
    }
  }