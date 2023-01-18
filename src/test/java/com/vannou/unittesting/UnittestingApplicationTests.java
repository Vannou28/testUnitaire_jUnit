package com.vannou.unittesting;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.vannou.unittesting.service.StringUtils;



@SpringBootTest
class UnittestingApplicationTests {

    private StringUtils stringUtils = new StringUtils();

    @Test
    void testStringUtilsAllVoyelle() {
        String valeurTested = "aeiouyAEIOUY";
        String valeurWanted = "aeiouyAEIOUY";
        testVoyelle(valeurTested,valeurWanted); 
	}

    @Test
	void testStringUtilsNoFirstVoyelle() {
        String valeurTested = "vannou";
        String valeurWanted = "aou";
        testVoyelle(valeurTested,valeurWanted);
	}

	@Test
	void testStringUtilsWithFistVoyelle() {
        String valeurTested = "aurelien";
        String valeurWanted = "aueie";
        testVoyelle(valeurTested,valeurWanted); 
	}

    
    private void testVoyelle(String valeurTested, String valeurWanted){
        String resultTest = stringUtils.vowels(valeurTested);
        Assert.assertEquals(valeurWanted, resultTest);
    }


    @Test
    void testStringUtilsAllVoyelleUnique() {
        String valeurTested = "aeiouyAEIOUY";
        String valeurWanted = "aeiouyAEIOUY";
        testVoyelleUnique(valeurTested,valeurWanted); 
	}

    @Test
	void testStringUtilsNoFirstVoyelleUnique() {
        String valeurTested = "vannou";
        String valeurWanted = "aou";
        testVoyelleUnique(valeurTested,valeurWanted);
	}


    @Test
	void testStringUtilsWithFistVoyelleUnique() {
        String valeurTested = "aurelien";
        String valeurWanted = "auei";
        testVoyelleUnique(valeurTested,valeurWanted); 
	}


    private void testVoyelleUnique(String valeurTested, String valeurWanted){
        String resultTest = stringUtils.uniqueVowels(valeurTested);
        Assert.assertEquals(valeurWanted, resultTest);
    }
    

}
