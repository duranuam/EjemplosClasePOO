/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author labc205
 */
public class Usuario 
        extends javax.swing.JInternalFrame {
    int fila=-1;
    private dao.Usuario lista = new dao.Usuario();
    
    /**
     * Creates new form Usuario
     */
    public Usuario() {
        initComponents();
        
    }
    
    public Usuario(dao.Usuario user){
        initComponents();
        this.lista = user;
        jTblRegistros.setModel(generarTabla());
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
        jLabel1 = new javax.swing.JLabel();
        jTfUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPfPw = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jTfNombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTfApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTfEmail = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jBtnNuevo = new javax.swing.JButton();
        jBtnGuardar = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblRegistros = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuarios");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)), "Datos Generales"));

        jLabel1.setText("Nombre de usuario:");

        jLabel2.setText("Contraseña:");

        jLabel3.setText("Nombres:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("E-mail:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTfApellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jTfNombres, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPfPw, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTfUserName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTfEmail))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPfPw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jToolBar1.setRollover(true);

        jBtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/img/Nuevo.png"))); // NOI18N
        jBtnNuevo.setToolTipText("Nuevo");
        jBtnNuevo.setFocusable(false);
        jBtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnNuevo);

        jBtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/img/Guardar.png"))); // NOI18N
        jBtnGuardar.setToolTipText("Guardar");
        jBtnGuardar.setFocusable(false);
        jBtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnGuardar);

        jBtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/img/editar.png"))); // NOI18N
        jBtnEditar.setToolTipText("Editar");
        jBtnEditar.setEnabled(false);
        jBtnEditar.setFocusable(false);
        jBtnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnEditar);

        jBtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/img/Eliminar.png"))); // NOI18N
        jBtnEliminar.setToolTipText("Eliminar}");
        jBtnEliminar.setEnabled(false);
        jBtnEliminar.setFocusable(false);
        jBtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBtnEliminar);

        jTblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTblRegistrosMousePressed(evt);
            }
        });
        jTblRegistros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTblRegistrosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTblRegistros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
        jBtnGuardar.setEnabled(true);
        jBtnEliminar.setEnabled(false);
        jBtnEditar.setEnabled(false);
    }//GEN-LAST:event_jBtnNuevoActionPerformed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        // TODO add your handling code here:
        String id = jTfUserName.getText();
        String pw = String.valueOf(jPfPw.getPassword());
        String nom = jTfNombres.getText();
        String ape = jTfApellidos.getText();
        String ema = jTfEmail.getText();
        lista.agregar(id, pw, nom, ape, ema);
        limpiar();
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jTblRegistrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblRegistrosMousePressed
        // TODO add your handling code here:
        
        try{
            fila = jTblRegistros.getSelectedRow();
            String userName = lista.getLista().
                    get(fila).getUserName();
            String pw = lista.getLista().
                    get(fila).getPw();
            String nom = lista.getLista().
                    get(fila).getNombres();
            String ape = lista.getLista().
                    get(fila).getApellidos();
            String email = lista.getLista().
                    get(fila).getEmail();
            this.jTfUserName.setText(userName);
            this.jPfPw.setText(pw);
            this.jTfNombres.setText(nom);
            this.jTfApellidos.setText(ape);
            this.jTfEmail.setText(email);
            this.jBtnGuardar.setEnabled(false);
            this.jBtnEditar.setEnabled(true);
            this.jBtnEliminar.setEnabled(true);
            //this.jTfUserName.requestFocus();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,
                    "Error al Seleccionar", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTblRegistrosMousePressed

    private void ubicarTxt(){
        fila = jTblRegistros.getSelectedRow();
            String userName = lista.getLista().
                    get(fila).getUserName();
            String pw = lista.getLista().
                    get(fila).getPw();
            String nom = lista.getLista().
                    get(fila).getNombres();
            String ape = lista.getLista().
                    get(fila).getApellidos();
            String email = lista.getLista().
                    get(fila).getEmail();
            this.jTfUserName.setText(userName);
            this.jPfPw.setText(pw);
            this.jTfNombres.setText(nom);
            this.jTfApellidos.setText(ape);
            this.jTfEmail.setText(email);
            this.jBtnGuardar.setEnabled(false);
            this.jBtnEditar.setEnabled(true);
            this.jBtnEliminar.setEnabled(true);
            //this.jTfUserName.requestFocus();
    }
    private void jTblRegistrosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTblRegistrosKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_DOWN || 
                evt.getKeyCode() == KeyEvent.VK_UP){
            ubicarTxt();
        }
    }//GEN-LAST:event_jTblRegistrosKeyReleased

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        // TODO add your handling code here:
        String id = jTfUserName.getText();
        String pw = String.valueOf(jPfPw.getPassword());
        String nom = jTfNombres.getText();
        String ape = jTfApellidos.getText();
        String ema = jTfEmail.getText();
        lista.editar(id, pw, nom, ape, ema);
        jBtnGuardar.setEnabled(true);
        jBtnEditar.setEnabled(false);
        jBtnEliminar.setEnabled(false);
        limpiar();
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void limpiar(){
        jTfUserName.setText("");
        jPfPw.setText("");
        jTfNombres.setText("");
        jTfApellidos.setText("");
        jTfEmail.setText("");
        jTblRegistros.setModel(generarTabla());
        jTfUserName.requestFocus();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPfPw;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblRegistros;
    private javax.swing.JTextField jTfApellidos;
    private javax.swing.JTextField jTfEmail;
    private javax.swing.JTextField jTfNombres;
    private javax.swing.JTextField jTfUserName;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    public dao.Usuario getLista() {
        return lista;
    }

    public void setLista(dao.Usuario lista) {
        this.lista = lista;
    }
    
    private DefaultTableModel generarTabla(){
        DefaultTableModel dtm = new DefaultTableModel();
        try{
            String titulos[]={"ID", "NOMBRE COMPLETO", 
                "EMAIL"};
            dtm.setColumnIdentifiers(titulos);
            Object fila[] = new Object[3];
            int i=0;
            
            while(i < lista.getLista().size()){
                fila[0] = lista.getLista().get(i).getUserName();
                fila[1] = lista.getLista().get(i).getNombres() +
                        " " +lista.getLista().get(i).getApellidos();
                fila[2] = lista.getLista().get(i).getEmail();
                dtm.addRow(fila);
                i++;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: " +
                    ex.getMessage(), "Error al generar tabla",
                    JOptionPane.WARNING_MESSAGE);
        }
        return dtm;
    }
}
