/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Vehiculo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
/**
 *
 * @author ADGA
 */
public class VehiculoModel {
    
    public List<Vehiculo> getAll(){
        List<Vehiculo> lis = new ArrayList<Vehiculo>(); 
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            lis = s.createCriteria(Vehiculo.class).list();
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
        return lis;
    }
                
    //CREATE
    
    public void createElemeto(Vehiculo ve){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.save(ve);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
      
    }
    
    //REMOVE
    
        public void removeVehiculo(Vehiculo ve){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.delete(ve);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
      
    }
        
        //UPDATE
        
        public void updateVehiculo(Vehiculo ve){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.update(ve);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
      
    }
        public Vehiculo getVehiculo(BigDecimal id){
            
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Vehiculo ve= new Vehiculo();
        
        try {
            s.beginTransaction();
            ve = (Vehiculo) s.get(Vehiculo.class, id);
            s.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        return ve;
        }
        
        
 
}
