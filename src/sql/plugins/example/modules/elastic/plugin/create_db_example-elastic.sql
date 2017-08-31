
--
-- Structure for table example_elastic_
--

DROP TABLE IF EXISTS example_elastic_;
CREATE TABLE example_elastic_ (
id_project int NOT NULL,
name varchar(50) default '' NOT NULL,
cout int default '0' NOT NULL,
PRIMARY KEY (id_project)
);
