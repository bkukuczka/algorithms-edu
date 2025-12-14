package bkukuczka.algorithms.leetcode;

class ReverseOnlyLetters {
    String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length() - 1;

        String output = "";

        while (left < s.length()) {
            if (!Character.isLetter(s.charAt(left))) {
                output += s.charAt(left);
                left++;
                continue;
            }

            if (!Character.isLetter(s.charAt(right))) {
                right--;
                continue;
            }

            if (Character.isLetter(s.charAt(right))) {
                output += s.charAt(right);
                left++;
                right--;
            }
        }

        return output;
    }
}
