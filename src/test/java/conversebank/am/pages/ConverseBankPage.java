package conversebank.am.pages;

import conversebank.am.AllureLoggerCustom;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import java.time.Duration;

// page_url = https://www.conversebank.am/en/
public class ConverseBankPage {

    private final AllureLoggerCustom LOG = new AllureLoggerCustom(LoggerFactory.getLogger(ConverseBankPage.class));
    WebDriver driver;

    private final int WAIT_TIMEOUT = 10;

    @FindBy(xpath = "//a[normalize-space()='C360']")
    public WebElement c360Button;

    @FindBy(xpath = "//div[@class='main_menu']//a[@rel='noreferrer'][normalize-space()='Converse Mobile']")
    public WebElement converseMobileButton;

    @FindBy(xpath = "//a[normalize-space()='Deposits']")
    public WebElement depositsButton;

    @FindBy(xpath = "//a[normalize-space()='Loans']")
    public WebElement loansButton;

    @FindBy(xpath = "//a[normalize-space()='Cards']")
    public WebElement cardsButton;

    @FindBy(xpath = "//a[normalize-space()='Securities']")
    public WebElement securitiesButton;

    @FindBy(xpath = "//a[normalize-space()='Transfers']")
    public WebElement transfersButton;

    @FindBy(xpath = "//a[normalize-space()='Other']")
    public WebElement otherButton;

    @FindBy(xpath = "//a[normalize-space()='Online banking']")
    public WebElement onlineBankingButton;

    @FindBy(xpath = "(//button[normalize-space()='Custom'])[1]")
    public WebElement customButton;

    @FindBy(xpath = "//button[normalize-space()='Most profitable']")
    public WebElement mostProfitableButton;

    @FindBy(xpath = "//button[normalize-space()='Open a deposit']")
    public WebElement openDepositButton;

    @FindBy(xpath = "//button[normalize-space()='EUR']")
    public WebElement eurButton;

    @FindBy(xpath = "//button[normalize-space()='AMD']")
    public WebElement amdButton;

    @FindBy(xpath = "//button[normalize-space()='USD']")
    public WebElement usdButton;

    @FindBy(xpath = "//button[normalize-space()='45 days']")
    public WebElement daysButton;

    @FindBy(xpath = "//button[normalize-space()='3 months']")
    public WebElement threeMonthsButton;

    @FindBy(xpath = "//button[normalize-space()='6 months']")
    public WebElement sixMonthlyButton;

    @FindBy(xpath = "//button[normalize-space()='9 months']")
    public WebElement nineMonthButton;

    @FindBy(xpath = "//button[contains(text(),'1')]")
    public WebElement oneYearButton;

    @FindBy(xpath = "//button[normalize-space()='18 months']")
    public WebElement eighteenMonthButton;

    @FindBy(xpath = "//button[contains(text(),'2')]")
    public WebElement twoYearButton;

    @FindBy(xpath = "//label[normalize-space()='Option of partial withdrawal']")
    public WebElement optionOfPartialWithdrawalButton;

    @FindBy(xpath = "//label[normalize-space()='Option to add']")
    public WebElement optionToAddButton;

    @FindBy(xpath = "//label[normalize-space()='Monthly interest payment']")
    public WebElement monthlyInterestPaymentButton;

    @FindBy(xpath = "//div[@id='form_currency']//div[@class='switch_btns']//button[1]")
    public WebElement cashButton;

    @FindBy(xpath = "//div[@id='form_currency']//button[contains(text(),'Non Cash')]")
    public WebElement nonCashButton;

    @FindBy(xpath = "//button[normalize-space()='Clear all']")
    public WebElement clearAllButton;

    @FindBy(xpath = "//button[normalize-space()='Exchange currency']")
    public WebElement exchangeButton;

    @FindBy(xpath = "//div[@class='currency_content']//button[1]")
    public WebElement cashTowButton;

    @FindBy(xpath = "//div[@class='currency_content']//button[contains(text(),'Non Cash')]")
    public WebElement nonCashTowButton;

    @FindBy(xpath = "(//button[normalize-space()='Metal'])[1]")
    public WebElement metalButton;

    @FindBy(xpath = "//button[normalize-space()='See all']")
    public WebElement seeAllButton;

    @FindBy(xpath = "//a[@rel='noreferrer'][normalize-space()='See more']")
    public WebElement seeMoreButton;

    @FindBy(xpath = "//a[contains(@class,'view_more icon_right')]")
    public WebElement seeMoreTowButton;

    @FindBy(xpath = "//a[@href='/en/corporatebanking' and text()='BUSINESS']")
    public WebElement besinessButton;

    @FindBy(xpath = "//a[@href='/en/en' and text()='INDIVIDUALS']")
    public WebElement individualsButton;

    public boolean getC360IsActive() {
        LOG.info("Проверка доступности кнопки 'C360'");
        return c360Button.isEnabled();
    }

    public boolean getConverseMobileIsActive() {
        LOG.info("Проверка доступности кнопки 'converseMobile'");
        return converseMobileButton.isEnabled();
    }

    public boolean getDepositsIsActive() {
        LOG.info("Проверка доступности кнопки 'Deposits'");
        return depositsButton.isEnabled();
    }

    public boolean getLoansIsActive() {
        LOG.info("Проверка доступности кнопки'Loans'");
        return loansButton.isEnabled();
    }

    public boolean getCardsIsActive() {
        LOG.info("Проверка доступности кнопки 'Cards'");
        return cardsButton.isEnabled();
    }

    public boolean getSecuritiesIsActive() {
        LOG.info("Проверка доступности кнопки 'Securities'");
        return securitiesButton.isEnabled();
    }

    public boolean getTansfersIsActive() {
        LOG.info("Проверка доступности кнопки 'Transfers'");
        return transfersButton.isEnabled();
    }

    public boolean getOtherIsActive() {
        LOG.info("Проверка доступности кнопки 'Other'");
        return otherButton.isEnabled();
    }

    public boolean getOnlineBankingIsActive() {
        LOG.info("Проверка доступности кнопки 'OnlineBanking'");
        return onlineBankingButton.isEnabled();
    }

    public boolean getCustomIsActive() {
        LOG.info("Проверка доступности кнопки 'Custom'");
        return customButton.isEnabled();
    }

    public boolean getMostProfitableIsActive() {
        LOG.info("Проверка доступности кнопки 'Most Profitable'");
        return mostProfitableButton.isEnabled();
    }

    public boolean getOpenDepositIsActive() {
        LOG.info("Проверка доступности кнопки 'Open a Deposit'");
        return openDepositButton.isEnabled();
    }

    public boolean getEurIsActive() {
        LOG.info("Проверка доступности кнопки 'EUR'");
        return eurButton.isEnabled();
    }

    public boolean getAmdIsActive() {
        LOG.info("Проверка доступности кнопки 'AMD'");
        return amdButton.isEnabled();
    }

    public boolean getUsdIsActive() {
        LOG.info("Проверка доступности кнопки 'USD'");
        return usdButton.isEnabled();
    }

    public boolean getDaysIsActive() {
        LOG.info("Проверка доступности кнопки 45 days");
        return daysButton.isEnabled();
    }

    public boolean getThreeMonthsIsActive() {
        LOG.info("Проверка доступности кнопки 'Three-Months'");
        return threeMonthsButton.isEnabled();
    }

    public boolean getSixMonthlyIsActive() {
        LOG.info("Проверка доступности кнопк 'Six-Monthly'");
        return sixMonthlyButton.isEnabled();
    }

    public boolean getNineMonthIsActive() {
        LOG.info("Проверка доступности кнопк 'Nine-Month'");
        return nineMonthButton.isEnabled();
    }

    public boolean getOneYearIsActive() {
        LOG.info("Проверка доступности кнопк 'One-Year'");
        return oneYearButton.isEnabled();
    }

    public boolean getEighteenMonthIsActive() {
        LOG.info("Проверка доступности кнопк 'eighteen-Month'");
        return eighteenMonthButton.isEnabled();
    }

    public boolean getTwoYearIsActive() {
        LOG.info("Проверка доступности кнопк 'Two-Year'");
        return twoYearButton.isEnabled();
    }

    public boolean getOptionOfPartialWithdrawalIsActive() {
        LOG.info("Проверка доступности кнопк 'Option-of-Partial-Withdrawal'");
        return optionOfPartialWithdrawalButton.isEnabled();
    }

    public boolean getOptionToAddIsActive() {
        LOG.info("Проверка доступности кнопк 'Option-to-Add'");
        ;
        return optionToAddButton.isEnabled();
    }

    public boolean getMonthlyInterestPaymentIsActive() {
        LOG.info("Проверка доступности кнопк 'Monthly-Interest-Payment'");
        return monthlyInterestPaymentButton.isEnabled();
    }

    public boolean getCashIsActive() {
        LOG.info("Проверка доступности кнопк 'Cash'");
        return cashButton.isEnabled();
    }

    public boolean getNonCashIsActive() {
        LOG.info("Проверка доступности кнопк 'Non-Cash'");
        return nonCashButton.isEnabled();
    }

    public boolean getClearAllIsActive() {
        LOG.info("Проверка доступности кнопк 'Clear-All'");
        return clearAllButton.isEnabled();
    }

    public boolean getExchangeIsActive() {
        LOG.info("Проверка доступности кнопк 'Exchange currency'");
        return exchangeButton.isEnabled();
    }

    public boolean getCashTowIsActive() {
        LOG.info("Проверка доступности кнопк 'cash-tow'");
        return cashTowButton.isEnabled();
    }

    public boolean getNonCashTowIsActive() {
        LOG.info("Проверка доступности кнопк 'Non Cash Tow'");
        return nonCashTowButton.isEnabled();
    }

    public boolean getMetalIsActive() {
        LOG.info("Проверка доступности кнопк 'Metal'");
        return metalButton.isEnabled();
    }

    public boolean getSeeAllIsActive() {
        LOG.info("Проверка доступности кнопк 'See-All'");
        return seeAllButton.isEnabled();
    }

    public boolean getSeeMoreIsActive() {
        LOG.info("Проверка доступности кнопк 'See-More'");
        return seeMoreButton.isEnabled();
    }

    public boolean getSeeMoreTowIsActive() {
        LOG.info("Проверка доступности кнопк 'See-More Tow'");
        return seeMoreTowButton.isEnabled();
    }

    public boolean getBesinessIsActive() {
        LOG.info("Проверка доступности кнопк 'Besiness'");
        return besinessButton.isEnabled();
    }

    public boolean getIndividualsIsActive() {
        LOG.info("Проверка доступности кнопк INDIVIDUALS");
        return individualsButton.isEnabled();
    }

    public String seeMoreTowTransition() {
        LOG.info("Переход на страницу SeeMoreTow");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("animsition-loading")));
        seeMoreTowButton.click();
        return driver.getCurrentUrl();
    }

    public String besinessTransition() {
        LOG.info("Переход на страницу Besiness");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("animsition-loading")));
        besinessButton.click();
        return driver.getCurrentUrl();
    }

    public String individualsTransition() {
        LOG.info("Переход на страницу INDIVIDUALS");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("animsition-loading")));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", individualsButton);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("animsition-loading")));
        return driver.getCurrentUrl();
    }

    public ConverseBankPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT));
        wait.until(webDriver -> ((org.openqa.selenium.JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
    }
}
