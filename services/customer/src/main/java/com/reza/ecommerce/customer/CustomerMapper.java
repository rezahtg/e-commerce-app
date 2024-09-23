package com.reza.ecommerce.customer;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class CustomerMapper {
    public Customer toCustomer(CustomerRequest request) {
        if (Objects.isNull(request)) {
            return null;
        }
        return Customer.builder()
                .id(request.id())
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .address(request.address())
                .build();
    }

    public CustomerReponse fromCustomer(Customer customer) {
        return new CustomerReponse(
                customer.getId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getAddress()
        );
    }
}
