package com.qf.cloud041_shiro_emp_p.controller;

import com.qf.cloud041_shiro_emp_p.service.EmpPService;
import com.qf.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpPController {
    @Autowired
    private EmpPService empPService;
    @RequestMapping(value = "/empSave",method = RequestMethod.POST)
    public Emp addEmp( Emp emp){
        Emp saveEmp = empPService.saveEmp(emp);
        return saveEmp;
    }

}
