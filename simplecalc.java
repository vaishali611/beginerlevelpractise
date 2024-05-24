import java.util.*;
public class simplecalc{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      sc.nextLine(); 
      String s=sc.nextLine();
      switch(s){
        case "+":
        System.out.println(x+y);
        break;
        case "-":
        System.out.println(x-y);
        break;
        case "/":
        System.out.println(x/y);
        break;
        case "*":
        System.out.println(x*y);
        break;

      }
      

    }
}