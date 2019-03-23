package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    private String getProduct(){

        return "product";
    }
}
