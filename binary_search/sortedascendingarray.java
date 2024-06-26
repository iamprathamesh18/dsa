public class sortedascendingarray {
    public static void main(String[] args) {
        int[] arr={14,18,19,20,45,75,85,95,99};
        // in the above array all the numbers are in ascending order.
        int target = 188;
        int ans = find(arr,188);
        System.out.println(ans);
    }
    static int find(int[] arr,int target){
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
    }return -1;
}
}



