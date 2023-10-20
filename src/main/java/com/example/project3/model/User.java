package com.example.project3.model;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;


@Entity
public class User {
     @Id
     @GeneratedValue
     private Long id;
     private String idDetails;
     private String idNumber;
     private String name;
     private String contactNumber;
     private String vaccineName;

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     @Override
     public String toString() {
          return "User [id=" + id + ", idDetails=" + idDetails + ", idTypes=" + idNumber + ", name=" + name
                    + ", contactNumber=" + contactNumber + ", vaccineName=" + vaccineName + "]";
     }

     public User() {
     }

     public String getIdDetails() {
          return idDetails;
     }

     public void setIdDetails(String idDetails) {
          this.idDetails = idDetails;
     }

     public String getIdTypes() {
          return idNumber;
     }

     public void setIdTypes(String idTypes) {
          this.idNumber = idTypes;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getContactNumber() {
          return contactNumber;
     }

     public void setContactNumber(String contactNumber) {
          this.contactNumber = contactNumber;
     }

     public String getVaccineName() {
          return vaccineName;
     }

     public void setVaccineName(String vaccineName) {
          this.vaccineName = vaccineName;
     }

}
