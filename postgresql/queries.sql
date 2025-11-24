select * from categorias;
select * from clientes;
select * from compras;

select p.nombre, cp.cantidad, p.precio_venta, cp.total from compras_productos cp
inner join compras c on c.id_compra = cp.id_compra
inner join productos p on cp.id_producto = p.id_producto
where c.id_cliente = '4546221' and c.id_compra = 1 ;