import java.util.*;
import java.io.*;
public class String8
{
	String str;
	public int countTriple(String str)
	{
		int n=str.length();
		int count=0;
		for(int i=0;i<n-2;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				if(str.charAt(i)==str.charAt(i+2))
				{
					count++;
				}
			}
		}
		return count;
	}
}
