DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(32) NOT NULL,
    email VARCHAR(200) NOT NULL,
    created_at datetime default current_timestamp
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8;

INSERT INTO users (name, email, created_at) VALUES ('smith', 'smith@example.com', NOW());
INSERT INTO users (name, email, created_at) VALUES ('johnson', 'johnson@example.com', NOW());
INSERT INTO users (name, email, created_at) VALUES ('williams', 'williams@example.com', NOW());
INSERT INTO users (name, email, created_at) VALUES ('jones', 'jones@example.com', NOW());
INSERT INTO users (name, email, created_at) VALUES ('brown', 'brownb@example.com', NOW());
INSERT INTO users (name, email, created_at) VALUES ('davis', 'davvis@example.com', NOW());
