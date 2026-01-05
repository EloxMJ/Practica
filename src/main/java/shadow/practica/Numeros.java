package shadow.practica;

import javax.swing.JOptionPane;

/*
 * @author Knight
 */
public class Numeros extends javax.swing.JFrame {    
    private Ventanas Vent;
    private Funciones Fun = new Funciones();
    private int Numero;
    
    public Numeros(Ventanas _vent) {
        this.Vent = _vent;
        initComponents();
        getContentPane().setLayout(null);
        setTitle("Números");
        setLocationRelativeTo(null);
    }
    
    private boolean ValidarNumero(String _entrada) {
        try {
            this.Numero = Integer.parseInt(_entrada);   
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private void AplicarFunciones() {        
        this.LbNumeroIngresado.setText(String.valueOf(this.Numero));
        this.LbDigitos.setText(Integer.toString(Fun.Digitos(Numero)));
        this.LbSigno.setText(Fun.EsPositivo(this.Numero));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenedor = new javax.swing.JPanel();
        PanelEntrada = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtNumero = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        PanelResultado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LbNumeroIngresado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LbSigno = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LbParidad = new javax.swing.JLabel();
        LbAbsoluto = new javax.swing.JLabel();
        LbCuadrado = new javax.swing.JLabel();
        LbCubo = new javax.swing.JLabel();
        LbRaiz2 = new javax.swing.JLabel();
        LbRaiz3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        LbBinario = new javax.swing.JLabel();
        LbHexadecimal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        LbDigitos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelEntrada.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTRADA");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Número");

        TxtNumero.setBackground(new java.awt.Color(255, 255, 255));
        TxtNumero.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setText("Aceptar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEntradaLayout = new javax.swing.GroupLayout(PanelEntrada);
        PanelEntrada.setLayout(PanelEntradaLayout);
        PanelEntradaLayout.setHorizontalGroup(
            PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PanelEntradaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(439, Short.MAX_VALUE))
        );
        PanelEntradaLayout.setVerticalGroup(
            PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        PanelContenedor.add(PanelEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 750, 90));

        PanelResultado.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SALIDA");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Número ingresado:");

        LbNumeroIngresado.setForeground(new java.awt.Color(51, 51, 51));
        LbNumeroIngresado.setText("-");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Signo:");

        LbSigno.setForeground(new java.awt.Color(51, 51, 51));
        LbSigno.setText("-");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Paridad:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Su valor absoluto:");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Su cuadrado es:");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Su cubo es:");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Su raíz cuadrada es:");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Su raíz cúbica es:");

        LbParidad.setForeground(new java.awt.Color(51, 51, 51));
        LbParidad.setText("-");

        LbAbsoluto.setForeground(new java.awt.Color(51, 51, 51));
        LbAbsoluto.setText("-");

        LbCuadrado.setForeground(new java.awt.Color(51, 51, 51));
        LbCuadrado.setText("-");

        LbCubo.setForeground(new java.awt.Color(51, 51, 51));
        LbCubo.setText("-");

        LbRaiz2.setForeground(new java.awt.Color(51, 51, 51));
        LbRaiz2.setText("-");

        LbRaiz3.setForeground(new java.awt.Color(51, 51, 51));
        LbRaiz3.setText("-");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Binario:");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Hexadecimal:");

        LbBinario.setForeground(new java.awt.Color(51, 51, 51));
        LbBinario.setText("-");

        LbHexadecimal.setForeground(new java.awt.Color(51, 51, 51));
        LbHexadecimal.setText("-");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Dígitos:");

        LbDigitos.setForeground(new java.awt.Color(51, 51, 51));
        LbDigitos.setText("-");

        javax.swing.GroupLayout PanelResultadoLayout = new javax.swing.GroupLayout(PanelResultado);
        PanelResultado.setLayout(PanelResultadoLayout);
        PanelResultadoLayout.setHorizontalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelResultadoLayout.createSequentialGroup()
                            .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel14)
                                .addComponent(jLabel9))
                            .addGap(19, 19, 19))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelResultadoLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)))
                    .addGroup(PanelResultadoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(32, 32, 32))
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbHexadecimal)
                    .addComponent(LbAbsoluto)
                    .addComponent(LbParidad)
                    .addComponent(LbSigno)
                    .addComponent(LbNumeroIngresado)
                    .addComponent(LbCuadrado)
                    .addComponent(LbDigitos)
                    .addComponent(LbRaiz2)
                    .addComponent(LbCubo)
                    .addComponent(LbRaiz3)
                    .addComponent(LbBinario))
                .addContainerGap(609, Short.MAX_VALUE))
        );
        PanelResultadoLayout.setVerticalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LbNumeroIngresado))
                .addGap(18, 18, 18)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(LbDigitos))
                .addGap(18, 18, 18)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LbSigno))
                .addGap(18, 18, 18)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LbParidad))
                .addGap(18, 18, 18)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(LbAbsoluto))
                .addGap(18, 18, 18)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(LbCuadrado))
                .addGap(18, 18, 18)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(LbCubo))
                .addGap(18, 18, 18)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbRaiz2)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(LbRaiz3))
                .addGap(18, 18, 18)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(LbBinario))
                .addGap(18, 18, 18)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(LbHexadecimal))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        PanelContenedor.add(PanelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 750, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (this.ValidarNumero(this.TxtNumero.getText())) {             
            this.AplicarFunciones();
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresarse un número", "Error", 2);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbAbsoluto;
    private javax.swing.JLabel LbBinario;
    private javax.swing.JLabel LbCuadrado;
    private javax.swing.JLabel LbCubo;
    private javax.swing.JLabel LbDigitos;
    private javax.swing.JLabel LbHexadecimal;
    private javax.swing.JLabel LbNumeroIngresado;
    private javax.swing.JLabel LbParidad;
    private javax.swing.JLabel LbRaiz2;
    private javax.swing.JLabel LbRaiz3;
    private javax.swing.JLabel LbSigno;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel PanelEntrada;
    private javax.swing.JPanel PanelResultado;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
