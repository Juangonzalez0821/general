#include <QtWidgets/QApplication>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QRadioButton>
#include <QtWidgets/QVBoxLayout>
#include <QtSql/QSqlDatabase>
#include <QtSql/QSqlQuery>
#include <QtSql/QSqlError>
#include <QDateTime>
#include <iostream>

// Función para agregar un ingreso
void agregarIngreso(QLineEdit* ingresoLineEdit, QLineEdit* categoriaLineEdit, QLabel* saldoTotalLabel) {
    double ingreso = ingresoLineEdit->text().toDouble();
    QString categoria = categoriaLineEdit->text();

    QSqlDatabase db = QSqlDatabase::addDatabase("QSQLITE");
    db.setDatabaseName("finanzas.db");

    if (!db.open()) {
        std::cerr << "Error al abrir la base de datos: " << db.lastError().text().toStdString() << std::endl;
        return;
    }

    QSqlQuery query;
    query.prepare("INSERT INTO ingresos (cantidad, categoria) VALUES (?, ?)");
    query.addBindValue(ingreso);
    query.addBindValue(categoria);

    if (!query.exec()) {
        std::cerr << "Error al agregar ingreso: " << query.lastError().text().toStdString() << std::endl;
    }

    db.close();

    // Actualizar saldo total
    double saldo = ingreso - gasto;
    saldoTotalLabel->setText("Saldo Total: " + QString::number(saldo, 'f', 2));
}

// Función para agregar un gasto
void agregarGasto(QLineEdit* gastoLineEdit, QLineEdit* categoriaGastoLineEdit, QLabel* saldoTotalLabel) {
    double gasto = gastoLineEdit->text().toDouble();
    QString categoria = categoriaGastoLineEdit->text();

    QSqlDatabase db = QSqlDatabase::addDatabase("QSQLITE");
    db.setDatabaseName("finanzas.db");

    if (!db.open()) {
        std::cerr << "Error al abrir la base de datos: " << db.lastError().text().toStdString() << std::endl;
        return;
    }

    QSqlQuery query;
    query.prepare("INSERT INTO gastos (cantidad, categoria) VALUES (?, ?)");
    query.addBindValue(gasto);
    query.addBindValue(categoria);

    if (!query.exec()) {
        std::cerr << "Error al agregar gasto: " << query.lastError().text().toStdString() << std::endl;
    }

    db.close();

    // Actualizar saldo total
    double saldo = ingreso - gasto;
    saldoTotalLabel->setText("Saldo Total: " + QString::number(saldo, 'f', 2));
}

int main(int argc, char *argv[]) {
    QApplication app(argc, argv);

    QMainWindow mainWindow;
    mainWindow.setWindowTitle("Gestión Financiera");

    // Crear la interfaz gráfica aquí utilizando Qt (QLabel, QLineEdit, QPushButton, QRadioButton, etc.)

    mainWindow.show();

    return app.exec();
}

