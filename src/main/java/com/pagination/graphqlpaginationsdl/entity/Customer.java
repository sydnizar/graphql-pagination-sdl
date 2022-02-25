package com.pagination.graphqlpaginationsdl.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;


@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Customer {

    @Id
    private Long customer_id;

    private Long store_id;

    private String first_name;

    private String last_name;

    private String email;

    private Integer address_id;

    private Integer active;





}
