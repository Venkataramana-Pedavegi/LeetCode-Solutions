class Solution {
    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            int left = 0;
            int right = word.length() - 1;

            boolean isPalindrome = true;

            while (left < right) {

                if (word.charAt(left) != word.charAt(right)) {
                    isPalindrome = false;
                    break;
                }

                left++;
                right--;
            }

            if (isPalindrome) {
                return word;
            }
        }

        return "";
    }
}