from cx_Freeze import setup, Executable

# Define los ejecutables y sus configuraciones
executables = [
    Executable("fin.py", base=None)  # Reemplaza "fin.py" con el nombre de tu archivo Python
]

# Configura la información del proyecto
setup(
    name="NombreDelEjecutable",
    version="1.0",
    description="Descripción de tu programa",
    executables=executables
)
