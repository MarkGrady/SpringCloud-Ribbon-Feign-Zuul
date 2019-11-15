package com.qf.cloud041_shiro_emp_p.mapper;


import com.qf.pojo.Emp;

import java.util.List;

public interface EmpPMapper {
    public List<Emp> findAll();
    public Emp findOne(int empno);
    public Emp saveEmp(Emp emp);
    public Emp updateEmp(Emp emp);
    public Boolean deleteEmp(int empno);
}
