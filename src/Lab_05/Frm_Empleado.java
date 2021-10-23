
package Lab_05;

import java.awt.Font;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class Frm_Empleado extends javax.swing.JFrame {
    //Declaracion de la lista enlazada
    public class Nodo {
        String codigo;
        String nombre;
        String sueldo;
        Nodo sig;
    public Nodo (String cod, String nom, String suel){
        codigo=cod;
        nombre=nom;
        sueldo=suel;
    }
    }
    //Declaracion de variables locales
    public Nodo ini,fin;
    public Nodo pFound;
    int num=0;
    
    public Frm_Empleado() {
        initComponents();
    }
    void Encabezado(){
        txtAReporte.setFont(new Font("monospaced",Font.PLAIN, 12));
        txtAReporte.setText("");
        //Insertar encabezado al textarea
        txtAReporte.append("");
        txtAReporte.append(" N°    CODIGO        NOMBRES                    SUELDO\n");
        txtAReporte.append(" ------------------------------------------------------\n");
    }
    void Habilitar(){
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
    }
    
    void Deshabilitar(){
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
    }
    
    void LimpiarEntradas(){
       jtxtCodigo.setText("");
       jtxtNombre.setText("");
       jtxtSueldo.setText("");
       jtxtCodigo.requestFocus();
    }
    
    void VerDatos(){
        String cod,nom,s;
        Nodo aux=ini;
        num=0;
        //colocando el encabezado
        Encabezado();
        //Recorriendo la lista
        while(aux!=null){
            cod=aux.codigo;
            nom=aux.nombre;
            s=aux.sueldo;
            num++;
            String numera = String.valueOf(num);
            //modificando el tamaño de la numeracion con espacio en blanco a la izquierda
            for(int i=String.valueOf(num).length();i<5;i++){
                numera = " "+numera; }
            //modificando el tamaño de la cadena codigo con espacios en blanco derecha
            for(int i=cod.length();i<12;i++){
                cod=cod+" ";
            }
            //modificando el tamaño de la cadena con espacios en blanco de la derecha
            for(int i=nom.length();i<20;i++){
                nom=nom+" ";
            }
            DecimalFormat df2 = new DecimalFormat("####.00");
            s=" "+s;
            //colocando el tamaño de la cadena sueldo con espacios en blanco a la izquierda
            txtAReporte.append(numera+" "+cod+nom+s+"\n");
            aux=aux.sig;
            
        }
    }
    
    Nodo Buscar (Nodo inicio,String cod){
        Nodo pos=inicio;
        //recorriendo la lista para encontrar la inf
              while(pos!=null && !cod.equalsIgnoreCase(pos.codigo))
                      pos=pos.sig;
        return pos;
    }
    
    Nodo InsertarInicio(Nodo inicio,String cod, String nom, String suel){
        Nodo nuevo=new Nodo (cod,nom,suel);
        //Realizando los enlaces correspondientes
        nuevo.sig=inicio;
        inicio=nuevo;
        return inicio;
    }
    
    void Eliminar(Nodo Actual){
        //creando un puntero al nodo anterior actual
        Nodo anterior=ini;
        while(anterior.sig!=Actual && anterior.sig!=null){
            anterior=anterior.sig;
            //2.- Eliminar el nodo si existe
        if(Actual !=null){
            if(Actual !=null) ini=Actual.sig;
            else anterior.sig=Actual.sig;
            
        }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtSueldo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAReporte = new javax.swing.JTextArea();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CODIGO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 30));

        jLabel2.setText("NOMBRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, 40));

        jLabel3.setText("SUELDO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 80, 30));
        jPanel1.add(jtxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, 40));
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 230, 40));

        jtxtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSueldoActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 160, 40));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 120, 40));

        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 120, 40));

        txtAReporte.setColumns(20);
        txtAReporte.setRows(5);
        jScrollPane1.setViewportView(txtAReporte);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 590, 250));

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 110, 40));

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 110, 40));

        btnRestaurar.setText("RESTAURAR");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 120, 40));

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String cod=jtxtCodigo.getText();
    String nom=jtxtNombre.getText().toUpperCase();
    String suel=jtxtSueldo.getText();
    //Creando el nodo de la lista memoria y colocando la infformacion
    ini=InsertarInicio(ini, cod, nom, suel);
    LimpiarEntradas();
    VerDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        pFound.codigo=jtxtCodigo.getText();
        pFound.nombre=jtxtNombre.getText();
        pFound.sueldo=jtxtSueldo.getText();
        LimpiarEntradas();
        Deshabilitar();
        VerDatos();   
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       String cod=jtxtCodigo.getText();
       if(cod.equalsIgnoreCase("")){
           JOptionPane.showMessageDialog(this,"Ingrese un codigo por favor");
       } else {
           //llamada a la funcion que retorna de la posicion de dato buscado
           pFound=Buscar(ini, cod);
           //verificando el puntero para mostrar la inf. buscada
           if(pFound!=null){
               jtxtNombre.setText(pFound.nombre);
               jtxtSueldo.setText(pFound.sueldo);
            //habilitamos los objetos para eliminar y actualizar
            Habilitar();
           } else {
               JOptionPane.showMessageDialog(this, "El codigo: "+cod+", no esta en la lista...");
           }
       }
       
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Eliminar((pFound));
        LimpiarEntradas();
        VerDatos();
        if (ini==null)
            JOptionPane.showMessageDialog(this,"La lista es vacia");
        Deshabilitar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
       LimpiarEntradas();
       Deshabilitar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //colocando el encabezado el encabezado
        Encabezado();
        //desabilitando objetos
        Deshabilitar();
    }//GEN-LAST:event_formWindowOpened

    private void jtxtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSueldoActionPerformed
    

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
            java.util.logging.Logger.getLogger(Frm_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtSueldo;
    private javax.swing.JTextArea txtAReporte;
    // End of variables declaration//GEN-END:variables
}
