package com.qf.cloud041_shiro_dept_c.controller;

import com.qf.cloud041_shiro_dept_c.service.DeptCService;
import com.qf.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class DeptCController {
    @Autowired
    private DeptCService deptCService;
@RequestMapping(value = "/deptAll",method = RequestMethod.GET)
    public String showAll(Model model){
        List<Dept> depts = deptCService.findAll();
        model.addAttribute("depts",depts);
        return "dept_list";
    }
}
