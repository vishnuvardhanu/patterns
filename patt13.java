import java.util.*;
class patt13
{
    public static void main(String args[])
    {
    Scanner inp = new Scanner(System.in);
    System.out.println("enter any number:");
    int n = inp.nextInt();
    int l=1;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(l+" ");
            l++;
        }
        System.out.println();
    }
    }
}