import java.io.*;
import java.util.*;
class CodeKata_Player8{
public static void main(String[] args)
{
String s;
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
String[] c=s.split(" ");
s="";
for(int i=0;i<c.length;i++)
{
c[i]=Character.toUpperCase(c[i].charAt(0))+c[i].substring(1);
s+=c[i]+" ";
}
System.out.print(s);
}
}