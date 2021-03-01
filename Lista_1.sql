USE psdb;

SELECT * FROM employees; /*ex1*/

SELECT emp_no, first_name  FROM employees; /*ex2*/

SELECT DISTINCT first_name FROM employees; /*ex3*/

SELECT DISTINCT first_name FROM employees ORDER BY first_name; /*ex4*/

SELECT DISTINCT first_name FROM employees ORDER BY first_name DESC; /*ex5*/

SELECT DISTINCT first_name FROM employees ORDER BY first_name ASC; /*ex6*/

SELECT DISTINCT first_name, last_name FROM employees; /*ex7*/

SELECT DISTINCT first_name, last_name FROM employees ORDER BY first_name, last_name; /*ex8*/

SELECT DISTINCT first_name, last_name FROM employees ORDER BY first_name DESC, last_name DESC; /*ex9*/

SELECT DISTINCT first_name, last_name FROM employees ORDER BY first_name ASC, last_name ASC; /*ex10*/

SELECT * FROM employees LIMIT 100; /*ex11*/

SELECT emp_no, first_name  FROM employees ORDER BY emp_no LIMIT 100; /*ex12*/

SELECT emp_no, first_name  FROM employees ORDER BY emp_no ASC LIMIT 100; /*ex13*/

SELECT emp_no, first_name  FROM employees ORDER BY emp_no DESC LIMIT 100; /*ex14*/

SELECT * FROM employees WHERE first_name = "Basil"; /*ex15*/

SELECT * FROM employees WHERE first_name = "Basil" and gender="M"; /*ex16*/

SELECT * FROM employees WHERE first_name = "Basil" and gender!="M"; /*ex17*/

SELECT * FROM employees WHERE first_name = "Basil" and gender="M" and last_name="Strooper"; /*ex18*/

SELECT * FROM employees WHERE first_name LIKE "Crist%"; /*ex19*/

SELECT * FROM employees WHERE first_name LIKE "%zette"; /*ex20*/

SELECT * FROM employees WHERE first_name LIKE "%zette" and gender="M"; /*ex21*/

SELECT * FROM employees WHERE first_name LIKE "%arvi%"; /*ex22*/

SELECT * FROM employees WHERE first_name LIKE "%arvi%" and gender="M"; /*ex23*/

SELECT * FROM employees WHERE first_name="Elvis" OR first_name="Yinghua"; /*ex24*/

SELECT * FROM employees WHERE gender="M" AND (first_name="Elvis" OR first_name="Yinghua"); /*ex25*/

SELECT * FROM employees WHERE emp_no="14037"; /*ex26*/

SELECT first_name,last_name FROM employees WHERE emp_no="14037"; /*ex27*/

SELECT * FROM employees WHERE emp_no IN(15037,14039,16039); /*ex28*/

SELECT * FROM employees WHERE emp_no BETWEEN 14037 AND 14047; /*ex29*/

SELECT * FROM employees WHERE (emp_no >= 14037) AND (emp_no<=14047); /*ex30*/

SELECT * FROM employees WHERE emp_no >485733 AND first_name LIKE "Crist%"; /*ex31*/

SELECT * FROM employees WHERE emp_no >=485733 AND first_name LIKE "Crist%"; /*ex32*/

SELECT * FROM employees WHERE emp_no <37126 AND first_name LIKE "Crist%"; /*ex33*/

SELECT * FROM employees WHERE emp_no <=37126 AND first_name LIKE "Crist%"; /*ex34*/

SELECT * FROM employees WHERE emp_no IN(494831,479832,599833,499832) 
AND (gender="M" OR gender="F"); /*ex35*/

SELECT * FROM employees WHERE emp_no IN(494831,479832,599833,499832) 
AND (gender="M" OR gender="F") LIMIT 10; /*ex36*/

SELECT * FROM employees AS emp WHERE emp.emp_no IN(494831,479832,599833,499832) 
AND (emp.gender="M" OR emp.gender="F") ;/*ex37*/

SELECT emp_no AS Numero, first_name AS Nome FROM employees
AS emp WHERE emp_no IN(494831,479832,599833,499832) 
AND (emp.gender="M" OR emp.gender="F"); /*ex38*/

USE world;

SELECT country.Name FROM country
INNER JOIN countrylanguage ON country.Code = countrylanguage.CountryCode
WHERE countrylanguage.language="Dutch"; /*ex39*/

SELECT * FROM city
INNER JOIN countrylanguage ON city.CountryCode = countrylanguage.CountryCode
WHERE countrylanguage.language="Dutch"; /*ex40*/

SELECT country.Name FROM country
INNER JOIN countrylanguage ON country.Code = countrylanguage.CountryCode
WHERE countrylanguage.language="Spanish" AND countrylanguage.IsOfficial="T"; /*ex41*/

SELECT country.Name FROM country
INNER JOIN countrylanguage ON country.Code = countrylanguage.CountryCode
WHERE (countrylanguage.language="Spanish" AND countrylanguage.IsOfficial="T")
AND countrylanguage.Percentage>96.00; /*ex42*/

SELECT * FROM city WHERE CountryCode="BRA" AND Population>1000000;/*ex43*/

SELECT 
country.Name,
country.Continent,
country.Region,
country.Population,
city.Name,
city.District,
city.Population,
countrylanguage.Language
 FROM country
INNER JOIN countrylanguage ON country.Code = countrylanguage.CountryCode
INNER JOIN city ON country.Code = city.CountryCode
WHERE country.Continent="Europe"; /*ex44*/

SELECT 
country.Name,
country.Continent,
country.Region,
country.Population,
city.Name,
city.District,
city.Population,
countrylanguage.Language
 FROM country
INNER JOIN countrylanguage ON country.Code = countrylanguage.CountryCode
INNER JOIN city ON country.Code = city.CountryCode
WHERE country.Continent="Europe" AND countrylanguage.IsOfficial="T"; /*ex45*/


