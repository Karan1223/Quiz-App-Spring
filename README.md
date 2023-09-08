# Quiz-App-Spring
## This is SpringBoot Quiz Application 

The backend was created in SpringBoot and the database used is PostgreSQL.

## Command to create database and table. Also insert data into table.
use questiondb;

CREATE TABLE question (
    id SERIAL PRIMARY KEY,
    category VARCHAR(25),
    difficulty_level VARCHAR(25),
    option1 VARCHAR(255),
    option2 VARCHAR(255),
    option3 VARCHAR(255),
    option4 VARCHAR(255),
    question_title VARCHAR(255),
    correct_answer VARCHAR(255),
    hint VARCHAR(255)
);

### Sample Data
NSERT INTO question (category, difficulty_level, option1, option2, option3, option4, question_title, correct_answer)
VALUES ('Geography', 'Easy', 'What is the capital of France?', 'Paris', 'London', 'Rome', 'Berlin', 'Paris', 'City is famous for Eiffel tower');


