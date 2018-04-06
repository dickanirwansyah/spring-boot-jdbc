package com.dicka.jdbc.springbootjdbc.dao;

import com.dicka.jdbc.springbootjdbc.entitie.Gudang;
import com.dicka.jdbc.springbootjdbc.row.RowMapperGudang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class GudangDaoImpl implements GudangDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Gudang> listGudang() {
        String sql = "select * from gudang";
        RowMapper<Gudang> gudangMapper = new RowMapperGudang();
        return this.jdbcTemplate.query(sql, gudangMapper);
    }

    @Override
    public Gudang getId(String idgudang) {
        String sql = "select * from gudang where idgudang=?";
        RowMapper<Gudang> mapper = new BeanPropertyRowMapper<>(Gudang.class);
        Gudang gudang = jdbcTemplate.queryForObject(sql, mapper, idgudang);
        return gudang;
    }
}
