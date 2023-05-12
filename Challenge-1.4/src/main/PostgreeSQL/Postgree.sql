 CREATE TABLE Address(
  addressId SERIAL PRIMARY KEY,
  zip VARCHAR(50) NOT NULL,
  street VARCHAR(255) NULL,
  complement VARCHAR(100) NOT NULL,
  neighborhood VARCHAR(255) NOT NULL,
  city VARCHAR(100) NOT NULL,
  state CHAR(2) NOT NULL,
  country VARCHAR(100) NOT NULL
 );

 CREATE TABLE Person(
  person_id SERIAL PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  age INTEGER NULL,
  phone_1 INTEGER NULL,
  phone_2 INTEGER NULL,
  height INTEGER NULL,
  email VARCHAR(150) NULL,
  cpf VARCHAR(11) UNIQUE NULL,
  birthday DATE NULL,
  address_id INTEGER NULL
 );

  ALTER TABLE Person
  ADD CONSTRAINT fk_address
  FOREIGN KEY (address_id)
  REFERENCES Address (addressId);

 INSERT INTO Address (addressId, zip, street, complement, neighborhood, city, state, country)
 VALUES (1, 0294568, 'Street of canary ', 'Blue canary Statue', 'Blues', 'Birds', 'BD', 'Tree');

 SELECT
 	Person.person_id, Person.name, Person.address_id, Address.street

 FROM Address
 INNER JOIN Person
 ON  Address.addressId = Person.address_id