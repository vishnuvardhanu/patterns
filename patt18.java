import java.util.Scanner;

public class patt18 {
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(n+65-j));
            }
            System.out.println();
        }
    }
}
