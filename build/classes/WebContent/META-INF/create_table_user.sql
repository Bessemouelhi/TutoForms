CREATE TABLE  user (
 id INT( 11 ) NOT NULL AUTO_INCREMENT ,
 nom VARCHAR( 200 ) NOT NULL ,
 prenom VARCHAR( 200 ) NOT NULL ,
 PRIMARY KEY ( id )
) ENGINE = INNODB;

INSERT INTO user(nom, prenom) VALUES("Dupont", "Jack");
INSERT INTO user(nom, prenom) VALUES("Doe", "John");
INSERT INTO user(nom, prenom) VALUES("Bonbeur", "Jean");