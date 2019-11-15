package com.qf.pojo;

public class Emp {
    private Integer empno;
    private String ename;
    private Double sal;
    private String job;
    private Integer deptno;

    public Emp() {
    }

    public Emp(Integer empno, String ename, Double sal, String job, Integer deptno) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.job = job;
        this.deptno = deptno;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                ", job='" + job + '\'' +
                ", deptno=" + deptno +
                '}';
    }
}
