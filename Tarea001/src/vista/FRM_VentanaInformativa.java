package vista;

/**
 *
* @author Lanfor, Profe ya entendí como hacerlo bien, para la proxima vez
 */
public class FRM_VentanaInformativa extends javax.swing.JFrame {

    /**
     * Creates new form FRM_VentanaInformativa
     */
    public FRM_VentanaInformativa() {
        initComponents();
    }
    public  void establecerInformacion(String msj)
    {
        jta_AreaInformativa.setText(msj);
        show();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jl_Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_AreaInformativa = new javax.swing.JTextArea();
        jl_Imagen = new javax.swing.JLabel();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jl_Titulo.setBackground(new java.awt.Color(0, 0, 0));
        jl_Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jl_Titulo.setText("Información Almacenada en el registro");
        jl_Titulo.setBorder(new javax.swing.border.MatteBorder(null));

        jta_AreaInformativa.setEditable(false);
        jta_AreaInformativa.setColumns(20);
        jta_AreaInformativa.setRows(5);
        jta_AreaInformativa.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEtchedBorder()));
        jScrollPane1.setViewportView(jta_AreaInformativa);

        jl_Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/firma-ucr-ico.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Titulo)
                            .addComponent(jl_Imagen))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 104, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jl_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_Imagen;
    private javax.swing.JLabel jl_Titulo;
    private javax.swing.JTextArea jta_AreaInformativa;
    // End of variables declaration//GEN-END:variables
}
