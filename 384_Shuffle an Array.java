/*
Shuffle a set of numbers without duplicates.

// Init an array with set 1, 2, and 3.
int[] nums = {1,2,3};
Solution solution = new Solution(nums);

// Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
solution.shuffle();

// Resets the array back to its original configuration [1,2,3].
solution.reset();

// Returns the random shuffling of array [1,2,3].
solution.shuffle();
*/

public class Solution {
    
    static int[] truth; // store a copy of array
    Random r;
    public Solution(int[] nums) {
        truth = nums;
        r = new Random();
    }
      
    public int[] reset(){
        return this.truth;
    }
    
    public int[] shuffle(){
        int count = truth.length;
        if (count<=1) return truth;
        int[] rst = new int[count];
        rst[0] = truth[0];
        for (int i=1; i<count; i++){
            int rand = r.nextInt(i+1);
            
            rst[i] = rst[rand]; 
            rst[rand] = truth[i];
        }

        return rst;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */

/*
Summary
1. Underlying principle for shuffling an array - can refer to wiki.
    1.1 Modern version: swap each item (n-1->0) to the "end" of the array 
    1.2 "Inside-out": setting the array without initialization
2. Pseudo-random number generator: how it works. 
    2.1 At least, you should know seed controls the output random sequence.
3. Java/C# implementation for Random class
    1.1 Java: two defend mechanisms: nanosecond; seedUniquifier (https://stackoverflow.com/questions/11323245/explanation-of-random-number-generator-in-java)
    1.2 C#: no defend mechanism -> better use one instance 
        
*/

*/ 
