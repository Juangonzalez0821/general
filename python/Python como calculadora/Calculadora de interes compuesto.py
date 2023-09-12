# Solicitar al usuario que ingrese los datos de la inversión
monto_inversion = float(input("Ingrese el monto de la inversión inicial: $"))
tasa_interes_anual = float(input("Ingrese la tasa de interés anual (%): "))
periodo_tiempo = float(input("Ingrese el período de tiempo en años: "))

# Convertir la tasa de interés a decimal
tasa_interes_decimal = tasa_interes_anual / 100

# Calcular la ganancia y el dinero total acumulado
ganancia = monto_inversion * (1 + tasa_interes_decimal) ** periodo_tiempo - monto_inversion
total_acumulado = monto_inversion + ganancia

# Mostrar los resultados
print("\nDatos de la inversión:")
print(f"Monto de la inversión inicial: ${monto_inversion:.2f}")
print(f"Tasa de interés anual: {tasa_interes_anual}%")
print(f"Período de tiempo en años: {periodo_tiempo}")

print("\nResultados:")
print(f"Ganancia total: ${ganancia:.2f}")
print(f"Dinero total acumulado: ${total_acumulado:.2f}")
