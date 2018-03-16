
DROP TABLE IF EXISTS t_user;

CREATE TABLE t_user(
  user_id VARCHAR (20) PRIMARY KEY ,
  nickname VARCHAR (50),
  telephone VARCHAR (20),
  email VARCHAR (50)
);