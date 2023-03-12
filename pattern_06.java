import java.util.*;
public class patt6 {
public static void main(String args[])
{
Scanner inp = new Scanner(System.in);
System.out.println("enter value");
int n = inp.nextInt();
for(int i=n;i>=0;i--)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(j);
    }
    System.out.println();
}
}
}
