DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(32) NOT NULL,
    email VARCHAR(200) NOT NULL,
    created_at datetime default current_timestamp
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8;

INSERT INTO users (name, email, created_at) VALUES ('hoge', 'hoge@example.com', NOW());
INSERT INTO users (name, email, created_at) VALUES ('foo', 'foob@example.com', NOW());
