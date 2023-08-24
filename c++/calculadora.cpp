#include <iostream> // Incluye la biblioteca iostream para entrada/salida estándar
using namespace std; // Permite usar los elementos de la biblioteca estándar sin el prefijo "std::"

int main() {
    double r; // Variable para el resultado de las operaciones
    cout << "Calculadora simple" << endl; // Imprime un mensaje en la consola
    cout << "1. Suma" << endl; // Imprime opciones
    cout << "2. Resta" << endl;
    cout << "3. Multiplicacion" << endl;
    cout << "4. Division" << endl;
    cout << "Seleccione una opcion: "; // Pide al usuario que seleccione una opción

    int opc; // Variable para almacenar la opción seleccionada por el usuario
    cin >> opc; // Lee la opción desde la entrada estándar (teclado)

    cout << "Escriba el numero 1: "; // Pide al usuario que ingrese el primer número
    int n1; // Variable para el primer número
    cin >> n1; // Lee el primer número desde la entrada estándar

    cout << "Escriba el numero 2: "; // Pide al usuario que ingrese el segundo número
    int n2; // Variable para el segundo número
    cin >> n2; // Lee el segundo número desde la entrada estándar

    switch (opc) { // Inicio del switch basado en la opción seleccionada
        case 1: // Caso 1: Suma
            r = n1 + n2; // Realiza la suma
            cout << "El resultado de la suma de los dos numeros es: " << r << endl; // Muestra el resultado
            break; // Sale del switch
        case 2: // Caso 2: Resta
            r = n1 - n2; // Realiza la resta
            cout << "El resultado de la resta de los dos numeros es: " << r << endl; // Muestra el resultado
            break; // Sale del switch
        case 3: // Caso 3: Multiplicación
            r = n1 * n2; // Realiza la multiplicación
            cout << "El resultado de la Multiplicacion de los dos numeros es: " << r << endl; // Muestra el resultado
            break; // Sale del switch
        case 4: // Caso 4: División
            if (n2 != 0) { // Verifica que el divisor no sea cero para evitar división por cero
                r = static_cast<double>(n1) / n2; // Realiza la división y convierte uno de los operandos a double para obtener resultado decimal
                cout << "El resultado de la Division de los dos numeros es: " << r << endl; // Muestra el resultado
            } else {
                cout << "No es posible dividir entre cero" << endl; // Muestra un mensaje de error si se intenta dividir entre cero
            }
            break; // Sale del switch
        default: // Caso por defecto: Opción inválida
            cout << "La opcion que ingresaste es invalida" << endl; // Muestra un mensaje de error
    }

    return 0; // Devuelve 0 para indicar que el programa terminó exitosamente
}
