
import java.awt.Image;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class TelaInserir extends javax.swing.JFrame {
    public static ArrayList<Cadastro> banco = new ArrayList();
    static ArrayList<Estado> estado = new ArrayList<>();
    LerEscrever le = new LerEscrever();
    private TelaCadastro tc;
    public TelaInserir(ArrayList<Cadastro> x, ArrayList<Estado> y) {
        super("Inserir cadastro");
        initComponents();
        this.banco = x;
        this.estado = y;
        System.out.println("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabelFoto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextDataNasc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextAltura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bttInserirFoto = new javax.swing.JButton();
        bttInserirCad = new javax.swing.JButton();
        bttCancelar = new javax.swing.JButton();
        bttLimpar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto.setText("FOTO");

        jLabel2.setText("Nome completo:");

        jLabel3.setText("Data de Nascimento:");

        jLabel4.setText("Altura:");

        jLabel5.setText("Endereço:");

        jLabel6.setText("Número:");

        jLabel7.setText("Cidade:");

        jLabel8.setText("Estado:");

        bttInserirFoto.setText("Inserir foto");
        bttInserirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttInserirFotoActionPerformed(evt);
            }
        });

        bttInserirCad.setText("Inserir Cadastro");
        bttInserirCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttInserirCadActionPerformed(evt);
            }
        });

        bttCancelar.setText("Voltar");
        bttCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCancelarActionPerformed(evt);
            }
        });

        bttLimpar.setText("Limpar");
        bttLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLimparActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(bttLimpar)
                        .addGap(49, 49, 49)
                        .addComponent(bttInserirCad)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNumero)
                            .addComponent(jTextEndereco)
                            .addComponent(jTextCidade)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextDataNasc)
                                    .addComponent(jTextAltura)
                                    .addComponent(jTextNome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(bttInserirFoto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttInserirFoto)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttInserirCad)
                    .addComponent(bttCancelar)
                    .addComponent(bttLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    private void bttCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCancelarActionPerformed
        //TelaCadastro tc = new TelaCadastro();
        this.tc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bttCancelarActionPerformed

    private void bttLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLimparActionPerformed
        this.jTextNome.setText("");
        this.jTextDataNasc.setText("");
        this.jTextAltura.setText("");
        this.jTextEndereco.setText("");
        this.jTextNumero.setText("");
        this.jTextCidade.setText("");
        //this.jTextEstado.setText("");
    }//GEN-LAST:event_bttLimparActionPerformed

    private void bttInserirCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttInserirCadActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        
        try {
            
            //ImageIcon tmp = (ImageIcon)this.jLabelFoto.getIcon();
            
            Cadastro novo = new Cadastro(this.jTextNome.getText(),this.jTextEndereco.getText(),this.jTextCidade.getText(),
                    formato.parse(this.jTextDataNasc.getText()),Float.valueOf(this.jTextAltura.getText()), 
                    Integer.parseInt(this.jTextNumero.getText()), (ImageIcon)this.jLabelFoto.getIcon() );
            String e = jComboBox1.getSelectedItem().toString();
            int j = 0;
            while(e!= estado.get(j).getSigla()){
                j++;
            } novo.setEstado(estado.get(j));
            banco.add(novo);
            
            
            this.le.escrever_arquivo();
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
        } catch (ParseException ex) {
            Logger.getLogger(TelaInserir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_bttInserirCadActionPerformed

    private void bttInserirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttInserirFotoActionPerformed
        //através do botão "inserir foto", o usuario tem de ser capaz de escolher uma foto 
        //após isso a foto deve ser transformada em ìcone, ser instanciada na classe cadastro, e ser adicionada ao ArrayLIst
        //após isso ela deve ser gravada no arquivo.txt com todos os outros atributos da classe cadastro
        //A foto deve ser guardada no mesmo arquivo txt que os outros atributos ou deve ter uma arquivo próprio para as imagens??
        
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Selecione apenas os tipos JPG e PNG", "jpg", "png"
        );
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        ImageIcon icon = new ImageIcon(chooser.getSelectedFile().getAbsolutePath());
        Image image = icon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(120, 160, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newimg);  // transform it back
        
        jLabelFoto.setIcon(icon);
        //System.out.println(this.banco.get(2).getEstado().getNome());
    }//GEN-LAST:event_bttInserirFotoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInserir(banco, estado).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttCancelar;
    private javax.swing.JButton bttInserirCad;
    private javax.swing.JButton bttInserirFoto;
    private javax.swing.JButton bttLimpar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextAltura;
    private javax.swing.JTextField jTextCidade;
    private javax.swing.JTextField jTextDataNasc;
    private javax.swing.JTextField jTextEndereco;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextNumero;
    // End of variables declaration//GEN-END:variables

    void setTelaAuxiliar(TelaCadastro tc) {
        this.tc = tc;
    }
}

