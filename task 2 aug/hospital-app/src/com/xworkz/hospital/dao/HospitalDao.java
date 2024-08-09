package com.xworkz.hospital.dao;

import com.xworkz.hospital.dto.PatientDto;

public class HospitalDao {
    public void getPatientDetails(PatientDto dto){
        System.out.println("Patient id: "+dto.getPatientId());
        System.out.println("Patient Name: "+dto.getName());
        System.out.println("Phone Number: "+dto.getPhNo());
        System.out.println("Age: "+dto.getAge());
        System.out.println("Gender: "+dto.getGender());
        System.out.println("Daignosis: "+dto.getDiagnosis());
    }
}
