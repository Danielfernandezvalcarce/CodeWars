const quarterOf = (month) => {
    // Your code here
    var quarter = 0;
    
    if(month >= 1 && month <= 3){
      quarter = 1;
    }else if(month >= 4 && month <= 6){
      quarter = 2;
    }else if(month >= 7 && month <= 9){
      quarter = 3;
    }else if(month >= 9 && month <= 12){
      quarter = 4;
    }
      return quarter;
  }