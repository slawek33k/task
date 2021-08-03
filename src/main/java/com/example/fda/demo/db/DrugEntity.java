package com.example.fda.demo.db;

import javax.persistence.*;

@Entity
@Table(name = "drug")
public class DrugEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "application_number")
    private String applicationNumber;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "substance_name")
    private String substanceName;

    @Column(name = "product_numbers")
    private String productNumbers;

    public DrugEntity() {
    }

    public DrugEntity(String applicationNumber, String manufacturerName, String substanceName, String productNumbers) {
        this.applicationNumber = applicationNumber;
        this.manufacturerName = manufacturerName;
        this.substanceName = substanceName;
        this.productNumbers = productNumbers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getSubstanceName() {
        return substanceName;
    }

    public void setSubstanceName(String substanceName) {
        this.substanceName = substanceName;
    }

    public String getProductNumbers() {
        return productNumbers;
    }

    public void setProductNumbers(String productNumbers) {
        this.productNumbers = productNumbers;
    }

    @Override
    public String toString() {
        return "DrugEntity{" +
                "id=" + id +
                ", applicationNumber='" + applicationNumber + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", substanceName='" + substanceName + '\'' +
                ", productNumbers='" + productNumbers + '\'' +
                '}';
    }
}
