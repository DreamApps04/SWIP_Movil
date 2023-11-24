/*Se crea la base de datos */
drop schema if exists swiftDB;
drop user if exists admin;
CREATE SCHEMA swiftDB;

/*Se crea un usuario para la base de datos llamado "usuario_prueba" y tiene la contraseña "Usuario_Clave."*/
create user 'admin'@'%' identified by 'admin123';

/*Se asignan los prvilegios sobr ela base de datos prueba_a al usuario creado */
grant all privileges on swiftDB.* to 'admin'@'%';
flush privileges;

/*la tabla de usuarios*/
create table swiftDB.usuario (
  id_usuario INT NOT NULL AUTO_INCREMENT,
  email VARCHAR(30) NOT NULL,
  nombre VARCHAR(60) NOT NULL,
  fechaIngreso DATE NOT NULL,
  numeroCelular varchar(40),
  contrasena VARCHAR(100) NOT NULL,
  activo BOOL,
  PRIMARY KEY (id_usuario))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

/*la tabla de gastos*/
create table swiftDB.gastos (
  id_gasto INT NOT NULL AUTO_INCREMENT,
  nombreGasto VARCHAR(60) NOT NULL,
  descripcion VARCHAR(150) NOT NULL,
  monto DOUBLE NOT NULL,
  mesIngreso VARCHAR(40) NOT NULL,
  numQuincena INT NOT NULL,
  userID INT NOT NULL,
  PRIMARY KEY (id_gasto),
  FOREIGN KEY (userID) REFERENCES swiftDB.usuario(id_usuario))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

CREATE TABLE swiftDB.ingreso (
  id_ingreso INT NOT NULL AUTO_INCREMENT,
  nombre_ingreso VARCHAR(60) NOT NULL,
  icono VARCHAR(255) NOT NULL,
  descripingreso VARCHAR(150) NOT NULL,
  monto DOUBLE NOT NULL,
  PRIMARY KEY (id_ingreso))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


/*Tabla de Credito*/
create table swiftDB.credito (
  id_credito INT NOT NULL AUTO_INCREMENT,
  nombre_Credito VARCHAR(60) NOT NULL,
  mes_Registro VARCHAR(150) NOT NULL,
  monto DOUBLE NOT NULL,
  num_Cuotas INT NOT NULL,
  cuotas_Realizadas INT NOT NULL,
  userID INT NOT NULL,
  PRIMARY KEY (id_credito),
  FOREIGN KEY (userID) REFERENCES swiftDB.usuario(id_usuario))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

/*Tabla de Ahorros*/
create table swiftDB.ahorros (
  id_ahorro INT NOT NULL AUTO_INCREMENT,
  nombreAhorro VARCHAR(60) NOT NULL,
  descripcion VARCHAR(150) NOT NULL,
  monto DOUBLE NOT NULL,
  icono VARCHAR(1000) NOT NULL,
  userID INT NOT NULL,
  PRIMARY KEY (id_ahorro),
  FOREIGN KEY (userID) REFERENCES swiftDB.usuario(id_usuario))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

/*Tabla movimientos*/
create table swiftDB.movimientos (
  id_movimiento INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(60) NOT NULL,
  descripcion VARCHAR(150) NOT NULL,
  monto DOUBLE NOT NULL,
  fechaMovimiento DATE NOT NULL,
  userID INT NOT NULL,
  PRIMARY KEY (id_movimiento),
  FOREIGN KEY (userID) REFERENCES swiftDB.usuario(id_usuario))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


INSERT INTO swiftDB.usuario (id_usuario, email, nombre, fechaIngreso, numeroCelular, contrasena, activo) VALUES 
('1', 'j@j.com', 'joseth', CURDATE(), '8888888', '123456789', true),
('2', 'a@a.com', 'Angelo', CURDATE(), '8888888', '123456789', true),
('3', 'c@c.com', 'carlos', CURDATE(), '8888888', '123456789', false);


INSERT INTO swiftDB.gastos (id_gasto, nombreGasto, descripcion, monto, mesIngreso, numQuincena, userID) VALUES 
('1', 'Servicios', 'pago de agua y luz', 50000, 'Noviembre', '1', 1),
('2', 'Internet', 'Internet', 50000, 'Noviembre', '1', 2),
('3', 'Comida', 'Primera parte de comrpas', 150000, 'Noviembre', '2', 1);

INSERT INTO swiftDB.ingreso (id_ingreso, nombre_ingreso, icono, monto, descripingreso) VALUES
('1','Pago Fijo', 'fas fa-briefcase', 500000, 'Planilla'),
('2','Pago Fijo', 'fas fa-briefcase', 300000, 'Planilla'),
('3','SP', 'fas fa-handshake', 150000, 'Servicios brindados a la comunidad');

INSERT INTO swiftDB.credito (id_credito, nombre_Credito, mes_Registro, monto, num_Cuotas, cuotas_Realizadas, userID) VALUES 
('1', 'Taladro', 'Noviembre', 50000, 5, 1, 1),
('2', 'Mesa', 'Noviembre', 20000, 2, 0, 2),
('3', 'Tienda', 'Noviembre', 1500, 1, 1, 1);

INSERT INTO swiftDB.ahorros (id_ahorro, nombreAhorro, descripcion, monto, icono, userID) VALUES 
('1', 'Principales', 'Ahorros en caso de emergencia', 500000, '', 1),
('2', 'Hogar', 'Compras de casa', 200000, '', 2),
('3', 'Viaje', 'Viaje de miami', 150000, '', 1);

INSERT INTO swiftDB.movimientos (id_movimiento, nombre, descripcion, monto, fechaMovimiento, userID) VALUES 
('1', 'Pago fijo', 'Planilla', 500000, '2023-11-08', 1),
('2', 'Pago fijo', 'Planilla', 300000, '2023-11-08', 2),
('3', 'SP', 'Servicios brindados a comunidad', 150000, '2023-11-08', 1);


