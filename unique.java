import java.util.*;
class unique
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];

for(int i=0;i<a;i++)
{
b[i]=sc.nextInt();

}
int count=0;
for(int j=0;j<a;j++)
{
for(int k=0;k<a;k++)
{
if(b[j]==b[k])
count++;
}
if(count==1)
{
System.out.println(b[j]);

}
count=0;
}
}
}
