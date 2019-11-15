package com.qf.cloud041_shiro_emp_p.service;

import com.qf.pojo.Emp;

import java.util.List;

public interface EmpPService {
    public List<Emp> findAll();
    public Emp findOne(int empno);
    public Emp saveEmp(Emp emp);
    public Emp updateEmp(Emp emp);
    public Boolean deleteEmp(int empno);
}
