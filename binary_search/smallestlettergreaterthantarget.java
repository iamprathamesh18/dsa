public class smallestlettergreaterthantarget {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target = 'd';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);

    }
    static char nextGreatestLetter(char[] letters, char target){
        if(target>=letters[letters.length-1])
            return letters[0];
        int start = 0;
        int end = letters.length;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target >= letters[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return letters[start];
    }
}
