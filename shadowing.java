public class shadowing {
    static int m=55;
    public static void main(String[] args) {
        System.out.println(m);

        int m =88;
        System.out.println(m);

        fun();



    }
    static void fun(){
        System.out.println(m);
    }


}
