package com.example.voicepaydashboard.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class AmtPayModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String branch;
    private String initialMonth;
    private double january;
    private double february;
    private double march;
    private double april;
    private double may;
    private double june;
    private double july;
    private double august;
    private double september;
    private double october;
    private double november;
    private double december;


}
