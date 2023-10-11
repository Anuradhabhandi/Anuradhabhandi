import java.util.Scanner;

public class Pangram {

			public static boolean Pangram(String str)
			{
				boolean[] Alpha = new boolean[26];

				int index = 0;

				for (int i = 0; i < str.length(); i++) {
					
					if ('A' <= str.charAt(i)
						&& str.charAt(i) <= 'Z')
						index = str.charAt(i) - 'A';

					
					else if ('a' <= str.charAt(i)
							&& str.charAt(i) <= 'z')

						index = str.charAt(i) - 'a';
					else
						continue;
					Alpha[index] = true;
				}

				for (int i = 0; i <= 25; i++)
					if (Alpha[i] == false)
						return (false);
				return (true);
			}


			public static void main(String[] args)
			{
				
	           String str="abcdefghijklmnopqrstuvwxyz ";

				if (Pangram(str) == true)
					System.out.print(str + " \nis a pangram.");
				else
					System.out.print(str + " \nis not a pangram.");
			}
			}
			
		
   

