package com.github.models.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddRepoExistingName_StatusReponsePOJO {

	
	 @JsonProperty("resource") 
	    public String getResource() { 
			 return this.resource; } 
	    public void setResource(String resource) { 
			 this.resource = resource; } 
	    String resource;
	    @JsonProperty("code") 
	    public String getCode() { 
			 return this.code; } 
	    public void setCode(String code) { 
			 this.code = code; } 
	    String code;
	    @JsonProperty("field") 
	    public String getField() { 
			 return this.field; } 
	    public void setField(String field) { 
			 this.field = field; } 
	    String field;
	    @JsonProperty("message") 
	    public String getMessage() { 
			 return this.message; } 
	    public void setMessage(String message) { 
			 this.message = message; } 
	    String message;
	    

	    @JsonProperty("message") 
	    public String getMessage1() { 
			 return this.errmessage; } 
	    public void setMessage1(String getMessage) { 
			 this.errmessage = getMessage; } 
	    String errmessage;
	    
	    @JsonProperty("errors") 
	    public ArrayList<Error> getErrors() { 
			 return this.errors; } 
	    public void setErrors(ArrayList<Error> errors) { 
			 this.errors = errors; } 
	    ArrayList<Error> errors;
	  
	    
	    @JsonProperty("documentation_url") 
	    public String getDocumentation_url() { 
			 return this.documentation_url; } 
	    public void setDocumentation_url(String documentation_url) { 
			 this.documentation_url = documentation_url; } 
	    String documentation_url;
	    @JsonProperty("status") 
	    public String getStatus() { 
			 return this.status; } 
	    public void setStatus(String status) { 
			 this.status = status; } 
	    String status;
	
}