package View;


import Controller.Ctrl_Msg;
import Model.Model_Banco;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.oasis.JROdtExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRPptxExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class View_Relatorio extends javax.swing.JFrame {
    
    private static String status = "0";
    private final static SimpleDateFormat FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    
    public View_Relatorio() {
        initComponents();
        centralizarComponente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDeletar = new javax.swing.JButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btnFechar = new javax.swing.JButton();
        btnGerar = new javax.swing.JButton();
        pnlFormato1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        pnlFormato2 = new javax.swing.JPanel();
        jRadioButtomAberta = new javax.swing.JRadioButton();
        jRadioButtomEncerrada = new javax.swing.JRadioButton();
        jRadioButtomEncerrada1 = new javax.swing.JRadioButton();
        jRadioButtomEncerrada2 = new javax.swing.JRadioButton();
        pnlFormato = new javax.swing.JPanel();
        jRadioButtonPDF = new javax.swing.JRadioButton();
        jRadioButtonXLS = new javax.swing.JRadioButton();
        jRadioButtonHTML = new javax.swing.JRadioButton();
        jRadioButtonXML = new javax.swing.JRadioButton();
        jRadioButtonRTF = new javax.swing.JRadioButton();
        jRadioButtonDOCX = new javax.swing.JRadioButton();
        jRadioButtonPPTX = new javax.swing.JRadioButton();
        jRadioButtonODT = new javax.swing.JRadioButton();

        btnDeletar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easyexcluir.png"))); // NOI18N
        btnDeletar.setText("Excluir");
        btnDeletar.setToolTipText("Clique aqui para excluir o registro");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Vendas");
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);
        setSize(new java.awt.Dimension(723, 400));

        btnFechar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easyfechar.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setToolTipText("Clique aqui para fechar");
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnGerar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Print2.png"))); // NOI18N
        btnGerar.setText("Gerar");
        btnGerar.setToolTipText("Clique aqui para fechar");
        btnGerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        pnlFormato1.setBorder(javax.swing.BorderFactory.createTitledBorder("Intervalo de Tempo"));
        pnlFormato1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblNome.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblNome.setText("Data Inicio :");

        lblNome1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblNome1.setText("Data Final :");

        jDateChooser1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jDateChooser1.setName("JDateChooserInicio\n"); // NOI18N

        jDateChooser2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jDateChooser2.setName("JDateChooserInicio\n"); // NOI18N

        javax.swing.GroupLayout pnlFormato1Layout = new javax.swing.GroupLayout(pnlFormato1);
        pnlFormato1.setLayout(pnlFormato1Layout);
        pnlFormato1Layout.setHorizontalGroup(
            pnlFormato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormato1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblNome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlFormato1Layout.setVerticalGroup(
            pnlFormato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormato1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlFormato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(pnlFormato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormato1Layout.createSequentialGroup()
                        .addComponent(lblNome1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        pnlFormato2.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));
        pnlFormato2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        buttonGroup2.add(jRadioButtomAberta);
        jRadioButtomAberta.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButtomAberta.setSelected(true);
        jRadioButtomAberta.setText("Aberta");
        jRadioButtomAberta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MudaStatus(evt);
            }
        });
        jRadioButtomAberta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtomAbertaActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButtomEncerrada);
        jRadioButtomEncerrada.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButtomEncerrada.setText("Encerrada");
        jRadioButtomEncerrada.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MudaStatus2(evt);
            }
        });
        jRadioButtomEncerrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtomEncerradaActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButtomEncerrada1);
        jRadioButtomEncerrada1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButtomEncerrada1.setText("Anulada");
        jRadioButtomEncerrada1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MudaStatus3(evt);
            }
        });
        jRadioButtomEncerrada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtomEncerrada1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButtomEncerrada2);
        jRadioButtomEncerrada2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButtomEncerrada2.setText("Todos");
        jRadioButtomEncerrada2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MudaStatus4(evt);
            }
        });
        jRadioButtomEncerrada2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtomEncerrada2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormato2Layout = new javax.swing.GroupLayout(pnlFormato2);
        pnlFormato2.setLayout(pnlFormato2Layout);
        pnlFormato2Layout.setHorizontalGroup(
            pnlFormato2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormato2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jRadioButtomAberta)
                .addGap(18, 26, Short.MAX_VALUE)
                .addComponent(jRadioButtomEncerrada)
                .addGap(24, 24, 24)
                .addComponent(jRadioButtomEncerrada1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jRadioButtomEncerrada2)
                .addGap(26, 26, 26))
        );
        pnlFormato2Layout.setVerticalGroup(
            pnlFormato2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormato2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormato2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtomAberta)
                    .addComponent(jRadioButtomEncerrada)
                    .addComponent(jRadioButtomEncerrada1)
                    .addComponent(jRadioButtomEncerrada2))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pnlFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Formato"));
        pnlFormato.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        buttonGroup1.add(jRadioButtonPDF);
        jRadioButtonPDF.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButtonPDF.setSelected(true);
        jRadioButtonPDF.setText("PDF");

        buttonGroup1.add(jRadioButtonXLS);
        jRadioButtonXLS.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButtonXLS.setText("XLS");

        buttonGroup1.add(jRadioButtonHTML);
        jRadioButtonHTML.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButtonHTML.setText("HTML");

        buttonGroup1.add(jRadioButtonXML);
        jRadioButtonXML.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButtonXML.setText("XML");

        buttonGroup1.add(jRadioButtonRTF);
        jRadioButtonRTF.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButtonRTF.setText("RTF");

        buttonGroup1.add(jRadioButtonDOCX);
        jRadioButtonDOCX.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButtonDOCX.setText("DOCX");

        buttonGroup1.add(jRadioButtonPPTX);
        jRadioButtonPPTX.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButtonPPTX.setText("PPT");

        buttonGroup1.add(jRadioButtonODT);
        jRadioButtonODT.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRadioButtonODT.setText("ODT");

        javax.swing.GroupLayout pnlFormatoLayout = new javax.swing.GroupLayout(pnlFormato);
        pnlFormato.setLayout(pnlFormatoLayout);
        pnlFormatoLayout.setHorizontalGroup(
            pnlFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormatoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonPDF)
                    .addComponent(jRadioButtonRTF))
                .addGap(40, 40, 40)
                .addGroup(pnlFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonDOCX)
                    .addComponent(jRadioButtonHTML))
                .addGap(0, 48, Short.MAX_VALUE)
                .addGroup(pnlFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonXLS)
                    .addComponent(jRadioButtonODT))
                .addGap(34, 34, 34)
                .addGroup(pnlFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonXML)
                    .addComponent(jRadioButtonPPTX))
                .addGap(40, 40, 40))
        );
        pnlFormatoLayout.setVerticalGroup(
            pnlFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormatoLayout.createSequentialGroup()
                .addGroup(pnlFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonHTML)
                    .addComponent(jRadioButtonPDF)
                    .addComponent(jRadioButtonXLS)
                    .addComponent(jRadioButtonXML))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(pnlFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonRTF)
                    .addComponent(jRadioButtonDOCX)
                    .addComponent(jRadioButtonODT)
                    .addComponent(jRadioButtonPPTX)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(540, Short.MAX_VALUE)
                        .addComponent(btnGerar)
                        .addGap(5, 5, 5)
                        .addComponent(btnFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pnlFormato1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlFormato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlFormato2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlFormato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlFormato1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnGerar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed

        boolean r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQFechar);
        if (r==true)
        {
            this.dispose();

        }

    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
       
        try 
        {
            if (ValidarDatas(jDateChooser1, jDateChooser2) == true)
            {
               boolean  r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgGerarRelatorio);   
               if (r==true) 
               {
                    try {
                        // Pega o Inicio do Caminho 
                        String home = System.getProperty("user.home");
                        // Diretório onde fica os relatórios
                        File arquivo = new File(home + "/Desktop/Relatorios/");
                        // Define o Design do Relatório Jasper
                        JasperDesign desenho = JRXmlLoader.load("src\\Relatorio\\EasyParkRelatorio.jrxml");
                        // Le o relatório Jasper
                        JasperReport relatorio = JasperCompileManager.compileReport(desenho);
                        // Cria um Jasper Data Source
                        JRResultSetDataSource jrRS = new JRResultSetDataSource(Model_Banco.BuscaVendas(FORMAT.format(jDateChooser1.getDate()), FORMAT.format(jDateChooser2.getDate()),status)); 
                        // Passa os parametros
                        Map parametros = new HashMap();
                        parametros.put("DataInicio", FORMAT.format(jDateChooser1.getDate()));
                        parametros.put("DataFim", FORMAT.format(jDateChooser2.getDate()));
                        parametros.put("Status", status);
                        // Cria o relatório
                        JasperPrint impressao = JasperFillManager.fillReport( relatorio , parametros,  jrRS);
                        // Verifica se tem paginas o relatório !
                        if (!(impressao.getPages().isEmpty())) {

                            // Mostra o relatório
                            JasperViewer viewer = new JasperViewer( impressao , false);
                            viewer.setVisible(true);
                            // Cria a pasta Relátório caso não exista
                            if(!(arquivo.exists()))
                            {
                                 arquivo.mkdir();
                            }
                            // Pega quantos arquivos tem na pasta !
                            File Qlist[] = arquivo.listFiles();
                            
                            // Relatório em PDF
                            if (jRadioButtonPDF.isSelected()){
                                JasperExportManager.exportReportToPdfFile(impressao, arquivo.toString()+ "//Venda"+(Qlist.length+1)+".pdf");
                            }
                            // Relatório em HTML
                            else if (jRadioButtonHTML.isSelected()){
                                JasperExportManager.exportReportToHtmlFile(impressao,arquivo.toString()+ "//Venda"+(Qlist.length+1)+".html");

                            }
                            // Relatório em XLS
                            else if (jRadioButtonXLS.isSelected()){
                                JExcelApiExporter xlsExporter = new JExcelApiExporter();
                                xlsExporter.setParameter(JRExporterParameter.JASPER_PRINT, impressao);
                                xlsExporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, arquivo.toString()+ "//Venda"+(Qlist.length+1)+".xls");
                                xlsExporter.exportReport();                
                            }
                            // Relatório em XML
                            else if (jRadioButtonXML.isSelected()){
                                JasperExportManager.exportReportToXmlFile(impressao,  arquivo.toString()+ "//Venda"+(Qlist.length+1)+".xml", rootPaneCheckingEnabled);
                            }
                            // Relatório em RTF
                            else if (jRadioButtonRTF.isSelected()){
                                JRRtfExporter rtf = new JRRtfExporter();
                                rtf.setParameter(JRExporterParameter.CHARACTER_ENCODING, "UTF-8");
                                rtf.setParameter(JRExporterParameter.JASPER_PRINT, impressao);
                                rtf.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, arquivo.toString()+ "//Venda"+(Qlist.length+1)+".rtf");
                                rtf.exportReport();
                            }
                            // Relatório em DOCX
                            else if (jRadioButtonDOCX.isSelected()){
                                JRDocxExporter exporter = new JRDocxExporter();
                                exporter.setParameter(JRExporterParameter.JASPER_PRINT, impressao);
                                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, arquivo.toString()+ "//Venda"+(Qlist.length+1)+".docx");
                                exporter.exportReport();
                            }
                            // Relatório em PPTX
                            else if (jRadioButtonPPTX.isSelected()){
                                JRPptxExporter exporter = new JRPptxExporter ();
                                exporter.setParameter(JRExporterParameter.JASPER_PRINT, impressao);
                                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, arquivo.toString()+ "//Venda"+(Qlist.length+1)+".pptx");
                                exporter.exportReport();
                            }
                            // Relatório em ODT
                            else if (jRadioButtonODT.isSelected()){
                                JROdtExporter exporter = new JROdtExporter();
                                exporter.setParameter(JRExporterParameter.JASPER_PRINT, impressao);
                                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, arquivo.toString()+ "//Venda"+(Qlist.length+1)+".odt");
                                exporter.exportReport();
                            }
                            Limpar();
                        }
                        else{
                            Ctrl_Msg.Informa(Ctrl_Msg.MsgRelatorioSemDados);   
                        }
                    } catch (Exception e) {

                    }  
               }
           }
            else{
                Ctrl_Msg.Informa(Ctrl_Msg.MsgDataInvalida);
                Limpar();
            }
        } 
        catch (Exception e) 
        {
            Limpar();
            Ctrl_Msg.Informa(Ctrl_Msg.MsgDataInvalida);
        }
            
            
        
    }//GEN-LAST:event_btnGerarActionPerformed

    private void jRadioButtomAbertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtomAbertaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtomAbertaActionPerformed

    private void jRadioButtomEncerradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtomEncerradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtomEncerradaActionPerformed

    private void MudaStatus(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MudaStatus
        status = "0";
    }//GEN-LAST:event_MudaStatus

    private void MudaStatus2(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MudaStatus2
        status = "1";
    }//GEN-LAST:event_MudaStatus2

    private void jRadioButtomEncerrada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtomEncerrada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtomEncerrada1ActionPerformed

    private void jRadioButtomEncerrada2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtomEncerrada2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtomEncerrada2ActionPerformed

    private void MudaStatus3(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MudaStatus3
        status = "2";
    }//GEN-LAST:event_MudaStatus3

    private void MudaStatus4(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MudaStatus4
        status = "3";
    }//GEN-LAST:event_MudaStatus4

 
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
            java.util.logging.Logger.getLogger(View_CadAutorizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_CadAutorizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_CadAutorizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_CadAutorizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_CadAutorizados().setVisible(true);
            }
        });
    }
    public void centralizarComponente() 
    {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnGerar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JRadioButton jRadioButtomAberta;
    private javax.swing.JRadioButton jRadioButtomEncerrada;
    private javax.swing.JRadioButton jRadioButtomEncerrada1;
    private javax.swing.JRadioButton jRadioButtomEncerrada2;
    private javax.swing.JRadioButton jRadioButtonDOCX;
    private javax.swing.JRadioButton jRadioButtonHTML;
    private javax.swing.JRadioButton jRadioButtonODT;
    private javax.swing.JRadioButton jRadioButtonPDF;
    private javax.swing.JRadioButton jRadioButtonPPTX;
    private javax.swing.JRadioButton jRadioButtonRTF;
    private javax.swing.JRadioButton jRadioButtonXLS;
    private javax.swing.JRadioButton jRadioButtonXML;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JPanel pnlFormato;
    private javax.swing.JPanel pnlFormato1;
    private javax.swing.JPanel pnlFormato2;
    // End of variables declaration//GEN-END:variables

     private void Limpar(){
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        jRadioButtomAberta.setSelected(true);
        jRadioButtomEncerrada.setSelected(false);
        jRadioButtonHTML.setSelected(false);
        jRadioButtonPDF.setSelected(true);
        jRadioButtonXLS.setSelected(false);
        jRadioButtonXML.setSelected(false);
    }
     
    public  static  boolean ValidarDatas(JDateChooser dataInicio, JDateChooser dataFim) throws Exception {
        FORMAT.setLenient (true);
        if (dataInicio.getDate().before(dataFim.getDate()))
        {
            try {
            // data válida
            FORMAT.parse(FORMAT.format(dataInicio.getDate())).toString();
            FORMAT.parse(FORMAT.format(dataFim.getDate())).toString();
            return true;
            } catch (Exception ex) {
                // data inválida
                return false;
            }  
        }
        else{
            return false;
        }
        
    }
}

