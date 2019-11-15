package com.qf.cloud041_shiro_emp_c.service.impl;

import com.qf.cloud041_shiro_emp_c.service.EmpCService;
import com.qf.pojo.Emp;
/*当feign调用失败时，执行此实现*/
public class EmpCServiceError implements EmpCService {

    @Override
    public Emp addEmp(Emp emp) {
        emp.setEmpno(-1);
        return emp;
    }
}
