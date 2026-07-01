--Group By Clause
SELECT 
country,
sum(score)
FROM customers
GROUP BY country;

