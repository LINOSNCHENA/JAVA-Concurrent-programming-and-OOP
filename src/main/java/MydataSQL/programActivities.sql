select * from students where name like '%na%'			-- filter
Select SUBSTRING(name,1,3) as name from teachers		-- First three numbers
Select * into studentsTwo from students where 1=2 		-- Non Existant members
SELECT COUNT(id),code, name	FROM students	GROUP BY name,code	HAVING COUNT(id) > 1;
select count(id) from bank1;
select * from bank1 order by salary desc limit 3;
CREATE TABLE Persons (ID int NOT NULL, LastName varchar(255) NOT NULL,
    				  FirstName varchar(255),    Age int CHECK (Age>=18));

SELECT DISTINCT salary 
FROM bank1 a WHERE 2 >= (SELECT COUNT(DISTINCT salary) 
FROM bank1 b WHERE b.salary >= a.salary) 
ORDER BY a.salary DESC;

SELECT * 
FROM bank1 a WHERE 1 >= (SELECT COUNT(DISTINCT salary) 
FROM bank1 b WHERE b.salary >= a.salary) 
ORDER BY a.salary DESC;

SELECT COUNT(students2.id),COUNT(teachers3.id), students2.name2, teachers3.name3  AS CMISStudents
FROM  (students2	INNER JOIN courses1 ON   courses1.id>1 or courses1.id = students2.id
            	    INNER JOIN teachers3 ON  courses1.id>1 or courses1.id = teachers3.id)
WHERE students2.name2 = 'Kachana' OR students2.name2 like '%na%'
GROUP BY students2.id, students2.name2, courses1.name1, teachers3.name3
HAVING COUNT(courses1.id) > 0
order by teachers3.name3

SELECT A.name AS "GirlsBoys",A.code AS "CourseNumber",
B.name AS "INSY_Supervisor",B.id AS "COSC_Supervisor"
FROM students A, students B WHERE A.id = B.id;

SELECT rusangu1.name, rusangu2.name FROM students AS rusangu1 CROSS JOIN teachers AS rusangu2;
select * FROM Students B INNER JOIN courses ON courses.id = B.id;

Select * from bank1 where id % 2 = 01
SELECT DISTINCT salary FROM Bank1 ORDER BY salary ASC LIMIT 7 OFFSET 1; 
SELECT VERSION();
SHOW PRIVILEGES;