/*
 * @Autor Jorge Ignacio Elizondo Alvarado
 */
package vista;

/**
 *
 * @author JorgeIgnacio
 */
public class FRM_Reportes extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Reportes
     */
    public FRM_Reportes() {
        initComponents();
        
        this.setSize(760, 680);
        this.setLocation(200, 5);
        
    }
    
    public void mostrarInformacionLista(String informacion) {
        
        this.jT_InformacionToda.setText(informacion);
        
    }
    
    public void mostrarPromedioEdad(String informacion) {
        
        this.jT_PromedioEdad.setText(informacion);
        
    }
    
    public void mostrarCantidad(String informacion) {
        
        this.jT_CantidadPersonasCola.setText(informacion);
        
    }
    
    public void limpiarTablas() {
        
        this.jT_InformacionToda.setText("");
        this.jT_PromedioEdad.setText("");
        this.jT_CantidadPersonasCola.setText("");
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_Reportes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_InformacionToda = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jT_PromedioEdad = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jT_CantidadPersonasCola = new javax.swing.JTextArea();
        jL_InformacionToda = new javax.swing.JLabel();
        jl_PromedioEdad = new javax.swing.JLabel();
        jl_CantidadPersonasCola = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jL_Reportes.setBackground(new java.awt.Color(0, 153, 0));
        jL_Reportes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jL_Reportes.setForeground(new java.awt.Color(0, 0, 0));
        jL_Reportes.setText("REPORTES");
        jL_Reportes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jL_Reportes.setOpaque(true);
        getContentPane().add(jL_Reportes);
        jL_Reportes.setBounds(345, 12, 104, 26);

        jT_InformacionToda.setEditable(false);
        jT_InformacionToda.setColumns(20);
        jT_InformacionToda.setRows(5);
        jT_InformacionToda.setPreferredSize(new java.awt.Dimension(200, 80));
        jScrollPane1.setViewportView(jT_InformacionToda);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 246, 223, 300);

        jT_PromedioEdad.setEditable(false);
        jT_PromedioEdad.setColumns(20);
        jT_PromedioEdad.setRows(5);
        jT_PromedioEdad.setPreferredSize(new java.awt.Dimension(200, 80));
        jScrollPane2.setViewportView(jT_PromedioEdad);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(253, 246, 223, 300);

        jT_CantidadPersonasCola.setEditable(false);
        jT_CantidadPersonasCola.setColumns(20);
        jT_CantidadPersonasCola.setRows(5);
        jT_CantidadPersonasCola.setPreferredSize(new java.awt.Dimension(200, 80));
        jScrollPane3.setViewportView(jT_CantidadPersonasCola);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(494, 246, 223, 300);

        jL_InformacionToda.setBackground(new java.awt.Color(0, 153, 0));
        jL_InformacionToda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jL_InformacionToda.setForeground(new java.awt.Color(0, 0, 0));
        jL_InformacionToda.setText("INFORMACIÓN");
        jL_InformacionToda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jL_InformacionToda.setOpaque(true);
        getContentPane().add(jL_InformacionToda);
        jL_InformacionToda.setBounds(55, 179, 129, 26);

        jl_PromedioEdad.setBackground(new java.awt.Color(0, 153, 0));
        jl_PromedioEdad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jl_PromedioEdad.setForeground(new java.awt.Color(0, 0, 0));
        jl_PromedioEdad.setText("PROMEDIO EDAD");
        jl_PromedioEdad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jl_PromedioEdad.setOpaque(true);
        getContentPane().add(jl_PromedioEdad);
        jl_PromedioEdad.setBounds(304, 179, 155, 26);

        jl_CantidadPersonasCola.setBackground(new java.awt.Color(0, 153, 0));
        jl_CantidadPersonasCola.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jl_CantidadPersonasCola.setForeground(new java.awt.Color(0, 0, 0));
        jl_CantidadPersonasCola.setText("CANTIDAD");
        jl_CantidadPersonasCola.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jl_CantidadPersonasCola.setOpaque(true);
        getContentPane().add(jl_CantidadPersonasCola);
        jl_CantidadPersonasCola.setBounds(559, 179, 94, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jL_InformacionToda;
    private javax.swing.JLabel jL_Reportes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jT_CantidadPersonasCola;
    private javax.swing.JTextArea jT_InformacionToda;
    private javax.swing.JTextArea jT_PromedioEdad;
    private javax.swing.JLabel jl_CantidadPersonasCola;
    private javax.swing.JLabel jl_PromedioEdad;
    // End of variables declaration//GEN-END:variables
}
