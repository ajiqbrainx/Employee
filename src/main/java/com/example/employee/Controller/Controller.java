package com.example.employee.Controller;

import com.example.employee.Service.Service1;
import com.example.employee.entity.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EmployeeCheck")

public class Controller {
    @Autowired
    Service1 service;

    @GetMapping("/GetEmployee")
    public List<Model> getEmployee() {

        return service.getData();
    }

    @GetMapping("/GetByid/{id}")
    public Model getById(@PathVariable int id,Model mod) {
       return service.getByid(mod);

    }

    @PutMapping("/update")
    public Model updateData(@RequestBody Model mod) {
        return service.updateData(mod);
    }

    @PostMapping("/insertData")
    public Model insertData(@RequestBody Model mod) {
        return service.insertData(mod);
    }

    @DeleteMapping("/deleteData/id")
    public void deleteData(@RequestParam int id) {
        service.deleteData(id);

    }


}
