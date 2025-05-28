package com.example.inventory.config;

import com.example.inventory.model.Category;
import com.example.inventory.model.Product;
import com.example.inventory.model.StockEntry;
import com.example.inventory.repository.CategoryRepository;
import com.example.inventory.repository.ProductRepository;
import com.example.inventory.repository.StockEntryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(
            ProductRepository productRepository,
            CategoryRepository categoryRepository,
            StockEntryRepository stockEntryRepository
    ) {
        return args -> {

            Category electronics = new Category();
            electronics.setName("Electronics");
            categoryRepository.save(electronics);

            Category food = new Category();
            food.setName("Food");
            categoryRepository.save(food);

            Product laptop = new Product();
            laptop.setName("Laptop");
            laptop.setQuantity(10);
            laptop.setPrice(999.99);
            laptop.setCategory(electronics);
            productRepository.save(laptop);

            Product apple = new Product();
            apple.setName("Apple");
            apple.setQuantity(50);
            apple.setPrice(0.50);
            apple.setCategory(food);
            productRepository.save(apple);

            StockEntry se1 = new StockEntry();
            se1.setProduct(laptop);
            se1.setQuantityChange(-2);
            se1.setTimestamp(LocalDateTime.now());
            stockEntryRepository.save(se1);

            StockEntry se2 = new StockEntry();
            se2.setProduct(apple);
            se2.setQuantityChange(20);
            se2.setTimestamp(LocalDateTime.now());
            stockEntryRepository.save(se2);

            System.out.println("Sample data initialized ✅");
        };
    }
}
