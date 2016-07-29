package com.mDevI;

import com.mDevI.Utils.*;


public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] rawDataEmailsStrings = { "mkyong@yahoo.com",
                "mkyong-100@yahoo.com", "mkyong.100@yahoo.com",
                "mkyong111@mkyong.com", "mkyong-100@mkyong.net",
                "mkyong.100@mkyong.com.au", "mkyong@1.com",
                "mkyong@gmail.com.com", "mkyong+100@gmail.com",
                "mkyong-100@yahoo-test.com",
                // custom email entries
                "asd@sdf.er",
                "aswq_.asws@dfereer.ewer.we",
                "asrew$$$@aswsz.xx",
                "ssdaws@dsdsds@err",
                "21121 3swed@ssas.q"

        };

        String[] rawDataUsersUrl = {
                "http://www.rbc.ru", "https://github.com","toster.ru","avr.ru", "www.vcs.ru"
        };

        EmailValidator emailValidator = new EmailValidator();

        for (String temp: rawDataEmailsStrings
             ) {
            if (emailValidator.isValid(temp)){
                System.out.println(temp + " is valid");
            } else {
                System.out.println(temp+ " is not valid");
            }
        }


        UrlValidator urlValidator = new UrlValidator();

        for (String tempUrl: rawDataUsersUrl) {

            try {
                System.out.println("For URI: "+ tempUrl+ " we have HOST as:" + urlValidator.GetHostFromURL(tempUrl));
            } catch ( Exception e){
             System.out.println(e.getMessage().toString());
            }

        }



    }
}
