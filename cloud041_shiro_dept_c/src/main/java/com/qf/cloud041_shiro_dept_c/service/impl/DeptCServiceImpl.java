package com.qf.cloud041_shiro_dept_c.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qf.cloud041_shiro_dept_c.service.DeptCService;
import com.qf.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class DeptCServiceImpl implements DeptCService {

    @Autowired
    private RestTemplate restTemplate;
//  当远程访问失败时调用fallbackMethod指定的方法
    @HystrixCommand(fallbackMethod = "findAllError")
    @Override
    public List<Dept> findAll() {
        Dept[] depts = restTemplate.getForObject("http://service-dept-p/deptAll", Dept[].class);
        List<Dept> depts1 = Arrays.asList(depts);
        return depts1;
    }
    public List<Dept> findAllError(){
        List<Dept> depts=new ArrayList<>();
        depts.add(new Dept(100,"zhangsan","xi'an"));
        return depts;
    }







    @Override
    public Dept findOne(int deptno) {
        return null;
    }

    @Override
    public Dept saveDept(Dept dept) {
        return null;
    }

    @Override
    public Dept updateDept(Dept dept) {
        return null;
    }

    @Override
    public Boolean deleteDept(int deptno) {
        return null;
    }
}
