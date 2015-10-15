package j1.lesson02;

class Factorial10{
  public static void main(String...args){
    /**
     * @author Daiki GIMA
     * @version 1.0
     * @param args 実行時引数。無視されます。
     * 10の階乗を計算、出力するプログラムです。
     */
    final int num = 10;
    int Answer = num;
    for(int i = num; i > 1; i--){
      Answer *= i-1;
    }
    System.out.println("10の階乗は" + Answer);
  }
}
