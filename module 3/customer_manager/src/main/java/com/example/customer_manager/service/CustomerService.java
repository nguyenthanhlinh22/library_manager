package com.example.customer_manager.service;

import com.example.customer_manager.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomers();

    void saveCustomer(Customer customer);

    Customer findById(int id);

    void updateCustomer(int id,Customer customer);

    void deleteCustomer(int id , Customer customer);

}
