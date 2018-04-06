
create table product(

    idproduct int not null auto_increment,
    name varchar(255) not null,
    quantity int not null,
    price int not null,

    CONSTRAINT pk_product_idproduct PRIMARY KEY (idproduct)

);

create table barang(
    idbarang varchar(255) not null,
    nama varchar(255) not null,
    jumlah int not null,
    price int not null,
    valid boolean not null,
    idgudang varchar(255) not null,

    CONSTRAINT pk_barang_idbarang PRIMARY KEY (idbarang),
    CONSTRAINT fk_barang_idgudang FOREIGN KEY (idgudang)
    REFERENCES gudang(idgudang)
);

create table gudang(
    idgudang varchar(255) not null unique,
    nama varchar(255) not null,
    deskripsi varchar(255) not null,

    CONSTRAINT pk_gudang_idgudang PRIMARY KEY (idgudang)
);
