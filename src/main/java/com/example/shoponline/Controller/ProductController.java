package com.example.shoponline.Controller;

import com.example.shoponline.Entities.Product;
import com.example.shoponline.Service.Abstract.IProductService;
import com.example.shoponline.Service.Concrete.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/Product")//
public class ProductController {


    @Autowired
    private IProductService iProductService;

    public ProductController(IProductService iProductService){
        this.iProductService=iProductService;
    }

    @GetMapping("/getAllProduct")
    private List<Product> getAllProduct(){
     return iProductService.getAllProduct();
    }


}
