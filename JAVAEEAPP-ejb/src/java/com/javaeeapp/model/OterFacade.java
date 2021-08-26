/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaeeapp.model;

import com.javaeeapp.entities.Oter;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MATEO AVILA
 */
@Stateless
public class OterFacade extends AbstractFacade<Oter> {

    @PersistenceContext(unitName = "JAVAEEAPP-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OterFacade() {
        super(Oter.class);
    }
    
}
