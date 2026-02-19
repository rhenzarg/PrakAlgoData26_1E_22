package P1;

import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner rhenza = new Scanner(System.in);

        System.out.println("Masukan NIM: ");
        String nim = rhenza.nextLine();
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        if (n < 10) {
            n = n + 10;
        }
        System.out.println("n = " + n);
        System.out.print("Output: ");
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        rhenza.close();
    }
}
