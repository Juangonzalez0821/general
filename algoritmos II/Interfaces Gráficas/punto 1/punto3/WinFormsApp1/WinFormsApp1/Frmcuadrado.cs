using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Reflection.Emit;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace WinFormsApp1
{
    public partial class Frmcuadrado : Form
    {
        public Frmcuadrado()
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
                //obtener la base del cuadrado
                double a = double.Parse(textBox1.Text);
                //realizar la operacion
                double area = a * a;
                // Formatear el resultado a tres decimales
                string resultadoFormateado = string.Format("{0:0.00}", area);
                // Mostrar el resultado en el Label
                label4.Text = "A = a^2 =  " + a.ToString() + "^2 = " + resultadoFormateado + " (m)^2";
                //       A = a^2 =  0^2 = 0(m)^2  

            }
            catch (Exception ex)//maneja un format exception
            {
                // Manejo de errores
                MessageBox.Show("Error: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            try
            {
                //obtener la diagnal del cuadrado
                double d = double.Parse(textBox2.Text);
                //realizar la operacion
                double area = (0.5) * (d * d);
                // Formatear el resultado a tres decimales
                string resultadoFormateado = string.Format("{0:0.00}", area);
                // Mostrar el resultado en el Label
                label5.Text = "A = (1/2)a^2 =  (1/2)" + d.ToString() + "^2 = " + resultadoFormateado + " (m)^2";
                //       A = (1/2)a^2 =  (1/2)0^2 = 0(m)^2 

            }
            catch (Exception ex)//maneja un format exception
            {
                // Manejo de errores
                MessageBox.Show("Error: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }
    }
}
