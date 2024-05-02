package externalxpath;



public class NopcommerceXpath 
{
  // login
	//public static final String Email = "//*[@id=\"Email\"]";
	public static final String password = "//*[@id=\"Password\"]";
	public static final String CLickloginbtn = "//button[text()='Log in']";
	public static final String CLicklogoutbtn = "//a[text()='Logout']";
	//public static final String  Dashboard= "//title[text()='Dashboard / nopCommerce administration']";
	public static final String err1gettext ="//div[@class='message-error validation-summary-errors']";
	
    // Menu
    public static final String Clickmenubtn = "//a[@href='#']//p[contains(text(),'Customers')]";
    public static final String clickoncustomer = "//p[text()=' Customers']";
    public static final String Addnewbtn = "//a[@class='btn btn-primary']";
   // public static final String  addnewpagetitle= "/html/head/title";
    public static final String  email= "Email";
    public static final String  Password= "//input[@id='Password']";
    public static final String  FirstName= "FirstName";
    public static final String  LastName= "LastName";
    public static final String  gender= "//*[@id=\"customer-info\"]/div[2]/div[5]/div[2]/div/div[1]";
    public static final String  Dateofbirth= "DateOfBirth";
    public static final String  Company= "Company";
    public static final String  checkbox= "IsTaxExempt";

    public static final String  newslatterdropdown= "//*[@id=\"customer-info\"]/div[2]/div[9]/div[2]/div/div[1]/div/div";
    public static final String  newslatterdropdown1= "//*[@id=\"SelectedNewsletterSubscriptionStoreIds_listbox\"]/li[2]";
    public static final String  Admincomment= "//*[@id=\"AdminComment\"]";
    public static final String  savebtn= "//button[@name='save']";
    public static final String  bodyTagText1= "Body";
    public static final String dropdown1 ="//*[@id=\"VendorId\"]";
///////////////////search by email-------------------------//    
    public static final String  clickemail= "//*[@id=\"SearchEmail\"]";
    public static final String  searchbtn= "//*[@id=\"search-customers\"]";
    public static final String  getactultext= "//*[@id=\"customers-grid\"]/tbody/tr[1]/td[2]";
}
