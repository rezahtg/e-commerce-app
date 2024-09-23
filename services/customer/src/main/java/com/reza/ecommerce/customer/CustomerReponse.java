package com.reza.ecommerce.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerReponse(
        String id,
        String firstName,
        String lastName,
        String email,
        Address address
) {
}
