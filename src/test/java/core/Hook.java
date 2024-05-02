package core;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hook extends BaseClass
{
  
     // login
//  @FindBy(xpath = externalxpath.NopcommerceXpath.Email)
//  public static WebElement Email;
  
  
  @FindBy(xpath="//*[@id=\"Email\"]")	 
  public static WebElement Email;
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.password)
  public static WebElement password;
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.err1gettext)
  public static WebElement err1gettext;
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.CLickloginbtn)
  public static WebElement CLickloginbtn;
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.CLicklogoutbtn)
  public static WebElement CLicklogoutbtn;
  
//  @FindBy(xpath = externalxpath.NopcommerceXpath.Dashboard)
//  public static WebElement Dashboard;
  
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.Clickmenubtn)
  public static WebElement Clickmenubtn;
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.clickoncustomer)
  public static WebElement clickoncustomer;
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.Addnewbtn)
  public static WebElement Addnewbtn;
  
//  @FindBy(xpath = externalxpath.NopcommerceXpath.addnewpagetitle)
//  public static WebElement addnewpagetitle;

  @FindBy(id = externalxpath.NopcommerceXpath.email)
  public static WebElement email;
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.Password)
  public static WebElement Password;
  
  
  @FindBy(id = externalxpath.NopcommerceXpath.FirstName)
  public static WebElement FirstName;
  
  @FindBy(id = externalxpath.NopcommerceXpath.LastName)
  public static WebElement LastName;
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.gender)
  public static WebElement gender;
  
  
  @FindBy(id = externalxpath.NopcommerceXpath.Dateofbirth)
  public static WebElement Dateofbirth;
  
  @FindBy(id = externalxpath.NopcommerceXpath.Company)
  public static WebElement Company;
  
  @FindBy(id = externalxpath.NopcommerceXpath.checkbox)
  public static WebElement checkbox;
  
 
  @FindBy(xpath = externalxpath.NopcommerceXpath.newslatterdropdown)
  public static WebElement newslatterdropdown;
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.newslatterdropdown1)
  public static WebElement newslatterdropdown1;
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.Admincomment)
  public static WebElement Admincomment;
     
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.savebtn)
  public static WebElement savebtn;
  
  
  @FindBy(tagName = externalxpath.NopcommerceXpath.bodyTagText1)
  public static WebElement bodyTagText1;
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.clickemail)
  public static WebElement clickemail;
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.searchbtn)
  public static WebElement searchbtn;
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.getactultext)
  public static WebElement getactultext;
  
  
  @FindBy(xpath = externalxpath.NopcommerceXpath.dropdown1)
  public static WebElement dropdown1;
  
  
  
  
  
  
  
}
