import java.io.*;

public class ZohoRecruitmentProgram 
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int length = input.length(); 
		
		int index = length/2;
		
		String result = "";
		
		int spaces = length-1;
		
		for(int i = index; i < length;i++)
		{
			for(int j=0;j<spaces;j++)
				System.out.print(" ");
			
			result = result+input.charAt(i);
			System.out.print(result);
			spaces--;
			System.out.println();
		}
		
		for(int i = 0; i < index;i++)
		{	
			for(int j=0;j<spaces;j++)
				System.out.print(" ");
			
			result = result+input.charAt(i);
			System.out.print(result);
			spaces--;
			System.out.println();
		}
	}
}
