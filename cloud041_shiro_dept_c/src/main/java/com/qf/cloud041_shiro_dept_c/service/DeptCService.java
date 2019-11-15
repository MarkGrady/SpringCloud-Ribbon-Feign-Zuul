package com.qf.cloud041_shiro_dept_c.service;

import com.qf.pojo.Dept;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface DeptCService {
    @RequestMapping(value = "/deptAll",method = RequestMethod.GET)
    public List<Dept> findAll();
    @RequestMapping(value = "/deptOne",method = RequestMethod.GET)
    public Dept findOne(int deptno);
    @RequestMapping(value = "/deptSave",method = RequestMethod.POST)
    public Dept saveDept(Dept dept);
    @RequestMapping(value = "/deptUp",method = RequestMethod.PUT)
    public Dept updateDept(Dept dept);
    @RequestMapping(value = "/deptDe",method = RequestMethod.DELETE)
    public Boolean deleteDept(int deptno);

}
