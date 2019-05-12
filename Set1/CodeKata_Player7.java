import java.io.*;
import java.util.*;
class CodeKata_Player7{
public static void main(String[] args)
{
String s;
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
char[] c=s.toCharArray();
char temp;
for(int i=0;i<s.length()-1;i+=2)
{
temp=c[i];
c[i]=c[i+1];
c[i+1]=temp;
}
s=new String(c);
System.out.print(s);
}
}