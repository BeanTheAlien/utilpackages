package utils.fn;

@FunctionalInterface
interface Predicate<A> {
    boolean run(A arg0);
}