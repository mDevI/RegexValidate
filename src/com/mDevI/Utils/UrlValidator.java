package com.mDevI.Utils;


import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Class for URL validation purpose.
 */
public class UrlValidator {

    public String GetHostFromURL(String urlString) throws Exception {
        URL mURL = new URL(urlString);
        return mURL.getHost();
    }

    public String GetProtocolFromURL(String urlString) throws MalformedURLException {


        URL mURL = new URL(urlString);
        return mURL.getProtocol();
    }

    public URI String2Uri(String someUriString) throws URISyntaxException {

        URI mURI = URI.create(someUriString);

        if (!mURI.equals(null)) {
            return mURI.normalize();
        } else return mURI;

    }
}

