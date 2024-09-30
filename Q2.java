/*You have given an input N you have to print the sum value of multiple of N are table multiplication.
Input: n=10
output: 550
Explanation: 10 * 1 + 10 * 2 + 10*3 + 10 * 4 + 10*5+ 10*6+ 10 *7+10*8+10*9+10*10
*/
import java.util.*;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int N = sc.nextInt();
        int sum =0;
        for(int i =1;i<=10;i++){
            sum = N*i+sum;
        }
        System.out.println("sum="+sum);
    }
}
