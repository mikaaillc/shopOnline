package com.example.shoponline.Service.Concrete;

import com.example.shoponline.Entities.Product;
import com.example.shoponline.Repository.ProductRepository;
import com.example.shoponline.Service.Abstract.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{


    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }


}
