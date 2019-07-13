import java.util.Scanner;
class  URI1168{
  static int totalValue = 0;
  public static void value(char z){
    int y = Character.getNumericValue(z);
    switch(y){
      case 0:
        totalValue += 6;
        break;
      case 1:
        totalValue += 2;
        break;
      case 2:
        totalValue += 5;
        break;
      case 3:
        totalValue += 5;
        break;
      case 4:
        totalValue += 4;
        break;
      case 5:
        totalValue += 5;
        break;
      case 6:
        totalValue += 6;
        break;
      case 7:
        totalValue += 3;
        break;
      case 8:
        totalValue += 7;
        break;
      case 9:
        totalValue += 6;
        break;
    }
  }

  public static void numOfLeds(String x){
    char[] digits = x.toCharArray();
    for(char a : digits){
      value(a);
    }
    System.out.println(totalValue + " leds");
    totalValue = 0;
  }
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int l = in.nextInt();
    int counter = 0;
    while(counter < l){
      String s = in.nextLine();
      s.trim();
      numOfLeds(s);
    }
  }
}
