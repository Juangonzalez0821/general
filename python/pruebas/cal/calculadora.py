import tkinter as tk

# Función para actualizar la pantalla de la calculadora
def actualizar_pantalla(valor):
    pantalla.insert(tk.END, valor)

# Función para calcular el resultado
def calcular():
    try:
        expresion = pantalla.get()
        resultado = eval(expresion)
        pantalla.delete(0, tk.END)
        pantalla.insert(tk.END, resultado)
    except Exception as e:
        pantalla.delete(0, tk.END)
        pantalla.insert(tk.END, "Error")

# Función para borrar la pantalla
def borrar():
    pantalla.delete(0, tk.END)

# Configuración de la ventana
ventana = tk.Tk()
ventana.title("Calculadora")

# Pantalla
pantalla = tk.Entry(ventana, width=30)
pantalla.grid(row=0, column=0, columnspan=4)

# Botones
botones = [
    '7', '8', '9', '/',
    '4', '5', '6', '*',
    '1', '2', '3', '-',
    '0', '.', '=', '+'
]

fila = 1
columna = 0

for boton_texto in botones:
    if boton_texto == '=':
        tk.Button(ventana, text=boton_texto, command=calcular).grid(row=fila, column=columna)
    elif boton_texto == 'C':
        tk.Button(ventana, text=boton_texto, command=borrar).grid(row=fila, column=columna)
    else:
        tk.Button(ventana, text=boton_texto, command=lambda valor=boton_texto: actualizar_pantalla(valor)).grid(row=fila, column=columna)
    columna += 1
    if columna > 3:
        columna = 0
        fila += 1

ventana.mainloop()
