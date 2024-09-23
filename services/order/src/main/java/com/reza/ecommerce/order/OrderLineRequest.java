package com.reza.ecommerce.order;

public record OrderLineRequest(
        Long id,
        Long orderId,
        Long productId,
        double quantity

) {
}
