#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#define MAX_CAD 8

int main() {
    int numeroX = 0;
    int numeroY = 0;
    int suma = 0;
    int resta = 0;
    int multi = 0;
    int divi = 0;
    int cont = 0;
    char caracter[MAX_CAD];

    do {
        printf("\nIngresar el primer numero:\n");
        if (scanf("%d", &numeroX) != 1) {
            printf("Error: Entrada no valida. Por favor ingrese un numero.\n");
            fflush(stdin); // Limpia el bufer de entrada
            continue;
        }

        do {
            printf("\nIngresar el segundo numero:\n");
            if (scanf("%d", &numeroY) != 1) {
                printf("Error: Entrada no valida. Por favor ingrese un numero.\n");
                fflush(stdin); // Limpia el bufer de entrada
                continue;
            }

            if (numeroY == 0) {
                printf("El numero que ingreso no es valido. Intentelo de nuevo.\n");
            }
        } while (numeroY == 0);

        suma = numeroX + numeroY;
        printf("\nEl resultado de la suma es: %d", suma);

        resta = numeroX - numeroY;
        printf("\nEl resultado de la resta es: %d", resta);

        multi = numeroX * numeroY;
        printf("\nEl resultado de la multiplicacion es: %d", multi);

        divi = numeroX / numeroY;
        printf("\nEl resultado de la division es: %d", divi);

        printf("\nSi quiere volver a realizar otra operacion presione 0\n");
        printf("De lo contrario presione cualquier tecla\n");
        scanf("%d", &cont);

        system("cls");
    } while (cont == 0);

    printf("\nPresione una tecla diferente de cero para finalizar");
    getch();

    return 0;
}
