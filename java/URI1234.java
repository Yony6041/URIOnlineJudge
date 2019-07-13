import java.util.Scanner;
public class URI1234{
  public static boolean changeFlag(boolean b){
    if(b){
      return false;
    }else{
      return true;
    }
  }
  public static String changeCase(String s){
    boolean flag = true;
    String dancerString = "";
    String ss="";
    for(int a=0;a<s.length();a++){
      ss = Character.toString(s.charAt(a));
      if( ss != " "){
        if(flag){
          dancerString += ss.toUpperCase();
          flag = changeFlag(flag);
        }else{
          dancerString += ss.toLowerCase();
          flag = changeFlag(flag);
        }
      }else{
          dancerString += ss;
      }
    }
    return dancerString;
  }l




  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String str = "hi";
    do{
      str = in.nextLine();
      System.out.println(changeCase(str));
    }while(!(str.isEmpty()));
  }
}
