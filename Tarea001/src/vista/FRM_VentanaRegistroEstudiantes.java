package vista;

import controlador.Controlador_VentanaRegistroEstudiantes;
import javax.swing.JOptionPane;
import modelo.ArrayEstudiante;
import modelo.Estudiante;

/**
 *
 * @author Lanfor Mena Monatalbán
 */
public class FRM_VentanaRegistroEstudiantes extends javax.swing.JFrame {

    /**
     * Creates new form FRM_VentanaRegistroEstudiantes
     */
    Controlador_VentanaRegistroEstudiantes controlador;
    ArrayEstudiante array;
    FRM_VentanaInformativa frm_VentanaInformativa=new FRM_VentanaInformativa();
    String carnetTemporal;
    public FRM_VentanaRegistroEstudiantes() {
        super("Regsitro de estudiantes UCR");
        initComponents();
        setVisible(false);
        setLocation(450, 200);
        controlador=new Controlador_VentanaRegistroEstudiantes(this);
        array=new ArrayEstudiante();
        this.panel_Botones1.generarEvento(controlador);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Botones1 = new vista.Panel_Botones();
        jl_LogoUCR = new javax.swing.JLabel();
        panel_InformacionBasica1 = new vista.Panel_InformacionBasica();

        jl_LogoUCR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoUCR-300x231.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Botones1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(panel_InformacionBasica1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jl_LogoUCR, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jl_LogoUCR, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_InformacionBasica1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void buscar()
    {
        if(array.verificar(panel_InformacionBasica1.obtenerInformacion()[1])!=null)
        {
            Estudiante objeto=array.verificar(panel_InformacionBasica1.obtenerInformacion()[1]);
            panel_Botones1.habilitacionBotones(1);
            panel_InformacionBasica1.establecerInformacion(objeto.getNombre(), objeto.getCarnet(), "", "");
            carnetTemporal=objeto.getCarnet();
        }
        else 
        {
            panel_Botones1.habilitacionBotones(2);
            frm_VentanaInformativa.establecerInformacion(array.getInformacion());
        }
    }
    public void agregar()
    {
        String[] informacion=panel_InformacionBasica1.obtenerInformacion();
        if(informacion[0].equals("")||informacion[1].equals(""))
        {
            JOptionPane.showMessageDialog(this,"Información imcompleta","ERROR!!!",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if(array.verificar(panel_InformacionBasica1.obtenerInformacion()[1])!=null)
            {
                JOptionPane.showMessageDialog(this,"Este carnet ya se encuentra"
                +" en el registro","ERROR!!!",JOptionPane.ERROR_MESSAGE);
                panel_Botones1.habilitacionBotones(3);
            }
            else
            {
                Estudiante objeto=new Estudiante(panel_InformacionBasica1.obtenerInformacion()[0], panel_InformacionBasica1.obtenerInformacion()[1]);
                array.agregar(objeto);
                panel_Botones1.habilitacionBotones(3);
                JOptionPane.showMessageDialog(this, "Proceso Exitoso");
                panel_InformacionBasica1.establecerInformacion("", "", "", "");
            }
        }
    }
    public void modificar()
    {
        if(panel_InformacionBasica1.obtenerInformacion()[0].equals("")||panel_InformacionBasica1.obtenerInformacion()[1].equals(""))
        {
            JOptionPane.showMessageDialog(this,"Información imcompleta","ERROR!!!",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if(!carnetTemporal.equalsIgnoreCase(panel_InformacionBasica1.obtenerInformacion()[1]))
            {
                JOptionPane.showMessageDialog(this,"Carnet alterado","ERROR!!!",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                array.modificar(panel_InformacionBasica1.obtenerInformacion());
                JOptionPane.showMessageDialog(this, "Proceso Exitoso");
                panel_Botones1.habilitacionBotones(3);
            }
        }
    }
    public void eliminar()
    {
        if(panel_InformacionBasica1.obtenerInformacion()[0].equals("")||panel_InformacionBasica1.obtenerInformacion()[1].equals(""))
        {
            JOptionPane.showMessageDialog(this,"Información imcompleta","ERROR!!!",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if(!carnetTemporal.equalsIgnoreCase(panel_InformacionBasica1.obtenerInformacion()[1]))
            {
                JOptionPane.showMessageDialog(this,"Carnet alterado","ERROR!!!",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                array.eliminar();
                JOptionPane.showMessageDialog(this, "Proceso Exitoso");
                panel_Botones1.habilitacionBotones(3);
            }
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_LogoUCR;
    private vista.Panel_Botones panel_Botones1;
    private vista.Panel_InformacionBasica panel_InformacionBasica1;
    // End of variables declaration//GEN-END:variables
}