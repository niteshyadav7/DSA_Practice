type cating:

(char)('A'+1)

# imp question

NOTE :: if any things miscel. then use contional operation :make patterns

E
DE
CDE
BCDE
ABCDE

---

Find the Maximum Subarray Sum

```
public class MaxSubarraySum {

   public static int maxSubarraySum(int[] nums) {
       int maxSum = Integer.MIN_VALUE;

       for (int i = 0; i < nums.length; i++) {
           int currentSum = 0;
           for (int j = i; j < nums.length; j++) {
               currentSum += nums[j];
               maxSum = Math.max(maxSum, currentSum);
           }
       }

       return maxSum;
   }

   public static void main(String[] args) {
       int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
       System.out.println("Maximum subarray sum: " + maxSubarraySum(nums));
   }
}

```

Subarray Sum Equals K

```
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}

```
