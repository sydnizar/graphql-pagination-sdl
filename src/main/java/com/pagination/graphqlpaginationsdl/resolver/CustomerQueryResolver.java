package com.pagination.graphqlpaginationsdl.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.pagination.graphqlpaginationsdl.VO.CustomerVO;
import com.pagination.graphqlpaginationsdl.entity.Customer;
import com.pagination.graphqlpaginationsdl.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private CustomerService customerService;

    public List<CustomerVO> getCustomers() {

        return customerService.getAllCustomers().stream().map(customer -> {
            return CustomerVO.builder()
                    .customerId(customer.getCustomer_id())
                    .active(customer.getActive())
                    .addressId(customer.getAddress_id())
                    .email(customer.getEmail())
                    .firstName(customer.getFirst_name())
                    .lastName(customer.getLast_name())
                    .storeId(customer.getStore_id())
                    .build();

        }).collect(Collectors.toList());

    }

    public List<CustomerVO> paginatedCustomers(int count, int offset) {
        List<Customer> allCustomers = customerService.getPaginatedCustomers(count,offset);
        return allCustomers.subList(count,offset).stream().map(customer -> {
            return CustomerVO.builder()
                    .customerId(customer.getCustomer_id())
                    .active(customer.getActive())
                    .addressId(customer.getAddress_id())
                    .email(customer.getEmail())
                    .firstName(customer.getFirst_name())
                    .lastName(customer.getLast_name())
                    .storeId(customer.getStore_id())
                    .build();

        }).collect(Collectors.toList());


    }
}
