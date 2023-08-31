#include <stdio.h>

int main() {
    double x1, x2, res;
    int op;

    printf("1.Suma\n");
    printf("2.Resta\n");
    printf("3.Multiplicacion\n");
    printf("4.Division\n");
    printf("5.Para salir\n");

    printf("Que operacion va a realizar?\n");
    scanf("%d", &op);

    switch(op) {
        case 1: 
            printf("Ingrese el primer numero: ");
            scanf("%lf" , &x1);
            printf("Ingrese el segundo numero: ");
            scanf("%lf" , &x2);
            res = x1 + x2;
            printf("\nResultado = %lf\n", res);
            break;
        
        case 2:
            printf("Ingrese el primer numero: ");
            scanf("%lf" , &x1);
            printf("Ingrese el segundo numero: ");
            scanf("%lf" , &x2);
            res = x1 - x2;
            printf("\nResultado = %lf\n", res);
            break;

        case 3:
            printf("Ingrese el primer numero: ");
            scanf("%lf" , &x1);
            printf("Ingrese el segundo numero: ");
            scanf("%lf" , &x2);
            res = x1 * x2;
            printf("\nResultado = %lf\n", res);
            break;

        case 4:
            printf("Ingrese el primer numero: ");
            scanf("%lf" , &x1);
            printf("Ingrese el segundo numero: ");
            scanf("%lf" , &x2);
            if (x2 != 0) {
                double r = x1 / x2;
                printf("El resultado de la Division de los dos números es: %lf\n", r);
            } else {
                printf("No es posible dividir entre cero\n");
            }
            break;

        case 5:
            printf("Saliendo del programa...\n");
            break;

        default:
            printf("Opcion equivocada, digite otra opcion\n");
            break;
    }

    return 0;
}

