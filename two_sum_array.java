import java.util.Scanner;

public class two_sum_array {
    public static void main(String[] args) {
        int[] arr = new int[10000000];
        Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.print("nums = [");
        while(System.in != ""){

         do
             arr[c] = sc.nextInt();
             c++;

        }
        System.out.print("target = ");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }

    }


}
