package bkukuczka.algorithmsedu.leetcode;

import java.util.TreeMap;

class HandOfStraights {
    boolean isNStraightHand(int[] hand, int W) {
        TreeMap<Integer, Integer> allCards = new TreeMap<>();

        for (int card : hand) {
            if (!allCards.containsKey(card)) {
                allCards.put(card, 1);
            } else {
                allCards.put(card, allCards.get(card) + 1);
            }
        }

        while (!allCards.isEmpty()){
            Integer firstInARow = allCards.firstKey();
            for (int i = firstInARow; i < firstInARow + W; i++){
                if(!allCards.containsKey(i)){
                    return false;
                }

                if(allCards.get(i) == 1){
                    allCards.remove(i);
                } else {
                    allCards.put(i, allCards.get(i) - 1);
                }
            }
        }


//        if (hand.length % W != 0) {
//            return false;
//        }
//
//        Arrays.sort(hand);
//
//        for (int i = 0; i < hand.length; i++) {
//            if (hand[i] == -1) {
//                continue;
//            }
//
//            int moreLeft = W - 1;
//            int lastCons = hand[i];
//
//            for (int j = i + 1; j < hand.length; j++) {
//                if (moreLeft == 0) {
//                    break;
//                }
//
//                if (hand[j] == -1 || hand[j] == lastCons) {
//                    continue;
//                }
//
//                if (hand[j] - lastCons > 1) {
//                    return false;
//                }
//
//                lastCons = hand[j];
//                hand[j] = -1;
//                moreLeft -= 1;
//            }
//        }

        return true;
    }
}
