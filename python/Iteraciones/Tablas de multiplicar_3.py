# Usar un bucle for para iterar a través de los multiplicadores del 1 al 10
for multiplicador in range(1, 11, 2):  # Incrementar de 2 en 2 para seleccionar tablas impares
    # Imprimir el encabezado de las tablas lado a lado


    # Usar un bucle interno para calcular e imprimir las filas de las tablas
    for multiplicando in range(1, 11):
        resultado1 = multiplicador * multiplicando
        resultado2 = (multiplicador + 1) * multiplicando
        print(f"{multiplicador} x {multiplicando} = {resultado1}".ljust(15), end="")
        print(f"{multiplicador + 1} x {multiplicando} = {resultado2}".ljust(15))

    # Añadir una línea en blanco para separar las tablas
    print()
