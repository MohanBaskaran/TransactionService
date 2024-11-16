package com.mohan.productservices_mohan.modules;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;

@Getter
@Setter
public class Product {

    private Long id;
    private String title;
    private String description;
    private double price;
    private String imageUrl;
    private Category category;
}
