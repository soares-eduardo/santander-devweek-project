package com.project.bootcamp.model.dto;

import java.time.LocalDate;

public class StockDTO {
    
    private Long id;
    private String name;
    private Double price;
    private LocalDate date;
    private Double variation;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getVariation() {
        return variation;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setVariation(Double variation) {
        this.variation = variation;
    }
}
