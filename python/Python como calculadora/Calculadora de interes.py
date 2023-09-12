# Solicitar al usuario que ingrese el monto de la inversión, la tasa de interés y el período de tiempo
monto_inversion = float(input("Ingrese el monto de la inversión: "))
tasa_interes = float(input("Ingrese la tasa de interés anual (%): "))
periodo_tiempo = float(input("Ingrese el período de tiempo (en años): "))

# Calcular el interés simple
interes_simple = (monto_inversion * tasa_interes / 100) * periodo_tiempo

# Calcular el dinero acumulado
dinero_acumulado = monto_inversion + interes_simple

# Mostrar los resultados
print("\nResumen de la inversión:")
print(f"Monto de la inversión: ${monto_inversion:.2f}")
print(f"Tasa de interés anual: {tasa_interes}%")
print(f"Período de tiempo: {periodo_tiempo} años")
print(f"Ganancia por interés simple: ${interes_simple:.2f}")
print(f"Dinero acumulado: ${dinero_acumulado:.2f}")
