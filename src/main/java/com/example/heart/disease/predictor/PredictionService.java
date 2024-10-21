package com.example.heart.disease.predictor;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PredictionService {

    public String predictHeartDisease(PredictionRequest request) {
        RestTemplate restTemplate = new RestTemplate();

        // Your Flask API URL
        String PREDICTION_API_URL = "http://localhost:5000/predict";

        // Send the features as a POST request to the Python model API
        String prediction = restTemplate.postForObject(PREDICTION_API_URL, request, String.class);

        return prediction; // Return the prediction result
    }
}
