package com.example.customer_manager.service;

import com.example.customer_manager.model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

public class CustomerServiceImpl implements CustomerService {

    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        customers.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        customers.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        customers.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijing"));
        customers.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.put(6, new Customer(6, "Rose", "rose@codegym.vn", "New York"));
    }

    @Override
    public List<Customer> findAllCustomers() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void saveCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void updateCustomer(int id,Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void deleteCustomer(int id, Customer customer) {
        customers.remove(id);
    }

    private void deleteAllCustomers(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Customer customer = findById(id);
        RequestDispatcher dispatcher;
        if(customer == null) {
            dispatcher = req.getRequestDispatcher("error.jsp");
        }else {
            deleteCustomer(id, customer);
            try{
                 resp.sendRedirect("/views/customers");
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

}
