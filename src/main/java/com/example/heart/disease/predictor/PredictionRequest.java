package com.example.heart.disease.predictor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PredictionRequest {
    private int age;
    private int sex;
    private int chest_pain_type;
    private int resting_blood_pressure;
    private int cholesterol;
    private int fasting_blood_sugar;
    private int rest_ecg;
    private int max_heart_rate_achieved;
    private int exercise_induced_angina;
    private double st_depression;
    private int st_slope;
    private int num_major_vessels;
    private int thalassemia;
}
