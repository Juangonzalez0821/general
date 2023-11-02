namespace WinFormsApp1
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
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
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            menuStrip1 = new MenuStrip();
            circuloToolStripMenuItem = new ToolStripMenuItem();
            cuToolStripMenuItem = new ToolStripMenuItem();
            trianguloToolStripMenuItem = new ToolStripMenuItem();
            trapecioToolStripMenuItem = new ToolStripMenuItem();
            label1 = new Label();
            menuStrip1.SuspendLayout();
            SuspendLayout();
            // 
            // menuStrip1
            // 
            menuStrip1.Font = new Font("Script MT Bold", 20.25F, FontStyle.Bold, GraphicsUnit.Point);
            menuStrip1.Items.AddRange(new ToolStripItem[] { circuloToolStripMenuItem, cuToolStripMenuItem, trianguloToolStripMenuItem, trapecioToolStripMenuItem });
            menuStrip1.Location = new Point(0, 0);
            menuStrip1.Name = "menuStrip1";
            menuStrip1.Size = new Size(615, 41);
            menuStrip1.TabIndex = 0;
            menuStrip1.Text = "menuStrip1";
            // 
            // circuloToolStripMenuItem
            // 
            circuloToolStripMenuItem.Name = "circuloToolStripMenuItem";
            circuloToolStripMenuItem.Size = new Size(114, 42);
            circuloToolStripMenuItem.Text = "circulo";
            circuloToolStripMenuItem.Click += circuloToolStripMenuItem_Click;
            // 
            // cuToolStripMenuItem
            // 
            cuToolStripMenuItem.Name = "cuToolStripMenuItem";
            cuToolStripMenuItem.Size = new Size(152, 42);
            cuToolStripMenuItem.Text = "cuadrado";
            cuToolStripMenuItem.Click += cuToolStripMenuItem_Click;
            // 
            // trianguloToolStripMenuItem
            // 
            trianguloToolStripMenuItem.Name = "trianguloToolStripMenuItem";
            trianguloToolStripMenuItem.Size = new Size(146, 42);
            trianguloToolStripMenuItem.Text = "triangulo";
            // 
            // trapecioToolStripMenuItem
            // 
            trapecioToolStripMenuItem.Name = "trapecioToolStripMenuItem";
            trapecioToolStripMenuItem.Size = new Size(131, 42);
            trapecioToolStripMenuItem.Text = "trapecio";
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Script MT Bold", 24F, FontStyle.Bold, GraphicsUnit.Point);
            label1.Location = new Point(12, 41);
            label1.Name = "label1";
            label1.Size = new Size(591, 38);
            label1.TabIndex = 9;
            label1.Text = "eliga la figura de la cual desea saber el area";
            label1.Click += label1_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(615, 103);
            Controls.Add(label1);
            Controls.Add(menuStrip1);
            MainMenuStrip = menuStrip1;
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            menuStrip1.ResumeLayout(false);
            menuStrip1.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private MenuStrip menuStrip1;
        private ToolStripMenuItem circuloToolStripMenuItem;
        private ToolStripMenuItem cuToolStripMenuItem;
        private ToolStripMenuItem trianguloToolStripMenuItem;
        private ToolStripMenuItem trapecioToolStripMenuItem;
        private Label label1;
    }
}