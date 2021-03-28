USE world;

SELECT COUNT(Name) FROM country; /*ex1*/

SELECT Continent, count(Name) FROM country GROUP BY Continent;  /*ex2*/

SELECT Continent, count(Name) FROM country GROUP BY Continent
ORDER BY Continent, Name DESC ;  /*ex3*/

