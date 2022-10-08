package com.food.ordering.system.order.service.domain.vauleobject;

import com.food.ordering.system.domain.valueobject.BaseId;

import java.util.UUID;

public class OrderItemId extends BaseId<Long> {
    protected OrderItemId(Long value) {
        super(value);
    }
}
