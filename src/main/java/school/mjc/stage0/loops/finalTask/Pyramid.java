package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int numToPrint;
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength * 2 - 1; j++) {
                if (j >= cathetusLength - i - 1 && j <= cathetusLength + i - 1) {
                    if (j < cathetusLength - 1)
                        numToPrint = cathetusLength - j;
                    else numToPrint = j - cathetusLength + 2;
                    System.out.print(numToPrint);
                } else if (j < cathetusLength - i - 1) System.out.print(" ");
                if (j == cathetusLength * 2 - 2) System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }
}
