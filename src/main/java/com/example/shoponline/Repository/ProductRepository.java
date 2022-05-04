package com.example.shoponline.Repository;

import org.springframework.stereotype.Repository;
import com.example.shoponline.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
