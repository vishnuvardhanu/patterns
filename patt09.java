//diamond pattern
import java.util.*;
public class patt09 {
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter any number");
        int n=inp.nextInt();
        
        //upper part pyramid
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for(int l=1;l<i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //lower part reverse pyramid
        for(int i=n-1;i>=0;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for(int l=1;l<i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
