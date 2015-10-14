class Nabeatsu{

  static final String Three = "Three";
  static final String check_Three = "3";

  static void Nabeatsu_call(){
    int x = 0;
    String temp;
    while(x < 100){
      temp = String.valueOf(x);
      if(temp.indexOf(check_Three) >= 0){
        System.out.println(Three);
      }else if(x % 3 == 0 && x > 0){
        System.out.println(Three);
      }else{
        System.out.println(x);
      }
    x++;
    }
  }

  public static void main(String...args){
    Nabeatsu_call();
  }
}
