-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-11-2020 a las 10:22:23
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mn_sistema_web`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `ActualizarDatos` (IN `pCedula` VARCHAR(30), IN `pNombre` VARCHAR(50), IN `pPerfil` TINYINT, IN `pNota1` DECIMAL(5,2), IN `pNota2` DECIMAL(5,2), IN `pProyecto` DECIMAL(5,2), IN `pPromedio` DECIMAL(5,2))  NO SQL
BEGIN
UPDATE promedio
SET    nombre    = pNombre , 
       perfil_id = pPerfil ,
       nota1     = pNota1,
       nota2     = pNota2,
       proyecto  = pProyecto,
       promedio  = (pNota1+ pNota2+pProyecto)/3
WHERE  cedula    = pCedula;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ConsultarPromedios` (IN `pCedula` VARCHAR(30))  NO SQL
BEGIN

	IF (pCedula = '') THEN
    
    	SELECT  *
    	FROM	promedio;
    
    ELSE
    
        SELECT  *
        FROM	promedio
        WHERE 	Cedula = pCedula;
        
    END IF;
   
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarDatos` (IN `pCedula` VARCHAR(30))  NO SQL
BEGIN 
DELETE
FROM   promedio
WHERE  pCedula = cedula;
 
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarDatos` (IN `pCedula` VARCHAR(30), IN `pNombre` VARCHAR(50), IN `pPerfil` TINYINT, IN `pNota1` DECIMAL(5,2), IN `pNota2` DECIMAL(5,2), IN `pProyecto` DECIMAL(5,2), IN `pPromedio` DECIMAL(5,2))  NO SQL
BEGIN

INSERT INTO promedio (cedula, nombre, nota1, nota2, perfil_id, promedio, proyecto)
VALUES (pCedula, pNombre, pNota1, pNota2, pPerfil, pPromedio, pProyecto);

END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `promedio`
--

CREATE TABLE `promedio` (
  `Cedula` varchar(30) NOT NULL,
  `Nombre` varchar(200) NOT NULL,
  `Perfil_Id` tinyint(4) NOT NULL COMMENT 'FK 1 Adm y 2 Consulta',
  `Nota1` decimal(5,2) NOT NULL,
  `Nota2` decimal(5,2) NOT NULL,
  `Proyecto` decimal(5,2) NOT NULL,
  `Promedio` decimal(5,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `promedio`
--

INSERT INTO `promedio` (`Cedula`, `Nombre`, `Perfil_Id`, `Nota1`, `Nota2`, `Proyecto`, `Promedio`) VALUES
('116380859', 'Jean Paul Porras ', 1, '100.00', '100.00', '100.00', '100.00'),
('123456789', 'Prueba 2', 1, '80.00', '90.00', '100.00', '90.00'),
('304590417', 'Eduardo Calvo Castillo', 2, '100.00', '100.00', '100.00', '100.00'),
('304590418', 'Prueba 1', 2, '86.00', '85.25', '95.00', '88.75');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `promedio`
--
ALTER TABLE `promedio`
  ADD PRIMARY KEY (`Cedula`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
