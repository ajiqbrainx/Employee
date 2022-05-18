package com.example.employee.Service;


import com.example.employee.Repository.Repository;
import com.example.employee.entity.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service1 {

    @Autowired
    Repository rep;

    public List<Model> getData() {
        return rep.findAll();
    }
    public Model getByid(int id) {
       return rep.findOne(id);

    }

    public Model insertData(Model mod) {
        rep.save(mod);
        return mod;
    }

    public Model updateData(Model mod) {
        rep.saveAndFlush(mod);
        return mod;
    }
    public void deleteData(int id){
        rep.deleteById(id);
    }


}
