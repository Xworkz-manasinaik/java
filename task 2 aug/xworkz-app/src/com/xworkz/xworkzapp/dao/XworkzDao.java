package com.xworkz.dao;

import com.xworkz.dto.TraineeDto;

public class XworkzDao {
    public void getTrineeDetails(TraineeDto dto){
        System.out.println("Trainee Name: "+dto.getTraineeName());
        System.out.println("Trainee Email: "+dto.getTraineeEmail());
        System.out.println("Trainee Phone Number: "+dto.getTraineePhNumber());
        System.out.println("Trainee Year of Pass: "+dto.getTrineeYop());
        System.out.println("Trainee Selected Course: "+dto.getTrineecourse());
    }
}
