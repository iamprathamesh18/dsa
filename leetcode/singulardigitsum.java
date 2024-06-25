public class singulardigitsum {
    public static void main(String[] args) {
        int num=199;
        fun(199);
    }
    static int fun(int num){
        int ans=0;

        int ans2=0;

        while(num>0){
            int rem = num%10;
            ans = ans + rem;
            num = num /10;
        }


        while(ans>0){
            int rem1 = ans % 10;
            ans2 = ans2 + rem1;
            ans=ans/10;

        }
        return ans2;

    }
}
