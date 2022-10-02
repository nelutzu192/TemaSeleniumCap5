import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

    public static void main(String[] args) {

        //instantiem driverul si navigam pe URL ul aplicatiei
        ChromeDriver driver = WebDriverManager.getChromeDriverByManager();
        driver.get("https://testpages.herokuapp.com/styled/index.html");


        try{

//            interactWithFirtFourLinks(driver);
//                basicElementsPage(driver);
            attributesPage(driver);
        } finally{

            driver.quit();

        }

    }

    public static void interactWithFirtFourLinks(WebDriver driver){

        //identify the 4 links
        WebElement firstLink = driver.findElement(By.cssSelector("#basicpagetest"));
        firstLink.click();

        WebElement indexPage = driver.findElement(By.cssSelector(".page-navigation a"));
        indexPage.click();

        WebElement secondLink = driver.findElement(By.id("elementattributestest"));
        secondLink.click();

        indexPage = driver.findElement(By.cssSelector(".page-navigation a"));
        indexPage.click();

        WebElement thirdLink = driver.findElement(By.xpath("//*[@id=\"findbytest\"]"));
        thirdLink.click();

        indexPage = driver.findElement(By.cssSelector(".page-navigation a"));
        indexPage.click();

        WebElement fourthLink = driver.findElement(By.cssSelector("#tablestest"));
        fourthLink.click();

        indexPage = driver.findElement(By.cssSelector(".page-navigation a"));
        indexPage.click();

    }

    public static void basicElementsPage(WebDriver driver){

        WebElement firstLink = driver.findElement(By.cssSelector("#basicpagetest"));
        firstLink.click();

        //first paragraph
        WebElement para1 = driver.findElement(By.cssSelector("#para1"));
        System.out.println(para1.getText());


        //second para
        WebElement para2 = driver.findElement(By.id("para2"));
        System.out.println(para2.getText());

    }

    public static void attributesPage(WebDriver driver){

        WebElement secondLink = driver.findElement(By.id("elementattributestest"));
        secondLink.click();

        //static attributes
//        WebElement attributesParaghraph = driver.findElement(By.id("domattributes"));
//        System.out.println("Attribute 1: " + attributesParaghraph.getAttribute("class"));
//        System.out.println("Attribute 2: " + attributesParaghraph.getAttribute("custom-attrib"));
//        System.out.println("Attribute 3: " + attributesParaghraph.getAttribute("title"));
//        System.out.println("Attribute 4: " + attributesParaghraph.getAttribute("original-title"));

        //dynamic attributes
        WebElement dynamicAttributes = driver.findElement(By.id("jsattributes"));
        System.out.println("Dynamic text: " + dynamicAttributes.getText());

        System.out.println("nextInt before clicking button: " + dynamicAttributes.getAttribute("nextid"));
        System.out.println("custom-1 before click: " + dynamicAttributes.getAttribute("custom-1"));

        //button
        WebElement addAttributeButton = driver.findElement(By.className("styled-click-button"));

        //add an attribute

        addAttributeButton.click();
        System.out.println("nextInt after clicking button: " + dynamicAttributes.getAttribute("nextid"));
        System.out.println("custom-1 after click: " + dynamicAttributes.getAttribute("custom-1"));


    }

}
