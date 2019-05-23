package pkg.dao;

import pkg.entities.Teacher;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class TeacherDAO {
    @Inject
    private EntityManager em;

    public void create(Teacher teacher) {
        em.persist(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return em.createNamedQuery("Teacher.findAll", Teacher.class).getResultList();
    }
}
