package com.codewars.hwtdstrngls;

public class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
    
    int correcto = 0;
    
    int division = number / 5;
    
    if(number%5 == 0){
      correcto = number;
    }else if(number >= 5){
      correcto = 5*(division+1);
    }else if(number>-5 && number<=0){
      correcto = 0;
    }else if(number<-5){
      correcto = 5*division;
    }else if(number>0 && number<5){
      correcto = 5;
    }
    
    return correcto;
  }
}