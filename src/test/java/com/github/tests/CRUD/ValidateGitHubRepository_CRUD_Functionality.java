package com.github.tests.CRUD;

import com.github.base.APIHelper;
import com.github.base.BaseTest;
import com.github.models.requests.AddRepositoryRequestPOJO;
import com.github.models.requests.UpdateRepositoryRequestPOJO;
import com.github.models.responses.AddRepositoryResponsePOJO;
import com.github.models.responses.StatusResponsePOJO;
import com.github.models.responses.UpdateRepositoryResponsePOJO;
import com.github.utils.*;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;


@Listeners(com.github.listeners.TestEventListenersUtility.class)

public class ValidateGitHubRepository_CRUD_Functionality extends BaseTest {

	ExtentReportsUtility report=ExtentReportsUtility.getInstance();
    APIHelper apiHelper;

    String owner, repoName, token, repoNameToDelete;

   @BeforeClass
    public void beforeClass() {
        apiHelper = new APIHelper();
        token = EnvironmentDetails.getProperty("token");
        owner = EnvironmentDetails.getProperty("owner");
        repoName = TestDataUtils.getProperty("name");
        repoNameToDelete = TestDataUtils.getProperty("updateName");
    }
   
   
    @Test(priority = 0, description = "validate add repository functionality")
    public void validateAddRepositoryFunctionality() {

        String expFull_Name = owner+"/"+repoName;
        String expType = "User";
        
        System.out.println("Git Hub Account Owner is: "+owner);        
        System.out.println("Here are the information of new repository to create: \nname========"+repoName);        
        System.out.println("description========"+TestDataUtils.getProperty("description"));        
        System.out.println("homepage========"+TestDataUtils.getProperty("homepage"));        
        System.out.println("private========"+TestDataUtils.getProperty("private"));        
        System.out.println("**********************************************************************\n");
        
        AddRepositoryRequestPOJO addDataRequest = AddRepositoryRequestPOJO.builder().name(repoName)
        																	.description(TestDataUtils.getProperty("description"))
        																	.homepage(TestDataUtils.getProperty("homepage"))
        																	.myprivate(TestDataUtils.getProperty("private")).build();
      
        Response response = apiHelper.addRepository(addDataRequest, token);
     
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_CREATED, "Add repository functionality is not working as expected.");
        
        Assert.assertEquals(response.as(AddRepositoryResponsePOJO.class).getFull_name(), expFull_Name, "The value is not as expected in response ");
     
        System.out.println("\n**********************************************************************");        
        System.out.println("Status Code is ==== "+response.getStatusCode());        
        System.out.println("Name of repository created is ==== "+response.as(AddRepositoryResponsePOJO.class).getName());    
          
        System.out.println("Actual Login is ==== "+ response.body().jsonPath().get("owner.login"));   
        System.out.println("Actual type is ==== "+ response.body().jsonPath().get("owner.type"));        
        
        report.logTestInfo("Status Code is ==== "+response.getStatusCode());
		report.logTestInfo("Name of repository created is ==== "+response.as(AddRepositoryResponsePOJO.class).getName());   
		report.logTestInfo("Actual Login is ==== "+ response.body().jsonPath().get("owner.login"));
		report.logTestInfo("Actual type is ==== "+ response.body().jsonPath().get("owner.type"));
		report.logTestpassed( "Successfully created new repository in GitHub with below details:");
		
        Assert.assertEquals(response.as(AddRepositoryResponsePOJO.class).getName(), repoName, "Repository name not matching");
        Assert.assertEquals(response.body().jsonPath().get("owner.login"), owner, "Owner name not matching");
        Assert.assertEquals(response.body().jsonPath().get("owner.type"), expType, "type is not matching");
        
    }
    
    
    @Test(priority = 1, description = "validate add repository with existing repository name")
    public void validateAddRepositoryWithExistingName_Invalid() {

        System.out.println("name========"+repoName);        
        System.out.println("description========"+TestDataUtils.getProperty("description"));        
        System.out.println("homepage========"+TestDataUtils.getProperty("homepage"));        
        System.out.println("private========"+TestDataUtils.getProperty("private"));
        
        System.out.println("**********************************************************************\n"); 
        AddRepositoryRequestPOJO addDataRequest = AddRepositoryRequestPOJO.builder().name(repoName)
        																	.description(TestDataUtils.getProperty("description"))
        																	.homepage(TestDataUtils.getProperty("homepage"))
        																	.myprivate(TestDataUtils.getProperty("private")).build();
      
        Response response = apiHelper.addRepository(addDataRequest, token);
        
        //validating the status code and error message
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_UNPROCESSABLE_ENTITY, "Add repository with existing repository name is not working as expected.");   
        Assert.assertEquals(response.getBody().asString().contains("name already exists on this account"), true, "Reponse contains appropriate error msg.");
       
        System.out.println("\n**********************************************************************");
        System.out.println("Status Code is  === "+ response.getStatusCode());
        
        report.logTestpassed("Successfully validated the add repository functionality when existing repository name is given.");
        
      
   }

    @Test(priority = 2, description = "validate update repository name functionality", dependsOnMethods = "validateAddRepositoryFunctionality")
    public void validateUpdateRepositoryNameFunctionality() {
     
        String expUpdateName = TestDataUtils.getProperty("updateName");
        
        System.out.println("owner========"+owner);
        
        System.out.println("prev repository name========"+repoName);
        
        System.out.println("new repository name to update========"+TestDataUtils.getProperty("updateName"));
        
        System.out.println("new description========"+TestDataUtils.getProperty("updateDescription"));
        
        System.out.println("private========"+TestDataUtils.getProperty("updatePrivate"));
        System.out.println("**********************************************************************\n");
        
        UpdateRepositoryRequestPOJO updateDataRequest = UpdateRepositoryRequestPOJO.builder().name(TestDataUtils.getProperty("updateName"))
																					.description(TestDataUtils.getProperty("updateDescription"))        																	
																					.myprivate(TestDataUtils.getProperty("updatePrivate")).build();
		
        Response response = apiHelper.patchRepository(updateDataRequest, token, owner, repoName);
               
        UpdateRepositoryResponsePOJO patchDataResponse = response.getBody().as(UpdateRepositoryResponsePOJO.class);
        
        System.out.println("\n**********************************************************************"); 
        System.out.println("updated repository name is ============"+patchDataResponse.getName());        
        System.out.println("status code ============"+response.getStatusCode());
        
	    report.logTestInfo("status code ============"+response.getStatusCode());
	    report.logTestpassed("Succesfully updated the repository.\nUpdated repository name is ============\"+patchDataResponse.getName()");
	      
        //validating the status code and the updated name
        Assert.assertEquals(patchDataResponse.getName(), expUpdateName, "Update repository name is not working as expected, new name is not updated correctly");
		Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK, "Get Single Repository is not working as expected, full name is not matching");
	
    }
    
    
    
    @Test(priority = 3, description = "validate delete repository functionality", dependsOnMethods = "validateUpdateRepositoryNameFunctionality")
    public void validateDeleteRepositoryFunctionality() {

        
        System.out.println("owner========"+owner);        
        System.out.println("Repository name to delete========"+repoNameToDelete);      
        System.out.println("**********************************************************************\n"); 
        
        Response response = apiHelper.deleteRepository(token, owner, repoNameToDelete);
        
        System.out.println("\n**********************************************************************");        
        System.out.println("status code ============"+response.getStatusCode());
     
        report.logTestpassed("Succesfully deleted the repository.");
        
        // Asserting that the response body is empty         
        String responseBody = response.getBody().asString(); 
        
        assertThat(responseBody, isEmptyString());
        
        //validating the status code 
     	Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_NO_CONTENT, "Delete Repository request not showing correct status code.");
	
    }
    
    
    
    
    @Test(priority = 4, description = "validate delete repository that doesn't exists functionality", dependsOnMethods = "validateDeleteRepositoryFunctionality")
    public void validateDeleteRepository_NotExists() {
        
        System.out.println("owner========"+owner);        
        System.out.println("prev repository name========"+repoNameToDelete);      
        System.out.println("**********************************************************************\n"); 
        
        Response response = apiHelper.deleteRepository(token, owner, repoName);        
       
        StatusResponsePOJO deleteResponse = response.getBody().as(StatusResponsePOJO.class);
        
        System.out.println("\n**********************************************************************");        
        System.out.println("Status code is : "+response.getStatusCode());     
        System.out.println("Delete Error msg is : "+deleteResponse.getMessage());
        
        report.logTestpassed("Succesfully validation with appropriate error message when deleting the repository that doesn't exists.");
        //validating the status code 
        Assert.assertEquals(deleteResponse.getMessage(), TestDataUtils.getProperty("errorMessage"), "Delete Request error message is not matching");
     	Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_NOT_FOUND, "Delete Repository (not exists) request not showing correct status code.");
	
    }
    
 
}
