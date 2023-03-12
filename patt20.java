import java.util.Scanner;

public class patt20 {
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter any number:");
        int n=inp.nextInt();

        for(int i = 1;i<=n-1;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=(2*n)-(2*i);k++)
            {
                System.out.print(" ");
            }
            for(int l=i;l>0;l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i = n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=(2*n)-(2*i);k++)
            {
                System.out.print(" ");
            }
            for(int l=i;l>0;l--)
            {
                System.out.print("*");
            }
           
            System.out.println();
            
        }
        
    }
}
