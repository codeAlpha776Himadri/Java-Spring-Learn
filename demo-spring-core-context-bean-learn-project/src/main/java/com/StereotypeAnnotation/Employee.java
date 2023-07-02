package com.StereotypeAnnotation;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// by default the object (bean) name will be employee if no value is provided
@Component("employeeObject")
@Scope("prototype")  // be default it is singleton other options = (request, session, globalsession)
public class Employee {
    @Value("Himadri")
    private String employeeName;

    @Value("1001")
    private int employeeId;

    @Autowired
    @Qualifier("addressObject")
    private Address address;

    @Value("#{myStandaloneList}")
    private List<String> employeePhoneNumbers;

    @Value("#{myStandaloneSet}")  
    private Set<String> employeeIdentitys;

    @Value("#{myStandaloneMap}")
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    @PostConstruct
    public void init() {
        System.out.println("Init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    public String toString() {
        return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", address=" + address
                + ", employeePhoneNumbers=" + employeePhoneNumbers + ", employeeIdentitys=" + employeeIdentitys
                + ", employeeDeptManagers=" + employeeDeptManagers + "]";
    }
}
