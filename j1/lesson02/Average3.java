package j1.lesson02;

class Average3{

  public static void main(String...args){
    /**
     * @author Daiki GIMA
     * @version 1.0
     * @param args 実行時引数。無視されます。
     */
    final double[] array = {5.5, 10.0, 12.1};
    double sum = array[0];

    for(int i = 0; i < array.length-1; i++){
      sum+=array[i+1];
    }
    double ave = sum / array.length;
    System.out.println("3つの数の平均値は:" + ave);
  }
}
