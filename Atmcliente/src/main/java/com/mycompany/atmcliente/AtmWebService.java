/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.atmcliente;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:AtmOperacoes
 * [atm_operacoes]<br>
 * USAGE:
 * <pre>
 *        AtmWebService client = new AtmWebService();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author dlvmnfch3pla
 */
public class AtmWebService {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/AtmServerWebService/resources";

    public AtmWebService() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("atm_operacoes");
    }

    public <T> T EfectuarDeposito(Object requestEntity, Class<T> responseType) throws ClientErrorException {
        return webTarget.path("deposito").request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON), responseType);
    }

    public <T> T Levantamento(Object requestEntity, Class<T> responseType) throws ClientErrorException {
        return webTarget.path("levantamento").request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON), responseType);
    }

    public <T> T VerificarCredenciais(Class<T> responseType, String num_cartao, String pin) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("verificar_credenciais/{0}/{1}", new Object[]{num_cartao, pin}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void close() {
        client.close();
    }
    
}
