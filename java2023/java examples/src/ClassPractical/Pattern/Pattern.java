package ClassPractical.Pattern;
public class Pattern {
    public void p1(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public void p2(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }

    public void p3(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void p4(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(rows - j + 1);
            }
            System.out.println();

        }
    }

    public void p5(int rows, int columns) {
        int count = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();

        }
    }

    public void p6(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public void p7(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }

    public void p8(int rows, int columns) {
        int count = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();

        }
    }

    public void p9(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            int value = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();

        }
    }

    public void p10(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + j - 1);
            }
            System.out.println();

        }
    }

    public void p11(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i - j + 1);
            }
            System.out.println();

        }
    }

    public void p12(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                char ch = (char) ('A' + i - 1);
                System.out.print(ch);
            }
            System.out.println();

        }
    }

    public void p13(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                char ch = (char) ('A' + j - 1);
                System.out.print(ch);
            }
            System.out.println();

        }
    }

    public void p14(int rows, int columns) {
        int start = 'A';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                char ch = (char) start;
                System.out.print(ch);
                start = start + 1;
            }
            System.out.println();

        }
    }

    public void p15(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                char ch = (char) ('A' + i + j - 2);
                System.out.print(ch);
            }
            System.out.println();

        }
    }

    public void p16(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                char ch = (char) ('A' + i - 1);
                System.out.print(ch);

            }
            System.out.println();

        }
    }

    public void p17(int rows, int columns) {
        int start = 'A';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                char ch = (char) start;
                System.out.print(ch);
                start = start + 1;
            }
            System.out.println();

        }
    }

    public void p18(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                char ch = (char) ('A' + i + j - 2);
                System.out.print(ch);
            }
            System.out.println();

        }
    }

    public void p19(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                char ch = (char) ('A' + rows - i);
                System.out.print(ch);
            }
            System.out.println();

        }
    }

    public void p20(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {


            for (int space = rows - i; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public void p21(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public void p22(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {

            for (int space = i - 1; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= columns - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public void p23(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {

            for (int space = i - 1; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= columns - i + 1; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }

    public void p24(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {

            for (int space = i - 1; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int j = i; j <= columns; j++) {
                System.out.print(j);
            }
            System.out.println();
//
        }
    }

    public void p25(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {

            for (int space = rows - i; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }

    public void p26(int rows, int columns) {
        int count = 1;
        for (int i = 1; i <= rows; i++) {

            for (int space = rows - i; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();

        }
    }

    public void p27(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {

            for (int space = rows - i; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();

        }
    }

    public void p28(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j + " ");
            }
            for (int k = 2 * i - 2; k >= 1; k--) {
                System.out.print("* ");
            }
            for (int l = 1; l <= rows - i + 1; l++) {
                System.out.print((rows - i - l + 2) + " ");
            }

            System.out.println();

        }
    }

    public void p29(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j + " ");
            }
            for (int k = 2 * i - 2; k >= 1; k--) {
                System.out.print("* ");
            }
            for (int l = 1; l <= rows - i + 1; l++) {
                System.out.print((rows - i - l + 2) + " ");
            }

            System.out.println();

        }
    }

    public void hollowRectangle(int rows, int columns) {
        //outer loop
        for (int i = 1; i <= rows; i++) {
            // inner loop -columns
            for (int j = 1; j <= columns; j++) {
                // cell(i,j)
                if (i == 1 || i == rows || j == 1 || j == columns)
                //boundary cell
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}