package bkukuczka.algorithmsedu.leetcode;

class RobotReturnToOrigin {
    boolean judgeCircle(String moves) {
        int horizontalPosition = 0;
        int verticalPosition = 0;

        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U':
                    verticalPosition += 1;
                    break;
                case 'D':
                    verticalPosition -= 1;
                    break;
                case 'L':
                    horizontalPosition -= 1;
                    break;
                case 'R':
                    horizontalPosition += 1;
                    break;
            }
        }

        return horizontalPosition == 0 && verticalPosition == 0;
    }
}
