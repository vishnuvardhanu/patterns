import java.util.*;
public class patt11 {
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter any number");
        int n=inp.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0; j<=i ;j++)
            {
                if(j%2==0)
                System.out.print("0");
                else
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
