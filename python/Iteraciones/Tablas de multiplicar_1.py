# Inicializar la variable para el multiplicador
multiplicador = 1

# Usar un bucle while para iterar a través de los multiplicadores del 1 al 10
while multiplicador <= 10:
    # Imprimir el encabezado de la tabla


    # Inicializar la variable para el multiplicando
    multiplicando = 1

    # Usar un bucle while interno para calcular e imprimir las filas de la tabla
    while multiplicando <= 10:
        resultado = multiplicador * multiplicando
        print(f"{multiplicador} x {multiplicando} = {resultado}")
        multiplicando += 1

    # Añadir una línea en blanco para separar las tablas
    print()

    # Incrementar el multiplicador para pasar a la siguiente tabla
    multiplicador += 1
