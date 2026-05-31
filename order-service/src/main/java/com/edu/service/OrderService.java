package com.edu.service;

import com.edu.cliente.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private ProductClient productClient;

    public List<String> getProducts() {
        return productClient.getProducts();
    }
}
