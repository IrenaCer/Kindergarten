///*
//package pkg.controllers;
//
//import lombok.Getter;
//import lombok.Setter;
//import pkg.mybatis.dao.KindergardenMapper;
//import pkg.mybatis.dao.ChildMapper;
//import pkg.mybatis.model.Kindergarden;
//import pkg.mybatis.model.Child;
//
//import javax.annotation.PostConstruct;
//import javax.enterprise.inject.Model;
//import javax.inject.Inject;
//import javax.transaction.Transactional;
//import java.io.Serializable;
//import java.util.List;
//
//@Model
//public class UseCaseControllerMybatis implements Serializable {
//
//    @Getter
//    private List<Kindergarden> kindergardenList;
//
//    @Getter
//    @Setter
//    private List<Child> childList;
//
//    @Getter
//    @Setter
//    private Kindergarden selectedKindergarden = new Kindergarden();
//
//    @Getter
//    @Setter
//    private Child selectedChild = new Child();
//
//    @Inject
//    private KindergardenMapper kindergardenMapper;
//
//    @Inject
//    private ChildMapper childMapper;
//
//    @PostConstruct
//    public void init() {
//        loadAllKindergardens();
//    }
//
//    @Transactional
//    public void createKindergardenAndChild() {
//        kindergardenMapper.insert(selectedKindergarden);
//        selectedChild.setKindergardenId(selectedKindergarden.getId());
//        childMapper.insert(selectedChild);
//    }
//
//    public void loadAllKindergardens() {
//        kindergardenList = kindergardenMapper.selectAll();
//    }
//}
//*/
