public class RotateArray {
    void rotateRight(int[] var1, int var2, int var3) {
        for(int var4 = var2; var4 > var3; --var4) {
            this.rotateByOne(var1, var2);
        }

    }

    void rotateLeft(int[] var1, int var2, int var3) {
        for(int var4 = 0; var4 < var3; ++var4) {
            this.rotateByOne(var1, var2);
        }

    }

    int[] rotateByOne(int[] var1, int var2) {
        int var3 = 0;
        int var4 = var1[var3];

        for(var3 = 0; var3 < var2 - 1; ++var3) {
            var1[var3] = var1[var3 + 1];
        }

        var1[var2 - 1] = var4;
        return var1;
    }

    public static void main(String[] var0) {
        RotateArray var1 = new RotateArray();
        int[] var2 = new int[]{1, 2, 3, 4, 5, 6};
        var1.rotateRight(var2, var2.length, 2);

        for(int var3 = 0; var3 < var2.length; ++var3) {
            System.out.print(var2[var3] + " ");
        }

    }
}
