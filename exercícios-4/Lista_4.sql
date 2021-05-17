use world;

SELECT
country.Name,
count(countrylanguage.Language) AS NumLinguas
FROM country INNER JOIN countrylanguage ON
country.Code = countrylanguage.CountryCode
GROUP BY country.Name
HAVING(count(countrylanguage.Language) >
(SELECT 
avg(Linguas) FROM
(select count(countrylanguage.Language) as Linguas
from country
inner join countrylanguage 
on country.Code = countrylanguage.CountryCode
group by country.Name) as Lingua)); /*ex1*/

use sakila;

SELECT 
film.title,
film.release_year
FROM film WHERE language_id=
(SELECT language_id FROM language WHERE name="English");/*ex 2*/

SELECT
film.title,
film.release_year
FROM film WHERE language_id=
(SELECT language_id FROM language WHERE name="English");/*ex 3*/

SELECT email FROM (SELECT 
					first_name, last_name, email
					FROM customer WHERE active=0) as inactive_members 
WHERE first_name = "CHRISTIAN"; /*ex 4*/

SELECT 
customer.first_name,
customer.last_name,
payment.rental_id,
payment.amount
FROM customer INNER JOIN payment ON 
customer.customer_id = payment.customer_id
WHERE payment.amount = SOME(SELECT 
						amount FROM payment WHERE rental_id=76 or rental_id=1476)
GROUP BY customer.first_name;/*ex 5*/

SELECT 
customer.first_name,
customer.last_name,
payment.rental_id,
payment.amount
FROM customer INNER JOIN payment ON 
customer.customer_id = payment.customer_id
WHERE payment.amount = ALL(SELECT 
						amount FROM payment WHERE rental_id=76 or rental_id=1476)
GROUP BY customer.first_name;/*ex 6*/

SELECT 
ci.city,
cou.country
FROM city ci JOIN country cou ON ci.country_id  = cou.country_id;

SELECT 
city.city,
country.country
FROM city JOIN country USING(country_id);

SELECT 
inventory.inventory_id,
film.title
FROM inventory NATURAL JOIN film;/*ex 7*/


SELECT 
store.address_id,
address.address
FROM store CROSS JOIN address; /*ex 8*/

SELECT 
language.language_id,
language.name,
film.film_id,
film.title
FROM language LEFT OUTER JOIN film ON language.language_id=film.language_id
WHERE language.language_id = 2; /*ex 9*/ 


SELECT 
film.film_id,
film.title,
language.language_id,
language.name
FROM film RIGHT OUTER JOIN language ON language.language_id=film.language_id
WHERE language.language_id = 2; /*ex 10*/ 

SELECT 
language.language_id,
language.name,
film.film_id,
film.title
FROM language LEFT OUTER JOIN film ON language.language_id=film.language_id
WHERE language.language_id = 2/*ex 9*/ 
UNION ALL
SELECT 
film.film_id,
film.title,
language.language_id,
language.name
FROM film RIGHT OUTER JOIN language ON language.language_id=film.language_id
WHERE language.language_id = 2; 
/*ex 11 emulando porque não existe full outer join no mysql*/

 (SELECT language_id
 FROM film
 WHERE title IS NOT NULL)
 UNION
  (SELECT language_id
 FROM language
 WHERE language_id IS NOT NULL);/*ex 12*/
 
(SELECT language_id
 FROM film)
INTERSECT
(SELECT language_id
FROM language);/*ex 13*/

(SELECT language_id
FROM language)
EXCEPT
 (SELECT language_id
 FROM film)/*ex 14*/
 


