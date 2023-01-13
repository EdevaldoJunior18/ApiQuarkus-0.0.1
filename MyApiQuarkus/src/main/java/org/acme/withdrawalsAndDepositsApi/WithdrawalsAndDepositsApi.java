package org.acme.withdrawalsAndDepositsApi;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@OpenAPIDefinition(info = @Info (description = "Endpoints related to withdrawals and deposits making calls to Celcoin API!", title = "Withdrawals and deposits API.", version = "0.0.1" ))
public class WithdrawalsAndDepositsApi extends javax.ws.rs.core.Application{

}