import java.io.*;
import java.util.*;
public class String6
{
    String str;
	public int sumDigits(String str)
	{
		int len=str.length();
		int sum=0;
		for(int i=0;i<len;i++)
		{
			char c=str.charAt(i);
			if(Character.isDigit(c))
			{	String s1=""+c;
				sum+=Integer.parseInt(s1);
			}
		}
		return sum;
	}
}
