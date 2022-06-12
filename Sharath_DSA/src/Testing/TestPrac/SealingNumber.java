package Testing.TestPrac;

public class SealingNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,10,33,55,77};
        int target = 9;
        int ans = sealTest(arr,target);
        System.out.println(ans);

    }
    static int sealTest(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        if (target > mid){
            start =mid+1;
        }else if(target<mid){
            end =mid-1;
        }else {
            return arr[mid];
        }
        return start;
    }
}
