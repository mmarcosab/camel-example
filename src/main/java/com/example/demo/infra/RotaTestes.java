package com.example.demo.infra;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RotaTestes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:dir1").
                log("${body}").
                to("file:dir2");

        // aqui eh possivel usar o filter(), marshal(), xmlJson() para transformar e filtrar os dados
    }

}
