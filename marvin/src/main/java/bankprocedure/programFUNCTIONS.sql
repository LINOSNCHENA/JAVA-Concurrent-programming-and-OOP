---------------------------------------------------------------------------- FUNCTION(Two)
use presly; DELIMITER ||
DROP FUNCTION IF EXISTS fages;
CREATE FUNCTION fages (todayage INT)
  RETURNS INT
BEGIN
  RETURN (2019-todayage);
END;
 ||
DELIMITER ;
SELECT fages(1984);
--------------------------------
use presly; DELIMITER $$
CREATE DEFINER=`root`@`localhost` FUNCTION `fbankers`(kachana VARCHAR(200)) 
RETURNS varchar(200) CHARSET utf8mb4
DETERMINISTIC
BEGIN
DECLARE out1 VARCHAR(200);
SELECT name into out1
FROM bank2 where name=kachana;
RETURN out1;
END$$
DELIMITER ;
SELECT fbankers('Lorena nchena');
SELECT id, fbankers("Lorena nchena")
FROM  bank1
ORDER BY id;
----------------------------------------------------------------------------------------------------
use presly;
DELIMITER $$
CREATE FUNCTION `CustomerLevel` ( credit DECIMAL(10,2))
RETURNS VARCHAR(20)
DETERMINISTIC
BEGIN
    DECLARE customerLevel VARCHAR(20); 
    IF credit > 50000 THEN
        SET customerLevel = 'PLATINUM';
    ELSEIF (credit >= 50000 AND 
            credit <= 10000) THEN
        SET customerLevel = 'GOLD';
    ELSEIF credit < 10000 THEN
        SET customerLevel = 'SILVER';
    END IF;
    -- return the customer level
    RETURN (customerLevel);
END$$
DELIMITER ;
------------------------------------------------------------------------------------------------
SET GLOBAL log_bin_trust_function_creators = 1;
SELECT  customerName, CustomerLevel(creditLimit)
FROM  customers
ORDER BY customerName;


