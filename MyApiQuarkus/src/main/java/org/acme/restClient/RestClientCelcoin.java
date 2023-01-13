package org.acme.restClient;

import java.text.Normalizer.Form;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.models.TokenResponseCelcoinDto;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient (configKey = "endpoints-uri-celcoin")
public interface RestClientCelcoin {
   
    @GET
    @Path("/consult-partners")
    @Produces(MediaType.APPLICATION_JSON)
    TokenResponseCelcoinDto getAccesTokenResponseCelcoinDto(@HeaderParam("Authorization") Form tokenForm);
   
}