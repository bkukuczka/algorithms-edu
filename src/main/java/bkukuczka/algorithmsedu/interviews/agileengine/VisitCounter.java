package bkukuczka.algorithmsedu.interviews.agileengine;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

class VisitCounter {

    Map<Long, Long> count(Map<String, UserStats>... visits) {
        if (Objects.isNull(visits)) {
            return Collections.emptyMap();
        }

        return Arrays.stream(visits)
                .filter(map -> map.size() !=0)
                .flatMap(map -> map.entrySet().stream())
                .filter(entry -> Objects.nonNull(entry))
                .filter(entry -> isParseable(entry.getKey()))
                .filter(entry -> Objects.nonNull(entry.getValue()))
                .filter(entry -> entry.getValue().getVisitCount().isPresent())
                .collect(Collectors.groupingBy(
                        entry -> Long.valueOf(entry.getKey()),
                        Collectors.summingLong(entry -> entry.getValue().getVisitCount().get())
                ));
    }

    private boolean isParseable(String key) {
        try {
            Long.valueOf(key);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}