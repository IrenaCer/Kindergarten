package pkg.dao;

import pkg.entities.Kindergarden;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class KindergardenDAO {
    @Inject
    private EntityManager em;

    public void create(Kindergarden kindergarden) {
        em.persist(kindergarden);
    }

    public List<Kindergarden> getAllKindergardens() {
        return em.createNamedQuery("Kindergarden.findAll", Kindergarden.class).getResultList();
    }

    public Kindergarden getById(Integer id) {
        return em.createNamedQuery("Kindergarden.findById", Kindergarden.class).setParameter(id, "id").getSingleResult();
    }


}
