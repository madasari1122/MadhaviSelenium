package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Parameters({"URL","APIkey/usrname"})
	@Test
	public void ploan(String urlname,String key)
	{
		System.out.println("good");
		System.out.println(urlname);
		System.out.println(key);
	}
}
