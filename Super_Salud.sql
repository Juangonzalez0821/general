CREATE DATABASE Super_Salud;
USE Super_Salud;

-- Tabla Pacientes
CREATE TABLE Pacientes (
    codigo_identificacion INT PRIMARY KEY AUTO_INCREMENT,
    nombre_completo VARCHAR(100),
    direccion VARCHAR(255),
    tipo_poblacion VARCHAR(50),
    numero_contacto VARCHAR(15),
    fecha_nacimiento DATE,
    tipo_documento VARCHAR(20),
    nacionalidad VARCHAR(50),
    departamento_nacimiento VARCHAR(50),
    ciudad_nacimiento VARCHAR(50)
);

-- Tabla Medicos
CREATE TABLE Medicos (
    numero_identificacion INT PRIMARY KEY,
    nombre_completo VARCHAR(100),
    telefono VARCHAR(15),
    tipo_documento VARCHAR(20),
    especialidad_medica VARCHAR(50)
);

-- Tabla Ingresos
CREATE TABLE Ingresos (
    codigo_ingreso INT PRIMARY KEY AUTO_INCREMENT,
    fecha_hora_ingreso DATETIME,
    fecha_hora_salida DATETIME,
    numero_piso INT,
    numero_habitacion INT,
    numero_cama INT,
    paciente_codigo_identificacion INT,
    medico_numero_identificacion INT,
    FOREIGN KEY (paciente_codigo_identificacion) REFERENCES Pacientes(codigo_identificacion),
    FOREIGN KEY (medico_numero_identificacion) REFERENCES Medicos(numero_identificacion)
);


FOREIGN KEY (paciente_codigo_identificacion) REFERENCES Pacientes(codigo_identificacion)

FOREIGN KEY (medico_numero_identificacion) REFERENCES Medicos(numero_identificacion)
