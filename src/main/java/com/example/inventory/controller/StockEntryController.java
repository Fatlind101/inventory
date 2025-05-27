package com.example.inventory.controller;

import com.example.inventory.model.StockEntry;
import com.example.inventory.service.StockEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock-entries")
public class StockEntryController {

    @Autowired
    private StockEntryService stockEntryService;

    @GetMapping
    public List<StockEntry> getAllStockEntries() {
        return stockEntryService.getAllStockEntries();
    }

    @PostMapping
    public StockEntry addStockEntry(@RequestBody StockEntry stockEntry) {
        return stockEntryService.saveStockEntry(stockEntry);
    }
}
