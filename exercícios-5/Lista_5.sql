USE trigger_db_example;

CREATE TABLE it_vendas(
Id INT(10) NOT NULL,
NomeProduto VARCHAR(30) NOT NULL,
Preco FLOAT(10) NOT NULL,
Quantidade INT(10) NOT NULL,
Valortotal FLOAT(10) NOT NULL,
VendasId INT(10) NOT NULL,
PRIMARY KEY(Id),
FOREIGN KEY (VendasId) REFERENCES vendas (Id)
);
/*ex 1*/

DELIMITER $
CREATE TRIGGER a AFTER INSERT
ON it_vendas FOR EACH ROW
BEGIN
	UPDATE vendas SET Total = Total + NEW.Valortotal 
    WHERE Id = NEW.VendasId;
END$

CREATE TRIGGER b AFTER UPDATE
ON it_vendas FOR EACH ROW
BEGIN
	UPDATE vendas SET Total = (Total - OLD.Valortotal) + NEW.Valortotal 
    WHERE Id = NEW.VendasId;
END$

CREATE TRIGGER c AFTER DELETE
ON it_vendas FOR EACH ROW
BEGIN
	UPDATE vendas SET Total = Total - OLD.Valortotal 
    WHERE Id = OLD.VendasId;
END$

DELIMITER ;
/*ex 2*/

DELIMITER $

CREATE PROCEDURE Selecionar_Itens(IN quantidade INT,IN id INT)
BEGIN
	SELECT * FROM it_vendas WHERE VendasId=id
	LIMIT quantidade;
END$

CREATE PROCEDURE Contar_Itens(IN id INT, OUT quantidade INT)
BEGIN
	SELECT COUNT(*) INTO quantidade FROM it_vendas WHERE VendasId=id;
END$

DELIMITER ;
/*ex 3*/

DROP PROCEDURE Selecionar_Itens;

CALL Selecionar_Itens(2,1);
CALL Contar_Itens(1,@total);
SELECT @total;