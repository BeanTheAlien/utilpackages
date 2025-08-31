public class utils {
    public static int count(String input, char target) {
        int res = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == target) res++;
        }
        return res;
    }
    public static int count(String input, String target) {
        int res = 0;
        for(int i = 0; i < input.length(); i++) {
            if(String.valueOf(input.charAt(i)).equals(target)) res++;
        }
        return res;
    }
    public static int count(Object[] input, char target) {
        int res = 0;
        for(Object item : input) {
            if(String.valueOf(item).equals(String.valueOf(target))) res++;
        }
        return res;
    }
    public static int count(Object[] input, String target) {
        int res = 0;
        for(Object item : input) {
            if(String.valueOf(item).equals(target)) res++;
        }
        return res;
    }
    public static String toUpper(String s) {
        return s.toUpperCase();
    }
    public static String toLower(String s) {
        return s.toLowerCase();
    }
}