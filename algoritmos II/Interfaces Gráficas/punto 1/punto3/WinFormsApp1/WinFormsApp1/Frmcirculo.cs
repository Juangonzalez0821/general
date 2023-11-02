using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WinFormsApp1
{
    public partial class Frmcirculo : Form
    {
        public Frmcirculo()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                //definir pi 
                double pi = 3.14;
                //obtener el radio del circulo
                double r = double.Parse(textBox1.Text);
                //realizar la operacion
                double area = pi * (r * r);
                // Formatear el resultado a tres decimales
                string resultadoFormateado = string.Format("{0:0.000}", area);
                // Mostrar el resultado en el Label
                label4.Text = "A = π r^2 = π " + r.ToString() + "^2 = " + resultadoFormateado + " (m)^2";
                //    A = π r^2 = π 0^2 = 0 π (m^)2 ≈ 0(m^)2 

            }
            catch (Exception ex)//maneja un format exception
            {
                // Manejo de errores
                MessageBox.Show("Error: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            try
            {
                //definir pi 
                double pi = 3.14;
                //obtener el diametro del circulo
                double d = double.Parse(textBox2.Text);
                //realizar la operacion
                double area = (1.0 / 4.0) * pi * (d * d);
                // Formatear el resultado a tres decimales
                string resultadoFormateado = string.Format("{0:0.000}", area);
                // Mostrar el resultado en el Label
                label5.Text = "A = 1 /4 π d^2 = 1 /4 π " + d.ToString() + "^2 = " + resultadoFormateado + " (m)^2";
                //    A = 1 /4 π d^2 = 1 /4 π 0^2 = 0 (m)^2 

            }
            catch (Exception ex)//maneja un format exception
            {
                // Manejo de errores
                MessageBox.Show("Error: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            try
            {
                //definir pi 
                double pi = 3.14;
                //obtener la longitud del circulo
                double l = double.Parse(textBox3.Text);
                //realizar la operacion
                double area = (Math.Pow(l, 2)) / (4 * pi);
                // Formatear el resultado a tres decimales
                string resultadoFormateado = string.Format("{0:0.000}", area);
                // Mostrar el resultado en el Label
                label9.Text = "A=(l^2/4π)=(" + l.ToString() + "^2/4π)= " + resultadoFormateado + " (m)^2";
                //       A=(l^2/4π)=(0^2/4π)= 0(m)^2 

            }
            catch (Exception ex)//maneja un format exception
            {
                // Manejo de errores
                MessageBox.Show("Error: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void Frmcirculo_Load(object sender, EventArgs e)
        {

        }

        private void label9_Click(object sender, EventArgs e)
        {

        }
    }
}
