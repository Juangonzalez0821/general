# Solicitar al usuario el monto inicial, tasa de interés y número de meses
monto_inicial = float(input("Ingrese el monto inicial de la inversión: "))
tasa_interes = float(input("Ingrese la tasa de interés (en porcentaje): "))
num_meses = int(input("Ingrese el número de meses: "))

# Convertir la tasa de interés de porcentaje a decimal
tasa_interes_decimal = tasa_interes / 100

# Calcular el saldo acumulado al final de cada mes
for mes in range(1, num_meses + 1):
    # Fórmula del interés simple: Saldo = Monto Inicial + (Monto Inicial * Tasa de Interés * Mes)
    saldo = monto_inicial + (monto_inicial * tasa_interes_decimal * mes)
    print(f"Mes {mes}: Saldo acumulado = {saldo:.2f}")

# Mostrar el saldo final
print(f"Saldo final después de {num_meses} meses: {saldo:.2f}")

