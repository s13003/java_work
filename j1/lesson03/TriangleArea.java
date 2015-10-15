package j1.lesson03;

import java.util.Scanner;

class TriangleArea{

  public static void main(String...args){

    /**
     * @author Daiki GIMA
     * @version 1.0
     * @param args 実行時引数。無視されます。
     *
     * 3辺に値を入力し、三角形の面積を求めるプログラムです。
     */

    Scanner stdIn = new Scanner(System.in);
    double[] Side = new double[3];
    char Side_code = 97;

    for(int i = 0; i < Side.length; i++){
      System.out.print("辺" + Side_code + "の長さ:");
      Side[i] = stdIn.nextDouble();
      Side_code++;
    }

    double S = (Side[0] + Side[1] + Side[2]) / 2;
    double menseki = Math.sqrt(S * (S - Side[0]) * (S - Side[1]) * (S - Side[2]));

    System.out.println(menseki);
  }
}
