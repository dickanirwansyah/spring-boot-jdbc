
create table product(

    idproduct int not null auto_increment,
    name varchar(255) not null,
    quantity int not null,
    price int not null,

    CONSTRAINT pk_product_idproduct PRIMARY KEY (idproduct)

);
