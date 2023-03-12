import java.util.*;
public class patt08 {
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter any number:");
        int n = inp.nextInt();
        for(int i=n;i>=0;i--)
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
