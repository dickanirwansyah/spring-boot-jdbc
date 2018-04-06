package com.dicka.jdbc.springbootjdbc.controller;

import com.dicka.jdbc.springbootjdbc.entitie.Barang;
import com.dicka.jdbc.springbootjdbc.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/barang")
public class ControllerBarang {

    @Autowired
    private BarangService barangService;

    @GetMapping
    public ResponseEntity<List<Barang>> listBarang(){
        return Optional.ofNullable(barangService.listBarang())
                .map(resultset -> new ResponseEntity<>(resultset, HttpStatus.OK))
                .orElse(new ResponseEntity<List<Barang>>(HttpStatus.BAD_REQUEST));
    }

    @PostMapping(value = "/created")
    public ResponseEntity<Barang> createdBarang(@RequestBody Barang barang){
        return Optional.ofNullable(barangService.createdBarang(barang))
                .map(resultset -> new ResponseEntity<>(resultset, HttpStatus.CREATED))
                .orElse(new ResponseEntity<Barang>(HttpStatus.BAD_REQUEST));
    }
}
