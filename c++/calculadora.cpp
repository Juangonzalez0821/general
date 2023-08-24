#include <iostream> // Incluye la biblioteca iostream para entrada/salida est�ndar
using namespace std; // Permite usar los elementos de la biblioteca est�ndar sin el prefijo "std::"

int main() {
    double r; // Variable para el resultado de las operaciones
    cout << "Calculadora simple" << endl; // Imprime un mensaje en la consola
    cout << "1. Suma" << endl; // Imprime opciones
    cout << "2. Resta" << endl;
    cout << "3. Multiplicacion" << endl;
    cout << "4. Division" << endl;
    cout << "Seleccione una opcion: "; // Pide al usuario que seleccione una opci�n

    int opc; // Variable para almacenar la opci�n seleccionada por el usuario
    cin >> opc; // Lee la opci�n desde la entrada est�ndar (teclado)

    cout << "Escriba el numero 1: "; // Pide al usuario que ingrese el primer n�mero
    int n1; // Variable para el primer n�mero
    cin >> n1; // Lee el primer n�mero desde la entrada est�ndar

    cout << "Escriba el numero 2: "; // Pide al usuario que ingrese el segundo n�mero
    int n2; // Variable para el segundo n�mero
    cin >> n2; // Lee el segundo n�mero desde la entrada est�ndar

    switch (opc) { // Inicio del switch basado en la opci�n seleccionada
        case 1: // Caso 1: Suma
            r = n1 + n2; // Realiza la suma
            cout << "El resultado de la suma de los dos numeros es: " << r << endl; // Muestra el resultado
            break; // Sale del switch
        case 2: // Caso 2: Resta
            r = n1 - n2; // Realiza la resta
            cout << "El resultado de la resta de los dos numeros es: " << r << endl; // Muestra el resultado
            break; // Sale del switch
        case 3: // Caso 3: Multiplicaci�n
            r = n1 * n2; // Realiza la multiplicaci�n
            cout << "El resultado de la Multiplicacion de los dos numeros es: " << r << endl; // Muestra el resultado
            break; // Sale del switch
        case 4: // Caso 4: Divisi�n
            if (n2 != 0) { // Verifica que el divisor no sea cero para evitar divisi�n por cero
                r = static_cast<double>(n1) / n2; // Realiza la divisi�n y convierte uno de los operandos a double para obtener resultado decimal
                cout << "El resultado de la Division de los dos numeros es: " << r << endl; // Muestra el resultado
            } else {
                cout << "No es posible dividir entre cero" << endl; // Muestra un mensaje de error si se intenta dividir entre cero
            }
            break; // Sale del switch
        default: // Caso por defecto: Opci�n inv�lida
            cout << "La opcion que ingresaste es invalida" << endl; // Muestra un mensaje de error
    }

    return 0; // Devuelve 0 para indicar que el programa termin� exitosamente
}
