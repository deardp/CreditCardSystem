package org.com.creditcards.functional.tests;

import org.com.creditcards.functional.impl.CardGenerator;
import org.com.creditcards.functional.impl.CreditCard;
import org.com.creditcards.functional.impl.utils.Constants;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {

    /**
     * Verifies default card configuration.
     */
    @Test
    public void testGenerateDefaultCard() {
        CreditCard defaultCard = CardGenerator.generateDefaultCard();
        assertNotNull(defaultCard);
        assertEquals(0.0, defaultCard.getCreditLimit());
        assertEquals(Constants.DEFAULT_CARD, defaultCard.getNickName());
        assertEquals(0.0, defaultCard.getLatePaymentFee());
        assertEquals(0, defaultCard.getAllowedTransactionTypes().size());
        assertFalse(defaultCard.isBalanceTransferEnabled());
        assertEquals(0.0, defaultCard.getBalanceTransferFee());
    }

    /**
     * Verifies the basic card type config
     */
    @Test
    public void testGenerateBasicCard() {
        CreditCard basicCard = CardGenerator.generateBasicCard();
        assertNotNull(basicCard);
        assertEquals(3000.0, basicCard.getCreditLimit());
        assertEquals(Constants.BASIC_CARD, basicCard.getNickName());
        assertEquals(15.0, basicCard.getLatePaymentFee());
        assertEquals(2, basicCard.getAllowedTransactionTypes().size());
        assertTrue(basicCard.getAllowedTransactionTypes().contains(Constants.TRANSACTION_TYPE_CASH_ADVANCE));
        assertTrue(basicCard.getAllowedTransactionTypes().contains(Constants.TRANSACTION_TYPE_FEE));
        assertFalse(basicCard.isBalanceTransferEnabled());
        assertEquals(0.0, basicCard.getBalanceTransferFee());
    }

    /**
     * Verifies the active cash card type config
     */
    @Test
    public void testGenerateActiveCashCard() {
        CreditCard activeCashCard = CardGenerator.generateActiveCashCard();
        assertNotNull(activeCashCard);
        assertEquals(25000.0, activeCashCard.getCreditLimit());
        assertEquals(Constants.ACTIVE_CASH, activeCashCard.getNickName());
        assertEquals(25.0, activeCashCard.getLatePaymentFee());
        assertEquals(2, activeCashCard.getAllowedTransactionTypes().size());
        assertTrue(activeCashCard.getAllowedTransactionTypes().contains(Constants.TRANSACTION_TYPE_PURCHASE));
        assertTrue(activeCashCard.getAllowedTransactionTypes().contains(Constants.TRANSACTION_TYPE_FEE));
        assertTrue(activeCashCard.isBalanceTransferEnabled());
        assertEquals(75.0, activeCashCard.getBalanceTransferFee());
    }

    /**
     * Verifies the cash every day card type config
     */
    @Test
    public void testGenerateCashEverydayCard() {
        CreditCard cashEverydayCard = CardGenerator.generateCashEverydayCard();
        assertNotNull(cashEverydayCard);
        assertEquals(10000.0, cashEverydayCard.getCreditLimit());
        assertEquals(Constants.CASH_EVERYDAY, cashEverydayCard.getNickName());
        assertEquals(40.0, cashEverydayCard.getLatePaymentFee());
        assertEquals(2, cashEverydayCard.getAllowedTransactionTypes().size());
        assertTrue(cashEverydayCard.getAllowedTransactionTypes().contains(Constants.TRANSACTION_TYPE_CASH_ADVANCE));
        assertTrue(cashEverydayCard.getAllowedTransactionTypes().contains(Constants.TRANSACTION_TYPE_PURCHASE));
        assertFalse(cashEverydayCard.isBalanceTransferEnabled());
        assertEquals(0.0, cashEverydayCard.getBalanceTransferFee());
    }

    /**
     * Verifies the diamond cash back type config
     */
    @Test
    public void testGenerateDiamondCashbackCard() {
        CreditCard diamondCashbackCard = CardGenerator.generateDiamondCashbackCard();
        assertNotNull(diamondCashbackCard);
        assertEquals(8000.0, diamondCashbackCard.getCreditLimit());
        assertEquals(Constants.DIAMOND_CASH_BACK, diamondCashbackCard.getNickName());
        assertEquals(40.0, diamondCashbackCard.getLatePaymentFee());
        assertEquals(3, diamondCashbackCard.getAllowedTransactionTypes().size());
        assertTrue(diamondCashbackCard.getAllowedTransactionTypes().contains(Constants.TRANSACTION_TYPE_CASH_ADVANCE));
        assertTrue(diamondCashbackCard.getAllowedTransactionTypes().contains(Constants.TRANSACTION_TYPE_PURCHASE));
        assertTrue(diamondCashbackCard.getAllowedTransactionTypes().contains(Constants.TRANSACTION_TYPE_FEE));
        assertTrue(diamondCashbackCard.isBalanceTransferEnabled());
        assertEquals(50.0, diamondCashbackCard.getBalanceTransferFee());
    }

    /**
     * Veirifies the silver card type config.
     */
    @Test
    public void testGenerateSilverCard() {
        CreditCard silverCard = CardGenerator.generateSilverCard();
        assertNotNull(silverCard);
        assertEquals(15000.0, silverCard.getCreditLimit());
        assertEquals(Constants.SILVER_CARD, silverCard.getNickName());
        assertEquals(35.0, silverCard.getLatePaymentFee());
        assertEquals(1, silverCard.getAllowedTransactionTypes().size());
        assertTrue(silverCard.getAllowedTransactionTypes().contains(Constants.TRANSACTION_TYPE_PURCHASE));
        assertFalse(silverCard.isBalanceTransferEnabled());
        assertEquals(0.0, silverCard.getBalanceTransferFee());
    }
}
