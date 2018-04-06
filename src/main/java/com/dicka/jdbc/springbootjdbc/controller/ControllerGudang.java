package com.dicka.jdbc.springbootjdbc.controller;

import com.dicka.jdbc.springbootjdbc.entitie.Gudang;
import com.dicka.jdbc.springbootjdbc.service.GudangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/gudang")
public class ControllerGudang {

    @Autowired
    private GudangService gudangService;

    @GetMapping
    public ResponseEntity<List<Gudang>> listGudang(){
        return Optional.ofNullable(gudangService.listGudang())
                .map(resultset -> new ResponseEntity<>(resultset, HttpStatus.OK))
                .orElse(new ResponseEntity<List<Gudang>>(HttpStatus.BAD_REQUEST));
    }

    @GetMapping(value = "/get")
    public ResponseEntity<Gudang> getId(@RequestParam(value = "idgudang")String idgudang){
        return Optional.ofNullable(gudangService.getId(idgudang))
                .map(resultset -> new ResponseEntity<>(resultset, HttpStatus.OK))
                .orElse(new ResponseEntity<Gudang>(HttpStatus.BAD_REQUEST));
    }
}
