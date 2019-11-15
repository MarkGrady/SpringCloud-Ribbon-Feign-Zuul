package com.qf.cloud041_shiro_dept_p.service;

import com.qf.pojo.Dept;

import java.util.List;

public interface DeptPService {

    public List<Dept> findAll();
    public Dept findOne(int deptno);
    public Dept saveDept(Dept dept);
    public Dept updateDept(Dept dept);
    public Boolean deleteDept(int deptno);
}
