
package com.example.controller;

import com.example.service.MyService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class ServiceController {
    private MyService service = new MyService();

    @WebMethod
    public String getGreeting(String name) {
        return service.greet(name);
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/greet", new ServiceController());
        System.out.println("Service is running at http://localhost:8080/ws/greet?wsdl");
    }
}
