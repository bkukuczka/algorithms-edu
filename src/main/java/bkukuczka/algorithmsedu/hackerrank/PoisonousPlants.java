package bkukuczka.algorithmsedu.hackerrank;

import java.util.List;

class PoisonousPlants {
    int poisonousPlants(List<Integer> p) {
        boolean plantDied = true;
        int days = 0;

        while (plantDied && !p.isEmpty()) {
            plantDied = false;

            for (int i = p.size()-1; i > 0; i--) {
                if (p.get(i) > p.get(i - 1)) {
                    p.remove(i);
                    plantDied = true;
                }
            }

            if(plantDied){
                days++;
            }
        }

        return days;
    }
}
