package com.dicka.jdbc.springbootjdbc.dao;

import com.dicka.jdbc.springbootjdbc.entitie.Barang;
import com.dicka.jdbc.springbootjdbc.row.RowMapperBarang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class BarangDaoImpl implements BarangDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Barang> listBarang() {
        String sql = "select * from barang";
        RowMapper<Barang> barangRowMapper = new RowMapperBarang();
        return jdbcTemplate.query(sql, barangRowMapper);
    }

    @Override
    public Barang createdBarang(Barang barang) {
        String sql = "insert into barang(idbarang, nama, jumlah, price, valid, idgudang) " +
                "values(?,?,?,?,?,?)";
        jdbcTemplate.update(sql, barang.getIdbarang(),
                barang.getNama(),
                barang.getJumlah(),
                barang.getPrice(),
                barang.isValid(),
                barang.getGudang().getIdgudang());
        return barang;
    }
}
