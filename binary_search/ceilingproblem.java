public class ceilingproblem {
    public static void main(String[] args) {
//        in this problem we will get the sorted array may be in ascending or descending pattern depending on the problem .
//        we will basically need to return the smallest number grater than or equal to target element.
//        {2,3,5,9,14,16,18} and target = 15 ; so then the answer will be 16 bcz it is the smallest number present which is
//        greater than the target elment.
        int[] arr={2,3,5,9,14,16,18};
        int target=17;
        int ans=function(arr,17);
        System.out.println(ans);

    }
    static int function(int[] arr,int target){
        int start =0;
        int end =arr.length-1;

        while(start<=end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
                // ans found
            }
        }return arr[start];

    }
}
