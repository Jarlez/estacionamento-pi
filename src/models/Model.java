package models;

import entidades.ClienteAfiliado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Model {

    public static EntityManager openDB() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("estacionamentoPU");
        return emf.createEntityManager();
    }

    public boolean cadastrarActionPerformed(ClienteAfiliado ca) {

        EntityManager em = Model.openDB();
        try {
            em.getTransaction().begin();
            if (ca.getId() == null) {
                em.persist(ca);
            } else {
                em.merge(ca);
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

    public List<ClienteAfiliado> listaClientes() {
        EntityManager em = Model.openDB();
        try {
            return em.createQuery("select ca from ClienteAfiliado ca order by ca.nome").getResultList();
        } finally {
            em.close();
        }
    }

    public void remove(Long id) {
        EntityManager em = Model.openDB();
        try {
            ClienteAfiliado ca = em.find(ClienteAfiliado.class, id);
            em.getTransaction().begin();
            em.remove(ca);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
}
