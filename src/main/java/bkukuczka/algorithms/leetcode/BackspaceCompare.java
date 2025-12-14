package bkukuczka.algorithms.leetcode;

class BackspaceCompare {
//    boolean backspaceCompare(String s1, String s2) {
//        Stack<Character> chars1 = new Stack<>();
//        for (Character ch : s1.toCharArray()) {
//            if (ch.equals('#') && !chars1.isEmpty()) {
//                chars1.pop();
//            } else {
//                chars1.push(ch);
//            }
//        }
//
//        Stack<Character> chars2 = new Stack<>();
//        for (Character ch : s2.toCharArray()) {
//            if (ch.equals('#') && !chars2.isEmpty()) {
//                chars2.pop();
//            } else {
//                chars2.push(ch);
//            }
//        }
//
//        return chars1.equals(chars2);
//    }

    boolean backspaceCompare(String t, String s) {
        int tPointer = t.length() - 1;
        int sPointer = s.length() - 1;

        int tSkips = 0;
        int sSkips = 0;

        while (tPointer >= 0 || sPointer >= 0) {

            while (tPointer >= 0) {
                if (t.charAt(tPointer) == '#') {
                    tSkips++;
                    tPointer--;
                } else if (tSkips > 0) {
                    tSkips--;
                    tPointer--;
                } else {
                    break;
                }
            }

            while (sPointer >= 0) {
                if (s.charAt(sPointer) == '#') {
                    sSkips++;
                    sPointer--;
                } else if (sSkips > 0) {
                    sSkips--;
                    sPointer--;
                } else {
                    break;
                }
            }

            if (tPointer >= 0 && sPointer >= 0
                    && s.charAt(sPointer) != t.charAt(tPointer)) {
                return false;
            }

            if ((tPointer >= 0) != (sPointer >= 0)) {
                return false;
            }

            sPointer -= 1;
            tPointer -= 1;
        }

        return true;
    }
}
