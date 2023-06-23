DROP DATABASE IF EXISTS jaegers;

CREATE DATABASE jaegers OWNER postgres;

\connect jaegers;

DROP TABLE IF EXISTS jaegers;

CREATE TABLE jaegers(
    jaegers_id SERIAL PRIMARY KEY ,
    model_name VARCHAR(20) UNIQUE,
    mark INT,
    height DECIMAL(6, 3),
    weight DECIMAL(5, 3),
    status VARCHAR(16),
    origin VARCHAR(30),
    launch DATE,
    kaijuKill INT
);

\ir 'init_db.sql';
\ir 'queries.sql'