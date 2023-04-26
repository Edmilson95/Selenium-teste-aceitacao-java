package br.com.alura.leilao;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PageObject {

	protected WebDriver browser;

	public PageObject(WebDriver browser) {
		System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
		if (browser == null) {
			this.browser = new EdgeDriver();
		} else {
			this.browser = browser;
		}
		this.browser.manage().timeouts()
		.implicitlyWait(5, TimeUnit.SECONDS)
		.pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	public void fechar() {
		this.browser.quit();
	}
}
