package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {
	@Test
	public void Weblogincarloan() {
		System.out.println("weblogincar");
	}

	@Test(dataProvider = "getData")
	public void Mobilesignoutcarloan(String username, String pwd) {
		System.out.println("mobilesignoutncar");
		System.out.println(username);
		System.out.println(pwd);
	}

	@Test(enabled=false)
	public void MobileLogincarloan() {
		System.out.println("mobilelogincar");
	}
	@Test(dependsOnMethods={"Weblogincarloan"})
	public void APILogincarloan() {
		System.out.println("APIlogincar");
	}

	@DataProvider
	public Object[][] getData()
	{
		Object [][] data= new Object[3][2];
		data[0][0]="first user name";
		data[0][1]="first password";
		
		data[1][0]="second user name";
		data[1][1]="second password";
		
		data[2][0]="third user name";
		data[2][1]="third password";
		return data;
		
	}
}
