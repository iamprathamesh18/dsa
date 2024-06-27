public class floorproblem {
    public static void main(String[] args) {
        int[] arr= {2,3,5,8,11,15,19,22,25,30};

//        floor= greatest number smaller or equal to target
        int ans=func(arr,23);;
        System.out.println(ans);

    }
    static int func(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return arr[mid];
            }
        }
        return arr[end];
    }


}
