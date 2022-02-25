package com.pagination.graphqlpaginationsdl.service.impl;

import com.pagination.graphqlpaginationsdl.VO.CustomerVO;
import com.pagination.graphqlpaginationsdl.entity.Customer;
import com.pagination.graphqlpaginationsdl.repository.CustomerRepository;
import com.pagination.graphqlpaginationsdl.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;



    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> getPaginatedCustomers(int count, int offset) {
        PageRequest pageRequest = PageRequest.of(count,offset);
        Page<Customer> customers = customerRepository.findAll(pageRequest);
        return customers.toList();
    }
}
