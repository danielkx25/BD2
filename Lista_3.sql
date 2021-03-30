USE world;

SELECT COUNT(Name) FROM country; /*ex1*/

SELECT Continent, count(Name) FROM country GROUP BY Continent;  /*ex2*/

SELECT Continent, count(Name) FROM country GROUP BY Continent
ORDER BY CAST(Continent AS CHAR), Name DESC ;  /*ex3*/

SELECT Continent, count(Name) AS Paises FROM country
GROUP BY Continent HAVING Paises>50 ORDER BY CAST(Continent AS CHAR), Name DESC ;  /*ex4*/

SELECT MAX(SurfaceArea) FROM country; /*ex5*/

SELECT MIN(SurfaceArea) FROM country; /*ex6*/

SELECT AVG(SurfaceArea) FROM country; /*ex7*/

SELECT AVG(SurfaceArea) FROM country WHERE Continent="Europe"; /*ex8*/

SELECT Continent,AVG(SurfaceArea) FROM country GROUP BY Continent; /*ex9*/

SELECT Continent,AVG(SurfaceArea) FROM country GROUP BY Continent
ORDER BY AVG(SurfaceArea) DESC; /*ex10 pode botar um 2 ao invés do segundo avg
para ordenar pela segunda coluna */

SELECT Continent,SurfaceArea FROM country GROUP BY Continent; /*ex11*/

SELECT Continent,SurfaceArea FROM country GROUP BY Continent ORDER BY 
SurfaceArea DESC; /*ex12*/

SELECT 
country.Name,
COUNT(countrylanguage.Language)
 FROM country
 INNER JOIN countrylanguage ON country.Code = countrylanguage.CountryCode
 GROUP BY country.Name;/*ex13*/
 
 SELECT 
country.Name,
COUNT(countrylanguage.Language)
 FROM country
 INNER JOIN countrylanguage ON country.Code = countrylanguage.CountryCode
 GROUP BY country.Name HAVING COUNT(countrylanguage.language)>10;/*ex14*/

SELECT 
country.Name,
COUNT(city.CountryCode)
FROM country INNER JOIN city ON country.Code = city.CountryCode
GROUP BY country.Name;/*ex15*/

SELECT 
country.Name,
AVG(city.Population)
FROM country INNER JOIN city ON country.Code = city.CountryCode
GROUP BY country.Name;/*ex16*/

SELECT 
country.Name,
AVG(city.Population)
FROM country INNER JOIN city ON country.Code = city.CountryCode
GROUP BY country.Name ORDER BY AVG(city.Population) ASC;/*ex17*/

SELECT 
country.Name,
AVG(city.Population)
FROM country INNER JOIN city ON country.Code = city.CountryCode
GROUP BY country.Name 
HAVING AVG(city.Population)>70000
ORDER BY AVG(city.Population) ASC;/*ex18*/

/*----------------------------------------------------------------*/

USE sakila;

SELECT SUM(amount) AS Total FROM payment;/*19*/

SELECT AVG(amount) AS Media FROM payment;/*20*/

SELECT 
customer.customer_id, 
customer.first_name, 
customer.last_name,
SUM(payment.amount) AS Total
FROM customer INNER JOIN payment ON payment.customer_id = customer.customer_id
GROUP BY customer.customer_id;/*21*/

SELECT 
customer.customer_id, 
customer.first_name, 
customer.last_name,
SUM(payment.amount) AS Total
FROM customer INNER JOIN payment ON payment.customer_id = customer.customer_id
GROUP BY customer.customer_id, customer.first_name, customer.last_name 
ORDER BY customer.first_name, customer.last_name;/*22*/

SELECT 
customer.customer_id, 
customer.first_name, 
customer.last_name,
SUM(payment.amount) AS Total
FROM customer INNER JOIN payment ON payment.customer_id = customer.customer_id
GROUP BY customer.customer_id
HAVING SUM(payment.amount)>100
ORDER BY SUM(payment.amount) ;/*23*/

SELECT 
staff.staff_id, 
staff.first_name, 
staff.last_name,
SUM(payment.amount) AS Total
FROM staff INNER JOIN payment ON payment.staff_id = staff.staff_id
GROUP BY staff.staff_id ;/*24*/

SELECT 
staff.staff_id, 
staff.first_name, 
staff.last_name,
SUM(payment.amount) AS Total
FROM staff INNER JOIN payment ON payment.staff_id = staff.staff_id
WHERE payment.payment_date BETWEEN '2005-05-25' AND '2005-08-23'
GROUP BY staff.staff_id ;/*25*/

SELECT 
actor.actor_id,
actor.first_name,
actor.last_name,
COUNT(film_actor.film_id)
FROM actor 
INNER JOIN film_actor ON film_actor.actor_id = actor.actor_id
GROUP BY actor.actor_id;/*26*/

SELECT 
actor.actor_id,
actor.first_name,
actor.last_name,
COUNT(film_actor.film_id)
FROM actor 
INNER JOIN film_actor ON film_actor.actor_id = actor.actor_id
GROUP BY actor.actor_id ORDER BY COUNT(film_actor.film_id) ASC;/*27*/

SELECT 
actor.actor_id,
actor.first_name,
actor.last_name,
COUNT(film_actor.film_id)
FROM actor 
INNER JOIN film_actor ON film_actor.actor_id = actor.actor_id
WHERE actor.actor_id=100
GROUP BY actor.actor_id ORDER BY COUNT(film_actor.film_id) ASC;/*28*/

SELECT 
category.category_id,
category.name,
COUNT(film_category.film_id)
FROM category
INNER JOIN film_category ON film_category.category_id=category.category_id
GROUP BY category.name;/*29*/ 



