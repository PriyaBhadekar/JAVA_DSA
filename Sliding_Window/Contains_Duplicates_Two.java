
//Link To a Problem : https://leetcode.com/problems/contains-duplicate-ii/description/
/*Given an integer array nums and an integer k, return true if there are two distinct indices
 i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3

Output: true
*/

package Sliding_Window;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicates_Two {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> windows = new HashSet<>();

        for(int i = 0; i < nums.length; i++){

            if(windows.contains(nums[i])){
                return true;
            }

            windows.add(nums[i]);

            if(windows.size() > k){
                windows.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        boolean result = containsNearbyDuplicate(nums , 3);
        System.out.println(result);
    }
}
