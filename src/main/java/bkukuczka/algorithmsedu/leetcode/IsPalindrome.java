package bkukuczka.algorithmsedu.leetcode;

class IsPalindrome {
    boolean isPalindrome(String s) {
        int beginPointer = 0;
        int endPointer = s.length() - 1;

        s = s.toLowerCase();

        while (beginPointer <= endPointer) {
            if (!Character.isAlphabetic(s.charAt(beginPointer))) {
                beginPointer += 1;
                continue;
            }

            if (!Character.isAlphabetic(s.charAt(endPointer))) {
                endPointer -= 1;
                continue;
            }

            if (s.charAt(beginPointer) != s.charAt(endPointer)) {
                return false;
            }

            beginPointer += 1;
            endPointer -= 1;
        }

        return true;
    }
}
