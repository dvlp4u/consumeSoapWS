package it.dvlpr4u.exercise.ConsumeSoapWS.Client;

import id.dvlpr4u.esercizi.consumingwebservice.wsdl.BookResponse;
import it.dvlpr4u.exercise.ConsumeSoapWS.Configuration.BibliotecaConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BibliotecaConfig.class, loader = AnnotationConfigContextLoader.class)
@Slf4j
public class TestBibliotecaClient {

    @Autowired
    BibliotecaClient client;

    @Test
    public void getBook(){

        BookResponse response = client.getBook("Prova");
        log.info("Il nome del libro richiesto è: {}", response.getBook().getName());
        Assert.assertEquals("Design Pattern", response.getBook().getName());

    }
}
