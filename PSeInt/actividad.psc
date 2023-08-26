Algoritmo actividad
	
	escribir "?quieres saber el area o el volumen? "
	escribir "1 selecciona el area "
	escribir "2 selecciona el volumen "
	leer e
	Si e = 1 Entonces
		escribir "elige la  figura geometrica"
		escribir "1. Rectangulo"
		escribir "2. Cuadrado"
		escribir "3. Triangulo"
		escribir "4. Trapecio"
		escribir "5. Rombo"
		escribir "6. Circunferencia"
		leer opc
		
		Segun opc Hacer
			1:
				escribir "ingrese la medida del lado 1"
				leer L1
				escribir "ingrese la medida del lado 2"
				leer L2
				area =L2*L1
				escribir "el area del Rectangulo es: " area
			2:
				escribir "ingrese la medida de un lado"
				leer L1
				area =L1*L1
				escribir "el area del Cuadrado es: " area
			3:
				escribir "ingrese la medida de la base"
				leer L1
				escribir "ingrese la medida de la altura"
				leer L2
				area =(1/2)*(L2*L1)
				escribir "el area del Triangulo es: " area
			4:
				escribir "ingrese la medida de la base mayor"
				leer L1
				escribir "ingrese la medida de la base menor"
				leer L2
				escribir "ingrese la medida de la altura"
				leer L3
				area =(1/2)*((L2+L1)*L3)
				escribir "el area del Trapecio es: " area
			5:
				escribir "ingrese la medida de la diagonal mayor"
				leer L1
				escribir "ingrese la medida de la diagonal menor"
				leer L2
				area =((L2*L1)/2)
				escribir "el area del Rombo es: " area
			6:
				escribir "ingrese la medida del radio"
				leer L1
				area = PI *(L1*L1)
				escribir "el area de la Circunferencia es: " area
			De Otro Modo:
				escribir "elegiste una opcion incorrecta"
		Fin Segun
	SiNo
		Si e = 2 Entonces
			escribir "elige la  figura geometrica"
			escribir "1. Cubo"
			escribir "2. Cilindro"
			escribir "3. Cono"
			escribir "4. Piramide Base Cuadrada"
			escribir "5. Esfera"
			leer opc
			
			Segun opc Hacer
				1:
					escribir "ingrese la medida de un lado"
					leer L1
					volumen =L1*L1*L1
					escribir "el Volumen del Cubo es: " volumen
				2:
					escribir "ingrese la medida de la altura"
					leer L1
					escribir "ingrese la medida del radio"
					leer L2
					volumen =PI*L1*(L2*L2)
					escribir "el Volumen del Cilindro es: " volumen
				3:
					escribir "ingrese la medida de la altura"
					leer L1
					escribir "ingrese la medida del radio"
					leer L2
					volumen =(((PI*(L2*L2))*L1)/3)
					escribir "el Volumen del Cono es: " volumen
				4:
					escribir "ingrese la medida de la altura"
					leer L1
					escribir "ingrese la medida de un lado de la base"
					leer L2
					volumen =(((L2*L2)*L1)/3)
					escribir "el Volumen de una Piramide Base Cuadrada es: " volumen					
				5:
					escribir "ingrese la medida del radio"
					leer L3
					volumen =((4/3)*(PI*(L3*L3*L3)))
					escribir "el Volumen del Cono es: " volumen
				De Otro Modo:
					escribir "elegiste una opcion incorrecta"
			Fin Segun
		SiNo
			Escribir "elegiste una opcion incorrecta"
		Fin Si
	Fin Si
FinAlgoritmo
