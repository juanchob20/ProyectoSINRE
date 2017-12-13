/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Categoria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class CategoriaModel {
    
      public List<Categoria> getAll(){
        List<Categoria> lis = new ArrayList<Categoria>(); 
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            lis = s.createCriteria(Categoria.class).list();
            s.getTransaction().commit();
            
        } catch (HibernateException e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
        return lis;
    }
      
      //CREATE
    
    public void createCategoria(Categoria c){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.save(c);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
      
    }
    
    //REMOVE
    
        public void removeCategoria(Categoria c){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.delete(c);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
      
    }
        
        //UPDATE
        
        public void updateElemeto(Categoria c){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.update(c);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
      
    }
        public Categoria getCategoria(BigDecimal id){
            
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Categoria c= new Categoria();
        
        try {
            s.beginTransaction();
            c = (Categoria) s.get(Categoria.class, id);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        return c;
        }
    
}
