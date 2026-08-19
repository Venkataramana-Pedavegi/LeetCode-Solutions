class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        HashSet<Integer> result = new HashSet<>();

        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        int[] answer = new int[result.size()];

        int i = 0;
        for (int num : result) {
            answer[i] = num;
            i++;
        }

        return answer;
    }
}
    
