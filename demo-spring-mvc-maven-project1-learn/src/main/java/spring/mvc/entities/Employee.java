package spring.mvc.entities;

public class Employee {

    private Integer empId;
    private String empName;
    private String empEmail; 
    private String empPassword; 

    

    public Employee(Integer empId, String empName, String empEmail, String empPassword) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail ; 
        this.empPassword = empPassword ; 
    }

    public Employee( String empName, String empEmail, String empPassword) {
        this.empName = empName;
        this.empEmail = empEmail ; 
        this.empPassword = empPassword ; 
    }

    public Employee() {
        super();
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empPassword="
                + empPassword + "]";
    }
}
