package com.dicka.jdbc.springbootjdbc.row;

import com.dicka.jdbc.springbootjdbc.dao.GudangDao;
import com.dicka.jdbc.springbootjdbc.entitie.Barang;
import com.dicka.jdbc.springbootjdbc.entitie.Gudang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class RowMapperBarang implements RowMapper<Barang> {

    @Autowired
    private GudangDao gudangDao;

    @Override
    public Barang mapRow(ResultSet row, int rowNum) throws SQLException {
        Barang barang = new Barang();
        Gudang gudang = new Gudang();
        barang.setIdbarang(row.getString("idbarang"));
        barang.setNama(row.getString("nama"));
        barang.setJumlah(row.getInt("jumlah"));
        barang.setPrice(row.getInt("price"));
        gudang.setIdgudang(row.getString("idgudang"));
        barang.setGudang(gudang);
        return barang;
    }
}
