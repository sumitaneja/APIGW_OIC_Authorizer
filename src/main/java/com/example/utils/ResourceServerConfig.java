/*
# oci-apigw-authorizer-idcs-java version 1.0.
#
# Copyright (c) 2020 Oracle, Inc.
# Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl.
*/

package com.example.utils;

/**
 * It contains the resource server configuration and constants
 * Like a properties file, but simpler
 */
public class ResourceServerConfig {

    //YOUR IDENTITY DOMAIN AND APPLICATION CREDENTIALS
    public static final String CLIENT_ID = "";
    public static final String CLIENT_SECRET = "";
    public static final String IDCS_URL = "https://idcs-a4c987a4d84b4da094a25ae0fce5d6de.identity.oraclecloud.com:443";

    //INFORMATION ABOUT THE TARGET APPLICATION
    public static final String SCOPE_AUD = "http://service1";

    //TEST CLIENT CREDENTIALS
    public static final String TEST_CLIENT_ID = "";
    public static final String TEST_CLIENT_SECRET = "";
    public static final String TEST_CLIENT_SCOPE = "http://service1urn:opc:resource:consumer::all";

    //INFORMATION ABOUT IDENTITY CLOUD SERVICES
    public static final String JWK_URL=IDCS_URL+"/admin/v1/SigningCert/jwk";
    public static final String TOKEN_URL=IDCS_URL+"/oauth2/v1/token";

    //PROXY
    public static final boolean HAS_PROXY = false;
    public static final String PROXY_HOST = "http://my.proxy.com";
    public static final int PROXY_PORT = 80;
}
