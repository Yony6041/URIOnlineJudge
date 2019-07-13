import java.util.Scanner;
class URI1329{
  public static void aux(int a, String b){
    if(a != 0){
      int counter = 0;
      String[] arr = b.split(" ");
      for(int i=0;i<arr.length;i++){
        if(Integer.parseInt(arr[i]) == 0){
          counter++;
        }
      }
      System.out.println("Mary won " + counter + " times and John won " +
                                              (arr.length-counter) + " times");
    }
  }
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    for(int i=0;i<=args.length;i++){
      int input = in.nextInt();
      String nums = in.nextLine();
      aux(input, nums);
    }
  }
}
