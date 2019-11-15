package com.qf.cloud041_shiro_dept_p.service.impl;


import com.qf.cloud041_shiro_dept_p.mapper.DeptPMapper;
import com.qf.cloud041_shiro_dept_p.service.DeptPService;
import com.qf.pojo.Dept;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptPServiceImpl implements DeptPService {
    Logger lg= LogManager.getFormatterLogger(DeptPServiceImpl.class);
    @Autowired
    private DeptPMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        List<Dept> depts = deptMapper.findAll();
        return depts;
    }

    @Override
    public Dept findOne(int deptno) {
        Dept dept = deptMapper.findOne(deptno);
        lg.info("----------"+dept);
        return dept;
    }

    @Override
    public Dept saveDept(Dept dept) {
        return deptMapper.saveDept(dept);
    }

    @Override
    public Dept updateDept(Dept dept) {
        return deptMapper.updateDept(dept);
    }

    @Override
    public Boolean deleteDept(int deptno) {
        Boolean dept = deptMapper.deleteDept(deptno);
        return dept;
    }
}
