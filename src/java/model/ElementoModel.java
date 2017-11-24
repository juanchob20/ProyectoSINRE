/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Elemento;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author user 
 * juan
 */
public class ElementoModel {
    
    public List<Elemento> getAll(){
        List<Elemento> lis = new ArrayList<Elemento>(); 
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            lis = s.createCriteria(Elemento.class).list();
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
        return lis;
    }
                
    //CREATE
    
    public void createElemeto(Elemento el){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.save(el);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
      
    }
    
    //REMOVE
    
        public void removeElemeto(Elemento el){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.delete(el);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
      
    }
        
        //UPDATE
        
        public void updateElemeto(Elemento el){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.update(el);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
      
    }
        public Elemento getElemento(BigDecimal id){
            
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Elemento el= new Elemento();
        
        try {
            s.beginTransaction();
            el = (Elemento) s.get(Elemento.class, id);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        return el;
        }
        
        
        
}
