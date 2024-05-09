public class PatternRecursive {
    public static void main(String[] var0) {
        printPattern(4, 0);
        printPattern2(4, 0);
    }

    static void printPattern(int var0, int var1) {
        if (var0 != 0) {
            if (var1 < var0) {
                System.out.print("*");
                printPattern(var0, var1 + 1);
            } else {
                System.out.println();
                printPattern(var0 - 1, 0);
            }

        }
    }

    static void printPattern2(int var0, int var1) {
        if (var0 != 0) {
            if (var1 < var0) {
                printPattern2(var0, var1 + 1);
                System.out.print("*");
            } else {
                printPattern2(var0 - 1, 0);
                System.out.println();
            }

        }
    }
}
