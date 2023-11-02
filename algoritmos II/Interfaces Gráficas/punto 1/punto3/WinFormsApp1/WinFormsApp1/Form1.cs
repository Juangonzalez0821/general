namespace WinFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }


        private void circuloToolStripMenuItem_Click(object sender, EventArgs e)
        {
            // Crea una instancia del formulario FrmCirculo
            Frmcirculo frmCirculo = new Frmcirculo();

            // Llama al método Show() para mostrar el formulario
            frmCirculo.ShowDialog();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void cuToolStripMenuItem_Click(object sender, EventArgs e)
        {
            // Crea una instancia del formulario frmCuadrado
            Frmcuadrado frmCuadrado = new Frmcuadrado();

            // Llama al método Show() para mostrar el formulario
            frmCuadrado.ShowDialog();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}