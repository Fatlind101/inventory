package com.example.inventory.service;

import com.example.inventory.model.StockEntry;
import com.example.inventory.repository.StockEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockEntryService {

    @Autowired
    private StockEntryRepository stockEntryRepository;

    public List<StockEntry> getAllStockEntries() {
        return stockEntryRepository.findAll();
    }

    public StockEntry saveStockEntry(StockEntry entry) {
        return stockEntryRepository.save(entry);
    }
}
