package j1.lesson03;

import java.util.Scanner;

class Max3{

  static int[] array = new int[3];

  static int Max(int[] array){
    int max = 0;
    for(int i = 0; i <= array.length - 1; i++){
      if(max <= array[i]){
        max = array[i];
      }
    }
    return max;
  }

  public static void main(String...args){
    Scanner stdIn = new Scanner(System.in);
    for(int i = 0; i <= 2; i++){
      System.out.print("整数を入力(" + (i + 1) + ")");
      array[i] = stdIn.nextInt();
    }
    System.out.println("最大値は:" + Max(array));
  }
}
