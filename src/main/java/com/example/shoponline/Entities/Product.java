package com.example.shoponline.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@Table(name = "\"Product\"",
        indexes = {
        @Index(name = "fki_categoryId_fk", columnList = "\"categoryId\"")
}
)

public class Product {
    @Id
    @Column(name = "\"productId\"", nullable = false)
    private Long id;


    @Column(name = "\"productName\"")
    private String productName;

    @Column(name = "discount")
    private Double discount;

    @Column(name = "price")
    private Double price;

    @Column(name = "\"createDate\"", nullable = false)
    private Instant createDate;

    @Column(name = "stock")
    private Long stock;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "barcode")
    @NotNull
    private String barcode;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"categoryId\"", nullable = false)
    private Category category;

    @Column(name = "\"userId\"", nullable = false)
    private Long userId;

}