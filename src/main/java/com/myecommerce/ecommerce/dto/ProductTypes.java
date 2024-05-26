package com.myecommerce.ecommerce.dto;

public enum ProductTypes {
    FOOD("FOOD", 1),
    APPLIANCES("APPLIANCES", 2);

    private String name;
    private long id;

    ProductTypes(String name, long id) {
        this.name = name;
        this.id = id;
    }
}
