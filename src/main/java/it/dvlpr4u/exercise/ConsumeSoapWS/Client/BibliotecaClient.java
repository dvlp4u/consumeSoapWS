package it.dvlpr4u.exercise.ConsumeSoapWS.Client;

import id.dvlpr4u.esercizi.consumingwebservice.wsdl.BookRequest;
import id.dvlpr4u.esercizi.consumingwebservice.wsdl.BookResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class BibliotecaClient extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(BibliotecaClient.class);

    public BookResponse getBook(String name) {

        BookRequest request = new BookRequest();
        request.setName(name);

        log.info("E' stato richiesto il libro dal titolo: " + name);

        BookResponse response = (BookResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/biblioteca", request);

        return response;
    }
}
