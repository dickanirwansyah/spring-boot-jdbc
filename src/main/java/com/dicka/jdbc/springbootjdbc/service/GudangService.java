package com.dicka.jdbc.springbootjdbc.service;

import com.dicka.jdbc.springbootjdbc.entitie.Gudang;

import java.util.List;

public interface GudangService {

    List<Gudang> listGudang();

    Gudang getId(String idgudang);
}
