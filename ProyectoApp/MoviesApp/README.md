# Guía de Instalación y Configuración de Node.js y Angular

Este documento proporciona una guía paso a paso para instalar Node.js y Angular, así como configurar un proyecto Angular en tu sistema.

## Instalación de Node.js (v20.14.0)

1. **Descargar Node.js:**
   - Visita la página oficial de descargas de Node.js.
   - Descarga la versión v20.14.0 correspondiente a tu sistema operativo.

2. **Instalar Node.js:**
   - Ejecuta el instalador descargado y sigue las instrucciones proporcionadas.
   - Verifica la instalación abriendo una terminal y ejecutando el siguiente comando:
     ```
     node -v
     ```
     Deberías ver v20.14.0 como resultado.

## Instalación de Angular CLI (v17.3.8)

1. **Instalar Angular CLI:**
   - Abre una terminal y ejecuta el siguiente comando para instalar Angular CLI en la versión especificada:
     ```
     npm install -g @angular/cli@17.3.8
     ```

2. **Verificar la instalación:**
   - Ejecuta el siguiente comando para asegurarte de que la versión 17.3.8 de Angular CLI esté instalada:
     ```
     ng version
     ```

## Configuración del Proyecto Angular

1. **Navegar al Directorio del Proyecto:**
   - Abre una terminal o símbolo del sistema.
   - Usa el comando cd para dirigirte al directorio donde se encuentra tu proyecto Angular. Por ejemplo:
     ```
     cd path/to/your/angular/project
     ```

2. **Servir la Aplicación Angular:**
   - Ejecuta el siguiente comando para iniciar el servidor de desarrollo de tu aplicación Angular:
     ```
     ng serve
     ```

3. **Abrir la Aplicación en el Navegador:**
   - Una vez que el servidor de desarrollo esté en funcionamiento, verás un enlace en la terminal similar a http://localhost:4200/.
   - Mantén presionada la tecla Ctrl y haz clic en el enlace para abrir la aplicación en tu navegador predeterminado.

Siguiendo estos pasos, tendrás Node.js y Angular correctamente instalados y configurados, y podrás servir y visualizar tu aplicación Angular en un navegador web.
