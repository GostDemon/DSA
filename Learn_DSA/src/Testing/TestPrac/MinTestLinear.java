package Testing.TestPrac;

public class MinTestLinear {
    public static void main(String[] args) {
        int[] arr = {34, 35, 656, 123, 7457, 7867, 3345, 23, 57, 62345, 345, 45, 7, 346};
        int answer = search(arr);
        System.out.println(answer);

    }

    // write a function to find the minimun number in array
    static int search(int[] arr) {
        int ans = arr[0];
        for (int min : arr) {
            if (min < ans) {
                ans = min;
            }
        }

        return ans;
    }
}
