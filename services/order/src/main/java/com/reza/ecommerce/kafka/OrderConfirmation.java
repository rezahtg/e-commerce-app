package com.reza.ecommerce.kafka;

import com.reza.ecommerce.customer.CustomerResponse;
import com.reza.ecommerce.order.PaymentMethod;
import com.reza.ecommerce.order.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
