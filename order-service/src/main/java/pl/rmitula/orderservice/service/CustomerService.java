package pl.rmitula.orderservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerService {

    private static final String URL = "http://localhost:9090";

    private RestTemplate rest;

    public CustomerService(RestTemplate rest) {
        this.rest = rest;
    }

    public String getGreeting() {
        return rest.getForObject(URL, String.class);
    }


}
