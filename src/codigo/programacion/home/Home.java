/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.programacion.home;

import codigo.programacion.Documentacion.Documentacion;
import codigo.programacion.Search.Search;
import codigo.programacion.admin.Admin;
import codigo.programacion.curso.AllCourses;
import codigo.programacion.interfaces.Go;
import codigo.programacion.login.login;
import codigo.programacion.model.User;
import codigo.programacion.profile.Profile;
import com.jfoenix.controls.JFXListView;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author HugoLuna
 */
public class Home extends javax.swing.JFrame implements Go {

    /**
     * Creates new form Home
     */
    public User user = null;

    public Home(User us) {
        user = us;
        initComponents();
        setContent();
    }

    public Home() {
        initComponents();
        setContent();
    }

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
        jLabel5 = new javax.swing.JLabel();
        goCourse = new javax.swing.JLabel();
        docBtnMenu = new javax.swing.JLabel();
        containerCont = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnBackend = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnFrontend = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnAndroid = new javax.swing.JButton();
        bannerHome = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        photoProfile = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        searchBtn = new javax.swing.JLabel();
        fieldSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1136, 755));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1336, 755));

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

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/programacion/home/home.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 70, 50));

        goCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        goCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/programacion/home/play-button.png"))); // NOI18N
        goCourse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        goCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goCourseMouseClicked(evt);
            }
        });
        jPanel6.add(goCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 70, 50));

        docBtnMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        docBtnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/programacion/home/docs.png"))); // NOI18N
        docBtnMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        docBtnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docBtnMenuMouseClicked(evt);
            }
        });
        jPanel6.add(docBtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 70, 50));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 760));

        containerCont.setBackground(new java.awt.Color(32, 47, 90));

        jPanel1.setBackground(new java.awt.Color(24, 147, 231));

        jLabel7.setBackground(new java.awt.Color(21, 150, 135));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backend.png"))); // NOI18N
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setSize(new java.awt.Dimension(80, 80));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cursos De Backend");

        btnBackend.setBackground(new java.awt.Color(255, 255, 255));
        btnBackend.setText("Revisar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnBackend))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBackend)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(new java.awt.Color(249, 168, 41));

        jLabel11.setBackground(new java.awt.Color(21, 150, 135));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Frontend.png"))); // NOI18N
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setSize(new java.awt.Dimension(80, 80));

        jLabel12.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cursos De Frontend");

        btnFrontend.setBackground(new java.awt.Color(255, 255, 255));
        btnFrontend.setText("Revisar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFrontend))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFrontend)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel4.setBackground(new java.awt.Color(21, 150, 135));

        jLabel13.setBackground(new java.awt.Color(21, 150, 135));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/android.png"))); // NOI18N
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setSize(new java.awt.Dimension(80, 80));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Curso de programación para android");

        btnAndroid.setBackground(new java.awt.Color(255, 255, 255));
        btnAndroid.setText("Revisar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAndroid))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAndroid)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout containerContLayout = new javax.swing.GroupLayout(containerCont);
        containerCont.setLayout(containerContLayout);
        containerContLayout.setHorizontalGroup(
            containerContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerContLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        containerContLayout.setVerticalGroup(
            containerContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerContLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(containerContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jPanel5.add(containerCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 1370, 420));

        bannerHome.setBackground(new java.awt.Color(204, 204, 204));
        bannerHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bannerHome.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bannerHomeImage.png"))); // NOI18N
        bannerHome.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 280));

        jPanel5.add(bannerHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 1370, 280));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(1300, 60));

        photoProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photoProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/programacion/home/user.png"))); // NOI18N
        photoProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        photoProfile.setMaximumSize(new java.awt.Dimension(54, 54));
        photoProfile.setMinimumSize(new java.awt.Dimension(54, 54));
        photoProfile.setPreferredSize(new java.awt.Dimension(54, 54));
        photoProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                photoProfileMouseClicked(evt);
            }
        });

        userName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userName.setText("Usuario");
        userName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:

        int reply = JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(), "¿Estas seguro que quieres cerrar tu sesión?", "Cerrar Sesión", JOptionPane.YES_OPTION);

        if (reply == JOptionPane.YES_OPTION) {

            closeSession();

            System.out.println("Cerraste tu sesión");
        } else {

        }

    }//GEN-LAST:event_jLabel3MouseClicked

    private void photoProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photoProfileMouseClicked
        // TODO add your handling code here:
        goToProfile();
    }//GEN-LAST:event_photoProfileMouseClicked

    private void userNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameMouseClicked
        // TODO add your handling code here:

        goTo("Admin");
    }//GEN-LAST:event_userNameMouseClicked

    private void goCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goCourseMouseClicked
        // TODO add your handling code here:
        goTo("Cursos");
    }//GEN-LAST:event_goCourseMouseClicked

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        // TODO add your handling code here:
        String text = fieldSearch.getText().toString();
        if (!text.isEmpty() && !text.equals("Buscar un curso...")) {
            
            dispose();
            Search s = new Search(user,text);
            s.setVisible(true);
            
        }
    }//GEN-LAST:event_searchBtnMouseClicked

    private void docBtnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docBtnMenuMouseClicked
        // TODO add your handling code here:
        goTo("Doc");
    }//GEN-LAST:event_docBtnMenuMouseClicked

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
                break;
            default:
                break;
        }
    }

    @Override
    public void goTo() {

    }

    public void goToProfile() {
        Profile profile = new Profile(user);
        this.dispose();
        profile.setVisible(true);

    }

    public void closeSession() {
        try {

            File file = new File("user.txt");
            boolean result = Files.deleteIfExists(file.toPath()); //surround it in try catch block
            goToLogin();

        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void goToLogin() {
        login l = new login();
        this.dispose();
        l.setVisible(true);
    }

    public void setContent() {

        userName.setText(user.getUsuario());

    }

    public void maximize(Frame frame) {
        int state = frame.getExtendedState();

        // Set the maximized bits
        state |= Frame.MAXIMIZED_BOTH;

        // Maximize the frame
        frame.setExtendedState(state);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bannerHome;
    private javax.swing.JButton btnAndroid;
    private javax.swing.JButton btnBackend;
    private javax.swing.JButton btnFrontend;
    private javax.swing.JPanel containerCont;
    private javax.swing.JLabel docBtnMenu;
    private javax.swing.JTextField fieldSearch;
    private javax.swing.JLabel goCourse;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel photoProfile;
    private javax.swing.JLabel searchBtn;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
