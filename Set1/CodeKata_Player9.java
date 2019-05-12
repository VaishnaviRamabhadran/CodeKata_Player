import java.io.*;
import java.util.*;
class CodeKata_Player9{
public static void main(String[] args)
{
 int a,b,flag,count=0;
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 b=sc.nextInt();
 for(int i=a;i<=b;i++)
 {
  flag=1;
  for(int j=2;j<=i/2;j++)
  {
	if(i%j==0)
	{
	flag=0;break;
	}
  }
  if(flag==1)
  {
    count++;
   }
  }
System.out.print(count);
}
}