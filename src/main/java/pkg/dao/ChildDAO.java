package pkg.dao;

import pkg.entities.Child;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class ChildDAO {
    @Inject
    private EntityManager em;

    public void create(Child child) {
        em.persist(child);
    }
    public void updateAndFlush(Child child) {
        em.merge(child);
        em.flush();
    }
    public List<Child> getAllChildren() {
        return em.createNamedQuery("Child.findAll", Child.class).getResultList();
    }

    public Child getById(Integer id) {
        return em.find( Child.class, id);
    }
}