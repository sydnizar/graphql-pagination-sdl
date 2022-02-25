package com.pagination.graphqlpaginationsdl;

import com.pagination.graphqlpaginationsdl.entity.Customer;
import com.pagination.graphqlpaginationsdl.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class GraphqlPaginationSdlApplication {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlPaginationSdlApplication.class, args);

	}

	@RequestMapping(value = "/customer")
	public List<Customer> getOrderDetails() {
		return customerRepository.findAll();
	}
}
