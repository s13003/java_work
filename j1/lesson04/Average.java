package j1.lesson04;

import java.util.Scanner;

class Average{

  public static void main(String...args){

    /**
     * @author Daiki GIMA
     * @version 1.0
     * @param args 実行時引数。無視されます。
     * 
     * コンソールに繰り返す回数を入力させ、さらに指定された回数だけコンソールから実数を入力させ、それら入力された実数の平均値を表示するプログラムです。
     */

    Scanner stdIn = new Scanner(System.in);
    boolean flag = false;
    int x = 0;
    double max = 0;
    double average = 0;
    while(!flag){
      System.out.print("繰り返す回数を入力してください:");
      x = stdIn.nextInt();
      if(x <= 0){
        System.out.println("繰り返す回数には1以上を入れてください。");
      }else{
        flag = true;
      }
    }

    double[] For = new double[x];
    for(int i = 0; i < For.length; i++){
      System.out.print("値を入力してください:");
      For[i] = stdIn.nextDouble();
      max += For[i];
    }
    average = max / For.length;
    System.out.println("平均は" + average);
  }
}
