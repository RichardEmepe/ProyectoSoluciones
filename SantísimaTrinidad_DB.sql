CREATE DATABASE SANTISIMA_TRINIDAD;

DROP DATABASE SANTISIMA_TRINIDAD;

USE SANTISIMA_TRINIDAD;

CREATE TABLE PACIENTE(
DNI INT PRIMARY KEY NOT NULL,
NOMBRES VARCHAR(50) NOT NULL,
APELLIDOS VARCHAR(50) NOT NULL,
TELEFONO CHAR(9) NOT NULL)
GO

CREATE TABLE ESPECIALIDAD(
COD_ESPEC INT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ESPECIALIDAD VARCHAR(30) NOT NULL)
GO

CREATE TABLE DOCTORES(
DNI INT PRIMARY KEY NOT NULL,
NOMBRES VARCHAR(50) NOT NULL,
APELLIDOS VARCHAR(50) NOT NULL)
GO

CREATE TABLE CITAS(
NRO_CITA INT IDENTITY(10000,1) PRIMARY KEY NOT NULL,
FECHA DATE NOT NULL,
HORA TIME NOT NULL,
ESPECIALIDAD VARCHAR(50) NOT NULL,
DNI_PACIENTE INT NOT NULL)
GO



ALTER TABLE CITAS
ADD CONSTRAINT FK_PACIENTE_CITAS FOREIGN KEY (DNI_PACIENTE)
REFERENCES PACIENTE(DNI);


INSERT INTO CITAS (FECHA, HORA, ESPECIALIDAD, DNI_PACIENTE)
VALUES ('2023-11-15','15:30','CARDIOLOGÍA','70205136');
INSERT INTO CITAS (FECHA, HORA, ESPECIALIDAD, DNI_PACIENTE)
VALUES ('2023-11-13','12:30','GINECOLOGÍA','46171489');



SELECT * FROM CITAS;

select * from PACIENTE


--RENOMBRAR UNA COLUMNA DE UNA TABLA
EXEC sp_rename 'PACIENTE.TELÉFONO', 'TELEFONO', 'COLUMN';

INSERT INTO especialidades_medicas (nombre) VALUES ('Cardiología');
INSERT INTO especialidades_medicas (nombre) VALUES ('Dermatología');
INSERT INTO especialidades_medicas (nombre) VALUES ('Ginecología');
INSERT INTO especialidades_medicas (nombre) VALUES ('Oftalmología');
INSERT INTO especialidades_medicas (nombre) VALUES ('Pediatría');
INSERT INTO especialidades_medicas (nombre) VALUES ('Neurología');
INSERT INTO especialidades_medicas (nombre) VALUES ('Cirugía General');
INSERT INTO especialidades_medicas (nombre) VALUES ('Urología');
INSERT INTO especialidades_medicas (nombre) VALUES ('Psiquiatría');