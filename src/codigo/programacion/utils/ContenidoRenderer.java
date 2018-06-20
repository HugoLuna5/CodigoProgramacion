/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.programacion.utils;

import codigo.programacion.model.Contenido;
import codigo.programacion.model.Curso;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author HugoLuna
 */
public class ContenidoRenderer extends JPanel implements ListCellRenderer<Contenido> {

    private JLabel lbIcon = new JLabel();
    private JLabel lbName = new JLabel();
    private JLabel lbAuthor = new JLabel();
    private JPanel panelText;
    private JPanel panelIcon;

    public ContenidoRenderer() {
        setLayout(new BorderLayout(5, 5));

        panelText = new JPanel(new GridLayout(0, 1));
        panelText.add(lbName);
        panelText.add(lbAuthor);

        panelIcon = new JPanel();
        panelIcon.setBorder(new EmptyBorder(5, 5, 5, 5));
        panelIcon.add(lbIcon);

        add(panelIcon, BorderLayout.WEST);
        add(panelText, BorderLayout.CENTER);
        this.setBackground(Color.white);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Contenido> list,
            Contenido contenido, int index, boolean isSelected, boolean cellHasFocus) {
        try {
            Image image = null;
            URL url = new URL("http://lunainc.com.mx/cursos/play-button-40.png");
            image = ImageIO.read(url);
            lbIcon.setIcon(new ImageIcon(image));
            lbIcon.setBackground(Color.white);
        } catch (Exception e) {
            System.err.println("Error al descargar la imagen");
        }

        lbName.setText(contenido.getNombre());
        lbName.setBackground(Color.white);
        lbAuthor.setText(contenido.getDescripcion());
        lbAuthor.setForeground(Color.blue);
        lbAuthor.setBackground(Color.white);

        list.setBackground(Color.white);
        list.setSelectionBackground(new Color(0, 102, 204));

        // when select item
        if (list.getSelectedIndex() == index) {
            lbName.setBackground(list.getSelectionBackground());
            lbAuthor.setBackground(list.getSelectionBackground());
            lbIcon.setBackground(list.getSelectionBackground());
            setBackground(list.getSelectionBackground());
        } else { // when don't select
            lbName.setBackground(list.getBackground());
            lbAuthor.setBackground(list.getBackground());
            lbIcon.setBackground(list.getBackground());
            setBackground(list.getBackground());
        }
        return this;
    }

}
