namespace WinFormsApp1
{
    partial class Frmcuadrado
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Frmcuadrado));
            label4 = new Label();
            button1 = new Button();
            label3 = new Label();
            textBox1 = new TextBox();
            label2 = new Label();
            pictureBox1 = new PictureBox();
            label1 = new Label();
            label5 = new Label();
            button2 = new Button();
            label6 = new Label();
            textBox2 = new TextBox();
            label7 = new Label();
            pictureBox2 = new PictureBox();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).BeginInit();
            ((System.ComponentModel.ISupportInitialize)pictureBox2).BeginInit();
            SuspendLayout();
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Font = new Font("Arial", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label4.Location = new Point(28, 380);
            label4.Name = "label4";
            label4.Size = new Size(175, 18);
            label4.TabIndex = 14;
            label4.Text = "A = a^2 =  0^2 = 0(m)^2 ";
            // 
            // button1
            // 
            button1.AutoSize = true;
            button1.Location = new Point(28, 305);
            button1.Name = "button1";
            button1.Size = new Size(157, 25);
            button1.TabIndex = 13;
            button1.Text = "Calcular área del cuadrado";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Font = new Font("Script MT Bold", 24F, FontStyle.Bold, GraphicsUnit.Point);
            label3.Location = new Point(66, 342);
            label3.Name = "label3";
            label3.Size = new Size(125, 38);
            label3.TabIndex = 12;
            label3.Text = "Solucion";
            // 
            // textBox1
            // 
            textBox1.Location = new Point(56, 276);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(100, 23);
            textBox1.TabIndex = 11;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("Arial", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label2.Location = new Point(28, 281);
            label2.Name = "label2";
            label2.Size = new Size(26, 18);
            label2.TabIndex = 10;
            label2.Text = "a=";
            // 
            // pictureBox1
            // 
            pictureBox1.Image = (Image)resources.GetObject("pictureBox1.Image");
            pictureBox1.Location = new Point(29, 49);
            pictureBox1.Name = "pictureBox1";
            pictureBox1.Size = new Size(214, 221);
            pictureBox1.TabIndex = 9;
            pictureBox1.TabStop = false;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Script MT Bold", 24F, FontStyle.Bold, GraphicsUnit.Point);
            label1.Location = new Point(66, 8);
            label1.Name = "label1";
            label1.Size = new Size(398, 38);
            label1.TabIndex = 8;
            label1.Text = "calcular el area del cuadrado";
            label1.Click += label1_Click;
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Font = new Font("Arial", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label5.Location = new Point(275, 380);
            label5.Name = "label5";
            label5.Size = new Size(239, 18);
            label5.TabIndex = 20;
            label5.Text = "A = (1/2)a^2 =  (1/2)0^2 = 0(m)^2 ";
            // 
            // button2
            // 
            button2.AutoSize = true;
            button2.Location = new Point(275, 305);
            button2.Name = "button2";
            button2.Size = new Size(157, 25);
            button2.TabIndex = 19;
            button2.Text = "Calcular área del cuadrado";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // label6
            // 
            label6.AutoSize = true;
            label6.Font = new Font("Script MT Bold", 24F, FontStyle.Bold, GraphicsUnit.Point);
            label6.Location = new Point(313, 342);
            label6.Name = "label6";
            label6.Size = new Size(125, 38);
            label6.TabIndex = 18;
            label6.Text = "Solucion";
            // 
            // textBox2
            // 
            textBox2.Location = new Point(303, 276);
            textBox2.Name = "textBox2";
            textBox2.Size = new Size(100, 23);
            textBox2.TabIndex = 17;
            // 
            // label7
            // 
            label7.AutoSize = true;
            label7.Font = new Font("Arial", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label7.Location = new Point(275, 281);
            label7.Name = "label7";
            label7.Size = new Size(26, 18);
            label7.TabIndex = 16;
            label7.Text = "d=";
            // 
            // pictureBox2
            // 
            pictureBox2.Image = (Image)resources.GetObject("pictureBox2.Image");
            pictureBox2.Location = new Point(276, 49);
            pictureBox2.Name = "pictureBox2";
            pictureBox2.Size = new Size(214, 221);
            pictureBox2.TabIndex = 15;
            pictureBox2.TabStop = false;
            // 
            // Frmcuadrado
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(534, 416);
            Controls.Add(label5);
            Controls.Add(button2);
            Controls.Add(label6);
            Controls.Add(textBox2);
            Controls.Add(label7);
            Controls.Add(pictureBox2);
            Controls.Add(label4);
            Controls.Add(button1);
            Controls.Add(label3);
            Controls.Add(textBox1);
            Controls.Add(label2);
            Controls.Add(pictureBox1);
            Controls.Add(label1);
            Name = "Frmcuadrado";
            Text = "Frmcuadrado";
            ((System.ComponentModel.ISupportInitialize)pictureBox1).EndInit();
            ((System.ComponentModel.ISupportInitialize)pictureBox2).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label4;
        private Button button1;
        private Label label3;
        private TextBox textBox1;
        private Label label2;
        private PictureBox pictureBox1;
        private Label label1;
        private Label label5;
        private Button button2;
        private Label label6;
        private TextBox textBox2;
        private Label label7;
        private PictureBox pictureBox2;
    }
}