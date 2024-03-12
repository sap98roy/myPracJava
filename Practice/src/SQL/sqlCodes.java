package SQL;

public class sqlCodes {

	/*
	
	//Non duplicate city with even ids

	SElECT DISTINCT (CITY) FROM STATION WHERE MOD(ID,2)=0;



	//find duplicate phone numbers
	
	SELECT AccountId, Account.Name, Phone, COUNT(Id)
	FROM Contact
	GROUP BY AccountId, Account.Name, Phone
	HAVING COUNT(Id) > 1;
	
	

	//diff to total and non-duplicate number of cities

	SELECT COUNT(CITY) - COUNT(DISTINCT CITY) FROM STATION;




	// min & max length of city by asc

	select city , length(city) from station where 
	length(city) = (select max(length(city)) from station)
	or 
	length(city) = (select min(length(city)) from station)
	order by length(city)  desc, city asc LIMIT 2;




	//city starts with these
	
	SELECT DISTINCT CITY FROM STATION WHERE LOWER(SUBSTR(CITY,1,1)) IN ('a','e','i','o','u');




	//city do not start and end with vowel

	SELECT DISTINCT CITY FROM STATION WHERE 
	LOWER(LEFT(CITY,1)) NOT IN ('a','e','i','o','u') 
	OR 
	LOWER(RIGHT(CITY,1)) NOT IN ('a','e','i','o','u');



	//arrange by name, if name are same arrange by id

	SELECT NAME FROM STUDENTS WHERE MARKS>75 ORDER BY RIGHT(NAME,3) ASC, ID ASC;

*/
}
