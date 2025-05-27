package com.example.inventory.repository;

import com.example.inventory.model.StockEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockEntryRepository extends JpaRepository<StockEntry, Long> {
}
