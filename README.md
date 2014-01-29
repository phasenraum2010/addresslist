addresslist
===========

educational project for teaching Spring MVC and JPA


Project Setup
=============

The Basics:
-----------
* Eclipse: Download and install Spring Tool Suite (STS) from: http://spring.io/tools
* java: Download jdk from: http://www.oracle.com/technetwork/java/javase/downloads/index.html
* Maven: Dowload and install maven3 from: http://maven.apache.org/download.cgi
* Install MySQL-Database from http://dev.mysql.com/downloads/ or from: http://www.apachefriends.org/de/xampp-windows.html

import Project via shell
------------------------ 
* git clone https://github.com/phasenraum2010/addresslist.git
* this creates a directory addresslist
* open STS
* import -> Git -> Projects from Git -> next
* existing local repository -> next
* add the addresslist directory to the list of local repositories
* choose the addresslist directory
* check: import as general project
* next -> finish
* wait a minute 
* right click on the Project in STS Package Explorer:
* configure -> convert to maven project

or import Project via STS only
------------------------------
* File -> import -> Git -> Projects from Git -> next 
* enter: "addresslist" and search
* choose "phasenraum2010/addresslist" (or your fork with your username instead of mine)
* next -> next -> choose Directory for downloading the project
* check: import as general project
* next -> finish
* wait a minute
* right click on the Project in STS Package Explorer:
* configure -> convert to maven project

Setup MySQL Database
--------------------

open MySQL-Client and enter: 

CREATE USER 'addresslist'@'localhost' IDENTIFIED BY 'addresslistpwd';

GRANT SELECT, INSERT, UPDATE, DELETE,CREATE, DROP,FILE,INDEX,ALTER, CREATE TEMPORARY TABLES, CREATE VIEW, EVENT, TRIGGER, SHOW VIEW, CREATE ROUTINE, ALTER ROUTINE, EXECUTE ON * . * TO 'addresslist'@'localhost' IDENTIFIED BY 'addresslistpwd' WITH MAX_QUERIES_PER_HOUR 0 MAX_CONNECTIONS_PER_HOUR 0 MAX_UPDATES_PER_HOUR 0 MAX_USER_CONNECTIONS 0 ;

CREATE DATABASE IF NOT EXISTS addresslist;

GRANT ALL PRIVILEGES ON addresslist.* TO 'addresslist'@'localhost';

GRANT ALL PRIVILEGES ON addresslist\_%.* TO 'addresslist'@'localhost';


Startup
-------
* mvn clean install tomcat7:run
* open Browser: http://localhost:8080/addresslist