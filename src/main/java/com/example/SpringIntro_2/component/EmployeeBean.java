package com.example.SpringIntro_2.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private int eid;
    private String ename;

    @Autowired
    private DepartmentBean deptBean;

    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    // Default constructor
    public EmployeeBean() {
        // Constructor logic (if any)
    }

    // Constructor with @Autowired for autowiring by constructor
    @Autowired
    public EmployeeBean(DepartmentBean deptBean) {
        logger.trace(" *** Autowiring by using @Autowired annotation on constructor *** ");
        this.deptBean = deptBean;
    }

    // Getter and Setter methods for eid and ename
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    // Getter for deptBean
    public DepartmentBean getDeptBean() {
        return deptBean;
    }

    // Setter for deptBean with @Autowired annotation (alternative autowiring via setter)
    @Autowired
    public void setDeptBean(DepartmentBean deptBean) {
        logger.trace(" *** Autowiring by using @Autowired annotation on Setter *** ");
        this.deptBean = deptBean;
    }

    // Method to show employee details
    public void showEmployeeDetails() {
        logger.debug("Employee Id : {}", eid);
        logger.debug("Employee Name : {}", ename);
        deptBean.setDeptName("Information Technology");
        logger.debug("Department : {}", deptBean.getDeptName());
    }


}

