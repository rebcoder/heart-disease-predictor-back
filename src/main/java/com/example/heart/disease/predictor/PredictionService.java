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
        String pythonApiUrl = "http://localhost:5000/predict";  // Python Flask API URL

        // Send input data to Python API
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Map> response = restTemplate.postForEntity(pythonApiUrl, request, Map.class);

        // Get prediction from Python API response
        Map<String, Object> result = response.getBody();

        return (String) result.get("prediction");
    }
}
