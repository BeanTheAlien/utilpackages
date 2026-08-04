package utils.fn;

@FunctionalInterface
interface Predicate2<A, B> {
    boolean run(A arg0, B arg1);
}