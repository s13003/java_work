import java.util.Scanner;

class FizzBuzz{
  public static void main(String...args){
    Scanner stdIn = new Scanner(System.in);

    final int fizz = 3;
    final int buzz = 5;

    final String Fizz = "Fizz";
    final String Buzz = "Buzz";

    int Count = 100;
    for(int i = 0; i <= Count; i++){
      if(i % buzz == 0 && i % fizz == 0){
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
}
