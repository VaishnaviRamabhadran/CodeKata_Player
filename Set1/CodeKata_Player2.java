import java.io.*;
import java.util.*;
class CodeKata_Player2{
static int Fact(int n)
{
   if(n==0||n==1)
   {
    return 1;
   }
   else
   {
   return n*Fact(n-1);
   }
}
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.print(Fact(n));
}
}