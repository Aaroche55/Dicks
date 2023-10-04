package com.dicks;


  

class Functions{

  public static int add(int lhs, int rhs){
    return lhs + rhs;
  }

  public static int sub(int lhs, int rhs){
    return lhs - rhs;
  }

  public static int mul(int lhs, int rhs){
    return lhs * rhs;
  }

  public static int div(int lhs, int rhs){
    return lhs / rhs;
  }

  public static int fact(int n){
    if(n == 0 || n == 1) return 1;
    return n * fact(n - 1);
  }



  public static int arg_count(char op){
    switch(op){
      case '-':
      case '*':
      case '/':
      case '+': return 2;
      case '!': return 1;
    }
  }


  public static int result(char op, int[] args){
    switch(op){
      case '-': return sub(args[0], args[1]);
      case '+': return add(args[0], args[1]);
      case '/': return div(args[0], args[1]);
      case '*': return mul(args[0], args[1]);
      case '!': return fact(args[0]);
    }
  }
}

