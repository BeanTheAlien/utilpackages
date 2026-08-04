package utils.fn;

@FunctionalInterface
interface Predicate3<A, B, C> {
    boolean run(A arg0, B arg1, C arg2);
}