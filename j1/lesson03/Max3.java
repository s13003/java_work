package j1.lesson03;

import java.util.Scanner;

class Max3{

  public static void main(String...args){

    /**
     * @author Daiki GIMA
     * @version 1.0
     * @param args 実行時引数。無視されます。
     *
     * 3つの入力された値の最大値を求めて出力するプログラムです。
     */

    Scanner stdIn = new Scanner(System.in);
    int[] array = new int[3];
    int max = 0;

    for(int i = 0; i <= array.length -1; i++){
      System.out.print("整数を入力(" + (i + 1) + ")");
      array[i] = stdIn.nextInt();
    }
    for(int i = 0; i <= array.length -1; i++){
      if(max <= array[i]){
        max = array[i];
      }
    }
    System.out.println("最大値は:" + max);
  }
}
