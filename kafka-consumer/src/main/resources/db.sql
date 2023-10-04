--CREATING employees TABLE
CREATE TABLE employees(
                          employee_id NUMERIC,
                          firstname VARCHAR(255),
                          lastname VARCHAR(255),
                          age NUMERIC,
                          title VARCHAR(255),
                          PRIMARY KEY(employee_id)
);

--SELECT * FROM employees