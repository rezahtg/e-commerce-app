package com.reza.ecommerce.order;

import java.math.BigDecimal;

public record PurchaseResponse(
        Long productId,
        String name,
        String description,
        BigDecimal price,
        double quantity
) {
}
