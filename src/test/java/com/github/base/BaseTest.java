package com.github.base;

import org.testng.annotations.BeforeSuite;

import com.github.utils.Constants;
import com.github.utils.EnvironmentDetails;
import com.github.utils.TestDataUtils;

public class BaseTest {
    @BeforeSuite
    public void beforeSuite() {
        EnvironmentDetails.loadProperties();
        TestDataUtils.loadProperties(Constants.TESTDATA_PROPERTIES_FILE);
        TestDataUtils.loadProperties(Constants.GETDATA_PROPERTIES_FILE);    
        TestDataUtils.loadProperties(Constants.ADDDATA_PROPERTIES_FILE);    
        TestDataUtils.loadProperties(Constants.UPDATEDATA_PROPERTIES_FILE);     
        
        
    }
}
