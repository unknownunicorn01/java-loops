import java.util.*;
public class b_problem5 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=20;i++){
      System.out.println(n + " x " + i + " = " +i*n);
    }
    sc.close();
  }
}
