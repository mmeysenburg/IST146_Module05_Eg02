import java.util.function.Predicate;

/**
 * Predicate class to determine if a number is negative.
 *
 * @param <T> type of number
 */
public class NegativePredicate<T> implements Predicate<T> {
    /**
     * Test to see if t is negative.
     *
     * @param t number to check
     * @return false if t is not an Integer, or if t >= 0;
     * true if t < 0.
     */
    public boolean test(T t) {
        if (!(t instanceof Integer)) {
            return false;
        } else {
            return ((Integer)t).intValue() < 0;
        }
    }
}
