package com.pagination.graphqlpaginationsdl.service;

import com.pagination.graphqlpaginationsdl.VO.CustomerVO;
import com.pagination.graphqlpaginationsdl.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getAllCustomers();

    public List<Customer> getPaginatedCustomers(int count, int offset);
}
