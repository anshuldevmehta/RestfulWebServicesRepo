package com.packtpub.mmj.restsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

/**
 *
 * @author sousharm
 */
@SpringBootApplication
public class RestSampleApp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(RestSampleApp.class, args);
        Logger.getLogger("Ape").info("Adding logging capability");
    }
}
