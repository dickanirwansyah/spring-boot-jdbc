package com.dicka.jdbc.springbootjdbc.dao;

import com.dicka.jdbc.springbootjdbc.entitie.Gudang;

import java.util.List;

public interface GudangDao {

    List<Gudang> listGudang();

    Gudang getId(String idgudang);
}
