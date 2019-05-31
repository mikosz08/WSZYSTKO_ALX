public class J19_1 {
    public static void main(String[] args) {
        int[][] tab = new int[3][3];


        System.out.println("-------------------");
        for (int i = 0; i < tab.length; i++) {
            for (int j = tab[i].length - 1; j >= 0; j--) {
                if (i == j) {
                    tab[i][j] = 1;
                }
                if ((j + i) == tab.length - 1) {
                    tab[i][j] = 1;
                }

                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
