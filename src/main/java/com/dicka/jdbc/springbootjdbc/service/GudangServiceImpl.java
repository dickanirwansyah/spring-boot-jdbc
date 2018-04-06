package com.dicka.jdbc.springbootjdbc.service;

import com.dicka.jdbc.springbootjdbc.dao.GudangDao;
import com.dicka.jdbc.springbootjdbc.entitie.Gudang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GudangServiceImpl implements GudangService{

    @Autowired
    private GudangDao gudangDao;

    @Override
    public List<Gudang> listGudang() {
        return gudangDao.listGudang();
    }

    @Override
    public Gudang getId(String idgudang) {
        return gudangDao.getId(idgudang);
    }
}
