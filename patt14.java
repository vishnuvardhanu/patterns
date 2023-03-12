import java.util.Scanner;

public class patt14 {
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter any number:");
        int n=inp.nextInt();
        for(int i=65;i<=n+65;i++)
        {
            for(int j=65;j<=i;j++)
            {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}
