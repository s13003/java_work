package j1.lesson02;

class Average{
  /**
   * @author Daiki GIMA
   *
   * 3つの値の平均を求めるメソッドです。
   *
   * @return でた平均を返します。
   */

  static double Ave(){
    double[] array = {5.5, 10.0, 12.1};
    double sum = array[0];
    for(int i = 0; i < array.length-1; i++){
      sum+=array[i+1];
    }
    System.out.print("3つの数の平均値は:" );
    double ave = sum / array.length;
    return ave;
  }

  public static void main(String...args){
    System.out.println(Ave());
  }
}
