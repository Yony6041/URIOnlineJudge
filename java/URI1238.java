import java.util.Scanner;
import java.io.*;
class  URI1238{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for(int x=0;x<num;x++){
      String s;
      int i;
      s = in.nextLine();
      s.trim();
      String[] arr = s.split(" ");
      int a = arr[0].length();
      int b = arr[1].length();
      int c = 0;
      if(a < b){
        i = a;
        c = b-a;
      }else{
        i = b;
        c = a-b;
      }
      for(int j=0;j<i;j++){
        try{
          System.out.print(arr[0].charAt(j));
          System.out.print(arr[1].charAt(j));
        }catch(Exception e){
          int d = 0;
          while(c < d){
          System.out.println();
          }
        }
      }
    }
  }
}
