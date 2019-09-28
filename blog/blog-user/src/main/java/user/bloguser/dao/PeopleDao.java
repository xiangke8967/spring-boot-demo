package user.bloguser.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import user.bloguser.entity.mapper.PeopleMapper;
import user.bloguser.entity.po.People;

import java.util.List;

@Repository
public class PeopleDao {

    @Autowired
    private PeopleMapper peopleMapper;

    public List<People> findAll(){
        return peopleMapper.selectAll();
    }

}
