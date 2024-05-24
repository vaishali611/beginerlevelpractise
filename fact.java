public class fact {
    public static int facto(int n){
        if(n<=1){
            return 1;
        }
       int val=1;
       val =n*facto(n-1);
       return val;
    }
public static void main(String[] args) {
    int n=3;
    System.out.println(facto(n));
}
    
}