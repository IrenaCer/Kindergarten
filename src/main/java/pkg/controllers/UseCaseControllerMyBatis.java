package pkg.controllers;

import lombok.Getter;
import lombok.Setter;
import pkg.mybatis.dao.KindergardenMapper;
import pkg.mybatis.model.Kindergarden;
import pkg.mybatis.model.Child;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Model
public class UseCaseControllerMyBatis implements Serializable {

    @Getter
    private List<Kindergarden> kindergardenList;

    @Getter
    @Setter
    private Kindergarden selectedKindergarden = new Kindergarden();

    @Getter
    @Setter
    private Child selectedChild = new Child();

    @Inject
    private KindergardenMapper kindergardenMapper;


    @PostConstruct
    public void init() {
        loadAllKindergardens();
    }

    @Transactional
    public void createKindergardenAndChild() {
        kindergardenMapper.insert(selectedKindergarden);
    }

    public void loadAllKindergardens() {
        kindergardenList = kindergardenMapper.selectAll();
    }
}

