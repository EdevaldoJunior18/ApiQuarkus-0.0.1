package org.acme.controllers;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "endpoints-uri-celcoin")
@Tag(name = "ConsultPartners")
@Path("/ConsultPartners")
@Produces(MediaType.APPLICATION_JSON)
public class ConsultPartners {
    
}