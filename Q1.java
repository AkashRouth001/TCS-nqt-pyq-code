/*Given an array of integers nums and an integer sum, return the total number of subarrays whose sum equals to sum. A subarray is a contiguous non-empty sequence of elements within an array.
Example 1:
Input: nums = [3 4 -7 1 3 3 1 4], sum = 7
Output: [3,4]
[34-7133]
133]
[331]
Example 1:
Input: nums = [3 4 -7 1 3 3 1 4], sum = 0
Output: [3,4,-7] [-7133]
*/
public class Q1 {
    public static void main(String[] args) {
        int[] nums={3,4,-7,1,3,3,1,4};
        int sum=7,k=0,count;
        int resum=0, j;
        for(int i=0;i<nums.length;i++) {
            j = i + 1;  //j is always 1 value greater than i;
            while (j < nums.length) {
                resum = resum + nums[j - 1];    //finding result sum
                if (resum == sum) {     //if result sum is equal to original sum then enter the loop
                    count = i;
                    while (count < j) {
                        System.out.print(nums[count]+" ");
                        count++;
                    }
                    j++;
                    System.out.println();
                }
                else if (j == nums.length - 1) {    //if j meets the end of the loop then break the loop
                    resum = 0;
                    break;
                }else {
                    j++;    //or else let it iterate till it meets the end of the loop
                }
            }
        }
    }
}
