CREATE DATABASE SANTISIMA_TRINIDAD;

DROP DATABASE SANTISIMA_TRINIDAD;

USE SANTISIMA_TRINIDAD;

use spring;

CREATE TABLE ROLES(
ID INT IDENTITY(100,1) PRIMARY KEY NOT NULL,
ADM_ID INT,
NOMBRE VARCHAR(30) NOT NULL)
GO

CREATE TABLE ADMINISTRADORES(
ID INT IDENTITY(100,1) PRIMARY KEY NOT NULL,
USERNAME VARCHAR(45) NOT NULL,
PASSWORD VARCHAR(60) NOT NULL,
ENABLED INT NOT NULL)

ALTER TABLE ROLES
ADD CONSTRAINT FK_ROLES_ADMIN FOREIGN KEY (ADM_ID)
REFERENCES ADMINISTRADORES(ID) ON DELETE CASCADE;

insert into roles (adm_id, nombre) values (100, 'Administrador');
insert into roles (adm_id, nombre) values (101, 'Administrador');
insert into roles (adm_id, nombre) values (102, 'Administrador');

insert into ADMINISTRADORES (USERNAME, PASSWORD, ENABLED) values ('richardmp','$2a$12$2c7upIJnTfyw2xmfFrlld.JQ.Bjop6eYMdImC7lPlM.P3lV4xKvEK',1)
insert into ADMINISTRADORES (USERNAME, PASSWORD, ENABLED) values ('juliogm','$2a$12$gU45D.vpW1MgaZD.rSpMue.ofqeRPFAGavtib.hKNmdXJuvEjkqRq',1)
insert into ADMINISTRADORES (USERNAME, PASSWORD, ENABLED) values ('juanvq','$2a$12$xjRsjsPTqRYIbq8mgCpRVunSFyk8GCcGuPfav4UyUuQmzRVfKFJyu',1)


select * from roles;
select * from ADMINISTRADORES;

drop table ROLES;
drop table ADMINISTRADORES;


CREATE TABLE PACIENTE(
DNI INT PRIMARY KEY NOT NULL,
NOMBRES VARCHAR(50) NOT NULL,
APELLIDOS VARCHAR(50) NOT NULL,
TELEFONO CHAR(9) NOT NULL,
PASSW VARCHAR(20) NOT NULL)
GO

CREATE TABLE ESPECIALIDAD_ATENCION(
ESPEC_ATEN INT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ESPECIALIDAD VARCHAR(30) NOT NULL)
GO

CREATE TABLE ESPECIALIDAD_DOCTORES(
ESPEC_DOC INT IDENTITY(100,1) PRIMARY KEY NOT NULL,
ESPECIALIDAD VARCHAR(30) NOT NULL)
GO

CREATE TABLE DOCTOR(
DNI_DOCTOR INT PRIMARY KEY NOT NULL,
NOMBRES VARCHAR(50) NOT NULL,
APELLIDOS VARCHAR(50) NOT NULL,
ESPEC_DOC INT NOT NULL)
GO

ALTER TABLE DOCTOR
ADD CONSTRAINT FK_ESPECIALIDAD_DOCTOR FOREIGN KEY (ESPEC_DOC)
REFERENCES ESPECIALIDAD_DOCTORES(ESPEC_DOC) ON DELETE CASCADE;


CREATE TABLE CITAS(
NRO_CITA INT IDENTITY(10000,1) PRIMARY KEY NOT NULL,
FECHA DATE NOT NULL,
HORA TIME NOT NULL,
ESPEC_ATEN INT NOT NULL,
DNI_DOCTOR INT NOT NULL,
DNI_PACIENTE INT NOT NULL)
GO


CREATE TABLE SOLICITUDES(
NRO_SOLI INT IDENTITY(100000,1) PRIMARY KEY NOT NULL,
DNI_SOLICITANTE CHAR(8) NOT NULL,
NOMBRE_SOLICITANTE VARCHAR(70) NOT NULL,
CORREO_SOLICITANTE VARCHAR(100) NOT NULL,
TELEFONO_SOLICITANTE CHAR(9) NOT NULL,
FECHA_SOLICITUD DATETIME DEFAULT GETDATE())
GO


ALTER TABLE CITAS
ADD CONSTRAINT FK_ESPECIALIDAD_ATENCION FOREIGN KEY (ESPEC_ATEN)
REFERENCES ESPECIALIDAD_ATENCION(ESPEC_ATEN) ON DELETE CASCADE;

ALTER TABLE CITAS
ADD CONSTRAINT FK_DOCTOR_CITAS FOREIGN KEY (DNI_DOCTOR)
REFERENCES DOCTOR(DNI_DOCTOR) ON DELETE CASCADE;

ALTER TABLE CITAS
ADD CONSTRAINT FK_PACIENTE_CITAS FOREIGN KEY (DNI_PACIENTE)
REFERENCES PACIENTE(DNI) ON DELETE CASCADE;


SELECT * FROM SOLICITUDES;

INSERT INTO SOLICITUDES (DNI_SOLICITANTE, NOMBRE_SOLICITANTE, CORREO_SOLICITANTE, TELEFONO_SOLICITANTE)
VALUES ('48189211', 'Eduardo Ramirez', 'Eduram@gmail.com', '977278188') 




INSERT INTO CITAS (FECHA, HORA, ESPEC_ATEN, DNI_PACIENTE)
VALUES ('2023-11-15','15:30','1000','70205136');
INSERT INTO CITAS (FECHA, HORA, ESPEC_ATEN, DNI_PACIENTE)
VALUES ('2023-11-13','12:30','1000','46171489');


select * from citas;

update CITAS set DNI_DOCTOR='77899492' where NRO_CITA='10008';



select * from PACIENTE;
select * from DOCTOR;

Select * from ESPECIALIDAD_ATENCION;
Select * from ESPECIALIDAD_DOCTORES;

--RENOMBRAR UNA COLUMNA DE UNA TABLA
EXEC sp_rename 'PACIENTE.TELÉFONO', 'TELEFONO', 'COLUMN';

INSERT INTO DOCTOR(DNI_DOCTOR,Nombres,Apellidos,ESPEC_DOC)
VALUES
  ('77899492','Mohammad','Barber','100'),
  ('48233923','Ignacia','Graham','102'),
  ('72218749','Calvin','Moses','107'),
  ('74489527','Summer','White','100'),
  ('77248456','Regan','Roberts','103');


INSERT INTO ESPECIALIDAD_DOCTORES (ESPECIALIDAD) VALUES ('Cardiología');
INSERT INTO ESPECIALIDAD_DOCTORES (ESPECIALIDAD) VALUES ('Dermatología');
INSERT INTO ESPECIALIDAD_DOCTORES (ESPECIALIDAD) VALUES ('Ginecología');
INSERT INTO ESPECIALIDAD_DOCTORES (ESPECIALIDAD) VALUES ('Oftalmología');
INSERT INTO ESPECIALIDAD_DOCTORES (ESPECIALIDAD) VALUES ('Pediatría');
INSERT INTO ESPECIALIDAD_DOCTORES (ESPECIALIDAD) VALUES ('Neurología');
INSERT INTO ESPECIALIDAD_DOCTORES (ESPECIALIDAD) VALUES ('Cirugía General');
INSERT INTO ESPECIALIDAD_DOCTORES (ESPECIALIDAD) VALUES ('Urología');
INSERT INTO ESPECIALIDAD_DOCTORES (ESPECIALIDAD) VALUES ('Psiquiatría');
INSERT INTO ESPECIALIDAD_DOCTORES (ESPECIALIDAD) VALUES ('Endocrinología');

INSERT INTO ESPECIALIDAD_ATENCION (ESPECIALIDAD) VALUES ('Cardiología');
INSERT INTO ESPECIALIDAD_ATENCION (ESPECIALIDAD) VALUES ('Dermatología');
INSERT INTO ESPECIALIDAD_ATENCION (ESPECIALIDAD) VALUES ('Ginecología');
INSERT INTO ESPECIALIDAD_ATENCION (ESPECIALIDAD) VALUES ('Oftalmología');
INSERT INTO ESPECIALIDAD_ATENCION (ESPECIALIDAD) VALUES ('Pediatría');
INSERT INTO ESPECIALIDAD_ATENCION (ESPECIALIDAD) VALUES ('Neurología');
INSERT INTO ESPECIALIDAD_ATENCION (ESPECIALIDAD) VALUES ('Cirugía General');
INSERT INTO ESPECIALIDAD_ATENCION (ESPECIALIDAD) VALUES ('Urología');
INSERT INTO ESPECIALIDAD_ATENCION (ESPECIALIDAD) VALUES ('Psiquiatría');
INSERT INTO ESPECIALIDAD_ATENCION (ESPECIALIDAD) VALUES ('Endocrinología');

