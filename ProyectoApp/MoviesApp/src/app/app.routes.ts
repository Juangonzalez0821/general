// Importa el módulo Routes de Angular para definir las rutas de la aplicación.
import { Routes } from '@angular/router';

// Importa los componentes necesarios para cada ruta.
import { ListMoviesComponent } from './pages/list-movies/list-movies.component';
import { MoviesDetailsComponent } from './pages/movies-details/movies-details.component';

// Define las rutas de la aplicación utilizando el objeto Routes.
export const routes: Routes = [
  // Ruta raíz que muestra el componente ListMoviesComponent.
  { path: '', component: ListMoviesComponent },

  // Ruta que muestra el detalle de una película específica usando el componente MoviesDetailsComponent.
  { path: 'movie/:id', component: MoviesDetailsComponent },

  // Ruta que muestra el componente ListMoviesComponent.
  { path: 'list-movies', component: ListMoviesComponent }
];
