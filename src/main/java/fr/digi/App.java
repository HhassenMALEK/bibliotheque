package fr.digi;

import fr.digi.entites.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Id;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // CRUD ==>Creste/Insert
       /* Livre livreACreer = new Livre (6 ,"Harry Potter" ,  "J.K. Rowling");*/
        Livre livreACreer= new Livre ("Harry Potter" ,  "J.K. Rowling");
        em.persist(livreACreer);
        em.persist(livreACreer);
        //update Silencieux;
        livreACreer.setAuteur("Hassen MALEK");

        // CRUD ==>Read/Select
        Livre livreALire = em.find(Livre.class, 8); //il faut un id  pour le find fonctionne
        if(livreALire != null){
            System.out.println(livreALire.getTitre());
        }

        //CRUD Update/Modifier
        Livre livreAModifier = em.find(Livre.class, 9);
        if(livreALire != null){
            livreAModifier.setTitre("Les Misérable");
        }

        //CRUD Delete
        Livre livreASupprimer = em.find(Livre.class, 8);
        if(livreASupprimer != null ){
            em.remove(livreASupprimer);
        }

        em.getTransaction().commit();
        System.out.println(livreACreer);
        em.close();
        emf.close();
    }
}