package user.bloguser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user.bloguser.dao.PeopleDao;
import user.bloguser.entity.po.People;

import java.util.List;

@RestController
@RequestMapping("/user")
public class test {

    @Autowired
    private PeopleDao peopleDao;

    @GetMapping("/list")
    public List<People> list(){
        return peopleDao.findAll();
    }


}
