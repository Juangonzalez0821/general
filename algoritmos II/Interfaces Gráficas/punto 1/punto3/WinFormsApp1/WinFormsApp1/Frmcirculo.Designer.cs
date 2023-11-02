namespace WinFormsApp1
{
    partial class Frmcirculo
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
            components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Frmcirculo));
            contextMenuStrip1 = new ContextMenuStrip(components);
            pictureBox1 = new PictureBox();
            label2 = new Label();
            textBox1 = new TextBox();
            label3 = new Label();
            button1 = new Button();
            label4 = new Label();
            label5 = new Label();
            button2 = new Button();
            label6 = new Label();
            textBox2 = new TextBox();
            label7 = new Label();
            pictureBox2 = new PictureBox();
            label8 = new Label();
            label9 = new Label();
            button3 = new Button();
            label10 = new Label();
            textBox3 = new TextBox();
            label11 = new Label();
            pictureBox3 = new PictureBox();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).BeginInit();
            ((System.ComponentModel.ISupportInitialize)pictureBox2).BeginInit();
            ((System.ComponentModel.ISupportInitialize)pictureBox3).BeginInit();
            SuspendLayout();
            // 
            // contextMenuStrip1
            // 
            contextMenuStrip1.Name = "contextMenuStrip1";
            contextMenuStrip1.Size = new Size(61, 4);
            // 
            // pictureBox1
            // 
            pictureBox1.Image = (Image)resources.GetObject("pictureBox1.Image");
            pictureBox1.Location = new Point(12, 59);
            pictureBox1.Name = "pictureBox1";
            pictureBox1.Size = new Size(214, 221);
            pictureBox1.TabIndex = 2;
            pictureBox1.TabStop = false;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("Arial", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label2.Location = new Point(11, 300);
            label2.Name = "label2";
            label2.Size = new Size(22, 18);
            label2.TabIndex = 3;
            label2.Text = "r=";
            // 
            // textBox1
            // 
            textBox1.Location = new Point(39, 295);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(100, 23);
            textBox1.TabIndex = 4;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Font = new Font("Script MT Bold", 24F, FontStyle.Bold, GraphicsUnit.Point);
            label3.Location = new Point(52, 352);
            label3.Name = "label3";
            label3.Size = new Size(125, 38);
            label3.TabIndex = 5;
            label3.Text = "Solucion";
            // 
            // button1
            // 
            button1.AutoSize = true;
            button1.Location = new Point(11, 324);
            button1.Name = "button1";
            button1.Size = new Size(143, 25);
            button1.TabIndex = 6;
            button1.Text = "Calcular área del círculo";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Font = new Font("Arial", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label4.Location = new Point(13, 390);
            label4.Name = "label4";
            label4.Size = new Size(197, 18);
            label4.TabIndex = 7;
            label4.Text = "A = π r^2 = π 0^2 = 0(m)^2 ";
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Font = new Font("Arial", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label5.Location = new Point(303, 390);
            label5.Name = "label5";
            label5.Size = new Size(273, 18);
            label5.TabIndex = 14;
            label5.Text = "A = 1 /4 π d^2 =   1 /4 π 0^2 = 0 (m)^2 ";
            // 
            // button2
            // 
            button2.AutoSize = true;
            button2.Location = new Point(303, 320);
            button2.Name = "button2";
            button2.Size = new Size(143, 25);
            button2.TabIndex = 13;
            button2.Text = "Calcular área del círculo";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // label6
            // 
            label6.AutoSize = true;
            label6.Font = new Font("Script MT Bold", 24F, FontStyle.Bold, GraphicsUnit.Point);
            label6.Location = new Point(341, 352);
            label6.Name = "label6";
            label6.Size = new Size(125, 38);
            label6.TabIndex = 12;
            label6.Text = "Solucion";
            // 
            // textBox2
            // 
            textBox2.Location = new Point(331, 291);
            textBox2.Name = "textBox2";
            textBox2.Size = new Size(100, 23);
            textBox2.TabIndex = 11;
            // 
            // label7
            // 
            label7.AutoSize = true;
            label7.Font = new Font("Arial", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label7.Location = new Point(303, 296);
            label7.Name = "label7";
            label7.Size = new Size(26, 18);
            label7.TabIndex = 10;
            label7.Text = "d=";
            label7.Click += label7_Click;
            // 
            // pictureBox2
            // 
            pictureBox2.Image = (Image)resources.GetObject("pictureBox2.Image");
            pictureBox2.Location = new Point(303, 59);
            pictureBox2.Name = "pictureBox2";
            pictureBox2.Size = new Size(214, 221);
            pictureBox2.TabIndex = 9;
            pictureBox2.TabStop = false;
            // 
            // label8
            // 
            label8.AutoSize = true;
            label8.Font = new Font("Script MT Bold", 24F, FontStyle.Bold, GraphicsUnit.Point);
            label8.Location = new Point(234, 9);
            label8.Name = "label8";
            label8.Size = new Size(360, 38);
            label8.TabIndex = 8;
            label8.Text = "calcular el area del circulo";
            // 
            // label9
            // 
            label9.AutoSize = true;
            label9.Font = new Font("Arial", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label9.Location = new Point(595, 390);
            label9.Name = "label9";
            label9.Size = new Size(210, 18);
            label9.TabIndex = 21;
            label9.Text = "A=(l^2/4π)=(0^2/4π)= 0(m)^2";
            label9.Click += label9_Click;
            // 
            // button3
            // 
            button3.AutoSize = true;
            button3.Location = new Point(595, 320);
            button3.Name = "button3";
            button3.Size = new Size(143, 25);
            button3.TabIndex = 20;
            button3.Text = "Calcular área del círculo";
            button3.UseVisualStyleBackColor = true;
            button3.Click += button3_Click;
            // 
            // label10
            // 
            label10.AutoSize = true;
            label10.Font = new Font("Script MT Bold", 24F, FontStyle.Bold, GraphicsUnit.Point);
            label10.Location = new Point(634, 352);
            label10.Name = "label10";
            label10.Size = new Size(125, 38);
            label10.TabIndex = 19;
            label10.Text = "Solucion";
            // 
            // textBox3
            // 
            textBox3.Location = new Point(623, 291);
            textBox3.Name = "textBox3";
            textBox3.Size = new Size(100, 23);
            textBox3.TabIndex = 18;
            // 
            // label11
            // 
            label11.AutoSize = true;
            label11.Font = new Font("Arial", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label11.Location = new Point(595, 296);
            label11.Name = "label11";
            label11.Size = new Size(20, 18);
            label11.TabIndex = 17;
            label11.Text = "l=";
            // 
            // pictureBox3
            // 
            pictureBox3.Image = (Image)resources.GetObject("pictureBox3.Image");
            pictureBox3.Location = new Point(596, 59);
            pictureBox3.Name = "pictureBox3";
            pictureBox3.Size = new Size(214, 221);
            pictureBox3.TabIndex = 16;
            pictureBox3.TabStop = false;
            // 
            // Frmcirculo
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(849, 420);
            Controls.Add(label9);
            Controls.Add(button3);
            Controls.Add(label10);
            Controls.Add(textBox3);
            Controls.Add(label11);
            Controls.Add(pictureBox3);
            Controls.Add(label5);
            Controls.Add(button2);
            Controls.Add(label6);
            Controls.Add(textBox2);
            Controls.Add(label7);
            Controls.Add(pictureBox2);
            Controls.Add(label8);
            Controls.Add(label4);
            Controls.Add(button1);
            Controls.Add(label3);
            Controls.Add(textBox1);
            Controls.Add(label2);
            Controls.Add(pictureBox1);
            Name = "Frmcirculo";
            Text = "Frmcirculo";
            Load += Frmcirculo_Load;
            ((System.ComponentModel.ISupportInitialize)pictureBox1).EndInit();
            ((System.ComponentModel.ISupportInitialize)pictureBox2).EndInit();
            ((System.ComponentModel.ISupportInitialize)pictureBox3).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion
        private ContextMenuStrip contextMenuStrip1;
        private PictureBox pictureBox1;
        private Label label2;
        private TextBox textBox1;
        private Label label3;
        private Button button1;
        private Label label4;
        private Label label5;
        private Button button2;
        private Label label6;
        private TextBox textBox2;
        private Label label7;
        private PictureBox pictureBox2;
        private Label label8;
        private Label label9;
        private Button button3;
        private Label label10;
        private TextBox textBox3;
        private Label label11;
        private PictureBox pictureBox3;
    }
}