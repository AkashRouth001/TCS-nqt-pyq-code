/*Question 2:Given an array and a integer k.we need to find
the maximum element in each of the contiguous subarrays.
Input: 247163
K = 3
Output:7776
The subarrays will be [2,4,7], [4,7,1], [7,1,6] and [1,6,3].
The maximum numbers from the subarrays are 7776*/
public class Q3 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 1, 6, 3};
        int k = 3;
        findMaxInContSubArray(arr, k);
    }

    public static void findMaxInContSubArray(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            System.out.print(max); // Print max of each subarray in a single line
        }
        //System.out.println(); // Optional: for a new line after the output
    }
}
