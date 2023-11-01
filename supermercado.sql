CREATE DATABASE supermercado;
USE supermercado;

CREATE TABLE caixa (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(50) NOT NULL,
  preco DOUBLE NOT NULL,
  valortotal DOUBLE NOT NULL
);

SELECT * FROM caixa;