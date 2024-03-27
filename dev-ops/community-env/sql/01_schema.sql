USE `community`;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
    `id`            INT AUTO_INCREMENT NOT NULL,
    `username`      VARCHAR(64) NOT NULL,
    `password`      VARCHAR(64) NOT NULL,
    PRIMARY KEY (`id`)
);