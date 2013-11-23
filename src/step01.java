/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0w3w
 */
public class step01 extends javax.swing.JFrame {

    /**
     * Creates new form step01
     */
    public step01() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleText = new javax.swing.JLabel();
        StepTitle = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        scrollPaneSuministros = new javax.swing.JScrollPane();
        listaSuministros = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nextStepBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        nombreSuministroTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cantidadSuministroTxt = new javax.swing.JTextField();
        restartBtn = new javax.swing.JButton();
        addSuministroBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleText.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        TitleText.setText("Método del Transporte");

        StepTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        StepTitle.setText("Paso 1");

        subTitle.setText("Agrega todos los Suministros");

        listaSuministros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPaneSuministros.setViewportView(listaSuministros);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Suministros agregados:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Agregar Suministros");

        nextStepBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        nextStepBtn.setText("Siguiente Paso >");
        nextStepBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextStepBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar Suministro");

        jLabel7.setText("Nombre:");

        jLabel8.setText("Cantidad de Suministro");

        restartBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        restartBtn.setText("Iniciar Nuevamente");
        restartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartBtnActionPerformed(evt);
            }
        });

        addSuministroBtn.setText("Agregar Suministro");
        addSuministroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSuministroBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(addSuministroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreSuministroTxt)
                            .addComponent(cantidadSuministroTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollPaneSuministros, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StepTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subTitle))
                            .addComponent(TitleText)
                            .addComponent(jLabel6))
                        .addGap(218, 218, 218)
                        .addComponent(jLabel5)
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(restartBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextStepBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StepTitle)
                    .addComponent(subTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneSuministros, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreSuministroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadSuministroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addSuministroBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextStepBtn)
                    .addComponent(restartBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextStepBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextStepBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextStepBtnActionPerformed

    private void restartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartBtnActionPerformed
        this.dispose();
        new main().setVisible(true);
    }//GEN-LAST:event_restartBtnActionPerformed

    private void addSuministroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSuministroBtnActionPerformed
        String nombreSuministroStr = nombreSuministroTxt.getText();
        String cantidadSuministroStr = cantidadSuministroTxt.getText();
        // Agregar a la lista
    }//GEN-LAST:event_addSuministroBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StepTitle;
    private javax.swing.JLabel TitleText;
    private javax.swing.JButton addSuministroBtn;
    private javax.swing.JTextField cantidadSuministroTxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList listaSuministros;
    private javax.swing.JButton nextStepBtn;
    private javax.swing.JTextField nombreSuministroTxt;
    private javax.swing.JButton restartBtn;
    private javax.swing.JScrollPane scrollPaneSuministros;
    private javax.swing.JLabel subTitle;
    // End of variables declaration//GEN-END:variables
}
