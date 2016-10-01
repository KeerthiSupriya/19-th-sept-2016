import java.io.*;
import java.util.*;
import java.lang.*;
public class String7
{
	String s;
	public int maxBlock(String s)
	{
		int n=s.length(),count=1,max=0;
		for(int i=1;i<n;i++)
		{
				if(s.charAt(i)==s.charAt(i-1))
				{
					count++;
				}
				else
				{
					if(max<count)
					{
						max=count;
					}
						count=1;
				}
		}
		if(max<count)
					{
						max=count;
					}
		return max;
	}
	
}
