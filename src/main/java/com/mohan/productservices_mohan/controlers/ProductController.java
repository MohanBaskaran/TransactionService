package com.mohan.productservices_mohan.controlers;

import com.mohan.productservices_mohan.modules.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


   /* REST - Representational  State Transfer

   1.) GET
   2.) POST
   3.) put
   4.)patch
   5.)Delete
    */


    @GetMapping(name = "/getAllProducts")
    public void getAllProducts() {

    }

    public void getProductDetails(Long id) {
    }

    public void createProduct() {
    }


}
