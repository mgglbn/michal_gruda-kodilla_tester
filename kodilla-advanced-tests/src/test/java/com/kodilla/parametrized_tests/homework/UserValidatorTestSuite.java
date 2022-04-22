package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"123",".-_","aB.","A1.-afl3","_-.1Afzx4"})
    public void userNameShouldBeValid(String username){
        assertTrue(validator.validateUsername(username));
    }


    @ParameterizedTest
    @ValueSource(strings = {"ab","A v","","#5a","abc ","!3232","dsfas?"})
    public void userNameShouldBeInvalid(String username){
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"_._._@-.-.a","0@-.abcdef","A@B.C","-_.-@-.a"})
    public void emailShouldBeValid(String email){
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {""," ","@",".@asd.asf","abc@bca.abcdefg","1.dfv.dvd","abc@bca.1","abc d@gfs.com",
    "qwr@_gd.com","123@sdf.com1"})
    public void emailShouldBeInvalid(String email){
        assertFalse(validator.validateEmail(email));
    }
}