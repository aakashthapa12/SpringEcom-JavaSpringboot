package com.aakash.SpringEcom.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {}
