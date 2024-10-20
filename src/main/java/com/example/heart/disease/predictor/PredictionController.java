package com.example.heart.disease.predictor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")  // Allow Angular to communicate with Spring Boot
public class PredictionController {

    @Autowired
    private PredictionService predictionService;

    @PostMapping("/predict")
    public ResponseEntity<String> predictHeartDisease(@RequestBody PredictionRequest request) {
        return new ResponseEntity<>(predictionService.predictHeartDisease(request), HttpStatus.OK);
    }
}
