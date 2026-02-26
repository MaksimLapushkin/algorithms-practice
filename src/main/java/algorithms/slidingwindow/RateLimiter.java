package algorithms.slidingwindow;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class RateLimiter {

    private static final int LIMIT = 3;
    private static final long WINDOW_SECONDS = 10;

    private final Map<String, Deque<Long>> requestsByUser = new HashMap<>();

    public boolean allowRequest(String userId, long timestamp) {

        Deque<Long> deque = requestsByUser.computeIfAbsent(userId,id -> new ArrayDeque<>());

        if (deque.size() < LIMIT) {
            deque.addLast(timestamp);
            return true;
        }

        while (!deque.isEmpty()) {
            long delta = timestamp - deque.getFirst();
            if (delta > WINDOW_SECONDS) {
                deque.removeFirst();
            } else {
                break;
            }
        }

        if (deque.size() >= LIMIT) {
            return false;
        }

        deque.addLast(timestamp);
        return true;
    }
}