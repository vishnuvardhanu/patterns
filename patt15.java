import java.util.Scanner;

public class patt15 {
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter any number:");
        int n=inp.nextInt();
        int k=65;
        for(int i=n;i>=0;i--)
        {
            for(int j=1;j<=i;j++)
            {
             System.out.print((char)k);
             k++;
            }
            k=65;
            System.out.println();
        }
    }
}
