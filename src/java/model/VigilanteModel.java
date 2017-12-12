/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Vigilante;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Apolo
 */
public class VigilanteModel {
    
    public List<Vigilante> getAll(){
        List<Vigilante> lis = new ArrayList<Vigilante>(); 
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            lis = s.createCriteria(Vigilante.class).list();
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
        return lis;
    }
                
    //CREATE
    
    public void createVigilante(Vigilante vi){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.save(vi);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
      
    }
    
    //REMOVE
    
        public void removeVigilante(Vigilante vi){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.delete(vi);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
      
    }
        
        //UPDATE
        
        public void updateVigilante(Vigilante vi){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.update(vi);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
      
    }
        public Vigilante getVigilante(BigDecimal id){
            
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Vigilante vi= new Vigilante();
        
        try {
            s.beginTransaction();
            vi = (Vigilante) s.get(Vigilante.class, id);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        return vi;
        }
        
}
