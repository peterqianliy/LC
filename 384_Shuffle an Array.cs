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
    int[] source; 
    Random rand ;
    public Solution(int[] nums) {
        source = nums;
        rand = new Random( );
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] Reset() {
        return this.source;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] Shuffle() {
        if (source==null) return null;
        int len = this.source.Length;
        int[] rst = new int[len];
        for (int i=0; i<len; i++){
            rst[i] = source[i];
        }
        
        for (int i=len-1;i>0;i--){
            int idx = rand.Next(i+1);
            swap(rst, idx, i);
        }
        
        return rst;
    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    }
}

/*
Summary
1. Underlying principle for shuffling an array - can refer to wiki.
2. Pseudo-random number generator: how it works. At least, you should know seed controls the output random sequence.
3. Java/C# implementation for Random class
*/

*/ 
