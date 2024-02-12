package org.com.creditcards.functional.impl;

import org.com.creditcards.functional.impl.utils.Constants;

import java.util.List;

/**
 * Credit card generator class.
 */
public class CardGenerator {

    /**
     * Generates default card
     * @return default credit card
     */
    public static CreditCard generateDefaultCard() {
        return new CreditCard();
    }

    /**
     * Generates basic credit card
     * @return basic credit card
     */
    public static CreditCard generateBasicCard() {
        return new CreditCard(3000, Constants.BASIC_CARD, 15.0, List.of(
                Constants.TRANSACTION_TYPE_CASH_ADVANCE, Constants.TRANSACTION_TYPE_FEE), false,
                0);
    }

    /**
     * Generates active cash card
     * @return active cash card
     */
    public static CreditCard generateActiveCashCard() {
        return new CreditCard(25000, Constants.ACTIVE_CASH, 25.0, List.of(Constants.TRANSACTION_TYPE_PURCHASE,
                Constants.TRANSACTION_TYPE_FEE), true, 75);
    }

    /**
     * Generates cash everyday card
     * @return cash everyday credit card
     */
    public static CreditCard generateCashEverydayCard() {
        return new CreditCard(10000, Constants.CASH_EVERYDAY, 40.0, List.of(Constants.TRANSACTION_TYPE_CASH_ADVANCE,
                Constants.TRANSACTION_TYPE_PURCHASE), false, 0);
    }

    /**
     * Generates Daimond cash back card
     * @return Diamond cash back card
     */
    public static CreditCard generateDiamondCashbackCard() {
        return new CreditCard(8000, Constants.DIAMOND_CASH_BACK, 40.0, List.of(Constants.TRANSACTION_TYPE_CASH_ADVANCE,
                Constants.TRANSACTION_TYPE_PURCHASE, Constants.TRANSACTION_TYPE_FEE), true, 50);
    }

    /**
     * Generates Silver card
     * @return silver credit card
     */
    public static CreditCard generateSilverCard() {
        return new CreditCard(15000, Constants.SILVER_CARD, 35.0, List.of(Constants.TRANSACTION_TYPE_PURCHASE),
                false, 0);
    }
}
