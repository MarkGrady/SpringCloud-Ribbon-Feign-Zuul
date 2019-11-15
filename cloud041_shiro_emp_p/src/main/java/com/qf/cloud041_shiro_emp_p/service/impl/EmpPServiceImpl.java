package com.qf.cloud041_shiro_emp_p.service.impl;

import com.qf.cloud041_shiro_emp_p.mapper.EmpPMapper;
import com.qf.cloud041_shiro_emp_p.service.EmpPService;
import com.qf.pojo.Emp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmpPServiceImpl implements EmpPService {
@Resource
private EmpPMapper empPMapper;

    @Override
    public List<Emp> findAll() {
        List<Emp> emps = empPMapper.findAll();
        return emps;
    }

    @Override
    public Emp findOne(int empno) {
        Emp one = empPMapper.findOne(empno);
        return one;
    }

    @Override
    public Emp saveEmp(Emp emp) {
        Emp emp1 = empPMapper.saveEmp(emp);
        return emp1;
    }

    @Override
    public Emp updateEmp(Emp emp) {
        Emp updateEmp = empPMapper.updateEmp(emp);
        return updateEmp;
    }

    @Override
    public Boolean deleteEmp(int empno) {
        Boolean deleteEmp = empPMapper.deleteEmp(empno);
        return deleteEmp;
    }
}
