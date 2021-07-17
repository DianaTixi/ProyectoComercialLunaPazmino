## Insertar Datos en la Base Comercial Luna Pazmiño
# Tabla Provincia
INSERT INTO Provincias VALUES (default, "Azuay");
INSERT INTO Provincias VALUES (default, "Bolivar");
INSERT INTO Provincias VALUES (default, "Cañar");
INSERT INTO Provincias VALUES (default, "Carchi");
INSERT INTO Provincias VALUES (default, "Chimborazo");
INSERT INTO Provincias VALUES (default, "Cotopaxi");
INSERT INTO Provincias VALUES (default, "El Oro");
INSERT INTO Provincias VALUES (default, "Esmeraldas");
INSERT INTO Provincias VALUES (default, "Galapagos");
INSERT INTO Provincias VALUES (default, "Guayas");
INSERT INTO Provincias VALUES (default, "Imbabura");
INSERT INTO Provincias VALUES (default, "Loja");
INSERT INTO Provincias VALUES (default, "Los Rios");
INSERT INTO Provincias VALUES (default, "Manabi");
INSERT INTO Provincias VALUES (default, "Morona Santiago");
INSERT INTO Provincias VALUES (default, "Napo");
INSERT INTO Provincias VALUES (default, "Orellana");
INSERT INTO Provincias VALUES (default, "Pastaza");
INSERT INTO Provincias VALUES (default, "Pichincha");
INSERT INTO Provincias VALUES (default, "Santa Elena");
INSERT INTO Provincias VALUES (default, "Santo Domingo de los Tsachilas");
INSERT INTO Provincias VALUES (default, "Sucumbios");
INSERT INTO Provincias VALUES (default, "Tungurahua");
INSERT INTO Provincias VALUES (default, "Zamora Chinchipe");
Select * From Provincias;

# Tabla Ciudades
INSERT INTO Ciudades VALUES (default, "Cuenca",1);
INSERT INTO Ciudades VALUES (default, "Guaranda",2);
INSERT INTO Ciudades VALUES (default, "Azogues",3);
INSERT INTO Ciudades VALUES (default, "Tulcan",4);
INSERT INTO Ciudades VALUES (default, "Riobamba",5);
INSERT INTO Ciudades VALUES (default, "Latacunga",6);
INSERT INTO Ciudades VALUES (default, "Machala",7);
INSERT INTO Ciudades VALUES (default, "Esmeraldas",8);
INSERT INTO Ciudades VALUES (default, "Puerto Baquerizo Moreno", 9);
INSERT INTO Ciudades VALUES (default, "Guayaquil",10);
INSERT INTO Ciudades VALUES (default, "Ibarra", 11);
INSERT INTO Ciudades VALUES (default, "Loja", 12);
INSERT INTO Ciudades VALUES (default, "Babahoyo", 13);
INSERT INTO Ciudades VALUES (default, "Portoviejo", 14);
INSERT INTO Ciudades VALUES (default, "Macas", 15);
INSERT INTO Ciudades VALUES (default, "Tena",16);
INSERT INTO Ciudades VALUES (default, "Francisco de Orellana", 17);
INSERT INTO Ciudades VALUES (default, "Puyo", 18);
INSERT INTO Ciudades VALUES (default, "Quito", 19);
INSERT INTO Ciudades VALUES (default, "Santa Elena", 20);
INSERT INTO Ciudades VALUES (default, "Santo Domingo", 21);
INSERT INTO Ciudades VALUES (default, "Nueva Loja", 22);
INSERT INTO Ciudades VALUES (default, "Ambato", 23);
INSERT INTO Ciudades VALUES (default, "Zamora", 24);


INSERT INTO Categorias VALUES (default, "Ceramica",'A', "Variedad de piezas u objetos de terracota o alfarería, de loza y del conjunto de porcelanas");
INSERT INTO Categorias VALUES (default, "Porcelanato", "Todo tipo de productos que se utilizan para el revestimiento de suelos y paredes");
INSERT INTO Categorias VALUES (default, "Iluminacion",'A', "Ofrece una amplia gama de productos que permiten facilitar la visualización de las cosas en unas condiciones aceptables de eficacia, comodidad y seguridad");


#Tabla Subcategorias
INSERT INTO SubCategorias VALUES (default, "De Techo", 'A', "Son aquellos productos de iluminacion que se colocan en los paramentos verticales o paredes", 3);
INSERT INTO Subcategorias VALUES (default, "De Pared", 'A', "Son aquellos productos de iluminacion que se colocan en la pared", 3);
INSERT INTO Subcategorias VALUES (default, "De Piso", 'A', "Son aquellos productos que se apoyam en el suelo", 3);
INSERT INTO Subcategorias VALUES (default, "Escritorio", 'A',"Son aquellos productos que se situan sobre mesas", 3);
INSERT INTO Subcategorias VALUES (default, "Colgante", 'A', "Son aquellos productos que se cuelgan de lo alto", 3);
INSERT INTO Subcategorias VALUES (default, "Ojo de Buey",'A', "Se refiere a los focos empotrados de forma circular, originalmente halógenos, que son bastante comunes tanto en viviendas, como en", 3);
INSERT INTO Subcategorias VALUES (default, "Faroles", 'A', "Son aquellos productos de caja con vidrios que contiene una luz", 3);

#Tabla Marcas
INSERT INTO Marcas VALUES (default,"Lunum", 'E');
INSERT INTO Marcas VALUES (default,"Sin Marca", 'N');

#Tabla Productos
INSERT INTO Productos VALUES(0, "227318B", "Lampara Colgante Negro Mate", "Lampara colgante negro mate de un solo foco E27 de dimensiones 14x26", 30.45, 33.50, 14 , 26, 14, "Negro Mate", 0, 0.0, 'A',  4, 1);
INSERT INTO Productos VALUES(0, "200164", "Aplique Pared Metal Black", "Aplique Pared Metal Black de un solo foco E27 de dimensiones 27x30", 23.99, 26.40,27 , 30, 27, "Negro", 0, 0, 'A', 5, 2);
INSERT INTO Productos VALUES(0, "817318B", "Farol de Pared ", "Farol de Pared con Vidrio ", 20.45, 23.50, 8 , 10, 5, "Negro Mate", 0, 0.0, 'A',  7, 1);
INSERT INTO Productos VALUES(0, "K10981", "Lampara Colgante Puñado de Rejillas Decorable 3L E27", "Lampara Colgante Puñado de Rejillas Decorable 3L E27 de 45x30x10", 50.45, 53.50, 45 , 30, 10, "Blanco", 0, 0.0, 'A',  5, 2);
INSERT INTO Productos VALUES(0, "K20856", "Farol Pared Vidrio Lineas Color RAB 1L E27", "Farol Pared Vidrio Lineas Color RAB 1L E27 ", 23.55, 25.98, 0 , 0, 0, "RAB", 0, 0.0, 'A',  4, 1);
INSERT INTO Productos VALUES(0, "K20843", "Farol Pared Vidrio 1L E27", "Farol Pared Vidrio 1L E27", 41.99, 53.40, 0 , 0, 0,"Negro", 0, 0, 'A', 7, 1);
INSERT INTO Productos VALUES(0, "IL010552", "Lampara Colgante 1L E27", "Lampara Colgante 1L E27 de 160x80x750mm", 23.55, 29.50, 160 , 80, 750, "Gris", 0, 0, 'A', 5, 1);
INSERT INTO Productos VALUES(0, "28437", "Lampara farol Pared Oro/Negro E27", "Lampara farol Pared Oro/Negro E27 ", 17.95, 20.50, 0 , 0, 0, "Oro Negro", 0, 0.0, 'A',  5, 1);

INSERT INTO Imagenes VALUES(0 , "lampara1.jpg", 1);
INSERT INTO Imagenes VALUES(0 , "lampara10.jpg", 2);
INSERT INTO Imagenes VALUES(0 , "lampara3.jpg", 3);
INSERT INTO Imagenes VALUES(0 , "lampara4.jpg", 4);
INSERT INTO Imagenes VALUES(0 , "lampara5.jpg", 5);
INSERT INTO Imagenes VALUES(0 , "lampara6.jpg", 6);
INSERT INTO Imagenes VALUES(0 , "lampara7.jpg", 7);
INSERT INTO Imagenes VALUES(0 , "lampara8.jpg", 8);
INSERT INTO Imagenes VALUES(0 , "lampara9.jpg", 9);
INSERT INTO Imagenes VALUES(0 , "lampara10.jpg", 10);

#Tabla Persona
INSERT INTO Personas values(default, "0102030241", "Jhon", "Macao", "0978451230", "jmacao@gmail.com", "jhon99",'C' , 'A');
INSERT INTO Personas values(default, "0102794512", "Pedro", "Arevalo", "0936451230", "pedro@gmail.com", "pedro99",'C' , 'A');
INSERT INTO Personas values(default, "0607845130", "Juan", "Becerra", "0987601230", "becerraj@gmail.com", "juan95",'C' , 'A');

INSERT INTO PedidosCabeceras values(default, "001" , '2021/07/03' ,"Circo Social", "A una cuadra del parque",  30.45, 30.45, 'L','C', 'P', null, 3,1);
INSERT INTO PedidosDetalles values(default,1,  30.45, 1,1);

INSERT INTO PedidosCabeceras values(default, "002" , '2021/08/03' ,"Av Americas", "Sector la Basilica",  115.34, 115.34, 'L','C', 'P', null, 2,1);
INSERT INTO PedidosDetalles values(default,3,  91.35, 1,2);
INSERT INTO PedidosDetalles values(default,1,  23.99, 2,2);

INSERT INTO PedidosCabeceras values(default, "003" , '2021/08/03' ,"Calle Batan ", "Atras de almacenes Chordeleg",  94.40, 94.40, 'L','C', 'P', null, 3,1);
INSERT INTO PedidosDetalles values(default,2,  41.0, 8,3);
INSERT INTO PedidosDetalles values(default,1,  53.40, 6,3);


Select * From pedidoscabeceras;


