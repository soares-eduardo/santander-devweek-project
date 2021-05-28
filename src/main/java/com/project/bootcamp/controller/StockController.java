package com.project.bootcamp.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.project.bootcamp.model.dto.StockDTO;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stock")
public class StockController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> save(@RequestBody StockDTO dto) {   
        return ResponseEntity.ok(dto);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> update(@RequestBody StockDTO dto) {
        return ResponseEntity.ok(dto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> findAll() {
        List<StockDTO> list = new ArrayList<>();
        StockDTO dto = new StockDTO();

        dto.setId(1L);
        dto.setName("Magazine Luiza");
        dto.setPrice(10D);
        dto.setDate(LocalDate.now());

        list.add(dto);

        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> findById(@PathVariable Long id) {

        List<StockDTO> list = new ArrayList<>();
        StockDTO stock1 = new StockDTO();

        stock1.setId(1L);
        stock1.setName("Magazine Luiza");
        stock1.setPrice(10D);
        stock1.setDate(LocalDate.now());

        StockDTO stock2 = new StockDTO();

        stock2.setId(2L);
        stock2.setName("Ponto Frio");
        stock2.setPrice(10D);
        stock2.setDate(LocalDate.now());

        list.add(stock1);
        list.add(stock2);

        StockDTO selecionado = list.stream().filter(x -> x.getId().compareTo(id) == 0).findFirst().get();

        return ResponseEntity.ok(selecionado);

    }
}
