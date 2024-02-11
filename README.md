 [!IMPORTANT] </br>
## SparrowBank -app without security	</br>
## SparrowBank2 - app with enabled spring security and different controllers	</br>
## SparrowBank3 - app with custome config for spring secutiry . secure all urls except 2 urls /contact and /notices </br>
## SparrowBank4 - app with custome InMemoryUserDetailsManager - store in memory credentials(not recomended for production) </br>
## SparrowBank5 - app with custome using OOB tables of JdbcUserDetailsManager provided by spring security </br>
## SparrowBank6 - app with custome using custom tables of storing user authentication</br>
### custom table for users is below
 CREATE TABLE customer(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(50) NOT NULL ,
    PASSWORD VARCHAR(50) NOT NULL,
    ROLE VARCHAR(45) NOT NULL
);
SELECT * FROM customer;
