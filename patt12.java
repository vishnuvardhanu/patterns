import java.util.*;
public class patt12 {
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter any number");
        int n = inp.nextInt();
        for(int i = 1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int k=1;k<=(2*n)-(2*i);k++)
            {
                System.out.print(" ");
            }
            for(int l=i;l>0;l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
