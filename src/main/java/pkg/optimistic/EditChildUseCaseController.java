//package pkg.optimistic;
//
//import lombok.Getter;
//import lombok.extern.slf4j.Slf4j;
//import org.hibernate.Hibernate;
//import org.omnifaces.cdi.ViewScoped;
//import org.primefaces.context.RequestContext;
//import pkg.dao.ChildDAO;
//import pkg.dao.KindergardenDAO;
//import pkg.dao.TeacherDAO;
//import pkg.entities.Child;
//import pkg.entities.Kindergarden;
//import pkg.entities.Teacher;
//
//import javax.annotation.PostConstruct;
//import javax.inject.Inject;
//import javax.inject.Named;
//import javax.persistence.OptimisticLockException;
//import javax.transaction.Transactional;
//import java.io.Serializable;
//import java.util.List;
//
//@Named
//@ViewScoped
//@Slf4j
//public class EditChildUseCaseController implements Serializable {
//
//    @Getter
//    private Child selectedChild;
//    @Getter private Child conflictingChild;
//    @Getter private List<Child> allChildren;
//    @Getter private List<Kindergarden> allKindergardens;
//    @Getter private List<Teacher> allTeachers;
//
//    /*
//     * DAO:
//     */
//    @Inject
//    private ChildDAO childDAO;
//    @Inject private TeacherDAO teacherDAO;
//    @Inject private KindergardenDAO kindergardenDAO;
//
//    @PostConstruct
//    public void init() {
//        reloadAll();
//    }
//
//    public void prepareForEditing(Child child) {
//        selectedChild = child;
//        conflictingChild = null;
//    }
//
//    @Transactional
//    public void updateSelectedChild() {
//        try {
//            childDAO.updateAndFlush(selectedChild);
//            reloadAll();
//        } catch (OptimisticLockException ole) {
//            conflictingChild = childDAO.getById(selectedChild.getId());
//            Hibernate.initialize(conflictingChild.getTeacherList());
//            RequestContext.getCurrentInstance().addCallbackParam("validationFailed", true);
//        }
//    }
//
//    @Transactional
//    public void overwriteChild() {
//        selectedChild.setOptLockVersion(conflictingChild.getOptLockVersion());
//        updateSelectedChild();
//    }
//
//    public void reloadAll() {
//        allChildren = childDAO.getAllChildren();
//        allKindergardens = kindergardenDAO.getAllKindergardens();
//        allTeachers = teacherDAO.getAllTeachers();
//    }
//}
