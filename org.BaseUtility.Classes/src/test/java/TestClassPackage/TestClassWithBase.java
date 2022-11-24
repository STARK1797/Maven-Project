package TestClassPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasePackage.BaseClass;

public class TestClassWithBase extends BaseClass {

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		launchBrowser("Chrome");
	}
	
	@Test
	public void TC01() {
		System.out.println("TestClassWithBase TC01");
	}
	@Test
	public void TC02() {
		System.out.println("TestClassWithBase TC02");
	}
	@Test
	public void TC03() {
		System.out.println("TestClassWithBase TC03");
	}
}
