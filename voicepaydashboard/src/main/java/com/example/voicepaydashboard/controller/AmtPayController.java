package com.example.voicepaydashboard.controller;

import com.example.voicepaydashboard.model.AmtPayModel;
import com.example.voicepaydashboard.service.AmtPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/hishab")
public class AmtPayController {

    @Autowired
    AmtPayService amtPayService;

    @GetMapping("/allAmtPay")
    public ResponseEntity<List<AmtPayModel>> getAllAmountOfService(){
        return amtPayService.getAllAmountOfPayment();
    }
    @PostMapping("/add")
    public ResponseEntity<String> addPayment(@RequestBody AmtPayModel amtPayModel){
        return amtPayService.addPayment(amtPayModel);

    }
}
