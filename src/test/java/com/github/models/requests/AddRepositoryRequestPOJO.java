package com.github.models.requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddRepositoryRequestPOJO {
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("description") 
    public String getDescription() { 
		 return this.description; } 
    public void setDescription(String description) { 
		 this.description = description; } 
    String description;
    @JsonProperty("homepage") 
    public String getHomepage() { 
		 return this.homepage; } 
    public void setHomepage(String homepage) { 
		 this.homepage = homepage; } 
    String homepage;
    @JsonProperty("private") 
    public String getMyprivate() { 
		 return this.myprivate; } 
    public void setMyprivate(String myprivate) { 
		 this.myprivate = myprivate; } 
    String myprivate;
    
}
