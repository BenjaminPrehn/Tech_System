CREATE SEQUENCE IF NOT EXISTS employee_seq;

CREATE TABLE IF NOT EXISTS employee (

employee_id BIGINT NOT NULL DEFAULT nextval('employee_seq') PRIMARY KEY,
email VARCHAR(100) NOT NULL,
firstname VARCHAR(100) NOT NULL,
lastname VARCHAR(100) NOT NULL

);

-- INSERT EMPLOYEES
insert into employee (employee_id, firstname, lastname, email) values (nextval('employee_seq'), 'John', 'Doe', 'Johndoe@gmail.com');
