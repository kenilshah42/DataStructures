public class ArrayRecursion {
    public static void main(String[] var0) {
        int[] var1 = new int[]{1, 2, 3, 4, 2, 5};
        ArrayRecursion var2 = new ArrayRecursion();
        System.out.println(var2.isSorted(var1, 0));
    }

    public boolean isSorted(int[] var1, int var2) {
        if (var2 == var1.length - 1) {
            return true;
        } else {
            return var1[var2] < var1[var2 + 1] && this.isSorted(var1, var2 + 1);
        }
    }
}
