package com.dicka.jdbc.springbootjdbc.service;

import com.dicka.jdbc.springbootjdbc.dao.BarangDao;
import com.dicka.jdbc.springbootjdbc.entitie.Barang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarangServiceImpl implements BarangService{

    @Autowired
    private BarangDao barangDao;

    @Override
    public List<Barang> listBarang() {
        return barangDao.listBarang();
    }

    @Override
    public Barang createdBarang(Barang barang) {
        return barangDao.createdBarang(barang);
    }
}
