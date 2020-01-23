package ueberschussrechner;
public class UeberschussGUI extends javax.swing.JFrame {
    public UeberschussGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        buchungButton = new javax.swing.JButton();
        speichernButton = new javax.swing.JButton();
        ladenButton = new javax.swing.JButton();
        druckenButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        buchungsTabelle = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buchungButton.setText("Buchung");
        buchungButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buchungButtonActionPerformed(evt);
            }
        });

        speichernButton.setText("Speichern");

        ladenButton.setText("Laden");
        ladenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ladenButtonActionPerformed(evt);
            }
        });

        druckenButton.setText("Drucken");

        buchungsTabelle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Datum", "Einnahmen", "Ausgaben", "Belegnummer", "Kommentar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(buchungsTabelle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(speichernButton)
                        .addGap(11, 11, 11)
                        .addComponent(druckenButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ladenButton)
                        .addGap(81, 81, 81)
                        .addComponent(buchungButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(0, 353, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speichernButton)
                    .addComponent(druckenButton)
                    .addComponent(ladenButton)
                    .addComponent(buchungButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buchungButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buchungButtonActionPerformed

    }//GEN-LAST:event_buchungButtonActionPerformed

    private void ladenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ladenButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ladenButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UeberschussGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buchungButton;
    private javax.swing.JTable buchungsTabelle;
    private javax.swing.JButton druckenButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton ladenButton;
    private javax.swing.JButton speichernButton;
    // End of variables declaration//GEN-END:variables
}
