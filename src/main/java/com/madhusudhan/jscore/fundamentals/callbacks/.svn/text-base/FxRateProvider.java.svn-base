/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.fundamentals.callbacks;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mkonda
 */
public class FxRateProvider {

    private double rate = 0.0;
    private String baseCurrency = "USD";
    private Map<String, Double> currencies = null;

    public FxRateProvider() {
        //impl goes here..
    }

    public void initMe() {
        currencies = new HashMap<String, Double>();

        currencies.put("GBP", 1.5);
        currencies.put("USD", 1.0);
        currencies.put("JPY", 1000.0);
        currencies.put("EUR", 1.4);
        currencies.put("INR", 50.00);
    }

    public void destroyMe() {
        // do your cleanup operations here
        currencies = null;
    }
    public double getRate(String currency) {
        if (!currencies.containsKey(currency)) {
            return 0;
        }
        return currencies.get(currency);
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }
}
