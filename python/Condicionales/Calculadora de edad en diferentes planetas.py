# Tabla de conversión de años terrestres a años en otros planetas
conversion_factor = {
    'Mercurio': 0.2408467,
    'Venus': 0.61519726,
    'Marte': 1.8808158,
    'Jupiter': 11.862615,
    'Saturno': 29.447498,
    'Urano': 84.016846,
    'Neptuno': 164.79132
}

# Solicitar la edad en la Tierra y el planeta seleccionado
edad_tierra = float(input("Ingresa tu edad en la Tierra: "))
planeta = input("Selecciona un planeta (Mercurio, Venus, Marte, Júpiter, Saturno, Urano, Neptuno): ")

# Verificar si el planeta ingresado está en la tabla de conversión
if planeta in conversion_factor:
    edad_equivalente = edad_tierra / conversion_factor[planeta]
    print(f"Tu edad en {planeta} es aproximadamente {edad_equivalente:.2f} años.")
else:
    print("Planeta no válido. Por favor, selecciona un planeta del sistema solar.")
