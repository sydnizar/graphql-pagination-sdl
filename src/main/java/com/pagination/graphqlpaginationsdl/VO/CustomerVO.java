package com.pagination.graphqlpaginationsdl.VO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerVO {

    private Long customerId;

    private Long storeId;

    private String firstName;

    private String lastName;

    private String email;

    private Integer addressId;

    private Integer active;
}
