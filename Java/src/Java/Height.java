package Java;

import java.util.Scanner;

public class Height 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int FatherHeight = 0;
		int MotherHeight = 0;
		System.out.println("please input your father's height:"+"cm");
		FatherHeight = in.nextInt();
		System.out.println("please input your mother's height:"+"cm");
		MotherHeight = in.nextInt();
		System.out.println("son's height is "+(FatherHeight+MotherHeight)*1.08/2+"cm");
		in.close();
	}
}
