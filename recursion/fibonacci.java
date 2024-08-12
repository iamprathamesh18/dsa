public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }
    static int fibo(int n){
        if(n<=3){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }

    static int fibo1(int n){
        if(n<=3){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }


}
