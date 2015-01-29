/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.containers.autowire;

/**
 *
 * @author mkonda
 */
public class TradeReceiver {
    private TradePersistor tradePersistor = null;
    private TradeTransformer tradeTransformer = null;

    @Override
    public String toString() {
        return "TradeReceiver{" + "tradePersistor=" + tradePersistor + ", tradeTransformer=" + tradeTransformer + '}';
    }
}
