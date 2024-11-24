package com.nizam.beans;

public class EmpBean {
    //member data
    private int empno;
    private String name;
    private String job;
    private String hiredate;
    private int deptno;
    private float sal;
    private String gender;

    public EmpBean() {
    }
    
    public EmpBean(int empno, String name, String job, String hiredate, int deptno, float sal, String gender) {
        this.empno = empno;
        this.name = name;
        this.job = job;
        this.hiredate = hiredate;
        this.deptno = deptno;
        this.sal = sal;
        this.gender = gender;
    }

    public int getEmpno() {
        return empno;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getHiredate() {
        return hiredate;
    }

    public int getDeptno() {
        return deptno;
    }

    public float getSal() {
        return sal;
    }

    public String getGender() {
        return gender;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
