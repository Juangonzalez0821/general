# Solicitar al usuario que ingrese un año
anno = int(input("Ingrese un año: "))

# Verificar si es un año bisiesto
if (anno % 4 == 0 and anno % 100 != 0) or (anno % 400 == 0):
    print(f"{anno} es un año bisiesto.")
else:
    print(f"{anno} no es un año bisiesto.")
2012