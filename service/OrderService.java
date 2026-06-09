package m3.microservice_2.service;


import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public String orderCheck() {
        return "Order Service is Up";
    }
}
