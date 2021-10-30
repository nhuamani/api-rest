DROP DATABASE IF EXISTS db_apispring;

CREATE DATABASE IF NOT EXISTS db_apispring;
SHOW CREATE DATABASE db_apispring;
USE db_apispring;

show tables;

CREATE TABLE IF NOT EXISTS tasks (
    task_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    start_date DATE,
    due_date DATE,
    status TINYINT NOT NULL,
    priority TINYINT NOT NULL,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)  ENGINE=INNODB;

DESCRIBE tasks;