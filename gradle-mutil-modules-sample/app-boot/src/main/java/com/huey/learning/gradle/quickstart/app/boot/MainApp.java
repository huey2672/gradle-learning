package com.huey.learning.gradle.quickstart.app.boot;

import com.huey.learning.gradle.quickstart.app.service.HelloService;

public class MainApp {

    public static void main(String[] args) {
        HelloService service = new HelloService();
        service.hello("Huey");
    }

}
