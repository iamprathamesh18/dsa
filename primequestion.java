import java.util.Scanner;

public class primequestion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

    }

    static boolean isprime(int n){
        if (n<=1){
            return false;
        }
        int c = 2 ;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }

        }
    }

}
