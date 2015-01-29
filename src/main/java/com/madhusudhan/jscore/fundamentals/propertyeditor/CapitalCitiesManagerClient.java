/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.fundamentals.propertyeditor;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mkonda
 */
public class CapitalCitiesManagerClient {

    private ApplicationContext context = null;
    private CapitalCitiesManager capitalCitiesManager = null;

    public void init() {
        context = new ClassPathXmlApplicationContext("fundamentals-beans.xml");
        capitalCitiesManager = context.getBean("capitalCitiesManager", CapitalCitiesManager.class);
    }

    public void fetchData() {
        List<String> countriesList = capitalCitiesManager.getCountriesList();
        System.out.println("Countries(via List):");
        System.out.println("---------------------");
        for (String country : countriesList) {
            System.out.println(country);
        }

        Set<String> countriesSet = capitalCitiesManager.getCountriesSet();
        System.out.println("Countries (via Set):");
        System.out.println("---------------------");
        for (String country : countriesSet) {
            System.out.println(country);
        }
        
        Properties countriesProperties = capitalCitiesManager.getCountryProperties();
        System.out.println("Countries (via Properties):");
        System.out.println("---------------------");
        for(Object key: countriesProperties.keySet()){
           System.out.println("Country & Capital (from Properties): "+key+" --> "+countriesProperties.get(key)); 
        }
        
        Map<String,String> countriesCapitalsMap = capitalCitiesManager.getCountriesCapitalsMap();
        System.out.println("Countries (via Map):");
        System.out.println("---------------------");
        for(String key: countriesCapitalsMap.keySet()){
            System.out.println("Country & Capital (from Map): "+key+" --> "+countriesCapitalsMap.get(key));
        }
        
        Map<String,Object> countriesCapitalsRefMap = capitalCitiesManager.getCountriesCapitalsRefMap();
        System.out.println("Countries (via Ref Map):");
        System.out.println("---------------------");
        for(String key: countriesCapitalsRefMap.keySet()){
            System.out.println("Country & Capital (from RefMap): "+key+" --> "+countriesCapitalsRefMap.get(key));
        }
    }

    public static void main(String[] args) {
        CapitalCitiesManagerClient provider = new CapitalCitiesManagerClient();
        provider.init();
        provider.fetchData();
    }
}
