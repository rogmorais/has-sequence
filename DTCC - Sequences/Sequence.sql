CREATE DATABASE LOCAUTO;

USE LOCAUTO;

CREATE TABLE TBL_VEICULO(
ID_VEICULO BIGINT PRIMARY KEY,
TX_PLACA VARCHAR(7),
TX_COR VARCHAR(20),
NR_ANO INT
);

CREATE TABLE TBL_SEQUENCE
(
    NAME VARCHAR(255) PRIMARY KEY,
    VALUE BIGINT
);
