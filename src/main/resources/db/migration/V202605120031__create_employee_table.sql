create table employees(
    id BIGINT not null auto_increment,
    nome VARCHAR (150) not null,
    salario decimal (10,2)not null,
    birthday TIMESTAMP not null,
    PRIMARY KEY(id)
)engine = InnoDB default charset=utf8;