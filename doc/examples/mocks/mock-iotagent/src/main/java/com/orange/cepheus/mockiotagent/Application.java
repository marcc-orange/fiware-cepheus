package com.orange.cepheus.mockiotagent;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by pborscia on 20/08/2015.
 */
@SpringBootApplication
@ComponentScan("com.orange")
public class Application {

    public static void main(String[] args) {

        new SpringApplicationBuilder()
                .sources(Application.class)
                .showBanner(false)
                .run(args);
    }
}

