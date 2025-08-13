package CalendarPopup;

import java.awt.Color;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public final class CalendarPopup extends javax.swing.JPanel {
    
    public static final String LONG_DATE = "EEEE, dd 'de' MMMM 'de' yyyy";
    public static final String YYYY_MM_DD = "yyyy-MM-dd";
    public static final String DD_MM_YYYY = "dd-MM-YYYY";
    public static final String DD_MMM_YYYY = "dd-MMM-YYYY";
    public static final String DD_MMMM_YYYY = "dd-MMMM-YYYY";
    public static String PERSONAL_FORMAT_DATE = LONG_DATE;
    private CalendarWindow ventanaCalendario;
    private Color backgroundColor = new Color(242, 242, 242);
    private Color buttonSetDateBackgroundColor = new Color(255, 255, 255); 
    private Color buttonSetDateForegroundColor = new Color(0, 0, 0);
    private Color dayForegroundColor = new Color(0, 0, 0);
    private Color daysNameBackgroundColor = new Color(220, 220, 220);
    private Color daysNameForegroundColor = new Color(0, 0, 0);
    private Color titleForegroundColor = new Color(0, 0, 0);
    private Color txtBackgroundColor = new Color(255, 255, 255);
    private Color txtForegroundColor = new Color(0, 0, 0);
    private boolean activo;
    private LocalDate fecha;
    private DateTimeFormatter formato;
    private Event evento;
    
    public CalendarPopup() {
        initComponents();
        setFormatDate(CalendarPopup.LONG_DATE);
        activo = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFecha = new javax.swing.JTextField();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        txtFecha.setEditable(false);
        txtFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtFecha.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaMouseClicked(evt);
            }
        });
        add(txtFecha);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseClicked
        if (activo) {
            ventanaCalendario = new CalendarWindow(null, false, this);
            javax.swing.JTextField btn = (javax.swing.JTextField) evt.getSource();
            int btnXpos = btn.getLocationOnScreen().x;
            int btnYpos = btn.getLocationOnScreen().y;
            int desktopY = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            int posX;
            int posY;

            if (btnXpos > ventanaCalendario.getWidth()) {
                posX = btnXpos + btn.getWidth() - ventanaCalendario.getWidth() - 2;
            } else {
                posX = btnXpos + btn.getWidth();
            }

            if (btnYpos + ventanaCalendario.getHeight() + 3 + btn.getHeight() < desktopY) {
                posY = btnYpos + btn.getHeight() + 3;
            } else {
                posY = btnYpos - ventanaCalendario.getHeight() - 3;
            }

            ventanaCalendario.setLocation(posX, posY);
            ventanaCalendario.setVisible(true);
        }
    }//GEN-LAST:event_txtFechaMouseClicked

    private void ejecutarEvento() {
        if (evento != null)
            evento.onDateChanged();
    }
    
    
    // Setters
    public void setCPBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        this.setBackground(backgroundColor);
    }

    public void setCPTxtBackgroundColor(Color txtBackgroundColor) {
        this.txtBackgroundColor = txtBackgroundColor;
        txtFecha.setBackground(txtBackgroundColor);
    }

    public void setCPTxtForegroundColor(Color txtForegroundColor) {
        this.txtForegroundColor = txtForegroundColor;
        txtFecha.setForeground(txtForegroundColor);
    }

    public void setButtonSetDateBackgroundColor(Color buttonSetDateBackgroundColor) {
        this.buttonSetDateBackgroundColor = buttonSetDateBackgroundColor;
    }

    public void setButtonSetDateForegroundColor(Color buttonSetDateForegroundColor) {
        this.buttonSetDateForegroundColor = buttonSetDateForegroundColor;
    }

    public void setCPDayForegroundColor(Color dayForegroundColor) {
        this.dayForegroundColor = dayForegroundColor;
    }

    public void setCPTitleForegroundColor(Color titleForegroundColor) {
        this.titleForegroundColor = titleForegroundColor;
    }

    public void setCPDaysNameBackgroundColor(Color daysNameBackgroundColor) {
        this.daysNameBackgroundColor = daysNameBackgroundColor;
    }

    public void setCPDaysNameForegroundColor(Color daysNameForegroundColor) {
        this.daysNameForegroundColor = daysNameForegroundColor;
    }

    public void setPersonalFormatDate(String format) {
        PERSONAL_FORMAT_DATE = format;
    }
    
    public void setFormatDate(String format) {
        formato = DateTimeFormatter.ofPattern(
                format, 
                Locale.getDefault());
    }
    
    public void setEvent(Event event) {
        evento = event;
    }
    
    // Getters
    public Color getCPBackgroundColor() {
        return backgroundColor;
    }

    public Color getCPButtonSetDateBackgroundColor() {
        return buttonSetDateBackgroundColor;
    }

    public Color getCPButtonSetDateForegroundColor() {
        return buttonSetDateForegroundColor;
    }

    public Color getCPDayForegroundColor() {
        return dayForegroundColor;
    }

    public Color getCPDaysNameBackgroundColor() {
        return daysNameBackgroundColor;
    }

    public Color getCPDaysNameForegroundColor() {
        return daysNameForegroundColor;
    }

    public Color getCPTitleForegroundColor() {
        return titleForegroundColor;
    }

    public Color getCPTxtBackgroundColor() {
        return txtBackgroundColor;
    }

    public Color getCPTxtForegroundColor() {
        return txtForegroundColor;
    }
    
    public String getPersonalFormatDate() {
        return PERSONAL_FORMAT_DATE;
    }
    
    public LocalDate getDate() {
        return fecha;
    }
    
    public String getDateToString(String format) {
        DateTimeFormatter formatoAux = DateTimeFormatter.ofPattern(
                format, 
                Locale.getDefault());
        return formatoAux.format(fecha);
    }
    
    // Métodos funcionales
    public void setDate(LocalDate fecha) {
        this.fecha = fecha;
        txtFecha.setText(formato.format(fecha));
        ejecutarEvento();
    }
    
    public void clear() {
        fecha = null;
        txtFecha.setText("");
    }

    @Override
    public void setEnabled(boolean enabled) {
        activo = enabled;
    }

    @Override
    public boolean isEnabled() {
        return activo;
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
