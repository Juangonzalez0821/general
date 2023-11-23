#include <stdio.h>

// Declaración de funciones
void archi();
void nom();
void cel();
void cor();
void escri();

// Declaración de variables globales
FILE *arch;
char archivo[20];
char nombre[16];
char celular[20];
char correo[16];
int id = 0;  // Variable para almacenar el ID

int main() {
    archi();  // Verifica la existencia del archivo y lo crea si no existe
    nom();    // Ingresa el nombre del usuario
    cel();    // Ingresa el número de teléfono celular del usuario
    cor();    // Ingresa el correo electrónico del usuario
    escri();  // Función aún por implementar (puede ser utilizada para futuras expansiones)

    fclose(arch);  // Cierra el archivo después de escribir la información
    return 0;
}

void archi() {
    arch = fopen("agenda.csv", "r");  // Intenta abrir el archivo en modo lectura

    if (arch == NULL) {
        fclose(arch);
        arch = fopen("agenda.csv", "a");  // Si el archivo no existe, créalo en modo append
        fprintf(arch, "ID;Nombre;Numero;Correo\n");
        printf("Se ha creado un nuevo archivo.\n");
    } else {
        // Determina el último ID existente en el archivo
        fseek(arch, 0, SEEK_END);  // Mueve el puntero al final del archivo

        if (ftell(arch) > 0) {
            fseek(arch, -1, SEEK_CUR);  // Retrocede un caracter

            int c = fgetc(arch);

            // Retrocede hasta encontrar un salto de línea (o hasta el inicio del archivo)
            while (c != '\n' && ftell(arch) > 0) {
                fseek(arch, -2, SEEK_CUR);  // Retrocede dos caracteres
                c = fgetc(arch);
            }

            if (c == '\n') {
                // Si el último caracter es un salto de línea, retrocede otro caracter
                fseek(arch, -1, SEEK_CUR);
            }

            // Lee el último ID existente y actualiza la variable 'id'
            fscanf(arch, "%d;", &id);
        }

        fclose(arch);
        arch = fopen("agenda.csv", "a");  // Si el archivo existe, ábrelo en modo append
        printf("Tu archivo se va a actualizar.\n");
    }
}

void nom() {
    printf("\nIngrese su nombre:\n");
    scanf("%[^\n]", nombre);
}

void cel() {
    printf("\nIngrese su numero celular:\n");
    scanf("%s", celular);
}

void cor() {
    printf("\nIngrese su correo:\n");
    scanf("%s", correo);
}

void escri() {
    // Incrementa el ID para el nuevo usuario
    id = (id == 0) ? 1 : id + 1;

    // Escribe la información en el archivo
    fprintf(arch, "\n%d;%s;%s;%s", id, nombre, celular, correo);
}

