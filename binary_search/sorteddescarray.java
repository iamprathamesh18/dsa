public class sorteddescarray {

    public static void main(String[] args) {

        int[] arr={200,99,88,77,66,55,44,33,22,11};
        // in the above array all the numbers are in ascending order.
        int target = 88;
        int ans = func(arr,88);
        System.out.println(ans);
    }

    static int func(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
        int mid=start+(end-start)/2;

        if(target>arr[mid]){
            end=mid-1;
        } else if (target<arr[mid]) {
            start=mid+1;
        }else{
            return mid;
        }
        }
        return -1;
    }
}
