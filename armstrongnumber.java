public class armstrongnumber {
    public static void main(String[] args) {
        int sum = 0;
        int a=153;
        while(a>0){
        int rem = a%10;
        rem = rem*rem*rem;
//        System.out.println(rem);
        sum=sum+rem;
        a=a/10;


    }
        System.out.println(sum);
}}
