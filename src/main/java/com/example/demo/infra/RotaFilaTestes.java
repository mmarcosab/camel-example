package com.example.demo.infra;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RotaFilaTestes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("rabbitmq://127.0.0.1:5672/fila-teste").
                log("${body}").
                to("file:cep/teste.json");
//
//        from("direct:startQueuePoint").id("idOfQueueHere").marshal(jsonDataFormat)
//                .to("rabbitmq://localhost:5672/javainuse.exchange?queue=javainuse.queue&autoDelete=false").end();

        // aqui eh possivel usar o filter(), marshal(), xmlJson() para transformar e filtrar os dados
    }

}
