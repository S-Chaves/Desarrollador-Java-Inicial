-- Creo la tabla departamento
CREATE TABLE departamento (
	id	INTEGER NOT NULL,
	nombre TEXT NOT NULL UNIQUE,
	presupuesto REAL NOT NULL,
	PRIMARY KEY(id AUTOINCREMENT)
);

-- Creo la tabla empleado
CREATE TABLE empleado (
	id INTEGER NOT NULL,
	dni TEXT NOT NULL UNIQUE,
	nombre TEXT,
	apellido TEXT,
	nacionalidad TEXT,
	departamento_fk INTEGER NOT NULL,
	PRIMARY KEY(id AUTOINCREMENT),
	FOREIGN KEY (departamento_fk) REFERENCES departamento(id)
);

-- Inserto los departamentos
INSERT INTO departamento (id, nombre, presupuesto) VALUES 
(NULL, "Sistemas", 3000),
(NULL, "Ingenieria", 2500),
(NULL, "Publicidad", 4000),
(NULL, "Logistica", 3700),
(NULL, "Marketing", 5000);
	
-- Inserto dos empleados nuevos
INSERT INTO empleado (id, dni, nombre, apellido, nacionalidad, departamento_fk) VALUES 
(NULL, "24783534", "Juan", "Perez", "Argentina", 2),
(NULL, "30245173", "Carlos", "Gomez", "Colombia", 4);
	
-- Modifico la nacionalidad de un empleado
UPDATE empleado
SET nacionalidad = "Uruguay"
WHERE id = 1;

-- Elimino un departamento
DELETE FROM departamento
WHERE id = 3;

-- Muestro los empleados del departamento de logistica
SELECT * FROM empleado
WHERE departamento_fk = (SELECT id FROM departamento WHERE nombre = "Logistica");

-- Muestro los departamentos ordenados alfabeticamente
SELECT * FROM departamento
ORDER BY nombre;