package org.com.creditcards.functional.impl.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Project constants
 */
public class Constants {
    // Credit card types
    public static final String DEFAULT_CARD = "Default Credit Card";
    public static final String BASIC_CARD = "Basic";
    public static final String ACTIVE_CASH = "Active Cash";
    public static final String CASH_EVERYDAY = "Cash Everyday";
    public static final String DIAMOND_CASH_BACK = "Diamond Cashback";
    public static final String SILVER_CARD = "Silver";

    // Attribute names
    public static final String CREDIT_LIMIT = "Credit Limit";
    public static final String NICKNAME = "NickName";
    public static final String LATE_PAYMENT_FEE = "Late Payment Fee";
    public static final String ALLOWED_TRANSACTION_TYPES = "Allowed Transaction Types";
    public static final String BALANCE_TRANSFER_ENABLED = "Balance Transfer Enabled";
    public static final String BALANCE_TRANSFER_FEE = "Balance Transfer Fee";

    // Default values
    public static final double DEFAULT_CREDIT_LIMIT = 0.0;
    public static final String DEFAULT_NICKNAME = "Default Card";
    public static final double DEFAULT_LATE_PAYMENT_FEE = 0.0;
    public static final String TRANSACTION_TYPE_CASH_ADVANCE = "Cash advance";
    public static final String TRANSACTION_TYPE_PURCHASE = "Purchase";
    public static final String TRANSACTION_TYPE_FEE = "Fee";
    public static final boolean DEFAULT_BALANCE_TRANSFER_ENABLED = false;
    public static final double DEFAULT_BALANCE_TRANSFER_FEE = 0.0;
}
