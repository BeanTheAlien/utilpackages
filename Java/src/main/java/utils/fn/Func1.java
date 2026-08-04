package utils.fn;

@FunctionalInterface
interface Func1<A, B> {
    B run(A arg0);
}