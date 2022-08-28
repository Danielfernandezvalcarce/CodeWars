public class Kata {
  
    public static String rpsls(String player1, String player2){
      // Your code here!
      String resultado = "";
      if(player1.equals(player2)){
        resultado = "Draw!";
      }else if(player1.equals("rock") && 
               player2.equals("scissors")){
        resultado = "Player 1 Won!";
      }else if(player1.equals("rock") && 
                player2.equals("lizard")){
        resultado = "Player 1 Won!";
      }else if(player1.equals("paper") && 
               player2.equals("spock")){
        resultado = "Player 1 Won!";
      }else if(player1.equals("paper") && 
                player2.equals("rock")){
        resultado = "Player 1 Won!";
      }else if(player1.equals("scissors") &&
              player2.equals("paper")){
        resultado = "Player 1 Won!";
      }else if(player1.equals("scissors") &&
              player2.equals("lizard")){
        resultado = "Player 1 Won!";
      }else if(player1.equals("spock") && 
              player2.equals("rock")){
        resultado = "Player 1 Won!";
      }else if(player1.equals("spock") && 
              player2.equals("scissors")){
        resultado = "Player 1 Won!";
      }else if(player1.equals("lizard") && 
              player2.equals("paper")){
        resultado = "Player 1 Won!";
      }else if(player1.equals("lizard") && 
              player2.equals("spock")){
        resultado = "Player 1 Won!";
      }else{
        resultado = "Player 2 Won!";
      }
      
      return resultado;
    }
  }