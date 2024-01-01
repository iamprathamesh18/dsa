import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun(5,5,8,4);

        multiple(5,8,"hui","qwerty","lolo");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
    static void multiple(int a, int b , String ...v){


    }
}
