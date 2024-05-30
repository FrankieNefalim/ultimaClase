package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import pagePackage.LoginPage;

class Test1 {

	private WebDriver driver;
	LoginPage loginPage = new LoginPage(driver);

	@BeforeEach
	void setUp() throws Exception {
		loginPage = new LoginPage(driver);

		driver = loginPage.chromeDriverConnection();
		loginPage.visit("https://www.saucedemo.com/");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void testStandardUser() {
		loginPage.loginStandardUser();
		loginPage.loginSuccess();
		assertTrue(loginPage.loginSuccess(), "No se encontro la pagina");
	}

	@Test
	void testPasswordMissing() {
		loginPage.loginWithOutPassword();
		loginPage.loginFailed();
		assertTrue(loginPage.loginFailed(), "No se encontro la pagina");
	}

	
}
