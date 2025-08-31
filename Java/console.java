import java.util.Scanner;

public class console {
    private static final Scanner scanner = new Scanner(System.in);
    public static void writeline(Object x) { System.out.println(x); }
    public static void writeline() { System.out.println(); }
    public static void writelines(Object... x) {
        for(Object i : x) {
            System.out.println(i);
        }
    }
    public static void write() { System.out.print(""); }
    public static void write(Object x) { System.out.print(x); }
    public static void writes(Object... x) {
        for(Object i : x) {
            System.out.print(i);
        }
    }
    public static String prompt(Object x) {
        System.out.println(x);
        return scanner.nextLine();
    }
    public static String prompt() {
        return scanner.nextLine();
    }
    public static String prompt(Object x, Object y, Object[] z) {
        boolean a = false;
        String resp = "";
        if(y.equals("last")) y = x;
        while(!a) {
            System.out.println(x);
            resp = scanner.nextLine();
            for(Object b : z) {
                if(resp.equals(b)) a = true;
            }
            if(!a) System.out.println(y);
        }
        return resp;
    }
    public static int promptInt() {
        int x = 0;
        String resp;
        while(true) {
            resp = scanner.nextLine();
            try {
                x = Integer.parseInt(resp);
                break;
            } catch(NumberFormatException e) {}
        }
        return x;
    }
    public static int promptInt(Object a) {
        int x = 0;
        String resp;
        while(true) { 
            System.out.println(a);
            resp = scanner.nextLine();
            try {
                x = Integer.parseInt(resp);
                break;
            } catch(NumberFormatException e) {}
        }
        return x;
    }
    public static int promptInt(Object x, Object y, int[] z) {
        boolean a = false;
        String resp;
        int n = 0;
        if(y.equals("last")) y = x;
        while(!a) {
            System.out.println(x);
            resp = scanner.nextLine();
            for(int b : z) {
                try {
                    int r = Integer.parseInt(resp);
                    if(r == b) {
                        a = true;
                        n = b;
                    }
                } catch(NumberFormatException e) {}
            }
            if(!a) System.out.println(y);
        }
        return n;
    }
    public static float promptFloat() {
        float x = 0f;
        String resp;
        while(true) {
            resp = scanner.nextLine();
            try {
                x = Float.parseFloat(resp);
                break;
            } catch(NumberFormatException e) {}
        }
        return x;
    }
    public static float promptFloat(Object a) {
        float x = 0f;
        String resp;
        while(true) { 
            System.out.println(a);
            resp = scanner.nextLine();
            try {
                x = Float.parseFloat(resp);
                break;
            } catch(NumberFormatException e) {}
        }
        return x;
    }
    public static float promptFloat(Object x, Object y, float[] z) {
        boolean a = false;
        String resp;
        float n = 0f;
        if(y.equals("last")) y = x;
        while(!a) {
            System.out.println(x);
            resp = scanner.nextLine();
            for(float b : z) {
                try {
                    float r = Float.parseFloat(resp);
                    if(r == b) {
                        a = true;
                        n = b;
                    }
                } catch(NumberFormatException e) {}
            }
            if(!a) System.out.println(y);
        }
        return n;
    }
    public static double promptDouble() {
        double x = 0;
        String resp;
        while(true) {
            resp = scanner.nextLine();
            try {
                x = Double.parseDouble(resp);
                break;
            } catch(NumberFormatException e) {}
        }
        return x;
    }
    public static double promptDouble(Object a) {
        double x = 0;
        String resp;
        while(true) { 
            System.out.println(a);
            resp = scanner.nextLine();
            try {
                x = Double.parseDouble(resp);
                break;
            } catch(NumberFormatException e) {}
        }
        return x;
    }
    public static double promptDouble(Object x, Object y, double[] z) {
        boolean a = false;
        String resp;
        double n = 0;
        if(y.equals("last")) y = x;
        while(!a) {
            System.out.println(x);
            resp = scanner.nextLine();
            for(double b : z) {
                try {
                    double r = Double.parseDouble(resp);
                    if(r == b) {
                        a = true;
                        n = b;
                    }
                } catch(NumberFormatException e) {}
            }
            if(!a) System.out.println(y);
        }
        return n;
    }
    public static char promptChar() {
        String resp;
        while(true) {
            resp = scanner.nextLine();
            if(resp.length() == 1) break;
        }
        return resp.toCharArray()[0];
    }
    public static char promptChar(Object a) {
        String resp;
        while(true) { 
            System.out.println(a);
            resp = scanner.nextLine();
            if(resp.length() == 1) break;
        }
        return resp.toCharArray()[0];
    }
    public static char promptChar(Object x, Object y, char[] z) {
        boolean a = false;
        String resp = "";
        if(y.equals("last")) y = x;
        while(!a) {
            System.out.println(x);
            resp = scanner.nextLine();
            for(char b : z) {
                if(resp.length() == 1 && resp.toCharArray()[0] == b) a = true;
            }
            if(!a) System.out.println(y);
        }
        return resp.toCharArray()[0];
    }
    public static char promptChar(Object x, Object y, char[] z, boolean truncate) {
        boolean a = false;
        String resp = "";
        if(y.equals("last")) y = x;
        while(!a) {
            System.out.println(x);
            resp = scanner.nextLine();
            for(char b : z) {
                if(truncate) {
                    if(resp.toCharArray()[0] == b) a = true;
                } else {
                    if(resp.length() == 1 && resp.toCharArray()[0] == b) a = true;
                }
            }
            if(!a) System.out.println(y);
        }
        return resp.toCharArray()[0];
    }
    public static void writelinef(String m, Object... x) {
        System.out.printf(m, x);
        System.out.println();
    }
    public static void writef(String m, Object... x) { System.out.printf(m, x); }
}