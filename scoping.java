public class scoping {
    public static void main(String[] args) {
        int a = 10;
        int b=25;
        {
            a =52;
//            a showing error cause we cant initiate a variable inside a box which is already declared outside the box
            b = 55;
//            however b not shows error cuz were not initiating but only changing the value

            int c = 5;
//            this is initiation of new variable , however we cant use this outside box as below

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        }
        int c=85;
        System.out.println(c);


    }


}
