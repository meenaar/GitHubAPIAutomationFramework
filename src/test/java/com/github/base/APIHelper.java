package com.github.base;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.models.requests.AddRepositoryRequestPOJO;
import com.github.models.requests.UpdateRepositoryRequestPOJO;
import com.github.utils.EnvironmentDetails;

import io.restassured.RestAssured;

import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;

import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class APIHelper {
    RequestSpecification reqSpec;
    String token = "";

    public APIHelper() {
        RestAssured.baseURI = EnvironmentDetails.getProperty("baseURL");
        reqSpec = RestAssured.given();
       
    }

    public Response getSingleRepoData(String owner, String repositoryName, String token) {
    	
    	Map<String, Object> pathParameters = new HashMap<>();
  	    pathParameters.put("owner", owner);
  	    pathParameters.put("repo", repositoryName);
  	    
  	    Header authorization = new Header("Authorization",  "Bearer "+token);

        reqSpec = RestAssured.given();
        
        reqSpec.header(authorization).pathParams(pathParameters);
        
        Response response = null;
        try {
            response = reqSpec.get("repos/{owner}/{repo}");
            
            response.then().log().headers();
            
        } catch (Exception e) {
            Assert.fail("Get data is failing due to :: " + e.getMessage());
        }
        return response;
    }
    
    public Response getAllRepoData(String owner, String token) {
    	
    	 Header authorization = new Header("Authorization",  "Bearer "+token);
    	  
    	 reqSpec = RestAssured.given();        
           
         Response response = null;
         try {
        	 
        	 reqSpec.header(authorization);
        	 
             response = reqSpec.get("user/repos");
             
             response.then().log().headers();
                          
         } catch (Exception e) {
             Assert.fail("Get all repositories data is failing due to :: " + e.getMessage());
         }
         return response;
    }
    

    public Response addRepository(AddRepositoryRequestPOJO addRepositoryRequest, String token) {
        reqSpec = RestAssured.given();
        Response response = null;
        Header authorization = new Header("Authorization",  "Bearer "+token);
        
        try {
            log.info("Adding below data :: " + new ObjectMapper().writeValueAsString(addRepositoryRequest));
            reqSpec.header(authorization);
            reqSpec.body(new ObjectMapper().writeValueAsString(addRepositoryRequest)); //Serializing addData Request POJO classes to byte stream
            response = reqSpec.when().post("user/repos");
            response.then().log().all();
        } catch (Exception e) {
            Assert.fail("Add repository functionality is failing due to :: " + e.getMessage());
        }
        return response;
    }
    
    
    public Response patchRepository(UpdateRepositoryRequestPOJO updateRepositoryRequest, String token, String owner, String repoName) {
    	    	
    	Map<String, Object> pathParameters = new HashMap<>();
  	    pathParameters.put("owner", owner);
  	    pathParameters.put("repo", repoName);
  	    
  	    Header authorization = new Header("Authorization",  "Bearer "+token);
  	  
        reqSpec = RestAssured.given();      
        
        System.out.println("owner from api helper is "+ owner);

        System.out.println("repoName to update from api helper is "+ repoName);

        System.out.println("token from api helper is "+ token);
        
        reqSpec.header(authorization).pathParams(pathParameters);
        
        Response response = null;
        try {
           
            
            reqSpec.body(new ObjectMapper().writeValueAsString(updateRepositoryRequest)); //Serializing addData Request POJO classes to byte stream
         
            response = reqSpec.patch("repos/{owner}/{repo}");
            
            response.then().log().all();
            
        } catch (Exception e) {
            Assert.fail("Update data functionality is failing due to :: " + e.getMessage());
        }
        return response;  
    }
    
    
    public Response deleteRepository(String token, String owner, String repoName) {
    	
    	Map<String, Object> pathParameters = new HashMap<>();
  	    pathParameters.put("owner", owner);
  	    pathParameters.put("repo", repoName);
  	    
  	    Header authorization = new Header("Authorization",  "Bearer "+token);
  	  
        reqSpec = RestAssured.given();
      
        
        System.out.println("owner from api helper is "+ owner);

        System.out.println("repoName to update from api helper is "+ repoName);

        System.out.println("token from api helper is "+ token);
        
        reqSpec.header(authorization).pathParams(pathParameters);
        
        Response response = null;
        try {
                   
            response = reqSpec.delete("repos/{owner}/{repo}");
            
            response.then().log().all();
            
        } catch (Exception e) {
            Assert.fail("Delete data functionality is failing due to :: " + e.getMessage());
        }
        return response;  
    }
    
}
