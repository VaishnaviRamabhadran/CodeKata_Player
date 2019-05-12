import java.io.*;
import java.util.*;
class CodeKata_Player3{
public static void main(String[] args)
{
int n,digit=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0)
{
digit=digit*10+n%10;
n=n/10;
}
System.out.print(digit);
}
}