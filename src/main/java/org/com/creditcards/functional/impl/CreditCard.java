package org.com.creditcards.functional.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class to configure credit cards with attributes card limit, nickName, late payment fee, transaction type etc.,
 */
public class CreditCard {
    private double creditCardLimit; // Credit limit for the credit card
    private String nickName; // Nickname of the credit card something like Gold, Silver etc.,
    private double latePaymentFee; // late payment for the card
    private List<String> allowedTransactionTypes; // allowed transactions
    private boolean balanceTransferEnabled; // balance transfer is enabled or not
    private double balanceTransferFee; // balance transfer fee(in case the balance transfer is enabled)

    // Default constructor with default attribute values
    public CreditCard() {
        this.creditCardLimit = 0;
        this.nickName = "Default Credit Card";
        this.latePaymentFee = 0;
        this.allowedTransactionTypes = new ArrayList<>();
        this.balanceTransferEnabled = false;
        this.balanceTransferFee = 0;
    }

    /**
     * @param creditLimit             credit limit for the card
     * @param nickName                nicakname of the card type
     * @param latePaymentFee          late payment fee for the card
     * @param allowedTransactionTypes credit card type
     * @param balanceTransferEnabled  is balance transfer enabled (true/false)
     * @param balanceTransferFee      fee for the balance transfer
     */
    public CreditCard(double creditLimit, String nickName, double latePaymentFee, List<String> allowedTransactionTypes,
                      boolean balanceTransferEnabled, double balanceTransferFee) {
        this.creditCardLimit = creditLimit;
        this.nickName = nickName;
        this.latePaymentFee = latePaymentFee;
        this.allowedTransactionTypes = allowedTransactionTypes;
        this.balanceTransferEnabled = balanceTransferEnabled;
        this.balanceTransferFee = balanceTransferFee;
    }

    // Getters and setters

    public double getCreditLimit() {
        return creditCardLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditCardLimit = creditLimit;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public double getLatePaymentFee() {
        return latePaymentFee;
    }

    public void setLatePaymentFee(double latePaymentFee) {
        this.latePaymentFee = latePaymentFee;
    }

    public List<String> getAllowedTransactionTypes() {
        return allowedTransactionTypes;
    }

    public void setAllowedTransactionTypes(List<String> allowedTransactionTypes) {
        this.allowedTransactionTypes = allowedTransactionTypes;
    }

    public boolean isBalanceTransferEnabled() {
        return balanceTransferEnabled;
    }

    public void setBalanceTransferEnabled(boolean balanceTransferEnabled) {
        this.balanceTransferEnabled = balanceTransferEnabled;
    }

    public double getBalanceTransferFee() {
        return balanceTransferFee;
    }

    public void setBalanceTransferFee(double balanceTransferFee) {
        this.balanceTransferFee = balanceTransferFee;
    }
}


