create table example2user (
	id identity,
	username varchar(16) unique not null,
	password varchar(25) not null,
	email varchar(30) not null
);