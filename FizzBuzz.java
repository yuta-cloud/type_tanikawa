class Main {

  public static void main(String args[]) {
    for (int i = 1; i <= 100; i++) {
      String str = "";

      // ここから記述
      
      if(i % 15 == 0){
          str = "FizzBuzz";
      }else if(i % 3 == 0){
          str = "Fizz";
      }else if(i % 5 == 0){
          str = "Buzz";
      }else{
          //String型に変換
          Integer num = Integer.valueOf(i);
          str = num.toString();
      }

      // ここまで記述

      System.out.println(str);
    }
  }
}
