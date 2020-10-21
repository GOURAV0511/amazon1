package com.stackroute.ticl.selenium.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageUI extends BasePage {
	
	@FindBy(xpath="//a[@id='nav-link-accountList']") WebElement linkSign;
	@FindBy(xpath="//input[@id='ap_email']") WebElement txtEmailID;
	@FindBy(xpath="//input[@id='continue']") WebElement btnContinue;
	@FindBy(xpath="//input[@id='ap_password']") WebElement txtPasswsord;
	@FindBy(xpath="//input[@id='signInSubmit']") WebElement btnSign1;
	@FindBy(xpath="//a[@id='nav-hamburger-menu']") WebElement hambergmenu;
	@FindBy(xpath="//*[@id=\'hmenu-content\']/ul[1]/li[10]/a/div") WebElement tvappliances;
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[3]/a") WebElement subcategory;
	@FindBy(xpath="//*[@id=\"leftNav_261657\"]/div[2]/div/ul/li[3]/a") WebElement button1;
	@FindBy(xpath="//*[@id=\"leftNav\"]/ul[5]/div/li[3]/span/a/span") WebElement button2;
	@FindBy(xpath="//*[@id=\"leftNav\"]/ul[15]/div/li[1]/span/a/i") WebElement button3;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span") WebElement item;
	//Switch to tab
	@FindBy(xpath="//input[@id='add-to-cart-button']") WebElement Addtocart;
	
	@FindBy(xpath="//a[@id='hlb-view-cart-announce']") WebElement shoptocart;
	@FindBy(xpath="//span[@id='a-autoid-0']") WebElement Qtybtn;
	@FindBy(xpath="//*[@id=\'dropdown1_4\']") WebElement dropdownState;
	//switch to previous tab
	@FindBy(xpath="//*[@id=\'nav-subnav\']/a[3]/span[1]") WebElement category;
	@FindBy(xpath="//*[@id=\'leftNav\']/ul[1]/ul/div/li[4]/span/a/span") WebElement subCategory;
	@FindBy(xpath="//*[@id=\'leftNav\']/ul[9]/div/li[4]/span/a/span") WebElement pricebtn;
	@FindBy(xpath="//*[@id=\'p_72/1318476031\']/span/a/section/i") WebElement reviewbtn;
	@FindBy(xpath="//*[@id=\'search\']/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span") WebElement product;
	// switch to tab;
	@FindBy(xpath="//input[@id='add-to-cart-button']") WebElement addcart;
	@FindBy(xpath="//a[@id='hlb-view-cart-announce']") WebElement carticon;
	@FindBy(xpath="//*[@id=\'nav-item-signout\']/span") WebElement linkSignOut;
	@FindBy(xpath="//a[@id='nav-link-accountList']") WebElement linkSign1;
	@FindBy(xpath="//input[@id='ap_email']") WebElement txtEmailID1;
	@FindBy(xpath="//input[@id='continue']") WebElement btnContinue1;
	@FindBy(xpath="//input[@id='ap_password']") WebElement txtPassword;
	@FindBy(xpath="(//input[@id='signInSubmit']") WebElement submit1;
	@FindBy(xpath="//*[@id=\'snav-cart-text-container\']/span[2]") WebElement cart2;
	public PageUI(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	public void amazonProduct() throws Exception{
		linkSign.click();
		txtEmailID.sendKeys("vvvvvvvvvv@gmail.com");
		btnContinue.click();
		txtPasswsord.sendKeys("vvvvvvvvvvvvvv");
		Thread.sleep(5000);
		btnSign1.click();
		Thread.sleep(10000);
		hambergmenu.click();
		tvappliances.click();
		subcategory.click();
		button1.click();
		button2.click();
		button3.click();
		item.click();
		switchToTab(1);
		Addtocart.click();
		shoptocart.click();
		Qtybtn.click();
		dropdownState.click();
		switchToTab(0);
		category.click();
		subCategory.click();
		pricebtn.click();
		reviewbtn.click();
		product.click();
		switchToTab(1);
		addcart.click();
		carticon.click();
		linkSignOut.click();
		linkSign1.click();
		txtEmailID1.sendKeys("vvvvvvvvv@gmail.com");
		btnContinue1.click();
		txtPassword.sendKeys("vvvvvvvvvs");
		submit1.click();
		cart2.click();
	}
}
