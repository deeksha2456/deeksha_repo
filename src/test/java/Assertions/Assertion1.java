package Assertions;

import java.io.IOException;

import BaseScripts.Base;
import Utilities.Screenshots;

public class Assertion1 extends Base {
	
	public static void assert_1(String exp, String act) throws IOException
	{
		if(exp.equals(act))
		{
			
			
			System.out.println("equal");
		
		}
		
		else
		{
			System.out.println("not equal");
		}
	}
}


