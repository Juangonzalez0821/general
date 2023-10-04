import tkinter as tk
import sqlite3
import datetime

# Función para agregar un ingreso
def agregar_ingreso():
    ingreso = float(entrada_ingreso.get())
    categoria = entrada_categoria.get()
    conn = sqlite3.connect("finanzas.db")
    cursor = conn.cursor()
    cursor.execute("INSERT INTO ingresos (cantidad, categoria) VALUES (?, ?)", (ingreso, categoria))
    conn.commit()
    conn.close()
    actualizar_saldo()

# Función para agregar un gasto
def agregar_gasto():
    gasto = float(entrada_gasto.get())
    categoria = entrada_categoria_gasto.get()
    conn = sqlite3.connect("finanzas.db")
    cursor = conn.cursor()
    cursor.execute("INSERT INTO gastos (cantidad, categoria) VALUES (?, ?)", (gasto, categoria))
    conn.commit()
    conn.close()
    actualizar_saldo()

# Función para consultar gastos
def consultar_gastos(periodo):
    hoy = datetime.date.today()
    if periodo == "Horas":
        fecha_limite = hoy - datetime.timedelta(hours=int(entrada_periodo.get()))
    elif periodo == "Días":
        fecha_limite = hoy - datetime.timedelta(days=int(entrada_periodo.get()))
    elif periodo == "Semanas":
        fecha_limite = hoy - datetime.timedelta(weeks=int(entrada_periodo.get()))
    elif periodo == "Meses":
        fecha_limite = hoy - datetime.timedelta(days=int(entrada_periodo.get()) * 30)
    else:
        return

    conn = sqlite3.connect("finanzas.db")
    cursor = conn.cursor()
    cursor.execute("SELECT cantidad, categoria FROM gastos WHERE fecha >= ?", (fecha_limite,))
    gastos = cursor.fetchall()
    conn.close()

    resultado.config(text="Gastos en los últimos {} {}: \n".format(entrada_periodo.get(), periodo))
    for gasto in gastos:
        resultado.config(text=resultado.cget("text") + "Cantidad: {}, Categoría: {}\n".format(gasto[0], gasto[1]))

# Función para actualizar el saldo total
def actualizar_saldo():
    conn = sqlite3.connect("finanzas.db")
    cursor = conn.cursor()
    cursor.execute("SELECT SUM(cantidad) FROM ingresos")
    ingresos_result = cursor.fetchone()
    ingresos = ingresos_result[0] if ingresos_result[0] is not None else 0.0
    cursor.execute("SELECT SUM(cantidad) FROM gastos")
    gastos_result = cursor.fetchone()
    gastos = gastos_result[0] if gastos_result[0] is not None else 0.0
    conn.close()
    saldo = ingresos - gastos
    saldo_total.config(text="Saldo Total: {:.2f}".format(saldo))

# Configuración de la ventana
ventana = tk.Tk()
ventana.title("Gestión Financiera")

# Ingresos
etiqueta_ingreso = tk.Label(ventana, text="Ingresos:")
etiqueta_ingreso.pack()
entrada_ingreso = tk.Entry(ventana)
entrada_ingreso.pack()
etiqueta_categoria = tk.Label(ventana, text="Categoría:")
etiqueta_categoria.pack()
entrada_categoria = tk.Entry(ventana)
entrada_categoria.pack()
boton_ingreso = tk.Button(ventana, text="Agregar Ingreso", command=agregar_ingreso)
boton_ingreso.pack()

# Gastos
etiqueta_gasto = tk.Label(ventana, text="Gastos:")
etiqueta_gasto.pack()
entrada_gasto = tk.Entry(ventana)
entrada_gasto.pack()
etiqueta_categoria_gasto = tk.Label(ventana, text="Categoría:")
etiqueta_categoria_gasto.pack()
entrada_categoria_gasto = tk.Entry(ventana)
entrada_categoria_gasto.pack()
boton_gasto = tk.Button(ventana, text="Agregar Gasto", command=agregar_gasto)
boton_gasto.pack()

# Consulta de Gastos
etiqueta_periodo = tk.Label(ventana, text="Consultar Gastos en los últimos:")
etiqueta_periodo.pack()
entrada_periodo = tk.Entry(ventana)
entrada_periodo.pack()
boton_consulta = tk.Button(ventana, text="Consultar Gastos", command=lambda: consultar_gastos(opcion_periodo.get()))
boton_consulta.pack()

# Opciones de período
opcion_periodo = tk.StringVar()
opcion_periodo.set("Días")
radio_horas = tk.Radiobutton(ventana, text="Horas", variable=opcion_periodo, value="Horas")
radio_dias = tk.Radiobutton(ventana, text="Días", variable=opcion_periodo, value="Días")
radio_semanas = tk.Radiobutton(ventana, text="Semanas", variable=opcion_periodo, value="Semanas")
radio_meses = tk.Radiobutton(ventana, text="Meses", variable=opcion_periodo, value="Meses")
radio_horas.pack()
radio_dias.pack()
radio_semanas.pack()
radio_meses.pack()

# Saldo Total
saldo_total = tk.Label(ventana, text="Saldo Total: 0.0")
saldo_total.pack()

# Resultado de la consulta
resultado = tk.Label(ventana, text="")
resultado.pack()

# Crear base de datos SQLite
conn = sqlite3.connect("finanzas.db")
cursor = conn.cursor()
cursor.execute('''CREATE TABLE IF NOT EXISTS ingresos (cantidad REAL, categoria TEXT, fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP)''')
cursor.execute('''CREATE TABLE IF NOT EXISTS gastos (cantidad REAL, categoria TEXT, fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP)''')

conn.commit()
conn.close()

# Actualizar saldo al inicio
actualizar_saldo()

ventana.mainloop()
