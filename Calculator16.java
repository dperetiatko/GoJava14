import java.util.jar.JarEntry;

public class Calculator16 {
    public static void main(String[] args) {
        int x = 106;
        String[] y = new String[2];
        System.out.print("Calculator16 - ");
        int i = 0;
        while (x > 0) {
            if (x % 16 >= 10) {
                int q = x % 16;
                switch (q) {
                    case 10:
                        y[i] = "A";
                        break;
                    case 11:
                        y[i] = "B";
                        break;
                    case 12:
                        y[i] = "C";
                        break;
                    case 13:
                        y[i] = "D";
                        break;
                    case 14:
                        y[i] = "E";
                        break;
                    case 15:
                        y[i] = "F";
                        break;
                }
            } else {
                y[i] = x % 16 + "";
            }
            x /=16;
            i++;
        }for (int z = y.length - 1; z >= 0; z--)
            System.out.print(y[z]);
    }
}
