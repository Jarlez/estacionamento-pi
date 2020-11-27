package models;

import entidades.ClienteMensalista;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ModelMensalista {

    public static EntityManager openDB() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("estacionamentoPU");
        return emf.createEntityManager();
    }

    public boolean cadastrarmActionPerformed(ClienteMensalista cm) {
        EntityManager em = ModelMensalista.openDB();
        try {
            em.getTransaction().begin();
            if (cm.getIds() == null) {
                em.persist(cm);
            } else {
                em.merge(cm);
            }
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        } finally {
            em.close();
        }
    }

    public Iterable<ClienteMensalista> listamClientes() {
        EntityManager em = ModelMensalista.openDB();
        try {
            return em.createQuery("select cm from ClienteMensalista cm order by cm.usuario").getResultList();
        } finally {
            em.close();
        }
    }

    public void remove(Long ids) {
        EntityManager em = ModelMensalista.openDB();
        try {
            ClienteMensalista cm = em.find(ClienteMensalista.class, ids);
            em.getTransaction().begin();
            em.remove(cm);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        }

    }

}
