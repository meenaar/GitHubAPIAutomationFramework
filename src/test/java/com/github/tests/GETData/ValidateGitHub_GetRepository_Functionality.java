package com.github.tests.GETData;


import org.apache.http.HttpStatus;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.github.base.*;
import com.github.models.responses.GetSingleRepoResponsePOJO;
import com.github.models.responses.StatusResponsePOJO;
import com.github.utils.EnvironmentDetails;
import com.github.utils.ExtentReportsUtility;
import com.github.utils.TestDataUtils;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;


@Listeners(com.github.listeners.TestEventListenersUtility.class)

public class ValidateGitHub_GetRepository_Functionality<owner> extends BaseTest{
	
	ExtentReportsUtility report=ExtentReportsUtility.getInstance();
    APIHelper apiHelper;
    String expContent_Type,owner, token, repoName;   


   @BeforeClass
    public void beforeClass() {
        apiHelper = new APIHelper();
        owner = EnvironmentDetails.getProperty("owner");
        token = EnvironmentDetails.getProperty("token");
        expContent_Type = TestDataUtils.getProperty("expContent_Type");
        repoName = TestDataUtils.getProperty("repositoryName");
      
    }
	
	@Test	(priority=0)
	public void validateGetSingleRepository() {
		
		
		String expDefault_Branch = TestDataUtils.getProperty("expDefault_Branch");
		
		String expFull_Name = TestDataUtils.getProperty("expFull_Name");
		
		
		// calling api helper method to get the response
		Response data = apiHelper.getSingleRepoData(owner, repoName, token);
		
		System.out.println();
		
		//calling the Response POJO to validate the response
		GetSingleRepoResponsePOJO getDataResponse = data.getBody().as(GetSingleRepoResponsePOJO.class);
		
		
		Assert.assertEquals(data.getStatusCode(), HttpStatus.SC_OK, "Response code is not matching for get data.");			
		Assert.assertEquals(data.getContentType(), expContent_Type, "Content type is not matching for get data");
		
		report.logTestInfo("Successfully received Single repository data from GitHub");
		
	
		System.out.println("Status code is-------"+data.getStatusCode());
		
		System.out.println("content ype is-------"+data.getContentType());		
		
		System.out.println("branch is -------"+getDataResponse.getDefault_branch());
		
		System.out.println("fullname is -------"+getDataResponse.getFull_name());
	
		System.out.println();
		
		Assert.assertEquals(getDataResponse.getDefault_branch(), expDefault_Branch, "Get Single Repository is not working as expected, default branch is not matching");
		Assert.assertEquals(getDataResponse.getFull_name(), expFull_Name, "Get Single Repository is not working as expected, full name is not matching");
		
	}
	
	
	@Test	(priority=1)
	public void validateGetData_InvalidRepositoryName() {

		// calling api helper method to get the response
		Response data = apiHelper.getSingleRepoData(owner, "NonExistingProject", token);
		
	    StatusResponsePOJO statusResponse = data.as(StatusResponsePOJO.class);
	   
	    System.out.println("\nStatus code is-------"+data.getStatusCode());		
		System.out.println("expected code is-------"+ HttpStatus.SC_NOT_FOUND);		
	    System.out.println("Error message :"+ statusResponse.getMessage());
	   
	    report.logTestInfo("Status code is-------"+data.getStatusCode());
	    report.logTestInfo("Error message :"+ statusResponse.getMessage());
	    
	    Assert.assertEquals(data.getStatusCode(), HttpStatus.SC_NOT_FOUND, "Get repository is not returning proper status code with non existing repository name.");
        Assert.assertEquals(statusResponse.getMessage(), TestDataUtils.getProperty("errorMessage"), "Error message is not returning as expected");
        
	}
				

	@Test	(priority=2)
	public void validateGetAllRepositories() {		
		
		// calling api helper method to get the response
		Response data = apiHelper.getAllRepoData(owner, token);
			
		data.prettyPrint();		
				
		data.then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schema/GetAllRepositoriesResponseSchema.json"));
		
		GetSingleRepoResponsePOJO[] getAllDataResponse = data.getBody().as(GetSingleRepoResponsePOJO[].class);
		
		System.out.println("\nRepository Names that are Public:");
		report.logTestInfo("\nRepository Names that are Public:");
		
		for (int i=0; i<getAllDataResponse.length; i++) {			
		
			if (!getAllDataResponse[i].getMyprivate())
			{
				System.out.println("   "+getAllDataResponse[i].getName());
				report.logTestInfo("   "+getAllDataResponse[i].getName());
			}			
		}
		System.out.println("Numuber of repositries from Git Hub are:  "+getAllDataResponse.length);
		report.logTestInfo("Numuber of repositries from Git Hub are:  "+getAllDataResponse.length);
		
		System.out.println("Status Code is : "+data.getStatusCode()+"\n");
		report.logTestInfo("Status Code is : "+data.getStatusCode()+"\n");
		
		//Validating Status code and content type
		Assert.assertEquals(data.getStatusCode(), HttpStatus.SC_OK, "Response code is not matching for get data.");			
		Assert.assertEquals(data.getContentType(), expContent_Type, "Content type is not matching for get data");
		
		report.logTestInfo("Successfully received all repositories data from GitHub");
		
		//jsonpath to find the number of repositories
		//System.out.println("number of repositories ***********"+data.jsonPath().getList("$").size());		
		
	}
	
	
}
