/* Crear base de datos */
create database DBRegistros
go --Ejecuta todos los comandos anteriores
--Poner en uso la base de datos
use DBRegistros
go
--Crear tabla
create table Categoria(
	codigoCat int primary key identity(1,1)
	, nombreCat nvarchar(60) not null
	, activoCat bit default 'true') 
	go 
create table Producto(
	codigoProd int primary key identity (1,1)
	, nombreProd nvarchar(50) not null
	, precioProd numeric(18,2) 
	, categoriaProd int foreign key references Categoria(codigoCat)
	, activoProd bit default 1)
	go
	insert into Categoria(nombreCat)values('Electrónicos')
	go
	select *from Categoria
	insert into Categoria(nombreCat)values('Ropa')
	, ('Embutidos') 
	, ('Bebidas +18 ')
	
	delete from Categoria where codigocat >= 6
	delete from Categoria where codigocat = 2

	

		
	 
