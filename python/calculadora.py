import tkinter as tk

# Función para agregar texto a la entrada
def agregar_texto(valor):
    entrada.insert(tk.END, valor)

# Función para borrar todo el contenido de la entrada
def borrar():
    entrada.delete(0, tk.END)

# Función para calcular el resultado
def calcular():
    try:
        expresion = entrada.get()
        resultado = eval(expresion)
        entrada.delete(0, tk.END)
        entrada.insert(tk.END, str(resultado))
    except Exception as e:
        entrada.delete(0, tk.END)
        entrada.insert(tk.END, "Error")

# Configuración de la ventana principal
ventana = tk.Tk()
ventana.title("Calculadora")

# Crear la entrada de texto
entrada = tk.Entry(ventana)
entrada.grid(row=0, column=0, columnspan=4)

# Crear los botones de números y operadores
botones = [
    '7', '8', '9', '/',
    '4', '5', '6', '*',
    '1', '2', '3', '-',
    '0', '.', '=', '+',
    'C'  # Botón de borrado
]

fila = 1
columna = 0

for boton_texto in botones:
    tk.Button(ventana, text=boton_texto, width=5, height=2,
              command=lambda t=boton_texto: agregar_texto(t) if t != '=' else calcular() if t != 'C' else borrar()).grid(row=fila, column=columna)
    columna += 1
    if columna > 3:
        columna = 0
        fila += 1

# Ejecutar la aplicación
ventana.mainloop()
