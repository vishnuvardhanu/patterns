import java.util.*;
public class patt4 {
    /**
     * @param args
     */
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter any integer");
        int n= inp.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1; j<=i ;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

