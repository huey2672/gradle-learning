package com.huey.learning.gradle.fatjar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

    final static Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        logger.info("Hello, World!");
    }

}
