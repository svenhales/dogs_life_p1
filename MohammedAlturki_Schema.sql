create table Dogs
(
    id int  AUTO_INCREMENT PRIMARY KEY,
    name varchar (50) not null,
    age int not null,
    owner_id int not null,
    FOREIGN KEY (owner_id) REFERENCES Owners (owner_id)
)

create table owners
(
    owner_id int  AUTO_INCREMENT PRIMARY KEY,
    name varchar (50) not null
)
