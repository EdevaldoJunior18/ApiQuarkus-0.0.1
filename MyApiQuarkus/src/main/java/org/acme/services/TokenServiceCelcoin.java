package org.acme.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Form;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.acme.restClient.RestClientTokenCelcoin;


@ApplicationScoped
public class TokenServiceCelcoin {
    @Inject
    @RestClient
    RestClientTokenCelcoin restClient;

    @ConfigProperty(name = "clientId")
    String clientId;

    @ConfigProperty(name = "grantType")
    String grantType;

    @ConfigProperty(name = "clientSecret")
    String clientSecret;

    public String getToken () {

        Form tokenReq = new Form()
            .param("client_id", clientId)
            .param("grant_type", grantType)
            .param("client_secret", clientSecret);
            
            var tokenDto = restClient.getNewToken(tokenReq);
            return tokenDto.getTokenType () + tokenDto.getAccessToken ();
    }
        
}    