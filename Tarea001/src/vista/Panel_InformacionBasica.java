package vista;

/**
 *
 * @author Lanfor, Profe ya entendí como hacerlo bien, para la proxima vez
 */
public class Panel_InformacionBasica extends javax.swing.JPanel {

    /**
     * Creates new form Panel_InformacionBasica
     */
    public Panel_InformacionBasica() {
        initComponents();
        jt_Creditos.setEnabled(false);
        jt_Nombre.setEnabled(false);
    }

    public void habilitarEspacios(boolean habilitacion)
    {
        if(habilitacion)
        {
            jt_Creditos.setEnabled(habilitacion);
            jt_Nombre.setEnabled(habilitacion);
        }
        else
        {
            jt_Creditos.setEnabled(habilitacion);
            jt_Nombre.setEnabled(habilitacion);
            
            jt_Creditos.setText("");
            jt_Nombre.setText("");
            jt_Carnet.setText("");
            jt_Siglas.setText("");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Nombre = new javax.swing.JLabel();
        jl_Siglas = new javax.swing.JLabel();
        jl_Creditos = new javax.swing.JLabel();
        jt_Nombre = new javax.swing.JTextField();
        jlCarnet = new javax.swing.JLabel();
        jt_Carnet = new javax.swing.JTextField();
        jt_Siglas = new javax.swing.JTextField();
        jt_Creditos = new javax.swing.JTextField();

        jl_Nombre.setText("Nombre:");

        jl_Siglas.setText("Siglas:");

        jl_Creditos.setText("Creditos");

        jlCarnet.setText("Carnet:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_Creditos)
                        .addGap(18, 18, 18)
                        .addComponent(jt_Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Nombre)
                            .addComponent(jl_Siglas))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_Siglas, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jlCarnet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jt_Carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nombre)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCarnet)
                    .addComponent(jt_Carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Siglas)
                    .addComponent(jt_Siglas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Creditos)
                    .addComponent(jt_Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public String[] obtenerInformacion()
    {
        String[] vector=new String[4];
        vector[0]=jt_Nombre.getText();
        vector[1]=jt_Carnet.getText();
        vector[2]=jt_Siglas.getText();
        vector[3]=jt_Creditos.getText();
        return vector;
    }
    public  void establecerInformacion(String nombre, String carnet, String siglas, String direcccion)
    {
        jt_Nombre.setText(nombre);
        jt_Carnet.setText(carnet);
        jt_Siglas.setText(siglas);
        jt_Creditos.setText(direcccion);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlCarnet;
    private javax.swing.JLabel jl_Creditos;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_Siglas;
    private javax.swing.JTextField jt_Carnet;
    private javax.swing.JTextField jt_Creditos;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextField jt_Siglas;
    // End of variables declaration//GEN-END:variables
}
