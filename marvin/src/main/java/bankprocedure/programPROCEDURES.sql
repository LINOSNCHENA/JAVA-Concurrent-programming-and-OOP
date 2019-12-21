----------------------------------------------------------- PROCEDURES(3)
DELIMITER //
DROP PROCEDURE IF EXISTS pnumber;
CREATE PROCEDURE pnumber(thisPick SMALLINT)
BEGIN
	SELECT students.id, students.name, courses.name, courses.id
	FROM students INNER JOIN courses ON	students.id = courses.id
	WHERE students.id > thisPick;
END //
DELIMITER ;
call pnumber(4)
-------------------------------------------------------------
DELIMITER $$
DROP PROCEDURE IF EXISTS psum2;
CREATE PROCEDURE psum2(IN num1 INT,IN num2 INT,OUT zambia INT)
BEGIN
    SET zambia := num2 - num1;
END $$
CALL psum2(1984,2019,@output);
SELECT @output;
---------------------------------------------------------------
USE `presly`;
DROP procedure IF EXISTS `justina`;
DELIMITER $$
CREATE PROCEDURE `justina` ()
BEGIN
select * from students where name like '%na%';
END $$
DELIMITER ;
call justina
----------------------------------------------------------------