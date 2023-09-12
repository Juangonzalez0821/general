# Usar un bucle for para iterar a través de los multiplicadores del 1 al 10
for multiplicador in range(1, 11):
    # Imprimir el encabezado de la tabla


    # Usar un bucle for interno para calcular e imprimir las filas de la tabla
    for multiplicando in range(1, 11):
        resultado = multiplicador * multiplicando
        print(f"{multiplicador} x {multiplicando} = {resultado}")

    # Añadir una línea en blanco para separar las tablas
    print()
