/* Projeto LP1 - Cadastro de pilotos de aeronave
 * 
 * Professora: Daniela Coelho Batista Guedes Pereira
 * 
 * Grupo: Caio Marcelo Campoy Guedes
 *        Adalberto Belmiro de Souto Neto
 *        Nycholas de Sousa
 *        Victor Batista Maia
 * 
 * Descrição da Classe: Classe responável por gerar o índice dos pilotos
 */
package cadastroPilotos;

import cadastroPilotos.piloto.Piloto;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nycholas
 */
public class Indice extends javax.swing.JInternalFrame {

    /**
     * Creates new form Indice
     */
    public Indice() {
        initComponents(); //Default NetBeans
         jButton1.setToolTipText("Gerar índice"); //Mostra informações sobre o botão para o usuário
    }
    
    private void leTabela(){
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel(); //Envia formato da tabela a modelo
        modelo.setNumRows(0);   
        for(Piloto p : Persistencia.getListaPiloto() ){
            modelo.addRow(new Object[] {p.getNome(), p.getBreve()}); //Adiciona novo índice a cada linha da tabela.
        }
    }
    
    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Índice");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastroPilotos/imagens/aviao.png"))); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Brevê"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Gerar Índice");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        leTabela(); //Gera Tabela
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
