DROP TABLE IF EXISTS drug;

CREATE TABLE drug (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  application_number VARCHAR(250) NOT NULL,
  manufacturer_name VARCHAR(250) NOT NULL,
  substance_name VARCHAR(250) DEFAULT NULL,
  product_numbers VARCHAR(250) DEFAULT NULL
);
