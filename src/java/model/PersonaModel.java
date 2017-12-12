/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Persona;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Apolo
 */
public class PersonaModel {
    
    public List<Persona> getAll(){
        List<Persona> lis = new ArrayList<Persona>(); 
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            lis = s.createCriteria(Persona.class).list();
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
        return lis;
    }
                
    //CREATE
    
    public void createPersona(Persona p){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.save(p);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
      
    }
    
    //REMOVE
    
        public void removePersona(Persona p){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.delete(p);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
      
    }
        
        //UPDATE
        
        public void updatePersona(Persona p){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.update(p);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
      
    }
        public Persona getPersona(BigDecimal id){
            
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Persona p= new Persona();
        
        try {
            s.beginTransaction();
            p = (Persona) s.get(Persona.class, id);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        return p;
        }
        
    
}
