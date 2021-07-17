Create Table Provincias(
	id int primary key auto_increment not null ,
	nombre varchar (100) not null
);

Create Table Ciudades (
	id int primary key auto_increment not null ,
	nombre varchar (100) not null,
    provincia_id int not null,
    foreign key (provincia_id) References Provincias (id)	
);

Create Table Categorias(
	id int primary key auto_increment not null ,
	nombre varchar (100) not null,
    estado char not null,
	descripcion varchar (250) not null
);

Create Table SubCategorias(
	id int primary key auto_increment not null ,
	nombre varchar (100) not null,
    estado char not null,
	descripcion varchar (250) not null,
	categoria_id int not null,
	foreign key (categoria_id) References Categorias (id)		
);

Create Table Marcas(
	id int primary key auto_increment not null ,
	nombre Varchar (100) not null,
	origen char not null
);

Create Table Personas( 
	id int primary key auto_increment not null ,
	cedula varchar (13) unique null, 
    nombres varchar (100) not null,
	apellidos Varchar (100) not null,
	telefono Varchar (10) not null,
	email Varchar (250) not null,
	contrasena Varchar (250) not null,
	rol char not null,
    estado char not null
);
Create Table Productos(
	id int primary key auto_increment not null,
	codigo VARCHAR (15) unique not null,
	nombre Varchar (300) not null,
	descripcion Varchar(1000) not null,
	precioC Double not null ,
	precioD Double not null,
	ancho Double null,
	alto Double null,
	profundidad double null,
	color Varchar(100) null,
	stock int null,
	descuento double null,
    estado char not null,
	subcategoria_id int not null,
	marca_id int not null,
	foreign key(subcategoria_id) References SubCategorias(id),	
	foreign key(marca_id) References Marcas(id)	
);

Create Table Imagenes(
	id int primary key auto_increment not null ,
	url Varchar (300) not null,
    producto_id int not null ,
    foreign key (producto_id) references Productos (id)
);

Create Table PedidosCabeceras(
	id int primary key auto_increment not null ,
    orden varchar (15) unique,
    fecha date not null,
    direccion varchar (500) not null,
    referencia varchar (500) null,
    subtotal double not null,
    total double not null , 
    entrega char not null,
    pago char not null,
    estado char not null,
    observaciones varchar(500) ,
    persona_id int not null,
    ciudad_id int not null,
    foreign key(ciudad_id) references Ciudades(id),
    foreign key (persona_id) references Personas(id)
); 

Create Table PedidosDetalles(
	id int primary key auto_increment not null ,
    cantidad int not null,
    subtotal double not null,
    producto_id int not null,
    pedidoCabecera_id int not null,
    foreign key (producto_id) references Productos(id),
    foreign key (pedidoCabecera_id ) references PedidosCabeceras(id)
); 