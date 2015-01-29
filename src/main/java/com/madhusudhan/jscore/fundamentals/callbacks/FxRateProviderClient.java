/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.fundamentals.callbacks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.net.www.content.image.gif;

/**
 *
 * @author mkonda
 */
public class FxRateProviderClient {

    private ApplicationContext context = null;
    private FxRateProvider fxRateProvider = null;

    public void init() {
        context = new ClassPathXmlApplicationContext("fundamentals-beans.xml");
        fxRateProvider = context.getBean("fxRateProvider", FxRateProvider.class);
    }

    public double getRate(String currency) {
        return fxRateProvider.getRate(currency);
    }

    public String getBaseCurrency() {
        return fxRateProvider.getBaseCurrency();
    }
    public static void main(String[] args) {
        FxRateProviderClient provider = new FxRateProviderClient();

        provider.init();

        System.out.println("Rate is "+provider.getRate("GBP") +" [Base Currency "+provider.getBaseCurrency()+"]");
                
    }
}
