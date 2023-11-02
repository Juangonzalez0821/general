namespace WinFormsApp1
{
    partial class Frmtriangulo
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Frmtriangulo));
            label8 = new Label();
            label4 = new Label();
            button1 = new Button();
            label3 = new Label();
            textBox1 = new TextBox();
            label2 = new Label();
            pictureBox1 = new PictureBox();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).BeginInit();
            SuspendLayout();
            // 
            // label8
            // 
            label8.AutoSize = true;
            label8.Font = new Font("Script MT Bold", 24F, FontStyle.Bold, GraphicsUnit.Point);
            label8.Location = new Point(234, 9);
            label8.Name = "label8";
            label8.Size = new Size(360, 38);
            label8.TabIndex = 9;
            label8.Text = "calcular el area del circulo";
            label8.Click += label8_Click;
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Font = new Font("Arial", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label4.Location = new Point(25, 392);
            label4.Name = "label4";
            label4.Size = new Size(197, 18);
            label4.TabIndex = 15;
            label4.Text = "A = π r^2 = π 0^2 = 0(m)^2 ";
            // 
            // button1
            // 
            button1.AutoSize = true;
            button1.Location = new Point(23, 326);
            button1.Name = "button1";
            button1.Size = new Size(143, 25);
            button1.TabIndex = 14;
            button1.Text = "Calcular área del círculo";
            button1.UseVisualStyleBackColor = true;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Font = new Font("Script MT Bold", 24F, FontStyle.Bold, GraphicsUnit.Point);
            label3.Location = new Point(64, 354);
            label3.Name = "label3";
            label3.Size = new Size(125, 38);
            label3.TabIndex = 13;
            label3.Text = "Solucion";
            // 
            // textBox1
            // 
            textBox1.Location = new Point(51, 297);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(100, 23);
            textBox1.TabIndex = 12;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("Arial", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label2.Location = new Point(23, 302);
            label2.Name = "label2";
            label2.Size = new Size(22, 18);
            label2.TabIndex = 11;
            label2.Text = "r=";
            // 
            // pictureBox1
            // 
            pictureBox1.Image = (Image)resources.GetObject("pictureBox1.Image");
            pictureBox1.Location = new Point(24, 61);
            pictureBox1.Name = "pictureBox1";
            pictureBox1.Size = new Size(214, 221);
            pictureBox1.TabIndex = 10;
            pictureBox1.TabStop = false;
            // 
            // Frmtriangulo
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(label4);
            Controls.Add(button1);
            Controls.Add(label3);
            Controls.Add(textBox1);
            Controls.Add(label2);
            Controls.Add(pictureBox1);
            Controls.Add(label8);
            Name = "Frmtriangulo";
            Text = "Frmtriangulo";
            Load += Frmtriangulo_Load;
            ((System.ComponentModel.ISupportInitialize)pictureBox1).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label8;
        private Label label4;
        private Button button1;
        private Label label3;
        private TextBox textBox1;
        private Label label2;
        private PictureBox pictureBox1;
    }
}