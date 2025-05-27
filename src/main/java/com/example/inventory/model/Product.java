package com.example.inventory.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int quantity;
    private double price;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<StockEntry> stockEntries;

    // === Constructors ===
    public Product() {}

    public Product(String name, int quantity, double price, Category category) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    // === Getters and Setters ===
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public List<StockEntry> getStockEntries() { return stockEntries; }
    public void setStockEntries(List<StockEntry> stockEntries) { this.stockEntries = stockEntries; }
}
