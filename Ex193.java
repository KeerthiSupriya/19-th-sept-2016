import java.io.*;
import java.util.*;
public class Ex193{
	
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		String8 o=new String8();
		int n=o.countTriple(str);
		System.out.println(n);
		
	}
}
