import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int x : nums1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int x : nums2) {
            if (map.getOrDefault(x, 0) > 0) {
                list.add(x);
                map.put(x, map.get(x) - 1);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}