package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LeavePage {

    @FindBy(className = "oxd-main-menu-item--name")
    public List<WebElement> leftMenubar;

    public LeavePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

}
