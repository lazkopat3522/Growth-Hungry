import java.util.Scanner;

class two_sum {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int[] ar = new int[100000];
        int[] inar = new int[100000];
        int[] dat = new int[100000];
        int c = 0;
        int m = 0;
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            inar[i] = n + m;
            m = inar[i];
            for (int j = 0; j < n; j++) {
                int power = (int) Math.pow(2, j);

                if (j == 0) {
                    ar[j] = a + power * b;
                } else
                    ar[j] = ar[j - 1] + power * b;


                dat[c] = ar[j];
                c++;
            }

        }
        int d=0;
        for (int i = 0; i < t; i++) //To see the indexes where I have to divide array
        {
            for (int j = d; j < inar[i]; j++) {
                System.out.print(dat[j] + " ");
            }
            System.out.println();
            d=inar[i];
        }

    }

    }
