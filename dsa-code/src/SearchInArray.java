import java.util.List;
import java.util.ArrayList;
public class SearchInArray {
    public static void main(String[] var0) {
        int[] var1 = new int[]{1, 2, 3, 4, 1, 8, 4};
        System.out.println("Is sorted ---> " + isSorted(var1, 0));
        System.out.println("Is in array ---> " + isInArray(var1, 8, 0));
        List var10001 = inArrayAt(var1, 4, 0, new ArrayList());
        System.out.println("In array at ---> " + var10001);
        System.out.println("In array at ---> " + inArrayAtWithoutArgs(var1, 4, 0));
    }

    static boolean isSorted(int[] var0, int var1) {
        if (var1 == var0.length - 1) {
            return true;
        } else {
            return var0[var1] <= var0[var1 + 1] && isSorted(var0, var1 + 1);
        }
    }

    static boolean isInArray(int[] var0, int var1, int var2) {
        if (var2 == var0.length) {
            return false;
        } else {
            return var0[var2] == var1 ? true : isInArray(var0, var1, var2 + 1);
        }
    }

    static List<Integer> inArrayAt(int[] var0, int var1, int var2, List<Integer> var3) {
        if (var2 == var0.length) {
            return var3;
        } else {
            if (var0[var2] == var1) {
                var3.add(var2);
            }

            return inArrayAt(var0, var1, var2 + 1, var3);
        }
    }

    static List<Integer> inArrayAtWithoutArgs(int[] var0, int var1, int var2) {
        ArrayList var3 = new ArrayList();
        if (var2 == var0.length) {
            return var3;
        } else {
            if (var0[var2] == var1) {
                var3.add(var2);
            }

            var3.addAll(inArrayAtWithoutArgs(var0, var1, var2 + 1));
            return var3;
        }
    }
}
