package com.example.heart.disease.predictor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PredictionRequest {
    private int age;
    private int sex;
    private int cholesterol;
    private int restingBP;
    private int maxHeartRate;
}
