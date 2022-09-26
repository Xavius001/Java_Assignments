package Assessment3;

import java.time.LocalDate;

public class Customer {
    private int customerId;
    private String customerName, customerType, mobile;
    private Address permanentAddress;
    private LocalDate dateOfCreation;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Customer() {
    }

    public Customer(int customerId, String customerName, String customerType, String mobile, Address permanentAddress, LocalDate dateOfCreation) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerType = customerType;
        this.mobile = mobile;
        this.permanentAddress = permanentAddress;
        this.dateOfCreation = dateOfCreation;
    }
}
