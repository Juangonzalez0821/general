import math

# Solicitar los coeficientes a, b y c al usuario
a = float(input("Ingresa el coeficiente a: "))
b = float(input("Ingresa el coeficiente b: "))
c = float(input("Ingresa el coeficiente c: "))

# Crear una cadena de texto que representa la ecuación cuadrática
ecuacion = f"{a}*x^2 + {b}*x + {c}=0"

# Calcular el discriminante (parte dentro de la raíz cuadrada)
discriminante = b**2 - 4*a*c

# Inicializar las soluciones como una cadena vacía
soluciones_reales = None
soluciones_complejas = None

# Verificar el valor del discriminante
if discriminante > 0:
    # Dos soluciones reales diferentes
    x1 = (-b + math.sqrt(discriminante)) / (2*a)
    x2 = (-b - math.sqrt(discriminante)) / (2*a)
    soluciones_reales = f"x1 = {x1}, x2 = {x2}"
elif discriminante == 0:
    # Una única solución real (raíz doble)
    x = -b / (2*a)
    soluciones_reales = f"x = {x}"
else:
    # Soluciones complejas
    real_part = -b / (2*a)
    imaginary_part = math.sqrt(abs(discriminante)) / (2*a)
    soluciones_complejas = f"x1 = {real_part} + {imaginary_part}i, x2 = {real_part} - {imaginary_part}i"

# Imprimir el resultado en el formato deseado
print("\nTu problema matemático:")
print(ecuacion)
print("Aquí tienes el conjunto de soluciones de tu problema matemático:")

# Mostrar las soluciones reales si existen
if soluciones_reales:
    print(f"Soluciones reales: {{{soluciones_reales}}}")

# Mostrar las soluciones complejas si existen
if soluciones_complejas:
    print(f"Soluciones complejas: {{{soluciones_complejas}}}")

# Imprimir la resolución de la ecuación
print("\nMathepower calculó lo siguiente:")
print(ecuacion)
print(f"Entonces, a es {a}, b es {b} y c es {c}.")

# Si hay soluciones reales, mostrar los cálculos
if discriminante >= 0:
    print("\nInserta en la fórmula cuadrática:")
    print(f"x_1 = (-b + √(b² - 4ac)) / (2a)")
    print(f"x_1 = (-({b}) + √({b}² - 4*{a}*{c})) / (2*{a})")
    print("Simplifica:")
    # Cálculos para x1
    print(f"x_1 = ({-b} + √({discriminante})) / ({2*a})")
    print(f"x_1 = ({-b + math.sqrt(discriminante)}) / ({2*a})")

if discriminante > 0:
    print("\nSegunda solución:")
    print(f"x_2 = (-b - √(b² - 4ac)) / (2a)")
    print(f"x_2 = (-({b}) - √({b}² - 4*{a}*{c})) / (2*{a})")
    print("Simplifica:")
    # Cálculos para x2
    print(f"x_2 = ({-b} - √({discriminante})) / ({2*a})")
    print(f"x_2 = ({-b - math.sqrt(discriminante)}) / ({2*a})")

# Mostrar el conjunto de soluciones nuevamente al final
if soluciones_reales or soluciones_complejas:
    print("\nConjunto de soluciones:")
    if soluciones_reales:
        print(f"Soluciones reales: {{{soluciones_reales}}}")
    if soluciones_complejas:
        print(f"Soluciones complejas: {{{soluciones_complejas}}}")
else:
    print("\nNo hay soluciones reales ni complejas.")
