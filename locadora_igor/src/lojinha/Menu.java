/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojinha;

import dao.CarroDAO;
import dao.Conexao;
import dao.FornecedorDAO;
import dao.VendedorDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author kiraisk
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPlaca = new javax.swing.JTextField();
        jPot = new javax.swing.JTextField();
        jMod = new javax.swing.JTextField();
        jCor = new javax.swing.JTextField();
        jMarca = new javax.swing.JTextField();
        jAno = new javax.swing.JTextField();
        jPreco = new javax.swing.JTextField();
        jOK1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jNomeF = new javax.swing.JTextField();
        jEstado = new javax.swing.JTextField();
        jCidade = new javax.swing.JTextField();
        jTelF = new javax.swing.JTextField();
        jEmailF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jNomeV = new javax.swing.JTextField();
        jCod = new javax.swing.JTextField();
        jTelV = new javax.swing.JTextField();
        jEmailV = new javax.swing.JTextField();
        jSal = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Placa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Potência");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Modelo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Cor");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Marca");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Ano");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Preço");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jPlaca.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, -1));

        jPot.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPotActionPerformed(evt);
            }
        });
        jPanel1.add(jPot, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 90, -1));

        jMod.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 90, -1));

        jCor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 90, -1));

        jMarca.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 90, -1));

        jAno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 90, -1));

        jPreco.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 90, -1));

        jOK1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jOK1.setText("OK");
        jOK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOK1ActionPerformed(evt);
            }
        });
        jPanel1.add(jOK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 80, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/4fdc2b05b4fd8f6c1509ccd379f315df.jpg"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 250));

        jTabbedPane1.addTab("Carro", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Nome");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 32, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Estado");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Cidade");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 108, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Telefone");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 146, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Email");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 184, -1, -1));

        jNomeF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(jNomeF, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 29, 199, -1));

        jEstado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(jEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 67, 40, -1));

        jCidade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(jCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 105, 199, -1));

        jTelF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(jTelF, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 143, 150, -1));

        jEmailF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(jEmailF, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 181, 150, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 80, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/4fdc2b05b4fd8f6c1509ccd379f315df.jpg"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 250));

        jTabbedPane1.addTab("Fornecedor", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Nome");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Código");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Telefone");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Email");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Salário");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        jNomeV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jNomeV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeVActionPerformed(evt);
            }
        });
        jPanel3.add(jNomeV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 210, 20));

        jCod.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(jCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 40, 20));

        jTelV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(jTelV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 150, 20));

        jEmailV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(jEmailV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 147, 210, -1));

        jSal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(jSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 187, 100, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 80, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/4fdc2b05b4fd8f6c1509ccd379f315df.jpg"))); // NOI18N
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 250));

        jTabbedPane1.addTab("Vendedor", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPotActionPerformed

    private void jOK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOK1ActionPerformed
        Carro carro1 = new Carro("","","","","","","");
        carro1.setPlaca(jPlaca.getText());
        carro1.setPotencia(jPot.getText());
        carro1.setModelo(jMod.getText());
        carro1.setCor(jCor.getText());
        carro1.setMarca(jMarca.getText());
        carro1.setAno(jAno.getText());
        carro1.setPreco(jPreco.getText());

        if(jPlaca.getText().equals("") || jPot.getText().equals("") || jMod.getText().equals("") || jCor.getText().equals("") 
                || jMarca.getText().equals("") || jAno.getText().equals("") || jPreco.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Favor preencher todos os campos");
        }else{
        JOptionPane.showMessageDialog(null, "Placa: " +carro1.getPlaca()+ "\nPotência: " +carro1.getPotencia()+ 
                "\nModelo: " +carro1.getModelo()+ "\nCor: " +carro1.getCor()+ "\nMarca: " +carro1.getMarca()+ 
                "\nAno: " +carro1.getAno()+ "\nPreço: "+carro1.getPreco(),"Informações do Carro", JOptionPane.INFORMATION_MESSAGE);
        }
        
        Carro usuario = new Carro(carro1.getPlaca(), carro1.getPotencia(), carro1.getModelo(), carro1.getCor(), carro1.getMarca(), carro1.getAno(), carro1.getPreco());
        
        try {
            Connection conexao = new Conexao().getConnection();
            CarroDAO cadastro = new CarroDAO(conexao);
            cadastro.insert(usuario);

        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jOK1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Fornecedor fornecedor = new Fornecedor ("", "", "", "", "");
        
        fornecedor.setNome(jNomeF.getText());
        fornecedor.setEstado(jEstado.getText());
        fornecedor.setCidade(jCidade.getText());
        fornecedor.setTelefone(jTelF.getText());
        fornecedor.setEmail(jEmailF.getText());

        if(jNomeF.getText().equals("") || jEstado.getText().equals("") || jCidade.getText().equals("") || jTelF.getText().equals("") 
                || jEmailF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Favor preencher todos os campos");
        }else{
        JOptionPane.showMessageDialog(null, "Nome: " +fornecedor.getNome()+ "\nEstado: " +fornecedor.getEstado()+ 
                "\nCidade: " +fornecedor.getCidade()+ "\nTelefone: " +fornecedor.getTelefone()+ "\nEmail: " +fornecedor.getEmail(), 
                "Informações do Fornecedor", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        Fornecedor usuario = new Fornecedor(fornecedor.getNome(), fornecedor.getEstado(), fornecedor.getCidade(), fornecedor.getTelefone(), fornecedor.getEmail());
        
        try {
            Connection conexao = new Conexao().getConnection();
            FornecedorDAO cadastro = new FornecedorDAO(conexao);
            cadastro.insert(usuario);

        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Vendedor vendedor = new Vendedor("", "", "", "", "");
        
        vendedor.setNome(jNomeV.getText());
        vendedor.setCodigo(jCod.getText());
        vendedor.setTelefone(jTelV.getText());
        vendedor.setEmail(jEmailV.getText());
        vendedor.setSalario(jSal.getText());

        if(jNomeV.getText().equals("") || jCod.getText().equals("") || jTelV.getText().equals("") || jEmailV.getText().equals("") 
                || jSal.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Favor preencher todos os campos");
        }else{
        JOptionPane.showMessageDialog(null, "Nome: " +vendedor.getNome()+ "\nCódigo: " +vendedor.getCodigo()+ 
                "\nTelefone: " +vendedor.getTelefone()+ "\nEmail: " +vendedor.getEmail()+ "\nSalário: " +vendedor.getSalario(), 
                "Informações do Vendedor", JOptionPane.INFORMATION_MESSAGE);
        }
        
        Vendedor usuario = new Vendedor(vendedor.getNome(), vendedor.getCodigo(), vendedor.getTelefone(), vendedor.getEmail(), vendedor.getSalario());
        
        try {
            Connection conexao = new Conexao().getConnection();
            VendedorDAO cadastro = new VendedorDAO(conexao);
            cadastro.insert(usuario);

        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jNomeVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeVActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jCidade;
    private javax.swing.JTextField jCod;
    private javax.swing.JTextField jCor;
    private javax.swing.JTextField jEmailF;
    private javax.swing.JTextField jEmailV;
    private javax.swing.JTextField jEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jMarca;
    private javax.swing.JTextField jMod;
    private javax.swing.JTextField jNomeF;
    private javax.swing.JTextField jNomeV;
    private javax.swing.JButton jOK1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jPlaca;
    private javax.swing.JTextField jPot;
    private javax.swing.JTextField jPreco;
    private javax.swing.JTextField jSal;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTelF;
    private javax.swing.JTextField jTelV;
    // End of variables declaration//GEN-END:variables
}