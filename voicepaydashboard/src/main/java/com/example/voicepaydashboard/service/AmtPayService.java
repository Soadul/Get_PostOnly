package com.example.voicepaydashboard.service;

import com.example.voicepaydashboard.model.AmtPayModel;
import com.example.voicepaydashboard.repo.AmtPayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmtPayService {

    @Autowired
    AmtPayRepo amtPayRepo;

    public ResponseEntity<List<AmtPayModel>> getAllAmountOfPayment() {

        try {
            return new ResponseEntity<>(amtPayRepo.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(amtPayRepo.findAll(), HttpStatus.BAD_REQUEST);
        }
    }


    public ResponseEntity<String> addPayment(AmtPayModel amtPayModel) {
        amtPayRepo.save(amtPayModel);
        try {
            return new ResponseEntity<>("Success Adding New Data", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Your Data Not Added for some error", HttpStatus.BAD_REQUEST);
        }
    }
}