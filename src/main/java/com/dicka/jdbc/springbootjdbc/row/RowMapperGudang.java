package com.dicka.jdbc.springbootjdbc.row;

import com.dicka.jdbc.springbootjdbc.entitie.Gudang;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperGudang implements RowMapper<Gudang> {

    @Override
    public Gudang mapRow(ResultSet row, int rowNum) throws SQLException {
        Gudang gudang = new Gudang();
        gudang.setIdgudang(row.getString("idgudang"));
        gudang.setNama(row.getString("nama"));
        gudang.setDeskripsi(row.getString("deskripsi"));
        return gudang;
    }
}
