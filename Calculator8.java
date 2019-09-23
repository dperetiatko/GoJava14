public class Calculator8 {
    public static void main(String[] args) {
        int x=670;
        int[] y = new int[7];
        System.out.print("Calculator8");
        int i = 0;
        while (x > 0) {
            y[i] = x % 8;
            x /= 8;
            i++;
        }
        for (int z = y.length - 1; z >= 0; z--)
            System.out.print(y[z]);

    }

}
