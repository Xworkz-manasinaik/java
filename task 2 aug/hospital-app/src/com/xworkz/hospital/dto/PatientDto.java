package com.xworkz.hospital.dto;

public class PatientDto {

    private int patientId;
    private String name;
    private long phNo;
    private int age;
    private String gender;
    private String diagnosis;


    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public int getPatientId() {
        return patientId;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }
    public long getPhNo() {
        return phNo;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public String getDiagnosis() {
        return diagnosis;
    }

}
