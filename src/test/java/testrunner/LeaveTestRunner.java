package testrunner;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LeavePage;
import pages.LoginPage;
import setup.Setup;

public class LeaveTestRunner extends Setup {

    @BeforeTest
    public void doLogin(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.dologin("Admin","admin123");
    }



    @Test
    public void LeaveList() throws InterruptedException {
        LeavePage leavePage=new LeavePage(driver);
        leavePage.leftMenubar.get(2).click();
        Thread.sleep(5000);
        String messageActual=driver.findElements(By.className("oxd-table-filter-title")).get(0).getText();
        String messageExpected="Leave List";
        Assert.assertTrue(messageActual.contains(messageExpected));
    }

}
