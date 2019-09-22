CREATE TABLE opportunity
(
 id bigint auto_increment NOT NULL,
 prospect_name varchar(80) NOT NULL ,
 description varchar(200) NULL,
 price decimal(10,2),
 
 PRIMARY KEY (id)
);