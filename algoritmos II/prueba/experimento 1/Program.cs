using System;
using System.Data.SqlServerCe;
using System.Windows.Forms;


namespace GestionFinanciera;

public partial class MainForm : Form
{
    private SqlCeConnection connection;

    public MainForm()
    {
        InitializeComponent();
        InitializeDatabase();
        UpdateBalance();
    }

    private void InitializeDatabase()
    {
        connection = new SqlCeConnection("Data Source=finanzas.sdf");
        connection.Open();

        using (var cmd = new SqlCeCommand())
        {
            cmd.Connection = connection;
            cmd.CommandText = "CREATE TABLE IF NOT EXISTS ingresos (cantidad REAL, categoria NVARCHAR(255), fecha DATETIME DEFAULT GETDATE())";
            cmd.ExecuteNonQuery();
            cmd.CommandText = "CREATE TABLE IF NOT EXISTS gastos (cantidad REAL, categoria NVARCHAR(255), fecha DATETIME DEFAULT GETDATE())";
            cmd.ExecuteNonQuery();
        }
    }

    private void UpdateBalance()
    {
        using (var cmd = new SqlCeCommand())
        {
            cmd.Connection = connection;
            cmd.CommandText = "SELECT SUM(cantidad) FROM ingresos";
            var ingresosResult = cmd.ExecuteScalar();
            var ingresos = (ingresosResult != DBNull.Value) ? Convert.ToDouble(ingresosResult) : 0.0;

            cmd.CommandText = "SELECT SUM(cantidad) FROM gastos";
            var gastosResult = cmd.ExecuteScalar();
            var gastos = (gastosResult != DBNull.Value) ? Convert.ToDouble(gastosResult) : 0.0;

            var saldo = ingresos - gastos;
            saldoTotalLabel.Text = "Saldo Total: " + saldo.ToString("N2");
        }
    }

    private void AgregarIngreso()
    {
        double ingreso = Convert.ToDouble(entradaIngreso.Text);
        string categoria = entradaCategoriaIngreso.Text;

        using (var cmd = new SqlCeCommand())
        {
            cmd.Connection = connection;
            cmd.CommandText = "INSERT INTO ingresos (cantidad, categoria) VALUES (@cantidad, @categoria)";
            cmd.Parameters.AddWithValue("@cantidad", ingreso);
            cmd.Parameters.AddWithValue("@categoria", categoria);
            cmd.ExecuteNonQuery();
        }

        UpdateBalance();
    }

    // Método similar para AgregarGasto

    private void ConsultarGastos(string periodo)
    {
        // Lógica para consultar gastos según el período seleccionado
    }

    private void consultarGastosButton_Click(object sender, EventArgs e)
    {
        ConsultarGastos(opcionPeriodo.SelectedItem.ToString());
    }

    private void MainForm_FormClosing(object sender, FormClosingEventArgs e)
    {
        connection.Close();
    }
}
