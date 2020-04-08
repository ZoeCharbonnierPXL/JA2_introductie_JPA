package be.pxl.ja2.jpa;

import be.pxl.ja2.jpa.model.Visitors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OpdrachtChangeVisitor {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("musicdb_pu");
            entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction tx = entityManager.getTransaction();
            tx.begin();
            Visitors visitor = entityManager.find(Visitors.class, 1L);
            visitor.setFirstName("Manon");
            tx.commit();
            entityManager.detach(visitor);
            visitor.setFirstName("Maugane");
        } finally {
            if(entityManagerFactory == null) {
                entityManagerFactory.close();
            }
        }
    }
}
