/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Session;

import Model.Entity.Memberships;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DTT
 */
@Stateless
public class MembershipsFacade extends AbstractFacade<Memberships> implements MembershipsFacadeLocal {
    @PersistenceContext(unitName = "truyenPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MembershipsFacade() {
        super(Memberships.class);
    }
    
}
