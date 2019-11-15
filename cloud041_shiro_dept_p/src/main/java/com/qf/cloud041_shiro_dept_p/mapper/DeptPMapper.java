package com.qf.cloud041_shiro_dept_p.mapper;


import com.qf.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptPMapper {
    public List<Dept> findAll();
    public Dept findOne(int deptno);
    public Dept saveDept(Dept dept);
    public Dept updateDept(Dept dept);
    public Boolean deleteDept(int deptno);
}