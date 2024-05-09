public class CountingArrayProblem {
    public void countingSort(int[] var1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = var1.length - 1;

        while(var3 <= var4) {
            if (var1[var3] == 0) {
                this.swap(var3, var2, var1);
                ++var3;
                ++var2;
            }

            if (var1[var3] == 1) {
                ++var3;
            }

            if (var1[var3] == 2) {
                this.swap(var3, var4, var1);
                --var4;
            }
        }

    }

    public void swap(int var1, int var2, int[] var3) {
        System.out.println("X --> " + var3[var1] + " Y ---> " + var3[var2]);
        var3[var1] += var3[var2];
        var3[var2] = var3[var1] - var3[var2];
        var3[var1] -= var3[var2];
        System.out.println("After X --> " + var3[var1] + " Y ---> " + var3[var2]);
    }

    static void printArray(int[] var0, int var1) {
        for(int var2 = 0; var2 < var1; ++var2) {
            System.out.print(var0[var2] + " ");
        }

        System.out.println("");
    }

    public static void main(String[] var0) {
        CountingArrayProblem var1 = new CountingArrayProblem();
        int[] var2 = new int[]{2};
        var1.countingSort(var2);
        printArray(var2, var2.length);
    }
}
