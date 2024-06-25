public class evennumdigits {
    public static void main(String[] args) {
        int[] nums = {12,3,9,4554};

        System.out.println(findnum(456));
    }
    static int findnum(int nums){
        int count=0;

        int number=nums;
//        now we will write a function for checking the total number of integeres in the giuen digit
        while(nums>0){
            nums=nums%10;
            count++;
            nums=nums/10;


        }
        return count;

    }

}
