public class dontknowAscorDesc {
    public static void main(String[] args) {
        int[] arr={98,92,90,89,88,88,88,55,45,12};
        int target=92;
        int ans=func(arr,92);
        System.out.println(ans);
    }
    static int func(int[] arr, int target){
        int start= 0;
        int end = arr.length-1;

        if (arr[start]<arr[end]){
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
            }
        } else if (arr[start]>arr[end]) {
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


        }return -1;
    }
}
