package CalendarPopup;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class CalendarWindow extends javax.swing.JDialog {

    CalendarPopup calendario;
    LocalDate fecha;
    LocalDate fechaActual;
    
    public CalendarWindow(java.awt.Frame parent, 
            boolean modal, 
            CalendarPopup calendario) {
        
        super(parent, modal);
        this.calendario = calendario;
        initComponents();
        fechaActual = LocalDate.now();
        
        if (calendario.getDate() != null){
            fecha = calendario.getDate();
        } else {
            fecha = fechaActual;
        }
                
        insertarColores();
        crearCalendario();
        btnActual.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        panelEncabezado = new javax.swing.JPanel();
        panelAnterior = new javax.swing.JPanel();
        lblAnterior = new javax.swing.JLabel();
        panelMes = new javax.swing.JPanel();
        lblMes = new javax.swing.JLabel();
        panelSiguiente = new javax.swing.JPanel();
        lblSiguiente = new javax.swing.JLabel();
        panelCentral = new javax.swing.JPanel();
        panelContenido = new javax.swing.JPanel();
        panelPie = new javax.swing.JPanel();
        btnActual = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        panelBackground.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204))));

        panelAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelAnterior.setMinimumSize(new java.awt.Dimension(14, 40));
        panelAnterior.setPreferredSize(new java.awt.Dimension(50, 40));
        panelAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAnteriorMouseClicked(evt);
            }
        });
        panelAnterior.setLayout(new java.awt.GridBagLayout());

        lblAnterior.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        lblAnterior.setText("<");
        panelAnterior.add(lblAnterior, new java.awt.GridBagConstraints());

        panelMes.setMinimumSize(new java.awt.Dimension(66, 40));
        panelMes.setLayout(new java.awt.GridBagLayout());

        lblMes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMes.setText("Mes y Año");
        panelMes.add(lblMes, new java.awt.GridBagConstraints());

        panelSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelSiguiente.setMinimumSize(new java.awt.Dimension(14, 40));
        panelSiguiente.setPreferredSize(new java.awt.Dimension(50, 40));
        panelSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSiguienteMouseClicked(evt);
            }
        });
        panelSiguiente.setLayout(new java.awt.GridBagLayout());

        lblSiguiente.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        lblSiguiente.setText(">");
        panelSiguiente.add(lblSiguiente, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addComponent(panelAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelCentral.setMinimumSize(new java.awt.Dimension(350, 210));

        panelContenido.setLayout(new java.awt.GridLayout(7, 7, -1, -1));

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPie.setMinimumSize(new java.awt.Dimension(350, 59));

        btnActual.setText("Actual");
        btnActual.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActual.setPreferredSize(new java.awt.Dimension(100, 30));
        btnActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualActionPerformed(evt);
            }
        });
        btnActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnActualKeyPressed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        btnCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelPieLayout = new javax.swing.GroupLayout(panelPie);
        panelPie.setLayout(panelPieLayout);
        panelPieLayout.setHorizontalGroup(
            panelPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPieLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelPieLayout.setVerticalGroup(
            panelPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPieLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelPie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualActionPerformed
        calendario.setDate(LocalDate.now());
        this.dispose();
    }//GEN-LAST:event_btnActualActionPerformed

    private void panelAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAnteriorMouseClicked
        mesAnterior();
    }//GEN-LAST:event_panelAnteriorMouseClicked

    private void panelSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSiguienteMouseClicked
        mesSiguiente();
    }//GEN-LAST:event_panelSiguienteMouseClicked

    private void btnActualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnActualKeyPressed
        switch (evt.getKeyCode()){
            case java.awt.event.KeyEvent.VK_LEFT -> mesAnterior();
            case java.awt.event.KeyEvent.VK_RIGHT -> mesSiguiente();
            case java.awt.event.KeyEvent.VK_ESCAPE -> this.dispose();
            case java.awt.event.KeyEvent.VK_ENTER -> {calendario.setDate(LocalDate.now());
                                                      this.dispose();}
        }
    }//GEN-LAST:event_btnActualKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
        switch (evt.getKeyCode()){
            case java.awt.event.KeyEvent.VK_LEFT -> mesAnterior();
            case java.awt.event.KeyEvent.VK_RIGHT -> mesSiguiente();
            case java.awt.event.KeyEvent.VK_ESCAPE -> this.dispose();
            case java.awt.event.KeyEvent.VK_ENTER -> this.dispose();
        }
    }//GEN-LAST:event_btnCancelarKeyPressed
    
    private void mesSiguiente() {
        fecha = fecha.plusMonths(1);
        crearCalendario();
    }
    
    private void mesAnterior() {
        fecha = fecha.minusMonths(1);
            crearCalendario();
    }
    
    private void insertarColores() {
        java.awt.Color backgroundColor = calendario.getCPBackgroundColor();
        this.setBackground(backgroundColor);
        panelBackground.setBackground(backgroundColor);
        panelCentral.setBackground(backgroundColor);
        panelContenido.setBackground(backgroundColor);
        panelEncabezado.setBackground(backgroundColor);
        panelPie.setBackground(backgroundColor);
        panelMes.setBackground(backgroundColor);
        panelAnterior.setBackground(backgroundColor);
        panelSiguiente.setBackground(backgroundColor);
        
        btnActual.setBackground(calendario.getCPButtonSetDateBackgroundColor());
        btnActual.setForeground(calendario.getCPButtonSetDateForegroundColor());
        lblMes.setForeground(calendario.getCPTitleForegroundColor());
        lblAnterior.setForeground(calendario.getCPTitleForegroundColor());
        lblSiguiente.setForeground(calendario.getCPTitleForegroundColor());
    }
    
    private void actualizarMes() {
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern(
                "MMMM yyyy", 
                Locale.getDefault());
        String texto = formatoFecha.format(fecha);
        String letra = texto.substring(0, 1).toUpperCase();
        texto = texto.replaceFirst(letra.toLowerCase(), letra);
                        
        lblMes.setText(texto);
    }
    
    private void crearCalendario() {
        actualizarMes();
        panelContenido.removeAll();
        insertarEncabezado();
        insertarDias();
    }
    
    private void insertarEncabezado() {
        String[] dias = { "D", "L", "M", "X", "J", "V", "S" };
               
        for (int i = 0; i < 7; i++) {
            panelContenido.add(crearPanelEncabezado(dias[i]));
        }
    }
    
    private void insertarDias() {
        int dia = 1;
        int diasMes = fecha.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
        int inicia = fecha.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek().getValue() + 1;
        javax.swing.JPanel panel[] = new javax.swing.JPanel[42];
        
        if (inicia == 8)
            inicia = 1;
        
        for (int i = 1; i < 43; i++) {
            String dato = "";
            
            if (dia <= diasMes && i >= inicia){
                dato = Integer.toString(dia);
                dia++;
            }
            
            panel[i-1] = crearPanelFecha(dato);
            if (!dato.equals("")){
                panel[i-1].setBorder(javax.swing.BorderFactory.createEtchedBorder());
                panel[i-1].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                
                if (calendario.getDate() != null) {
                    if (fecha.getYear() == calendario.getDate().getYear() &&
                            fecha.getMonth() == calendario.getDate().getMonth()) {
                        if (calendario.getDate().getDayOfMonth() == Integer.parseInt(dato)){
                            panel[i-1].setBackground(calendario.getCPDaysNameBackgroundColor());
                        }
                    }
                }
                
                panel[i-1].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent evt){
                        javax.swing.JLabel label = (javax.swing.JLabel) evt.getComponent()
                                .getComponentAt(evt.getComponent().getWidth()/2, 
                                        evt.getComponent().getHeight()/2);
                        fecha = LocalDate.of(fecha.getYear(), 
                                fecha.getMonth(), 
                                Integer.parseInt(label.getText()));
                        calendario.setDate(fecha);
                        javax.swing.SwingUtilities.getWindowAncestor(evt.getComponent()).dispose();
                    };
                });
            }
            panelContenido.add(panel[i-1]);
        }
    }
    
    private javax.swing.JPanel crearPanelEncabezado(String dia) {
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setSize(50,30);
        panel.setBackground(calendario.getCPDaysNameBackgroundColor());
        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel.setLayout(new java.awt.GridBagLayout());
        javax.swing.JLabel label = new javax.swing.JLabel(dia);
        label.setFont(new Font(label.getFont().getFontName(), Font.BOLD, label.getFont().getSize()));
        label.setForeground(calendario.getCPDaysNameForegroundColor());
        panel.add(label);
        
        return panel;
    }
    
    private javax.swing.JPanel crearPanelFecha(String dia) {
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setSize(50, 30);
        panel.setBackground(calendario.getCPBackgroundColor());
        panel.setLayout(new java.awt.GridBagLayout());
        javax.swing.JLabel label = new javax.swing.JLabel(dia);
        label.setForeground(calendario.getCPDayForegroundColor());
        
        if (!dia.equals("")){
            if (fecha.getYear() == fechaActual.getYear() &&
                    fecha.getMonth() == fechaActual.getMonth()){
                if (fechaActual.getDayOfMonth() == Integer.parseInt(dia)) {
                    label.setFont(new Font(label.getFont().getFontName(), Font.BOLD, label.getFont().getSize()));
                    label.setForeground(calendario.getCPDaysNameForegroundColor());
                }
            }
        }
        
        panel.add(label);
        
        return panel;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActual;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblAnterior;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JPanel panelAnterior;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelMes;
    private javax.swing.JPanel panelPie;
    private javax.swing.JPanel panelSiguiente;
    // End of variables declaration//GEN-END:variables
}