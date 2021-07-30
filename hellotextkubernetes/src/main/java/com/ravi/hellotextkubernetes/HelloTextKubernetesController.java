package com.ravi.hellotextkubernetes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloTextKubernetesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloTextKubernetesController.class);

    @GetMapping( "/hello-text/from/{name}/of/{company}")
    public HelloWorld doHelloWorld(
            @PathVariable String name,
            @PathVariable String company
    ) {

        LOGGER.info("Message received from : {} of {}", name, company);

        return new HelloWorld(
                name, company, "Hello " + name + " from " + company
        );

    }

}
