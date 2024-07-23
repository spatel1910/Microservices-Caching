package com.caffeine.caffeine_cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private  EmployeeService employeeService;


    @GetMapping("/employee/name")
    public String getEmployeeData(){
        String name=employeeService.getData();
        return name;
    }
    @GetMapping("/employee/name/{data}")
    public String updateEmployeeData(@PathVariable("data") int data){
        String name=employeeService.updateData();
        return name;
    }

    @GetMapping("employee/clearCache")
    public String clearCacheData(){
        String str=employeeService.clearCache();
        return str;
    }


}

