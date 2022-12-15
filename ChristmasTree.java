/*

Input height = 3
      *
    * * *
  * * * * *
      *
      *

Input height = 4
      *
    * * *
  * * * * *
* * * * * * *
      *
      *
 */
public class ChristmasTree {
    public static void main(String[] args) {
        int height = 3;
        int base = (height * 2) - 1;
        for (int i = 1; i <= height; i++) {
            StringBuilder tree = new StringBuilder();
            for (int j = 0; j < height - i; j++) {
                tree.append(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                tree.append("*");
            }
            System.out.println(tree);
        }

        for (int l = 0; l < 2; l++) {
            String wood = "";
            for (int m = 0; m < base; m++) {
                if (m == height - 1) {
                    wood += "*";
                } else {
                    wood += " ";
                }
            }
            System.out.println(wood);

        }
    }
}
