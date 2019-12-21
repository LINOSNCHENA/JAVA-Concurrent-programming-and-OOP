DROP TABLE IF EXISTS teachers3;
CREATE TABLE teachers3(id serial PRIMARY KEY, name3 VARCHAR(255), code3 integer);
DROP TABLE IF EXISTS students2;
CREATE TABLE students2(id serial PRIMARY KEY, name2 VARCHAR(255), code2 integer);
DROP TABLE IF EXISTS courses1;
CREATE TABLE courses1(id serial PRIMARY KEY, name1 VARCHAR(255), code1 integer);

INSERT INTO courses1(name1, code1) VALUES('INSY118 POSTGRESS', 2011);
INSERT INTO courses1(name1, code1) VALUES('INSY336', 2013);
INSERT INTO courses1(name1, code1) VALUES('COSC111', 2016);
INSERT INTO courses1(name1, code1) VALUES('INSY118 POSTGRESS', 2013);

INSERT INTO students2(name2, code2) VALUES('Martin POSTGRESS', 1993);
INSERT INTO students2(name2, code2) VALUES('Kristine', 1994);
INSERT INTO students2(name2, code2) VALUES('Kachana', 1994);
INSERT INTO students2(name2, code2) VALUES('Justina', 1994);
INSERT INTO students2(name2, code2) VALUES('Kachana', 1994);
INSERT INTO students2(name2, code2) VALUES('Justina', 1994);
INSERT INTO students2(name2, code2) VALUES('Martin POSTGRESS', 1993);

INSERT INTO teachers3(name3, code3) VALUES('Chilube POSTGRESS', 432000);
INSERT INTO teachers3(name3, code3) VALUES('Mwetwa', 1759000);
INSERT INTO teachers3(name3, code3) VALUES('Siamplongo', 464000);
INSERT INTO teachers3(name3, code3) VALUES('Chilube POSTGRESS', 3671000);

select * from courses1,  students2, teachers3