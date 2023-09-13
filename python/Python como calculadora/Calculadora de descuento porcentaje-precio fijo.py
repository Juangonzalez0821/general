# Solicitar al usuario el precio original con IVA incluido
from numpy import double


precio_original_con_iva = double(input("Ingrese el precio original del producto con IVA incluido: $"))

# Solicitar al usuario elegir entre porcentaje de descuento o monto de descuento fijo
opcion_descuento = input("¿Desea aplicar un porcentaje de descuento o un monto de descuento fijo? (porcentaje/monto): ").lower()

# Calcular el precio sin IVA
precio_sin_iva = precio_original_con_iva / 1.19  # 19% de IVA

# Calcular el precio final después de aplicar el descuento
if opcion_descuento == "porcentaje":
    porcentaje_descuento = double(input("Ingrese el porcentaje de descuento (%): "))
    precio_despues_descuento = precio_sin_iva * (1 - (porcentaje_descuento / 100))
elif opcion_descuento == "monto":
    monto_descuento = double(input("Ingrese el monto de descuento: $"))
    precio_despues_descuento = precio_sin_iva - monto_descuento
else:
    print("Opción de descuento no válida. Por favor, ingrese 'porcentaje' o 'monto'.")
    exit()

# Mostrar el resultado
print("\nResumen de la compra:")
print(f"Precio original con IVA: ${precio_original_con_iva:.2f}")
print(f"Precio sin IVA: ${precio_sin_iva:.2f}")
print(f"Precio después del descuento: ${precio_despues_descuento:.2f}")
