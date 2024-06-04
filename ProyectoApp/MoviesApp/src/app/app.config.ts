// Importa los módulos y funciones necesarios de Angular y otras librerías.
import { ApplicationConfig, mergeApplicationConfig } from '@angular/core';
import { provideRouter } from '@angular/router';
import { provideHttpClient, withFetch } from '@angular/common/http';
import { provideClientHydration } from '@angular/platform-browser';
import { provideServerRendering } from '@angular/platform-server';
import { routes } from './app.routes'; // Importa las rutas de la aplicación.

// Define la configuración de la aplicación para el cliente.
export const appConfig: ApplicationConfig = {
  providers: [
    provideRouter(routes), // Provee las rutas de la aplicación.
    provideHttpClient(withFetch()), // Provee el cliente HTTP utilizando Fetch API.
    provideClientHydration() // Provee la hidratación del lado del cliente.
  ]
};

// Define la configuración de la aplicación para el servidor.
const serverConfig: ApplicationConfig = {
  providers: [
    provideServerRendering() // Provee el rendering del lado del servidor.
  ]
};

// Combina la configuración del cliente y del servidor en una única configuración.
export const config = mergeApplicationConfig(appConfig, serverConfig);
