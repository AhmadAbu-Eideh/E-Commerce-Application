package com.example.Ecommerce.Application.Controller;

import com.example.Ecommerce.Application.Model.Customers;
import com.example.Ecommerce.Application.Model.Products;
import com.example.Ecommerce.Application.Service.CustomerService;
import com.example.Ecommerce.Application.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/getCustomers")
    public List<Customers> getCustomers(){
        return customerService.getCustomer();
    }
    @GetMapping("/getCustomer/{id}")
    public Customers getCustomersById(@PathVariable int id){
        return customerService.getById(id);
    }
    @PostMapping("/addCustomer")
    public void addCustomer(@RequestBody Customers customers){
        customerService.addCustomer(customers);
    }

}
