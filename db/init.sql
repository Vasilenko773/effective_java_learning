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

-- Установка индекса
CREATE EXTENSION pg_trgm;
CREATE INDEX inx_book_name ON book USING GIN (name gin_trgm_ops);