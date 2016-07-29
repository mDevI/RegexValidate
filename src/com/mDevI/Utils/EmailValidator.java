package com.mDevI.Utils;


import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 * Class for regex validate method.
 */
public class EmailValidator implements ConstantManager {
    private Pattern pattern;
    Matcher matcher;

    /*
    * Class contructor
    *
    * */

    public EmailValidator(){
        pattern = Pattern.compile((EMAIL_PATTERN));
    }
/*
* Method for check is string representing email address have a valid email
* */
    public Boolean isValid(String hex){

        matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
