package j1.lesson04;

import java.util.Scanner;

class ToZero{
  public static void main(String...args){
    /**
     * @author Daiki GIMA
     * @version 1.0
     * @param args 実行時引数。無視されます。
     *
     * 入力された値を0に近づかせながら出力するプログラムです。
     */

    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数を入力:");
    int x = stdIn.nextInt();
    if(x == 0){
      System.out.println(x);
    }else if(x < 0){
      for(int i = x; i <= 0; i++){
        System.out.println(i);
      }
    }else{
      for(int i = x; i >= 0; i--){
        System.out.println(i);
      }
    }
  }
}
