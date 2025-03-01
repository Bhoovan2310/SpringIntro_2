package com.example.SpringIntro_2.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String deptName;

    // Getter method for deptName
    public String getDeptName() {
        return deptName;
    }

    // Setter method for deptName
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}

