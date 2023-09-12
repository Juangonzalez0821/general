# Solicitar al usuario que ingrese un número natural
numero = int(input("Ingrese un número natural: "))

# Verificar si el número es primo
if numero <= 1:
    # Si el número es menor o igual a 1, no es primo
    es_primo = False
else:
    # Inicializar la variable 'es_primo' como Verdadero por defecto
    es_primo = True
    
    # Comenzar un bucle que recorre desde 2 hasta un número menos que 'numero'
    for i in range(2, numero):
        # Comprobar si 'numero' es divisible exactamente por 'i'
        if (numero % i) == 0:
            # Si es divisible, establecer 'es_primo' como Falso y salir del bucle
            es_primo = False
            break

# Mostrar el resultado
if es_primo:
    # Si 'es_primo' es Verdadero, imprimir que 'numero' es un número primo
    print(f"{numero} es un número primo.")
else:
    # Si 'es_primo' es Falso, imprimir que 'numero' no es un número primo
    print(f"{numero} no es un número primo.")
