CREATE DATABASE IF NOT EXISTS escola.db;
USE escola.db;

CREATE TABLE IF NOT EXISTS alunos(
    id INTEGER PRIMARY KEY,
    nome TEXT,
    idade INTEGER,
    curso TEXT
);

INSERT INTO alunos (nome, idade, curso) VALUES ('Maria', 17, 'ADS');

SELECT * FROM alunos;

CREATE TABLE IF NOT EXISTS professor(
    id INTEGER PRIMARY KEY,
    nome TEXT,
    disciplina TEXT
);

INSERT INTO professor (nome, discplina) VALUES ('FABIO', 'BANCO DE DADOS');

SELECT * FROM professor;

DROP DATABASE escola.db;