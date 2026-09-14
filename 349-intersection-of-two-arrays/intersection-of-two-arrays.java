import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                // Check if they match AND it's not already in result
                if (nums1[i] == nums2[j] && !result.contains(nums1[i])) {
                    result.add(nums1[i]);
                    break; // Move to the next nums1 element once matched
                }
            }
        }

        // Convert List<Integer> to the required int[] return type
        int[] ans = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            ans[k] = result.get(k);
        }

        return ans;
    }
}