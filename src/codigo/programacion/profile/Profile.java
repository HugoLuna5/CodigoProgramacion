/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.programacion.profile;

import codigo.programacion.Documentacion.Documentacion;
import codigo.programacion.Search.Search;
import codigo.programacion.admin.Admin;
import codigo.programacion.conexionDB.DB;
import codigo.programacion.curso.AllCourses;
import codigo.programacion.curso.CursoDetail;
import static codigo.programacion.curso.CursoDetail.id_course;
import static codigo.programacion.curso.CursoDetail.user;
import codigo.programacion.curso.CursoView;
import static codigo.programacion.curso.CursoView.id_contenido;
import static codigo.programacion.curso.CursoView.id_course;
import codigo.programacion.home.Home;
import codigo.programacion.interfaces.Go;
import codigo.programacion.interfaces.init;
import codigo.programacion.model.Contenido;
import codigo.programacion.model.Curso;
import codigo.programacion.model.User;
import codigo.programacion.utils.ContenidoRenderer;
import codigo.programacion.utils.CursoRenderer;
import codigo.programacion.utils.WriteFileUtil;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import javax.swing.*;
import javax.xml.ws.handler.Handler;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;

/**
 *
 * @author HugoLuna
 */
public class Profile extends javax.swing.JFrame implements Go, init {

    /**
     *
     * Creates new form Profile
     */
    public DefaultListModel<Curso> model;
    public boolean validateCourse = false;

    public Profile(User us) {
        initComponents();
        user = us;
        contentView();
        initViews();
    }

    public Profile() {
        initComponents();
        contentView();
        initViews();

    }

    /**
     * initializate variables global
     */
    public User user = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        cursoBtn = new javax.swing.JLabel();
        docBtn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        photoProfile = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        searchBtn = new javax.swing.JLabel();
        fieldSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        contentProfile = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameUserLabel = new javax.swing.JLabel();
        labelDateNow = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        apellidosField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCursos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 755));
        setUndecorated(true);

        jPanel5.setMaximumSize(new java.awt.Dimension(1336, 755));
        jPanel5.setMinimumSize(new java.awt.Dimension(1165, 755));
        jPanel5.setPreferredSize(new java.awt.Dimension(1336, 755));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 18, 50));
        jPanel6.setPreferredSize(new java.awt.Dimension(70, 750));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 70, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/programacion/home/menu.png"))); // NOI18N
        jLabel4.setText("jLabel3");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/programacion/home/home.png"))); // NOI18N
        homeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
        });
        jPanel6.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 70, 50));

        cursoBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cursoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/programacion/home/play-button.png"))); // NOI18N
        cursoBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cursoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cursoBtnMouseClicked(evt);
            }
        });
        jPanel6.add(cursoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 70, 50));

        docBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        docBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/programacion/home/docs.png"))); // NOI18N
        docBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        docBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docBtnMouseClicked(evt);
            }
        });
        jPanel6.add(docBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 70, 50));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 760));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(1300, 60));

        photoProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photoProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/programacion/home/user.png"))); // NOI18N
        photoProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        photoProfile.setMaximumSize(new java.awt.Dimension(54, 54));
        photoProfile.setMinimumSize(new java.awt.Dimension(54, 54));
        photoProfile.setPreferredSize(new java.awt.Dimension(54, 54));

        userName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userName.setText("Usuario");

        searchBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/programacion/home/search.png"))); // NOI18N
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });

        fieldSearch.setText("Buscar un curso...");
        fieldSearch.setToolTipText("");
        fieldSearch.setSize(new java.awt.Dimension(80, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Código Programación");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(photoProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userName)
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldSearch)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(userName)
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(photoProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1230, 60));

        contentProfile.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 18, 72));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profilePhotoDefault.png"))); // NOI18N
        jLabel2.setToolTipText("");

        nameUserLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        nameUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameUserLabel.setText("Nombre del Usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(nameUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        labelDateNow.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        labelDateNow.setText("14 de Junio de 2018");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setText("Tu Información");

        jLabel11.setText("Nombre");

        jLabel12.setText("Apellidos");

        jLabel13.setText("Correo electronico");

        jLabel14.setText("Fecha de registro");

        labelDate.setText("01 de Enero del 2018");

        btnChange.setBackground(new java.awt.Color(33, 150, 243));
        btnChange.setForeground(new java.awt.Color(255, 255, 255));
        btnChange.setText("Guardar");
        btnChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13)))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(labelDate)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(216, 216, 216)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellidosField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(labelDateNow, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(labelDateNow, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(apellidosField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportView(listaCursos);

        javax.swing.GroupLayout contentProfileLayout = new javax.swing.GroupLayout(contentProfile);
        contentProfile.setLayout(contentProfileLayout);
        contentProfileLayout.setHorizontalGroup(
            contentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentProfileLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
        );
        contentProfileLayout.setVerticalGroup(
            contentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentProfileLayout.createSequentialGroup()
                .addGroup(contentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jPanel5.add(contentProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 1230, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel3MouseClicked

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        // TODO add your handling code here:
        goTo("Home");
    }//GEN-LAST:event_homeBtnMouseClicked

    private void btnChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeMouseClicked
        // TODO add your handling code here:

        validateDataToSave();

    }//GEN-LAST:event_btnChangeMouseClicked

    private void cursoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cursoBtnMouseClicked
        // TODO add your handling code here:
        goTo("Cursos");
    }//GEN-LAST:event_cursoBtnMouseClicked

    private void docBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docBtnMouseClicked
        // TODO add your handling code here:
        goTo("Doc");
    }//GEN-LAST:event_docBtnMouseClicked

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        // TODO add your handling code here:
         // TODO add your handling code here:
        String text = fieldSearch.getText().toString();
        if (!text.isEmpty() && !text.equals("Buscar un curso...")) {
            
            dispose();
            Search s = new Search(user,text);
            s.setVisible(true);
            
        }
    }//GEN-LAST:event_searchBtnMouseClicked

    private void validateDataToSave() {
        try {

            String nombre = nombreField.getText().toString();
            String apellidos = apellidosField.getText().toString();
            String correo = emailField.getText().toString();

            String data = "";
            Connection codigoPro = DB.getConection();
            Statement state = codigoPro.createStatement();
            String query = "";

            if (!nombre.isEmpty() && !nombre.equals(user.getNombre())) {
                query = "UPDATE users SET nombre = '" + nombre + "' WHERE id = '" + user.getId() + "'";

                data = user.getId() + "\n" + nombre + "\n" + user.getApellidos() + "\n" + user.getUsuario() + "\n" + user.getCorreo() + "\n" + user.getPhoto() + "\n" + user.getPhotoPortada() + "\n" + user.getRol() + "\n" + user.getCreated_at();
                user.setNombre(nombre);
                //String data = id+"\n"+nombre+"\n"+apellidos+"\n"+usuario+"\n"+correo+"\n"+photo+"\n"+photoPortada+"\n"+rol+"\n"+created_at;
            }

            if (!apellidos.isEmpty() && !apellidos.equals(user.getApellidos())) {
                query = "UPDATE users SET apellidos = '" + apellidos + "' WHERE id = '" + user.getId() + "'";

                data = user.getId() + "\n" + user.getNombre() + "\n" + apellidos + "\n" + user.getUsuario() + "\n" + user.getCorreo() + "\n" + user.getPhoto() + "\n" + user.getPhotoPortada() + "\n" + user.getRol() + "\n" + user.getCreated_at();
                user.setApellidos(apellidos);

            }

            if (!correo.isEmpty() && !correo.equals(user.getCorreo())) {
                query = "UPDATE users SET correo = '" + correo + "' WHERE id = '" + user.getId() + "'";

                data = user.getId() + "\n" + user.getNombre() + "\n" + user.getApellidos() + "\n" + user.getUsuario() + "\n" + correo + "\n" + user.getPhoto() + "\n" + user.getPhotoPortada() + "\n" + user.getRol() + "\n" + user.getCreated_at();
                user.setCorreo(correo);
            }

            state.executeUpdate(query);

            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Informacion actualizada", "Genial", JOptionPane.INFORMATION_MESSAGE);

            WriteFileUtil writeFile = new WriteFileUtil();
            writeFile.write("user.txt", data);

            Timer timer = new Timer(2000, new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {

                    goToProfile();

                }
            });
            timer.setRepeats(false);
            timer.start();

        } catch (SQLException sql) {
            System.err.println("Error: " + sql.getMessage());
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Ocurrio un error inesperado", "Upss", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void goToProfile() {
        Profile profile = new Profile(user);
        this.dispose();
        profile.setVisible(true);

    }


    public void contentView() {

        userName.setText(user.getUsuario());
        nameUserLabel.setText(user.getNombre() + " " + user.getApellidos());
        nombreField.setText(user.getNombre());
        apellidosField.setText(user.getApellidos());
        emailField.setText(user.getCorreo());
        labelDate.setText(user.getCreated_at());

        /**
         * add date to label time
         */
        Calendar fecha = new GregorianCalendar();
        //Obtenemos el valor del año, mes, día, hora, minuto y segundo del sistema.
        //Usando el método get y el parámetro correspondiente.
        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        int mesD = mes + 1;

        SimpleDateFormat formateador = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        String fecha2 = formateador.format(new Date());

        labelDateNow.setText(fecha2);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosField;
    private javax.swing.JButton btnChange;
    private javax.swing.JPanel contentProfile;
    private javax.swing.JLabel cursoBtn;
    private javax.swing.JLabel docBtn;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fieldSearch;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelDateNow;
    private javax.swing.JList<Curso> listaCursos;
    private javax.swing.JLabel nameUserLabel;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel photoProfile;
    private javax.swing.JLabel searchBtn;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables

    @Override
    public void goTo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void goTo(String screen) {
        this.dispose();
        switch (screen) {
            case "Home":
                Home home = new Home(user);
                home.setVisible(true);
                break;
            case "Admin":
                Admin admin = new Admin(user);
                admin.setVisible(true);
                break;
            case "Cursos":

                AllCourses ac = new AllCourses(user);
                ac.setVisible(true);
                break;
            case "Doc":
                Documentacion d = new Documentacion(user);
                d.setVisible(true);
            default:
                break;
        }
    }

    @Override
    public void initViews() {

        model = new DefaultListModel<>();

        try {

            Connection bd = DB.getConection();
            Statement state = bd.createStatement();

            String consulta = "SELECT * FROM (curso INNER JOIN inscrito ON curso.id = inscrito.id_usuario)";
            ResultSet resultset = state.executeQuery(consulta);

            if (resultset != null) {

                while (resultset.next()) {
                    // get fields
                    String id = resultset.getString("curso.id");
                    String nombre = resultset.getString("curso.nombre");
                    String descripcion = resultset.getString("curso.descripcion");
                    String autor = resultset.getString("curso.autor");
                    String estudiantes = resultset.getString("curso.estudiantes");
                    String img = resultset.getString("curso.img");
                    String created_at = resultset.getString("curso.created_at");

                    model.addElement(new Curso(id, nombre, descripcion, autor, estudiantes, img, created_at));

                }

            }

        } catch (Exception e) {
            System.err.println("Error al traer los datos para la lista");
        }

        MouseListener mouseListener = new MouseAdapter() {
            public void mouseClicked(MouseEvent mouseEvent) {
                listaCursos = (JList) mouseEvent.getSource();

                if (mouseEvent.getClickCount() == 1) {
                    int index = listaCursos.locationToIndex(mouseEvent.getPoint());
                    //System.out.println(model.get(index).getNombre());
                }

                if (mouseEvent.getClickCount() == 2) {
                    int index = listaCursos.locationToIndex(mouseEvent.getPoint());
                    System.out.println(model.get(index).getNombre());
                    String id_course = model.get(index).getId();
                    dispose();
                    CursoView cv = new CursoView(user, id_course);
                    cv.setVisible(true);

                }
            }
        };
        listaCursos.addMouseListener(mouseListener);

        // create JList with model
        listaCursos.setModel(model);
        // set cell renderer
        listaCursos.setCellRenderer(new CursoRenderer());

    }

}
