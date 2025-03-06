package conversebank.am.tests;

import conversebank.am.MyExtensions;
import conversebank.am.pages.ConverseBankPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MyExtensions.class)
public class ConverseBankTest extends BaseTest {
    private ConverseBankPage ConverseBankP;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.conversebank.am/en/");
        ConverseBankP = new ConverseBankPage(getDriver());
    }

    @Test
    @DisplayName("Проверка активности кнопки C360")
    public void c360IsActive() {
        Assertions.assertTrue(ConverseBankP.getC360IsActive(), "C360 кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки converseMobile")
    public void converseMobileIsActive() {
        Assertions.assertTrue(ConverseBankP.getConverseMobileIsActive(), "converseMobile кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Deposits")
    public void depositsIsActive() {
        Assertions.assertTrue(ConverseBankP.getDepositsIsActive(), "Deposits кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Loans")
    public void loansIsActive() {
        Assertions.assertTrue(ConverseBankP.getLoansIsActive(), "Loans кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Cards")
    public void cardsIsActive() {
        Assertions.assertTrue(ConverseBankP.getCardsIsActive(), "Cards кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Securities")
    public void securitiesIsActive() {
        Assertions.assertTrue(ConverseBankP.getSecuritiesIsActive(), "Securities кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Transfers")
    public void transfersIsActive() {
        Assertions.assertTrue(ConverseBankP.getTansfersIsActive(), "Transfers кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Othe")
    public void othersIsActive() {
        Assertions.assertTrue(ConverseBankP.getOtherIsActive(), "Othe кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки OnlineBanking")
    public void onlineBankingIsActive() {
        Assertions.assertTrue(ConverseBankP.getOnlineBankingIsActive(), "Online Banking кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Custom")
    public void customIsActive() {
        Assertions.assertTrue(ConverseBankP.getCustomIsActive(), "Custom кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки MostProfitable")
    public void mostProfitableIsActive() {
        Assertions.assertTrue(ConverseBankP.getMostProfitableIsActive(), "Most Profitable кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Open a Deposit")
    public void openDepositIsActive() {
        Assertions.assertTrue(ConverseBankP.getOpenDepositIsActive(), "Open a Deposit кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки EUR")
    public void eurIsActive() {
        Assertions.assertTrue(ConverseBankP.getEurIsActive(), "EUR кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки AMD")
    public void amdIsActive() {
        Assertions.assertTrue(ConverseBankP.getAmdIsActive(), "AMD кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки USD")
    public void usdIsActive() {
        Assertions.assertTrue(ConverseBankP.getUsdIsActive(), "USD кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки 45 days")
    public void daysIsActive() {
        Assertions.assertTrue(ConverseBankP.getDaysIsActive(), "45 days кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Three-Months")
    public void threeMonthsIsActive() {
        Assertions.assertTrue(ConverseBankP.getThreeMonthsIsActive(), "Three-Months кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Six-Monthly")
    public void sixMonthlyIsActive() {
        Assertions.assertTrue(ConverseBankP.getSixMonthlyIsActive(), "Six-Monthly кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Nine-Month")
    public void nineMonthIsActive() {
        Assertions.assertTrue(ConverseBankP.getNineMonthIsActive(), "Nine-Month кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки One-Year")
    public void oneYearIsActive() {
        Assertions.assertTrue(ConverseBankP.getOneYearIsActive(), "One-Year кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки eighteen-Month")
    public void eighteenMonthIsActive() {
        Assertions.assertTrue(ConverseBankP.getEighteenMonthIsActive(), "eighteen-Month кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Two-Year")
    public void twoYearIsActive() {
        Assertions.assertTrue(ConverseBankP.getTwoYearIsActive(), "Two-Year кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Option-of-Partial-Withdrawal")
    public void optionOfPartialWithdrawalIsActive() {
        Assertions.assertTrue(ConverseBankP.getOptionOfPartialWithdrawalIsActive(), "Option-of-Partial-Withdrawal кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Option-to-Add")
    public void optionToAddIsActive() {
        Assertions.assertTrue(ConverseBankP.getOptionToAddIsActive(), "Option-to-Add кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Monthly-Interest-Payment")
    public void monthlyInterestPaymentIsActive() {
        Assertions.assertTrue(ConverseBankP.getMonthlyInterestPaymentIsActive(), "Monthly-Interest-Payment кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Cash")
    public void cashIsActive() {
        Assertions.assertTrue(ConverseBankP.getCashIsActive(), "Cash кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Non-Cash")
    public void nonCashIsActive() {
        Assertions.assertTrue(ConverseBankP.getNonCashIsActive(), "Non-Cash кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Clear-All")
    public void clearAllIsActive() {
        Assertions.assertTrue(ConverseBankP.getClearAllIsActive(), "Clear-All кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Exchange currency")
    public void exchangeIsActive() {
        Assertions.assertTrue(ConverseBankP.getExchangeIsActive(), "Exchange currency кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки cash-tow")
    public void cashTowIsActive() {
        Assertions.assertTrue(ConverseBankP.getCashTowIsActive(), "cash-tow кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Non Cash Tow")
    public void nonCashTowIsActive() {
        Assertions.assertTrue(ConverseBankP.getNonCashTowIsActive(), "Non Cash Tow кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Metal")
    public void metalIsActive() {
        Assertions.assertTrue(ConverseBankP.getMetalIsActive(), "Metal кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки See-All")
    public void seeAllIsActive() {
        Assertions.assertTrue(ConverseBankP.getSeeAllIsActive(), "See-Al кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки See-More")
    public void seeMoreIsActive() {
        Assertions.assertTrue(ConverseBankP.getSeeMoreIsActive(), "See-More кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки See-More Tow")
    public void seeMoreTowIsActive() {
        Assertions.assertTrue(ConverseBankP.getSeeMoreTowIsActive(), "See-More Tow кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Besiness")
    public void besinessIsActive() {
        Assertions.assertTrue(ConverseBankP.getBesinessIsActive(), "Besiness кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки INDIVIDUALS")
    public void individualsIsActive() {
        Assertions.assertTrue(ConverseBankP.getIndividualsIsActive(), "INDIVIDUALS кнопка не активна");
    }

    @Test
    @DisplayName("Проверка перехода на страницу SeeMoreTow")
    public void seeMoreTowTest() {
        String expectedUrl = "https://www.conversebank.am/en/blog";
        String actualUrl = ConverseBankP.seeMoreTowTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Проверка перехода на страницу Besiness")
    public void besinessTest() {
        String expectedUrl = "https://www.conversebank.am/en/corporatebanking";
        String actualUrl = ConverseBankP.besinessTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Проверка перехода на страницу INDIVIDUALS")
    public void individualsTest() {
        String expectedUrl = "https://www.conversebank.am/en/en";
        String actualUrl = ConverseBankP.individualsTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }
}
