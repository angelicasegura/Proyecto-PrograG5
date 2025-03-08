/*Se crea la base de datos */

CREATE SCHEMA ProyectoProgra ;

/*Usuario y contraseña */
create user 'usuario_proyecto'@'%' identified by 'La_Clave.';

/*Se asignan los prvilegios sobr ela base de datos TechShop al usuario creado */
grant all privileges on ProyectoProgra.* to 'usuario_proyecto'@'%';

flush privileges;

use ProyectoProgra;

/* la tabla de categoria contiene categorias de productos*/
create table categoria (
  id_categoria INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(30) NOT NULL,
  ruta_imagen varchar(1024),
  PRIMARY KEY (id_categoria))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table producto (
  id_producto INT NOT NULL AUTO_INCREMENT,
  id_categoria INT NOT NULL,
  nombre VARCHAR(30) NOT NULL,  
  descripcion VARCHAR(1600) NOT NULL, 
  precio double,
  existencias int,  
  ruta_imagen varchar(1024),
  PRIMARY KEY (id_producto),
  foreign key fk_producto_caregoria (id_categoria) references categoria(id_categoria)  
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table masVendidos (
	id_masVendidos INT NOT NULL AUTO_INCREMENT,
    id_producto INT NOT NULL, 
    ruta_imagen varchar(1024),
    PRIMARY KEY (id_masVendidos),
	foreign key  (id_producto) references producto (id_producto) 
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table favoritos (
	id_favoritos INT NOT NULL AUTO_INCREMENT,
    id_producto INT NOT NULL, 
    ruta_imagen varchar(1024),
    PRIMARY KEY (id_favoritos),
	foreign key  (id_producto) references producto (id_producto) 
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;
INSERT INTO categoria (id_categoria, descripcion, ruta_imagen) VALUES
(1, 'Cuidado Personal', 'https://mejorconsalud.as.com/wp-content/uploads/2022/03/arbol-roble.jpg'),
(2, 'Hogar', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTS8sqj473JOpMlyWyjcoYcX57biRcymr3eaA&s'),
(3, 'Otros productos', 'https://www.recetasnestlecam.com/sites/default/files/2022-07/palmera-con-frutos_0.jpg');

INSERT INTO producto (id_producto, id_categoria, nombre, descripcion, precio, existencias, ruta_imagen) VALUES
(1,1, 'Cepillo de dientes de Bambu', 'Hecho de moso bambu el cual es biodegrable, 100% sostenible y libre de crueldad animal', 3900,20,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQy4rEAUBffYAjt8rZNSMJEROgiG0EszAF0FA&s'),
(2,1, 'Shampoo solido', 'Shampoo en bara, es 100% vegano, apto para cabello normal a graso.', 6500, 14,'https://faunacosmeticanatural.com/wp-content/uploads/2020/12/diferenciashampoosolidoyjabon-min.jpg' ),
(3,1, 'Crema corporal Solida-Lavanda', 'Crema corporal ecologica en barra. Es 100% vegana,deja la piel suave, hidratada y con un olor a lavanda',6300, 20, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSRzZGAw0ukKvhL3-lDtDdAXYgRA0-pr4EfiQ&s'),
(4,1, 'Desobrante', 'Desobrante vegano, con olor a coco. Es 100% vegano y amigable con el ambiente',5900, 15,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7y1r6zZ777cypYQhGHsL63XVCNj3hwnsUoQ&s'),
(5,2, 'Pajilla Reutilizable','Pajilla reutilizable, ideal para batidos 8mm de diámetro', 2000,15,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREbw1Sx-7FD5iCCvfAZ8ddPSU9f3YfZN400Q&s'),
(6,2, 'Esponja natural Luffa','Esponja 100% natural y organica se puede usar en la cocina para lavar platos. Libre de plastico',3200,20, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSCAsrk4MGbd5R_TNoP2R5jvd8CScYAKm2yAA&s'),
(7,2, 'Cubiertos Colapsables ','Set de cubiertos colapsables hechos de acero inoxidable de alta calidad',1200,10,'https://acdn-us.mitiendanube.com/stores/001/364/330/products/set-de-cubiertos-plegables-11-81c26323140c13edb016633521041410-1024-1024.webp'),
(8,2, 'Bolsa de tela reutilizable','Algodón organico 100% natural, biodegradable. Lavado a máquina', 4000,25,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2aKVfiIbuQKF8-Lgn5FL4tcIRVB4KmpzIR9N3EWVK1A_I57zhKWpyWkVJSUwoFEOQy10&usqp=CAU'),
(9,3,'Cepillo de madera','Cepillo de madera con cerdas de bambu',10500,5,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSX53EInPkR2c1EViIBwrKRVm2-3ntiMqN-vQ&s');


INSERT INTO masVendidos (id_masVendidos, id_producto, ruta_imagen)VALUES
(1,2,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQy4rEAUBffYAjt8rZNSMJEROgiG0EszAF0FA&s'),
(2,1, 'https://faunacosmeticanatural.com/wp-content/uploads/2020/12/diferenciashampoosolidoyjabon-min.jpg' ),
(3,4, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7y1r6zZ777cypYQhGHsL63XVCNj3hwnsUoQ&s'), 
(4,7, 'https://acdn-us.mitiendanube.com/stores/001/364/330/products/set-de-cubiertos-plegables-11-81c26323140c13edb016633521041410-1024-1024.webp'),
(5,9, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSX53EInPkR2c1EViIBwrKRVm2-3ntiMqN-vQ&s');


INSERT INTO favoritos (id_favoritos, id_producto, ruta_imagen)VALUES
(1,2,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQy4rEAUBffYAjt8rZNSMJEROgiG0EszAF0FA&s'),
(2,1, 'https://faunacosmeticanatural.com/wp-content/uploads/2020/12/diferenciashampoosolidoyjabon-min.jpg' ),
(3,6, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSCAsrk4MGbd5R_TNoP2R5jvd8CScYAKm2yAA&s'), 
(4,8, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2aKVfiIbuQKF8-Lgn5FL4tcIRVB4KmpzIR9N3EWVK1A_I57zhKWpyWkVJSUwoFEOQy10&usqp=CAU');
