import java.util.*;
public class patt17 {
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter any number:");
        int n = inp.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print((char)(k+64));
            }
            for(int l=i-1;l>0;l--)
            {
                System.out.print((char)(l+64));
            }
            System.out.println();
        }

    }
}
