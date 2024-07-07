public class arrangecoin {
    public static void main(String[] args) {
        int ans=func(8);
        System.out.println(ans);

    }
    static int func(int num){
        int i = 1;
        while(num > 0){
            i++;
            num = num-i;
        }
        return i-1;
    }
    }

