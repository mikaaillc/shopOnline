package com.example.shoponline.Entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "\"Product\"", indexes = {
        @Index(name = "fki_categoryId_fk", columnList = "categoryId")
})
public class Product {
    @Id
    @Column(name = "\"productId\"", nullable = false)
    private Long id;

    @Lob
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

    @Lob
    @Column(name = "barcode")
    private String barcode;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"categoryId\"", nullable = false)
    private Category category;

    @Column(name = "\"userId\"", nullable = false)
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Instant getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Instant createDate) {
        this.createDate = createDate;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}