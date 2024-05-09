public class ReverseNumber {
    public static void main(String[] var0) {
        ReverseNumber var1 = new ReverseNumber();
        short var2 = 1234;
        int var10001 = var1.reverseNumber(var2, (int)Math.log10((double)var2) + 1);
        System.out.println("REVERSE --> " + var10001);
    }

    public int reverseNumber(int var1, int var2) {
        return var1 % 10 == var1 ? var1 : var1 % 10 * (int)Math.pow(10.0, (double)(var2 - 1)) + this.reverseNumber(var1 / 10, var2 - 1);
    }
}
