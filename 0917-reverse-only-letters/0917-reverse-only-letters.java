class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right &&
                   !((arr[left] >= 'A' && arr[left] <= 'Z') ||
                     (arr[left] >= 'a' && arr[left] <= 'z'))) {
                left++;
            }

            while (left < right &&
                   !((arr[right] >= 'A' && arr[right] <= 'Z') ||
                     (arr[right] >= 'a' && arr[right] <= 'z'))) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}