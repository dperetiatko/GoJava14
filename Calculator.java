public class Calculator {
    public static void main(String[] args) {
        byte x = 35;
        byte[] y = new byte[7];
        System.out.print("Calculator");
        for (int i = 0; i < y.length; i++) {
            if (x % 2 == 0) {
                y[i]=0;
            } else {
                y[i] = 1;
            }
            x /= 2;
        }

        for (int z = y.length - 1; z >= 0; z--)
            System.out.print(y[z]);

    }

}