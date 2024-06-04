// Importa el decorador Component y RouterOutlet de Angular Core para la definición de componentes y enrutamiento.
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

// Define el componente raíz de la aplicación.
@Component({
  selector: 'app-root', // Selector del componente en el HTML.
  standalone: true, // Define si el componente es independiente o forma parte de otro componente.
  imports: [RouterOutlet], // Importa el RouterOutlet para el enrutamiento.
  templateUrl: './app.component.html', // Ubicación del archivo HTML del componente.
  styleUrls: ['./app.component.css'] // Ubicación de los archivos CSS de estilos del componente.
})
export class AppComponent {
  title = 'MoviesApp'; // Propiedad que define el título de la aplicación.
}
