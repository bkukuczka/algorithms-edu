package bkukuczka.algorithmsedu.interviews.agileengine;

import java.util.Optional;

class UserStats {
    Optional<Long> visitCount;

    public UserStats(Optional<Long> visitCount) {
        this.visitCount = visitCount;
    }

    public Optional<Long> getVisitCount() {
        return visitCount;
    }
}
