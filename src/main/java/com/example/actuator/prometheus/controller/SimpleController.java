package com.example.actuator.prometheus.controller;

import io.micrometer.core.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    private static final Logger LOG = LoggerFactory.getLogger(SimpleController.class);

    @RequestMapping("/endpoint1")
    public void endpoint1() {
        LOG.info("Emdpoint 1");
    }

    @RequestMapping("/endpoint2")
    @Timed
    public void endpoint2() {
        LOG.info("Emdpoint 2");
    }
}
