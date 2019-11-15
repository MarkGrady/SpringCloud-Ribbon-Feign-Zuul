package com.qf.cloud041_shiro_emp_c.service;

import com.qf.cloud041_shiro_emp_c.service.impl.EmpCServiceError;
import com.qf.pojo.Emp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-emp-p",fallback = EmpCServiceError.class)
public interface EmpCService {

    @RequestMapping(value = "/empSave",method = RequestMethod.POST)
    public Emp addEmp(Emp emp);
}
