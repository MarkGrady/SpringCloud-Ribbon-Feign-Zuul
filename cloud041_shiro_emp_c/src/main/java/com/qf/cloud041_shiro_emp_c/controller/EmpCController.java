package com.qf.cloud041_shiro_emp_c.controller;

import com.qf.cloud041_shiro_emp_c.service.EmpCService;
import com.qf.pojo.Emp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Slf4j
@Controller
public class EmpCController {
    @Autowired
    private EmpCService empCService;

    @RequestMapping(value = "empSave",method = RequestMethod.POST)
    public Emp addEmp(Emp emp){
        log.info("======add"+emp);
        Emp emp1 = empCService.addEmp(emp);
        return emp1;
    }

}
