package com.reza.ecommerce.order;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessExecption extends RuntimeException {

    private final String msg;

}
