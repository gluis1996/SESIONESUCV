package Lab_05;

import java.awt.Font;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class PROPUESTO extends javax.swing.JFrame {

    //DECLARAR LISTA ENLAZADA
    public class Nodo {

        String codigo, nombre, tcontrato;
        double sueldo, tardanza, movilidad;
        Nodo sig;

        public Nodo(String codigo, String nombre, String tcontrato, double sueldo, double tardanza, double movilidad) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.tcontrato = tcontrato;
            this.sueldo = sueldo;
            this.tardanza = tardanza;
            this.movilidad = movilidad;
        }

    }
    //DECLARACION DE LA VARIABLES LOCALES
    public Nodo ini, fin;
    public Nodo pfound;
    int num;

    public PROPUESTO() {
        initComponents();
        num=0;
    }

    void Encabezado() {
        txtLista.setFont(new Font("monospaced", Font.PLAIN, 12));
        txtLista.setText("");
        //Insertar encabezado al textarea
        txtLista.append("");
        txtLista.append(" N°    CODIGO        NOMBRES             T. CONTRATO        SUELDO   TARDANZA    MOVILIDAD\n");
        txtLista.append(" ------------------------------------------------------\n");
    }

    void verDatos() {
        String cod, nombre, tcontrato;
        double sueldo, tardanza, movilidad;
        Nodo aux = ini;
        num = 0;
        //colocando el encabezado
        Encabezado();
        //RECORRIENDO LA LISTA
        while (aux != null) {
            cod = aux.codigo;
            nombre = aux.nombre;
            tcontrato = aux.tcontrato;
            sueldo = aux.sueldo;
            tardanza = aux.tardanza;
            movilidad = aux.movilidad;
            num++;
            String numera = String.valueOf(num);

            for (int i = String.valueOf(num).length(); i < 5; i++) {
                numera = " " + numera;
            }
            for (int i = cod.length(); i < 12; i++) {
                cod = cod+" " ;
            }
            for (int i = nombre.length(); i < 20; i++) {
                nombre = nombre + " ";
            }
            for (int i = tcontrato.length(); i < 20; i++) {
                nombre = nombre + " ";
            }
            DecimalFormat df2 = new DecimalFormat("####.00");

            txtLista.append(numera  + " " + cod + nombre + tcontrato + " " + sueldo + " " + tardanza + " " + movilidad + "\n");
            aux = aux.sig;
        }
    }

    Nodo InsertarInicio(Nodo inicio, String cod, String nom, String tcontrato, double sueldo, double tardanza, double movilidad) {
        Nodo nuevo = new Nodo(cod, nom, tcontrato, sueldo, tardanza, movilidad);
        //Realizando los enlaces correspondientes
        nuevo.sig = inicio;
        inicio = nuevo;
        return inicio;
    }

    Nodo Buscar(Nodo inicio, String cod) {
        Nodo pos = inicio;
        //recorriendo la lista para encontrar la inf
        while (pos != null && !cod.equalsIgnoreCase(pos.codigo)) {
            pos = pos.sig;
        }
        return pos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        cbxcontrato = new javax.swing.JComboBox<>();
        txtsueldo = new javax.swing.JTextField();
        txtmovilidad = new javax.swing.JTextField();
        txttardanza = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLista = new javax.swing.JTextArea();
        BTNGUARDAD = new javax.swing.JButton();
        BTNCONSULTAR = new javax.swing.JButton();
        BTNACTUALIZAR = new javax.swing.JButton();
        BTNELIMINAR = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtcontador = new javax.swing.JTextField();
        txtempleado = new javax.swing.JTextField();
        txtmontoM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtcodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("CODIGO"));

        txtnombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        cbxcontrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "PLAZO FIJO", "SERVICIO NO PERSONALES", "SERVICE" }));
        cbxcontrato.setBorder(javax.swing.BorderFactory.createTitledBorder("TIPO DE CONTRATO"));
        cbxcontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxcontratoActionPerformed(evt);
            }
        });

        txtsueldo.setBorder(javax.swing.BorderFactory.createTitledBorder("SUELDO"));

        txtmovilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("M. A. POR MOVILIDAD"));

        txttardanza.setBorder(javax.swing.BorderFactory.createTitledBorder("MIN. TARDANZA"));

        txtLista.setColumns(20);
        txtLista.setRows(5);
        jScrollPane1.setViewportView(txtLista);

        BTNGUARDAD.setBackground(new java.awt.Color(0, 153, 153));
        BTNGUARDAD.setText("GUARDAR");
        BTNGUARDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGUARDADActionPerformed(evt);
            }
        });

        BTNCONSULTAR.setBackground(new java.awt.Color(102, 102, 255));
        BTNCONSULTAR.setText("CONSULTAR");
        BTNCONSULTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCONSULTARActionPerformed(evt);
            }
        });

        BTNACTUALIZAR.setText("ACTUALIZAR");
        BTNACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNACTUALIZARActionPerformed(evt);
            }
        });

        BTNELIMINAR.setText("ELIMINAR");
        BTNELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNELIMINARActionPerformed(evt);
            }
        });

        jButton1.setText("RESUMEN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtcontador.setBorder(javax.swing.BorderFactory.createTitledBorder("N° DE EMPLEADOS CON MAS DE 15 MIN TARD."));

        txtempleado.setBorder(javax.swing.BorderFactory.createTitledBorder("N° DE EMPLEADOS CON > TARD."));

        txtmontoM.setBorder(javax.swing.BorderFactory.createTitledBorder("MAYOR MONTO DE MOVILIDAD"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTNGUARDAD)
                        .addGap(6, 6, 6)
                        .addComponent(BTNCONSULTAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNACTUALIZAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNELIMINAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxcontrato, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmovilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txttardanza, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmontoM, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcontador, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcontador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txttardanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txtmontoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(cbxcontrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtmovilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNGUARDAD)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTNCONSULTAR)
                        .addComponent(BTNACTUALIZAR)
                        .addComponent(BTNELIMINAR)
                        .addComponent(jButton1)))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxcontratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxcontratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxcontratoActionPerformed

    private void BTNGUARDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGUARDADActionPerformed
        String cod = txtcodigo.getText();
        String nombre = txtnombre.getText();
        String contrato = cbxcontrato.getSelectedItem().toString();
        double sueldo = Double.parseDouble(txtsueldo.getText());
        int tardanza = Integer.parseInt(txttardanza.getText());
        double movilidad = Double.parseDouble(txtmovilidad.getText());
        ini = InsertarInicio(ini, cod, nombre, contrato, sueldo, tardanza, movilidad);
        verDatos();
        Deshabilitar();
    }//GEN-LAST:event_BTNGUARDADActionPerformed

    private void BTNCONSULTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCONSULTARActionPerformed
        String cod = txtcodigo.getText();
        if (cod.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "ingrese algun valor");
        } else {
            pfound = Buscar(ini, cod);

            if (pfound != null) {
                txtnombre.setText(pfound.nombre);
                cbxcontrato.setSelectedItem(pfound.tcontrato);
                txtsueldo.setText(String.valueOf(pfound.sueldo));
                txttardanza.setText(String.valueOf(pfound.tardanza));
                txtmovilidad.setText(String.valueOf(pfound.movilidad));
                Habilitar();
            } else {
                JOptionPane.showMessageDialog(this, "El codigo: " + cod + ", no esta en la lista...");
            }
        }

    }//GEN-LAST:event_BTNCONSULTARActionPerformed

    private void BTNACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNACTUALIZARActionPerformed
        pfound.codigo = txtcodigo.getText();
        pfound.nombre = txtnombre.getText();
        pfound.tcontrato = cbxcontrato.getSelectedItem().toString();
        pfound.sueldo = Double.parseDouble(txtsueldo.getText());
        pfound.tardanza = Double.parseDouble(txttardanza.getText());
        pfound.movilidad = Double.parseDouble(txtmovilidad.getText());
        LimpiarEntradas();
        Deshabilitar();
        verDatos();
    }//GEN-LAST:event_BTNACTUALIZARActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //colocando el encabezado el encabezado
        Encabezado();
        //desabilitando objetos
        Deshabilitar();
    }//GEN-LAST:event_formWindowOpened

    private void BTNELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNELIMINARActionPerformed
        Eliminar((pfound));
        LimpiarEntradas();
        verDatos();
        if (ini == null) {
            JOptionPane.showMessageDialog(this, "La lista es vacia");
        }
        Deshabilitar();
    }//GEN-LAST:event_BTNELIMINARActionPerformed

    void LimpiarEntradas() {
        txtcodigo.setText("");
        txtnombre.setText("");
        cbxcontrato.setSelectedIndex(0);
        txtsueldo.setText("");
        txttardanza.setText("");
        txtmovilidad.setText("");
        txtcodigo.requestFocus();
    }

    void Habilitar() {
        BTNACTUALIZAR.setEnabled(true);
        BTNELIMINAR.setEnabled(true);
        BTNGUARDAD.setEnabled(false);
    }

    void Deshabilitar() {
        BTNACTUALIZAR.setEnabled(false);
        BTNELIMINAR.setEnabled(false);
        BTNGUARDAD.setEnabled(true);
    }

    void Eliminar(Nodo Actual) {
        //creando un puntero al nodo anterior actual
        Nodo anterior = ini;
        while (anterior.sig != Actual && anterior.sig != null) {
            anterior = anterior.sig;
            //2.- Eliminar el nodo si existe
            if (Actual != null) {
                if (Actual != null) {
                    ini = Actual.sig;
                } else {
                    anterior.sig = Actual.sig;
                }

            }
        }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PROPUESTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROPUESTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROPUESTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROPUESTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROPUESTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNACTUALIZAR;
    private javax.swing.JButton BTNCONSULTAR;
    private javax.swing.JButton BTNELIMINAR;
    private javax.swing.JButton BTNGUARDAD;
    private javax.swing.JComboBox<String> cbxcontrato;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtLista;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcontador;
    private javax.swing.JTextField txtempleado;
    private javax.swing.JTextField txtmontoM;
    private javax.swing.JTextField txtmovilidad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsueldo;
    private javax.swing.JTextField txttardanza;
    // End of variables declaration//GEN-END:variables
}
