package utils;
public class Random {
    public static double ranFloat() {
        return (Math.random() * 101);
    }
    public static double ranFloat(int a) {
        return (Math.random() * a);
    }
    public static double ranFloat(int a, int b) {
        if(a > b) {
            int t = a;
            a = b;
            b = t;
        }
        return (Math.random() * (b - a)) + a;
    }
    public static int random() {
        return (int)Random.ranFloat();
    }
    public static int random(int a) {
        return (int)Random.ranFloat(a);
    }
    public static int random(int a, int b) {
        return (int)Random.ranFloat(a, b);
    }
    public static Array<Integer> randoms(int count) {
        return Random.randoms(101, count);
    }
    public static Array<Integer> randoms(int max, int count) {
        return Random.randoms(0, max, count);
    }
    public static Array<Integer> randoms(int min, int max, int count) {
        var arr = new Array<Integer>();
        for(int i = 0; i < count; i++) arr.add(Random.random(min, max));
        return arr;
    }
    public static boolean chance(int floor, int ceil) {
        return Random.random(ceil) <= floor;
    }
    public static boolean chance(int floor) {
        return Random.chance(floor, 101);
    }
    public static boolean ranBool() {
        return Random.chance(50);
    }
}
