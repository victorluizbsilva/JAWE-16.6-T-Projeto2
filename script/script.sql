/*
SQLyog Community v12.2.4 (64 bit)
MySQL - 10.1.13-MariaDB : Database - petshop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`petshop` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `petshop`;

/*Table structure for table `animal` */

DROP TABLE IF EXISTS `animal`;

CREATE TABLE `animal` (
  `animal_id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `id_dono` int(11) DEFAULT NULL,
  `id_tipo_animal` int(11) DEFAULT NULL,
  PRIMARY KEY (`animal_id`),
  KEY `id_dono` (`id_dono`),
  KEY `id_tipo_animal` (`id_tipo_animal`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Data for the table `animal` */

insert  into `animal`(`animal_id`,`nome`,`id_dono`,`id_tipo_animal`) values 
(1,'Bidu',1,1),
(2,'Toto',2,1),
(3,'Zeus',3,2),
(4,'Piu Piu',1,3),
(5,'Garfild',4,2),
(6,'Tom',2,2),
(7,'Manda Chuva',1,2),
(8,'Pluto',5,1),
(9,'Zé Carioca',6,3),
(10,'Coçadinha',5,2);

/*Table structure for table `cliente` */

DROP TABLE IF EXISTS `cliente`;

CREATE TABLE `cliente` (
  `cliente_id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`cliente_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `cliente` */

insert  into `cliente`(`cliente_id`,`nome`,`cpf`,`telefone`,`email`) values 
(1,'Maria Jose','42363548723','8132556253','maria.jose@gmail.com'),
(2,'Jose Barbosa','54273623611','8133265437','josebarbosa@yahoo.com'),
(3,'Saulo Candido','64542398721','8123456534','saulo2001@hotmai.com'),
(4,'Ana Carla','74642376543','8142364543','anacarla_2010@gmail.com'),
(5,'Julia Santos','54365785746','8198372647','julia.santos@hotmail.com'),
(6,'Pedro Henrique','85746374568','8132183476','pedro_henrique200@gmail.com'),
(7,'Jose Marcelo','09874236452','8131284653','marcelo22@yahoo.com');

/*Table structure for table `tipo_animal` */

DROP TABLE IF EXISTS `tipo_animal`;

CREATE TABLE `tipo_animal` (
  `tipo_animal_id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`tipo_animal_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `tipo_animal` */

insert  into `tipo_animal`(`tipo_animal_id`,`tipo`) values 
(1,'Cachorro'),
(2,'Gato'),
(3,'Passarinho');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
