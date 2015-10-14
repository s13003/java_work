package j1.lesson02;

import java.util.Scanner;

class Kaijou{
  static void Kaijou(int x){

    int temp = x;

    for(int i = x; i > 1; i--){
      temp *= i-1;
    }
    System.out.println(x + "の階乗は" + temp);
  }

  public static void main(String...args){
    Scanner stdIn = new Scanner(System.in);
    System.out.print("何の階乗を求めるか値を入力してください:");
    int Count = stdIn.nextInt();
    Kaijou(Count);
  }
}
