/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.data.hib.nativ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author mkonda
 */
public class TradeDAO {

    private SessionFactory sessionFactory = null;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
    private Session session = null;

    public void persist(Trade t) {
        beginTx();
        session.save(t);
        commitTx();
        System.out.println("Trade successfully persisted");
    }

    private void beginTx() {
        session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
    }

    private void commitTx() {
        session.getTransaction().commit();
    }
}
