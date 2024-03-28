USE `community`;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
    `id`            INT AUTO_INCREMENT NOT NULL,
    `username`      VARCHAR(64) NOT NULL,
    `password`      VARCHAR(64) NOT NULL,
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`(
    `id`                INT AUTO_INCREMENT NOT NULL,
    `from_id`           INT NOT NULL,
    `to_id`             INT NOT NULL,
    `conversation_id`   VARCHAR(64) NOT NULL,
    `created_at`        DATE NOT NULL,
    `content`           VARCHAR(256),
    PRIMARY KEY (`id`)
);