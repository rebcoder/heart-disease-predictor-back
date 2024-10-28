
![image](https://github.com/user-attachments/assets/39600918-3bc5-42c9-97ab-3a3a02f5a1f4)


# Heart Disease Predictor Backend

This repository contains the backend service for the Heart Disease Predictor application, built with Java Spring Boot. The backend processes health data inputs, forwards them to a machine learning model for prediction, and returns the prediction result.

## Features

- REST API endpoint to accept health metrics and return a heart disease prediction
- Validates and processes data before sending it to the model service
- Integrates with a Python-based model service that performs the prediction

## Prerequisites

- Java 11 or above
- [Maven](https://maven.apache.org/) for dependency management

## Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/rebcoder/heart-disease-predictor-back.git
   cd heart-disease-predictor-back

2. **Configure application properties:**
    ```bash
    Open src/main/resources/application.properties and configure the properties as required:
    
    server.port=8080
    model.service.url=http://localhost:5000/predict  # Replace with your model service URL
   
3. **Build and run the application:**
    ```bash
    mvn clean install
    mvn spring-boot:run
    The backend will run at http://localhost:8080.

4. **API Documentation**
    ```bash
    Endpoint: /predict
    Method: POST
    URL: /predict
    Content-Type: application/json

    Request Body:
    json
   {
   "age": 50,
   "sex": 1,
   "chestPainType": 2,
   "restingBloodPressure": 130,
   "cholesterol": 250,
   "fastingBloodSugar": 0,
   "restEcg": 1,
   "maxHeartRateAchieved": 180,
   "exerciseInducedAngina": 0,
   "stDepression": 1.4,
   "stSlope": 2,
   "numMajorVessels": 0,
   "thalassemia": 2
   }

    Response:
    json
   {
   "prediction": 1
   }


    prediction: Integer (1 for positive prediction of heart disease, 0 for negative)
   
   
6. **Application Structure**
    ````
    src/main/java/com/yourpackage/controller: Contains the main REST controller for handling prediction requests.
   
    src/main/java/com/yourpackage/service: Defines services and business logic, including the integration with the Python model API.
   
    src/main/resources/application.properties: Configuration file for defining server properties and external API URLs.

7. **Prediction Machine learning Model Serivce**

    Prediction model Service: https://github.com/rebcoder/heart-disease-prediction-model-service