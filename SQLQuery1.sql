--Retrieve all the data customers and order table
--select * from orders;

--Retrieve each customers name, country, and score.
/*Select  
	first_name,
	country,
	score
from customers ;*/

-- Retrieve customers where score not equal to zero

-- where clause

/*select * 
From customers
Where score!=0;*/

/*SELECT 
	first_name,
	country
FROM customers
WHERE country='germany';*/

--Order by
/*SELECT *
FROM customers
--ORDER BY score DESC;
ORDER BY score asc;*/

--Retrieve all customers and sort the results by the country and then by the highest score
SELECT *
FROM customers
ORDER BY country ASC,score desc;