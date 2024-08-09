package com.xworkz;

import com.xworkz.dao.XworkzDao;
import com.xworkz.dto.TraineeDto;

public class XworkzRunner {

    public static void main(String[] args) {
        TraineeDto traineeDto=new TraineeDto();
        traineeDto.setTraineeName("shiva");
        traineeDto.setTraineeEmail("shivakumarr0611@gmail.com");
        traineeDto.setTraineePhNumber(9611960286l);
        traineeDto.setTrineeYop(2024);
        traineeDto.setTrineecourse("java");

        XworkzDao xworkzDao=new XworkzDao();
        xworkzDao.getTrineeDetails(traineeDto);

    }
}
