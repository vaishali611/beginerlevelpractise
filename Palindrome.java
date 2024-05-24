import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        boolean f = true;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i <((s.length()) / 2) - 1; i++) {
          
                if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                    f = false;
                    break;
                }
            
        }
        if (f==false) {
            System.out.println("not a  palindrome");
        } else {
            System.out.println(" it's  a palindrome");
        }
    }
}
