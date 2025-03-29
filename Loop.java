import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int[] ar = new int[100000];
        int[] inar = new int[100000];
        int[] dat = new int[100000];
        int c=0;
        int c1=0;
        int m=0;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            inar[c1]=n+m;
            c1++;
            m=n;
             for(int j=0;j<n;j++){
                int power = (int) Math.pow(2,j);

                if(j==0) {
                    ar[j]=a+power*b;
                } else {
                    ar[j]=ar[j-1]+power*b;
                }

                dat[c]=ar[j];
                c++;
            }

        }
        for (int j=0;j<inar.length;j++) {

            for (int i = 0; i < c; i++)
            if(i==inar[j]-1)
                System.out.println(dat[i]+" ");
            } else
            {
                System.out.print(dat[i] + " ");

            }

        }
    }
}