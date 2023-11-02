Algoritmo sin_titulo
	Escribir '¿Qué proceso desea realizar?'
	Escribir '1. Actualizar Inventario.'
	Escribir '2. agregar venta '
	Escribir "3. ver inventario"
	Escribir '4. Terminar proceso.'
	Escribir 'Digite la opción:'
	Leer opc
	Según opc Hacer
		1:
			Escribir 'Actualizar inventario.'
			Escribir '-----------------------'
			Escribir 'que desea hacer?'
			Escribir '1 agragar producto'
			Escribir '2 modificar producto'
			Escribir '3 actualizar producto.'
			Leer opc
			Según opc Hacer
				1:
					Escribir '1 agragar producto'
					Escribir 'ingrese el nombre'
					Escribir 'ingrese el id'
					Escribir 'ingrese el precio'
					Escribir 'cantidad de producto'
					Escribir 'fecha vencimiento del lote'
				2:
					Escribir '2 modificar producto'
					Escribir 'escriba el id del producto'
					Escribir 'ingrese el nombre'
					Escribir 'ingrese el id'
					Escribir 'ingrese el precio'
					Escribir 'fecha vencimiento del lote'
				3:
					Escribir '3 actualizar producto.'
					Escribir 'escriba el id del producto'
					Escribir 'ingrese el id'
					Escribir 'ingrese el precio'
					Escribir 'fecha vencimiento del lote'
			FinSegún
		2:
			Escribir '2. agregar venta '
			Escribir 'ingrese el id del vendedor'
			Escribir 'ingrese el id del prducto'
			Escribir 'ingrese la cantidad'
			Escribir 'fecha '
		3:
			Escribir 'mostrar el inventario'
		4:
			Escribir 'fin del proceso'
		De Otro Modo:
			Escribir "la opcion ingresada es incorresta"
	FinSegún
FinAlgoritmo
