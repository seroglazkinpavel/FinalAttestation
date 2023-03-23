# Создаем базу данных
DROP DATABASE IF EXISTS humanFriends;
CREATE DATABASE humanFriends;
USE humanFriends;

# Создаем низкоуровневые таблицы
#DROP TABLE IF EXISTS cat;
CREATE TABLE `cat` (
	id INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday DATE
); 

#DROP TABLE IF EXISTS dog;
CREATE TABLE dog (
	id INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday DATE
);

#DROP TABLE IF EXISTS hamster;
CREATE TABLE hamster (
	id INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday DATE
);

#DROP TABLE IF EXISTS horse
CREATE TABLE horse (
	id INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
	Birthday DATE
);

#DROP TABLE IF EXISTS camel
CREATE TABLE camel (
	id INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
	Birthday DATE
);

#DROP TABLE IF EXISTS donkey
CREATE TABLE donkey (
	id INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
	Birthday DATE
);

# Создаем таблицу домашние животные
CREATE TABLE Pets (
	id INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday DATE
);

# Создаем таблицу вьючные животные
CREATE TABLE packAnimal (
	id INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday DATE
);

# Создаем общую таблицу
CREATE TABLE humanFriend(
	id INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday Date
    );
    
# Заполняем данными низкоуровневые таблицы
    
INSERT INTO cat (Name, Command, Birthday) VALUES
    ('Мурка', 'Мяукать', '2022-02-11'),
    ('Симба', 'Мяукать', '2017-08-16'),
	('Барсик', 'Мяукать', '2023-02-20'),
    ('Рыжик', 'Мяукать', '2021-05-27');
    
SELECT * FROM cat;

INSERT INTO dog (Name, Command, Birthday) VALUES
    ('Дик', 'Сидеть', '2022-01-01'),
    ('Найда', 'Сидеть', '2017-08-16'),
	('Полкан', 'Сидеть', '2023-02-20'),
    ('Джульбарс', 'Сидеть', '2021-05-27');
	
SELECT * FROM dog;
 
	INSERT INTO hamster (Name, Command, Birthday) VALUES
    ('Пушистик', 'Спать', '2022-02-11'),
    ('Ушастик', 'Спать', '2017-08-16'),
	('Симка', 'Спать', '2023-02-20'),
    ('Джун', 'Спать', '2021-05-27');
	
SELECT * FROM hamster;
     
INSERT INTO camel (Name, Command, Birthday) VALUES
    ('Рахуль', 'Встать', '2022-02-11'),
    ('Хурр', 'Встать', '2017-08-16'),
	('Аджрафийа', 'Встать', '2023-02-20'),
    ('Джамаль', 'Встать', '2021-05-27');
	
SELECT * FROM camel;
     
INSERT INTO horse (Name, Command, Birthday) VALUES
    ('Победа', 'Но', '2022-02-11'),
    ('Орел', 'Но', '2017-08-16'),
	('Рысак', 'Но', '2023-02-20'),
    ('Лиса', 'Но', '2021-05-27');
	
SELECT * FROM horse;    
     
INSERT INTO donkey (Name, Command, Birthday) VALUES
    ('Марс', 'Стоять', '2022-02-11'),
    ('Малыш', 'Стоять', '2017-08-16'),
	('Миранда', 'Стоять', '2023-02-20'),
    ('Зима', 'Стоять', '2021-05-27');
	
SELECT * FROM donkey;
    
# Удаляем таблицу верблюдов 
DELETE FROM camel WHERE id > 0;
SELECT * FROM camel;

# Объединение таблицы лошадей и ослов в одну таблицу.
CREATE TABLE newPackAnimal (id INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY)
SELECT  Name, 
        Command, 
        Birthday
FROM horse UNION 
SELECT  Name, 
        Command, 
        Birthday
FROM donkey;

SELECT * FROM newPackAnimal;

# Создание таблицы, в которой все животные в возрасте от 1 до 3 лет.
INSERT INTO Pets (Name, Command, Birthday)
SELECT  Name, 
        Command, 
        Birthday
FROM cat UNION 
SELECT  Name, 
        Command, 
        Birthday
FROM dog UNION
SELECT  Name, 
        Command, 
        Birthday
FROM hamster;
SELECT * FROM Pets;

INSERT INTO humanFriend (Name, Command, Birthday)
SELECT  Name, 
        Command, 
        Birthday
FROM Pets UNION 
SELECT  Name, 
        Command, 
        Birthday
FROM newPackAnimal;
SELECT * FROM humanFriend;

CREATE TABLE youngAnimals (id INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY)
SELECT  Name, 
        Command, 
        Birthday,
        Round((year(current_date()) - year(Birthday)) + (month(current_date() - month(Birthday)))/10, 2) AS age
FROM humanFriend
WHERE Round((year(current_date()) - year(Birthday)) + (month(current_date() - month(Birthday)))/10, 2) > 1 
	AND Round((year(current_date()) - year(Birthday)) + (month(current_date() - month(Birthday)))/10, 2) < 3;
SELECT * FROM youngAnimals;

# Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.

CREATE TABLE newTablehumanFriend (id INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY)
SELECT  Name, 
        Command,
        Birthday,
        'cat' AS oldTable
FROM cat UNION 
SELECT  Name, 
        Command, 
        Birthday,
        'dog' AS oldTable
FROM dog UNION
SELECT  Name, 
        Command, 
        Birthday,
        'hamster' AS oldTable
FROM hamster UNION 
SELECT  Name, 
        Command, 
        Birthday,
        'horse' AS oldTable
FROM horse UNION 
SELECT  Name, 
        Command, 
        Birthday,
        'donkey' AS oldTable
FROM donkey;

SELECT * FROM newTablehumanFriend;