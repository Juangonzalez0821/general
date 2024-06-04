// Importa los módulos y funciones necesarios de Angular.
import { mergeApplicationConfig, ApplicationConfig } from '@angular/core';
import { provideServerRendering } from '@angular/platform-server';
import { appConfig } from './app.config'; // Importa la configuración del cliente desde app.config.

// Define la configuración específica para el lado del servidor.
const serverConfig: ApplicationConfig = {
  providers: [
    provideServerRendering() // Provee el rendering del lado del servidor.
  ]
};

// Combina la configuración del cliente (appConfig) y del servidor (serverConfig) en una única configuración (config).
export const config = mergeApplicationConfig(appConfig, serverConfig);
