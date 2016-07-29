package com.mDevI.Utils;


import java.net.URL;

/**
 * Class for URL validation purpose.
 */
public class UrlValidator {

public String GetHostFromURL(String urlString) throws  Exception {
    URL mURL = new URL(urlString);
     return  mURL.getHost();
}

public String GetProtocolFromURL (String urlString) throws Exception {


    URL mURL = new URL(urlString);
    return mURL.getProtocol();
}

}