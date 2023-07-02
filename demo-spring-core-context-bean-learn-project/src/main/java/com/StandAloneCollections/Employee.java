package com.StandAloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String employeeName;
    private int employeeId;
    private List<String> employeePhoneNumbers;
    private Set<String> employeeIdentitys;
    private Map<String, String> employeeDeptManagers;

    public Employee(String employeeName, int employeeId, List<String> employeePhoneNumbers,
            Set<String> employeeIdentitys, Map<String, String> employeeDeptManagers) {
        super();
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeePhoneNumbers = employeePhoneNumbers;
        this.employeeIdentitys = employeeIdentitys;
        this.employeeDeptManagers = employeeDeptManagers;
    }

    public Employee() {
        super();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public List<String> getEmployeePhoneNumbers() {
        return employeePhoneNumbers;
    }

    public void setEmployeePhoneNumbers(List<String> employeePhoneNumbers) {
        this.employeePhoneNumbers = employeePhoneNumbers;
    }

    public Set<String> getEmployeeIdentitys() {
        return employeeIdentitys;
    }

    public void setEmployeeIdentitys(Set<String> employeeIdentitys) {
        this.employeeIdentitys = employeeIdentitys;
    }

    public Map<String, String> getEmployeeDeptManagers() {
        return employeeDeptManagers;
    }

    public void setEmployeeDeptManagers(Map<String, String> employeeDeptManagers) {
        this.employeeDeptManagers = employeeDeptManagers;
    }

    @Override
    public String toString() {
        return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeePhoneNumbers="
                + employeePhoneNumbers + ", employeeIdentitys=" + employeeIdentitys + ", employeeDeptManagers="
                + employeeDeptManagers + "]";
    }
}
