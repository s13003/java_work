import java.util.Random;
import java.util.Scanner;

class janken{


  static void Janken(int player, int enemy){
    boolean hantei = false;
    boolean Continue = false;
    String Cont = "";

    while(hantei == false){
        switch(player){
          case 1: if(enemy == 1){
                    System.out.println("あいこ");
                    hantei = true;
                    break;
                  }else if(enemy == 2){
                    System.out.println("YOU WIN!!");
                    hantei = true;
                    break;
                  }else if(enemy == 3){
                    System.out.println("YOU LOSE...");
                    hantei = true;
                    break;
                  }
          case 2: if(enemy == 1){
                    System.out.println("YOU LOSE...");
                    hantei = true;
                    break;
                  }else if(enemy == 2){
                    System.out.println("あいこ");
                    hantei = true;
                    break;
                  }else if(enemy == 3){
                    System.out.println("YOU WiN!!");
                    hantei = true;
                    break;
                  }
          case 3: if(enemy == 1){
                    System.out.println("YOU WIN!!");
                    hantei = true;
                    break;
                  }else if(enemy == 2){
                    System.out.println("YOU LOSE...");
                    hantei = true;
                    break;
                  }else if(enemy == 3){
                    System.out.println("あいこ");
                    hantei = true;
                    break;
                  }
        }
      }
    }

  public static void main(String...args){


    Scanner stdIn = new Scanner(System.in);
    Random rand = new Random();

    int player = 0;
    int enemy = 0;
    boolean handler = false;
    while(!handler){
      player = stdIn.nextInt();
      enemy = rand.nextInt(3) + 1;
      if(player < 1 || player > 3){
        System.out.println("ちゃんと手を決めてください");
      }else{
        handler = true;
      }
    }

    Janken(player, enemy);
    /*while(handler == false){
      System.out.println("あなたの手を決めてください。");
      System.out.print("1: グー, 2: チョキ, 3: パー --->");
      player = stdIn.nextInt();
      enemy = rand.nextInt(3) + 1;
      if(player > 4 || player < 1){
      System.out.println("ちゃんと手を決めてください");
      }else{
      handler = true;
      }
      while(hantei == false){
      switch(player){
      case 1: if(enemy == 1){
      System.out.println("あいこ");
      hantei = true;
      break;
      }else if(enemy == 2){
      System.out.println("YOU WIN!!");
      hantei = true;
      break;
      }else if(enemy == 3){
      System.out.println("YOU LOSE...");
      hantei = true;
      break;
      }
      case 2: if(enemy == 1){
      System.out.println("YOU LOSE...");
      hantei = true;
      break;
      }else if(enemy == 2){
      System.out.println("あいこ");
      hantei = true;
      break;
      }else if(enemy == 3){
      System.out.println("YOU WiN!!");
      hantei = true;
      break;
      }
      case 3: if(enemy == 1){
      System.out.println("YOU WIN!!");
      hantei = true;
      break;
      }else if(enemy == 2){
      System.out.println("YOU LOSE...");
      hantei = true;
      break;
      }else if(enemy == 3){
      System.out.println("あいこ");
      hantei = true;
      break;
      }
      }
      }
      handler = false;
      hantei = false;
      } */
}
}
