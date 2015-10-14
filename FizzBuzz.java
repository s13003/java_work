import java.util.Scanner;

  /**
   * FizzBuzzを実行するクラス
   * @author Daiki GIMA
   */

class FizzBuzz{

  static final int fizz = 3;
  static final int buzz = 5;

  static final String Fizz = "Fizz";
  static final String Buzz = "Buzz";

  static final int Count = 100;

  static void FB(){
    for(int i = 0; i <= Count; i++){
      if(i % fizz == 0 && i % buzz == 0){
        System.out.println(Fizz + Buzz);
      }else if(i % buzz == 0){
        System.out.println(Buzz);
      }else if(i % fizz == 0){
        System.out.println(Fizz);
      }else{
        System.out.println(i);
      }
    }
  }
  public static void main(String...args){
    FB();
  }
}
