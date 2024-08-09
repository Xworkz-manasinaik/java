package com.xworkz.hospital;

import com.xworkz.hospital.dao.HospitalDao;
import com.xworkz.hospital.dto.PatientDto;

public class HospitalRunner {
    public static void main(String[] args) {
        PatientDto patientDto=new PatientDto();
        patientDto.setPatientId(1);
        patientDto.setName("axel");
        patientDto.setPhNo(123456789l);
        patientDto.setAge(24);
        patientDto.setGender("male");
        patientDto.setDiagnosis("broken arm");

        HospitalDao hospitalDao=new HospitalDao();
        hospitalDao.getPatientDetails(patientDto);

    }
}
