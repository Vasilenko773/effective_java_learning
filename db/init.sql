CREATE TABLE author
(
    id   INT PRIMARY KEY,
    name VARCHAR
);

CREATE table book
(
    id        INT PRIMARY KEY,
    name      VARCHAR,
    author_id INT REFERENCES author (id)
);