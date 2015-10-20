package j1.lesson03;

import java.util.Scanner;

class ChanceOfRain{
  public static void main(String...args){

  /**
   * @author Daiki GIMA
   * @version 1.0
   * @param args メイン実行時の引数。無視されます。
   *
   * 入力された降水確率に対してメッセージを出力するプログラムです。
   */

    Scanner stdIn = new Scanner(System.in);
    int x = 0;
    boolean flag = false;

    while(!flag){
      System.out.print("降水確率を入力してください:");
      x = stdIn.nextInt();
      if(x >= 0 && x <= 100){
        flag = true;
      }
      if(!flag){
        System.out.println("降水確率は0から100の間で指定してください。");
      }
    }
    if(x >= 50){
      System.out.println("傘を持って行ったほうがいいでしょう。");
    }else if(x < 50 && x >= 20){
      System.out.println("雨が降るかもしれません。\n傘を持って行ったほうが良いでしょう。");
    }else{
      System.out.println("傘は要りません。");
    }
  }
}
