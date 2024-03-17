package Models;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String username; // Added username field
    private String password;
    private String nic;
    private String address;
    private String tpn;
    private String category;
    private String gender;
    private Date startDate;
    private String position;
    private String location;
    private String salaryType;
    private double salary;

    // Constructors
    public User(int id, String username, String name, String password, String nic, String address, String tpn, String gender, Date startDate, String position, String location, String salaryType, double salary) {
    }

    public User(int id, String username, String name, String password, String nic, String address, String tpn, String category, String gender, Date startDate, String position, String location, String salaryType, double salary) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.password = password;
        this.nic = nic;
        this.address = address;
        this.tpn = tpn;
        this.category = category;
        this.gender = gender;
        this.startDate = startDate;
        this.position = position;
        this.location = location;
        this.salaryType = salaryType;
        this.salary = salary;
    }

    // Getters and setters for all fields

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTpn() {
        return tpn;
    }

    public void setTpn(String tpn) {
        this.tpn = tpn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(String salaryType) {
        this.salaryType = salaryType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Omitted for brevity, but they should be implemented as needed

    // toString() method
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nic='" + nic + '\'' +
                ", address='" + address + '\'' +
                ", tpn='" + tpn + '\'' +
                ", category='" + category + '\'' +
                ", gender='" + gender + '\'' +
                ", startDate=" + startDate +
                ", position='" + position + '\'' +
                ", location='" + location + '\'' +
                ", salaryType=" + salaryType +
                ", salary=" + salary +
                '}';
    }
}
