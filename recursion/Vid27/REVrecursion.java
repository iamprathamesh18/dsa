public class REVrecursion {
    public static void main(String[] args) {
        reverse(10);
    }
    static void reverse(int n){
        if (n==0){
            return;
        }
        reverse(n-1);
        System.out.println(n);
    }
}
