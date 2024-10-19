package com.example.heart.disease.predictor;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PredictionService {

    public HashMap<String,String> predictHeartDisease(PredictionRequest request) {
        HashMap<String,String> result = new HashMap<>();
        // Mocked Prediction Logic. Replace this with actual model integration
        if (request.getAge() > 50 && request.getCholesterol() > 200) {
            result.put("prediction","High Risk of Heart Disease");
            return result;
        } else {
            result.put("prediction","Low Risk of Heart Disease");
            return result;
        }
    }
}
