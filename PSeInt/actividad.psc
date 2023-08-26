Algoritmo actividad

    // Se le pregunta al usuario si desea calcular el área o el volumen
    escribir "?Quieres saber el area o el volumen?"
    escribir "1 Selecciona el area"
    escribir "2 Selecciona el volumen"
    leer e
    
    Si e = 1 Entonces
        // Si el usuario eligió calcular el área
        escribir "Elige la figura geometrica"
        escribir "1. Rectangulo"
        escribir "2. Cuadrado"
        escribir "3. Triangulo"
        escribir "4. Trapecio"
        escribir "5. Rombo"
        escribir "6. Circunferencia"
        leer opc
        
        Segun opc Hacer
            1:
                // Cálculos para el área del rectángulo
                escribir "Ingrese la medida del largo"
                leer L1
                escribir "Ingrese la medida del ancho"
                leer L2
                area = L2 * L1
                escribir "El area del Rectangulo es: ", area
            2:
                // Cálculos para el área del cuadrado
                escribir "Ingrese la medida de un lado"
                leer L1
                area = L1 * L1
                escribir "El area del Cuadrado es: ", area
            3:
                // Cálculos para el área del triángulo
                escribir "Ingrese la medida de la base"
                leer L1
                escribir "Ingrese la medida de la altura"
                leer L2
                area = (1/2) * (L2 * L1)
                escribir "El area del Triangulo es: ", area
            4:
                // Cálculos para el área del trapecio
                escribir "Ingrese la medida de la base mayor"
                leer L1
                escribir "Ingrese la medida de la base menor"
                leer L2
                escribir "Ingrese la medida de la altura"
                leer L3
                area = (1/2) * ((L2 + L1) * L3)
                escribir "El area del Trapecio es: ", area
            5:
                // Cálculos para el área del rombo
                escribir "Ingrese la medida de la diagonal mayor"
                leer L1
                escribir "Ingrese la medida de la diagonal menor"
                leer L2
                area = (L2 * L1) / 2
                escribir "El area del Rombo es: ", area
            6:
                // Cálculos para el área de la circunferencia
                escribir "Ingrese la medida del radio"
                leer L1
                area = PI * (L1 * L1)
                escribir "El area de la Circunferencia es: ", area
            De Otro Modo:
                escribir "Elegiste una opcion incorrecta"
        Fin Segun
        
    SiNo
        Si e = 2 Entonces
            // Si el usuario eligió calcular el volumen
            escribir "Elige la figura geometrica"
            escribir "1. Cubo"
            escribir "2. Cilindro"
            escribir "3. Cono"
            escribir "4. Piramide Base Cuadrada"
            escribir "5. Esfera"
            leer opc
            
            Segun opc Hacer
                1:
                    // Cálculos para el volumen del cubo
                    escribir "Ingrese la medida de un lado"
                    leer L1
                    volumen = L1 * L1 * L1
                    escribir "El Volumen del Cubo es: ", volumen
                2:
                    // Cálculos para el volumen del cilindro
                    escribir "Ingrese la medida de la altura"
                    leer L1
                    escribir "Ingrese la medida del radio"
                    leer L2
                    volumen = PI * L1 * (L2 * L2)
                    escribir "El Volumen del Cilindro es: ", volumen
                3:
                    // Cálculos para el volumen del cono
                    escribir "Ingrese la medida de la altura"
                    leer L1
                    escribir "Ingrese la medida del radio"
                    leer L2
                    volumen = (1/3) * PI * (L2 * L2) * L1
                    escribir "El Volumen del Cono es: ", volumen
                4:
                    // Cálculos para el volumen de la pirámide de base cuadrada
                    escribir "Ingrese la medida de la altura"
                    leer L1
                    escribir "Ingrese la medida de un lado de la base"
                    leer L2
                    volumen = (1/3) * (L2 * L2) * L1
                    escribir "El Volumen de una Piramide Base Cuadrada es: ", volumen
                5:
                    // Cálculos para el volumen de la esfera
                    escribir "Ingrese la medida del radio"
                    leer L3
                    volumen = (4/3) * PI * (L3 * L3 * L3)
                    escribir "El Volumen de la Esfera es: ", volumen
                De Otro Modo:
                    escribir "Elegiste una opcion incorrecta"
            Fin Segun
        
        SiNo
            // Si el usuario no eligió calcular área ni volumen correctamente
            Escribir "Elegiste una opcion incorrecta"
        Fin Si
        
    Fin Si

FinAlgoritmo

