package bkukuczka.algorithmsedu.leetcode;

class IsIntegerAPalindrome {
    boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int reversedInt = 0;
        while (x > reversedInt) {
            int pop = x % 10;
            x /= 10;

            reversedInt = reversedInt * 10 + pop;
            System.out.println("reversedInt: " + reversedInt);
            System.out.println("x: " + x);
        }

        return x == reversedInt || x == reversedInt / 10;

//        String value = String.valueOf(x);
//
//        return new StringBuilder(value).reverse().toString().equals(value);
    }
}
