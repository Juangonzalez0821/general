namespace punto2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                //obtener los valores ingresados
                string nombre = textBox3.Text;
                int edad = int.Parse(textBox1.Text);
                int cedula = int.Parse(textBox2.Text);

                //mostrar en el label
                label5.Text = nombre;
                label6.Text = edad.ToString();
                label7.Text = cedula.ToString();
            }
            catch (FormatException)
            {
                //mostrar la excepcion
                MessageBox.Show("ingrese un numero valido para la edad o la cedula");
            }         

        }

        private void label10_Click(object sender, EventArgs e)
        {

        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }
    }
}