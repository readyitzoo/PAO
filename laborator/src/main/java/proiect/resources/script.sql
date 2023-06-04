USE `pao`;

CREATE TABLE `drinks`
(
    `id`          int(11) NOT NULL AUTO_INCREMENT,
    `name`        varchar(255)   DEFAULT NULL,
    `description` varchar(255)   DEFAULT NULL,
    `price`       decimal(10, 2) DEFAULT NULL,
    `volume`      int(11)        DEFAULT NULL,
    `alcohol_content`     int(11)        DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `foods`
(
    `id`          int(11) NOT NULL AUTO_INCREMENT,
    `name`        varchar(255)   DEFAULT NULL,
    `price`       decimal(10, 2) DEFAULT NULL,
    `description` varchar(255)   DEFAULT NULL,
    `weight`      int(11)        DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `drivers`
(
    `id`          int(11) NOT NULL AUTO_INCREMENT,
    `name`        varchar(255)   DEFAULT NULL,
    `address`     varchar(255)   DEFAULT NULL,
    `phoneNumber` varchar(255)   DEFAULT NULL,
    `email`       varchar(255)   DEFAULT NULL,
    `salary`      int(11) DEFAULT NULL,
    `CNP`         varchar(255)   DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `clients`
(
    `id`          int(11) NOT NULL AUTO_INCREMENT,
    `name`        varchar(255)   DEFAULT NULL,
    `address`     varchar(255)   DEFAULT NULL,
    `phoneNumber` varchar(255)   DEFAULT NULL,
    `email`       varchar(255)   DEFAULT NULL,
    `username`    varchar(255)   DEFAULT NULL,
    `points`      int(11)        DEFAULT NULL,
    `orders`      int(11)        DEFAULT NULL,
    PRIMARY KEY (`id`)
);




