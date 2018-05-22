package pkg.controllers;

import pkg.dao.ChildDAO;
import pkg.entities.Kindergarden;
import lombok.Getter;
import lombok.Setter;
import pkg.dao.KindergardenDAO;
import pkg.dao.ChildDAO;
import pkg.entities.Child;
import pkg.entities.Child;


import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class UseCaseController implements Serializable {

    @Getter
    private List<Kindergarden> kindergardenList;

    @Getter
    @Setter
    private List<Child> childList;

    @Getter
    @Setter
    private Kindergarden selectedKindergarden = new Kindergarden();

    @Getter
    @Setter
    private Child selectedChild = new Child();

    @Getter
    @Setter
    private Child editableChild;

    @Inject
    private KindergardenDAO kindergardenDAO;

    @Inject
    private ChildDAO childDAO;

    @PostConstruct
    public void init() {
        loadAllKindergardens();
    }

    @Transactional
    public void createKindergardenAndChild() {
        selectedChild.setKindergarden(selectedKindergarden);
        selectedKindergarden.getChildList().add(selectedChild);
        kindergardenList.add(selectedKindergarden);
        kindergardenDAO.create(selectedKindergarden);
        childDAO.create(selectedChild);
    }

    public void loadAllKindergardens() {
        kindergardenList = kindergardenDAO.getAllKindergardens();
    }
}
