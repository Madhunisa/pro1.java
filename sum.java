# pro1.java

import java.io.*;
import java.util.*;
public class sum1
{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int sum=0;
    for(int i=0;i<N;i++)
    {
        int d=s.nextInt();
        sum=sum+d;
    }
       System.out.println(sum);
}
}
