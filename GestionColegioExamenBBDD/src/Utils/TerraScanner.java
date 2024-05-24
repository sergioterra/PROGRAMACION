package Utils;

import java.util.Scanner;

public class TerraScanner {
        private static Scanner sc;
        public static Scanner getInstance() {
            if (sc == null) {
                sc = new Scanner(System.in);

            }
            return sc;

        }
}
