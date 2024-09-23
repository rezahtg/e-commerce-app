package com.reza.ecommerce.product;

import jakarta.validation.constraints.NotNull;

public record ProductPurchaseRequest(
        @NotNull(message = "Product is mandatory")
        Long productId,
        @NotNull(message = "Quantity is mandatory")
        double Quantity
) {
}
