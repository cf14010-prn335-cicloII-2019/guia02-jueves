package ues.occ.edu.sv.ingenieria.prn335.controller.guia02;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import ues.occ.edu.sv.ingenieria.prn335.entity.guia02.Genero;

/**
 *
 * @author CF14010
 */
public class GeneroBean {
    
protected EntityManager em;
final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("CinePU");
public static final String filtrado = "[&a-z&[^aeiou]]";
/**
 * Metodo general para inicializar 
 * el Entity Manager a traves de un
 * Entity Manager Factory
 */
public void iniciarEM(){
    this.em = EMF.createEntityManager();
}

    public GeneroBean() {
    }

/**
 * Metodo general para manejar las transacciones
 * @return Retorna la Transaccion 
 * o una transaccion nula
 */
public EntityTransaction getTx(){
   try{
    if(this.em != null){
        return this.em.getTransaction();
    }else{
      throw new IllegalStateException("Entidad Vacia");
    }
   }catch(IllegalStateException e){
       Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
   }
   return null;
}

    

/**
 * Metodo para crear un nuevo genero
 * manejado a traves de transacciones
 * @param g 
 */
public void crearGenero(Genero g){
    EntityTransaction tx = this.getTx();
    tx.begin();
    this.em.persist(g);
    tx.commit();
}

/**
 * Metodo para modificar una entidad de
 * tipo Genero
 * @param g 
 */
public void modificarGenero(Genero g){
    EntityTransaction tx = this.getTx();
    tx.begin();
    this.em.merge(g);
    tx.commit();
}

/**
 * Metodo para filtrar y contar
 * las coincidencias existentes en
 * en la entidad Genero
 * @param Generos
 * @return Retorna la cantidad de coincidencias
 */
public int generosFiltrados(String Generos){
    int cantidad = 0;
  String[]f;
   f = Generos.split(" ");
   
    for(String algo : f){
        if(algo.trim().matches(filtrado)){
            cantidad++;
        }
    }
    return cantidad;
    }
}