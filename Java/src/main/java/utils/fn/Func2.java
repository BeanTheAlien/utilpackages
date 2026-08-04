package utils.fn;

@FunctionalInterface
interface Func2<A, B, C> {
    C run(A arg0, B arg1);
}