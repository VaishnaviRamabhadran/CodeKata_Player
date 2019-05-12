import java.io.*;
import java.util.*;
class CodeKata_Player10{
public static void main(String[] args)
{
 String a,b;
int count=0;
 Scanner sc=new Scanner(System.in);
 a=sc.nextLine();
 b=sc.nextLine();
for(int i=0;i<a.length();i++)
{
	if(a.charAt(i)!=b.charAt(i))
	count++;

}
if(count==1)
System.out.print("yes");
else
System.out.print("no");
}
}