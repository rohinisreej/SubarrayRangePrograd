import java.util.Scanner;
import java.util.Arrays;
class Subarray{
    public void subarray(int a,int b,int array[])
    {
        int[] sub = Arrays.copyOfRange(array, a, b+ 1);
        System.out.println(Arrays.toString(sub));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        System.out.println("Enter the array values: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int st=scanner.nextInt();
        int end=scanner.nextInt();
        Subarray su =new Subarray();
        su.subarray(st,end,arr);
    }
}