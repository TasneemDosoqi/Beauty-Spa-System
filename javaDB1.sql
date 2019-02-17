
CREATE TABLE Employee
(Full_name VARCHAR(45)not null,
SSN VARCHAR(10) primary key not null,
Salary double not null, 
BDate VARCHAR(15) not null,
Gender VARCHAR(10) not null,
Super_SSN VARCHAR(10),
constraint foregin_SuperSSN foreign key(Super_SSN) references Employee(SSN) );

INSERT into Employee values 
('Ahmad Alqahtani','112',12000,'1990-05-12','Male',null),
('Noura Alahmad', '223',20000,'1985-04-16','Female', '112'),
('Muneera Alkhaldi', '334',5000,'1992-06-22','Female', '112'),
('Mohammad AlFaisal', '661',25000,'1979-11-02','Male', '112'),
('Noura Ali', '552',4000,'1991-10-25','Female', '661'),
('Fahad Alabdullah', '621',5000,'1994-08-29','Male','112'),
('Mona Abdulaziz', '555',7000,'1988-12-15','Female', '661'),
('Wafa Ahmad', '881',6000,'1989-01-12','Female', '661'),
('Sara Alqahtani', '992',7000,'1982-02-12','Female', '661'),
('Asma Khalid', '122',3600,'1984-03-12','Female', '555'),
('areej saad', '999',3600,'1984-03-12','Female', '661'),
('maram alsafi', '222',3600,'1984-03-12','Female', '555'),
('Amira alali', '333',3600,'1984-03-12','Female', '555'); 

CREATE TABLE customer
(Fullname VARCHAR(45) NOT NULL,
SSN VARCHAR(10) PRIMARY KEY NOT NULL, 
BD VARCHAR(15) not NULL,
email VARCHAR(45) not NULL,
gender  VARCHAR(10) NOT NULL, 
phoneNumber VARCHAR(10) NOT NULL);
  
INSERT INTO customer VALUES 
 ('Ahmad Salem', '110', '1996-12-12', 'Ahmad-1996@gmail.com', 'Male', '0505667711')
,('Norah Waleed', '109', '1994-11-11', 'Norah_1994@hotmail.com', 'Female', '0501442211')
,('Lama Hesham', '210', '1992-10-10', 'LM_1992@hotmail.com', 'Female', '0501446655')
,('Naser Nader', '100', '1991-09-09', 'NNader-1991@gmail.com', 'Male', '0507334411')
,('Waleed Fahad', '123', '1998-08-08', 'Waleed-22@gmail.com', 'Male', '0502334410')
,('sara ali', '456', '1987-12-01', 'sara-12@hotmail.com', 'Female', '0505442222')
,('hana awad', '554', '1998-05-09', 'hana-a@gmail.com', 'Female', '0562234212')
,('fahad saleh', '229', '1981-12-04', 'fahad-sal@hotmail.com', 'Male', '0533334110')
,('noor saad', '117', '1994-10-12', 'noor-sa@hotmail.com', 'Female', '0595556489');

create table services
(Snumber VARCHAR(10) PRIMARY KEY Not Null,
SDate VARCHAR(15) Not Null,
FromS VARCHAR(20)  not null,
ToS VARCHAR(20) not null, 
S_type VARCHAR(10),
Price Double Not Null,
Tools VARCHAR(45) Not Null,
CSSN VARCHAR(10) NOT NULL,
S_activity VARCHAR(70) Not Null,
CONSTRAINT f1 FOREIGN KEY(CSSN) REFERENCES customer(SSN));

INSERT INTO services VALUES
('1', '2018/2/11', '8:00:00', '10:00:00','Salon',20,'dryers', '110','conditioning' ),
('2', '2018/1/12', '10:00:00' ,'12:00:00','Salon',30,'pedicure chairs', '109','pedicures' ),
('3', '2018/2/1', '12:00:00', '1:00:00','Sport',33,'leg extension machine', '110', 'PERSONAL TRAINING'),
('4', '2018/2/1', '1:00:00', '2:00:00','Sport',10,'abduction machine', '210', 'PERSONAL TRAINING'),
('5', '2018/2/1', '2:00:00', '3:00:00','spa',12,'tanning bed', '100', 'indoor tanning'),
('6', '2018/2/1', '3:00:00', '4:00:00','spa',12,'autumatic thermal massage bed', '123', 'AROMATHERAPY MASSAGE');

CREATE TABLE equipment_and_tools
(tool_id varchar(10) primary key not null, tool_name VARCHAR(45)not null,check_state VARCHAR(6) not null);

insert into equipment_and_tools values
('0001','leg extension machine','true'),
('1122','peck deck machine','true'),
('0044','abduction machine','true'),
('5677','shampoo bowls','true'),
('9864','dryers','true'),
('3456','pedicure chairs','true');

create table REPORT(EID varchar(10) not null, REP varchar(100) not null, 
constraint foregin_SuperS foreign key(EID) references equipment_and_tools(TOOL_ID)) ;

insert into REPORT values
('0001','it only work for 30 min then stop');

CREATE TABLE account ( user_id VARCHAR(6) PRIMARY KEY NOT NULL,Apassword VARCHAR(16) NOT NULL 
,ESSN VARCHAR(10) not null);

insert into account values  
('Ahmada','gSzhGJ3NAyUjVDkS','112'),
('Asmakk','LJtdqaVd5tNKyg5k','122'),
('marama','Sb73pdVMRnqX3fPL','222'),
('Nouraa','hFE5DwNurRm55Ehc','223'),
('amirai','cTY6gWGFAQSSAURD','333'),
('Muneer','NbbWVjnp6ZgQ642s','334'),
('Mohamm','NXfb4zKkb2DVkMFD','621'),
('Nouraf','kUAXn2NVKwpzkR5s','552'),
('areejq','YtWEbeajpQFJ2uHn','555'),
('Fahadb','SEat2QnNGnSVuJmF','661'),
('Monazz','4x2ZvuKcFqG4REhf','999'),
('Wafahh','FDRnPgjQdDS2vQB2','881'),
('Saragg','5CgazpzvHcuCY9Gw','992');
