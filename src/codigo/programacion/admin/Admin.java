/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.programacion.admin;

import codigo.programacion.Documentacion.Documentacion;
import codigo.programacion.Search.Search;
import codigo.programacion.conexionDB.DB;
import codigo.programacion.curso.AllCourses;
import codigo.programacion.curso.CursoView;
import codigo.programacion.home.Home;
import codigo.programacion.interfaces.Go;
import codigo.programacion.model.Curso;
import codigo.programacion.model.User;
import codigo.programacion.utils.CursoRenderer;
import codigo.programacion.utils.EncryptingData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author HugoLuna
 */
public class Admin extends javax.swing.JFrame implements Go {

    /**
     * Create variables for class Admin
     */
    ;
    public File fileForImageCourse = null;
    public DefaultListModel<Curso> model;
    int counter = 0;
    int position = 0;
    /**
     * Creates new form Admi
     */
    public User user;

    public Admin(User us) {
        initComponents();
        user = us;
        contentView();

    }

    public void contentView() {
        userName.setText(user.getUsuario());

        poblateList();

    }

    public void poblateList() {

        createList();

    }

    private void createList() {
        // create List model
        model = new DefaultListModel<>();

        try {

            Connection bd = DB.getConection();
            Statement state = bd.createStatement();

            String consulta = "SELECT * FROM curso";
            ResultSet resultset = state.executeQuery(consulta);

            if (resultset != null) {

                while (resultset.next()) {
                    // get fields
                    String id = resultset.getString("id");
                    String nombre = resultset.getString("nombre");
                    String descripcion = resultset.getString("descripcion");
                    String autor = resultset.getString("autor");
                    String estudiantes = resultset.getString("estudiantes");
                    String img = resultset.getString("img");
                    String created_at = resultset.getString("created_at");

                    model.addElement(new Curso(id, nombre, descripcion, autor, estudiantes, img, created_at));

                }

            }
            counter = resultset.getFetchSize();
            System.out.println("cont: " + counter);

        } catch (Exception e) {
            System.err.println("Error al traer los datos para la lista");
        }

        // create JList with model
        List.setModel(model);
        // set cell renderer
        List.setCellRenderer(new CursoRenderer());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        cursosBtn = new javax.swing.JLabel();
        docBtn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        photoProfile = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        searchBtn = new javax.swing.JLabel();
        fieldSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameCourse = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        btnSubmitCourse = new javax.swing.JButton();
        selectFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descCourse = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        containerCursos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        btnAddContent = new java.awt.Button();
        deleteCourse = new java.awt.Button();
        fieldName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        fieldDescripcion = new javax.swing.JTextArea();
        viewCourse = new java.awt.Button();
        fieldUrl = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 755));
        setUndecorated(true);

        jPanel9.setMaximumSize(new java.awt.Dimension(1336, 755));
        jPanel9.setMinimumSize(new java.awt.Dimension(1165, 755));
        jPanel9.setPreferredSize(new java.awt.Dimension(1336, 755));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 18, 50));
        jPanel10.setPreferredSize(new java.awt.Dimension(70, 750));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 70, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/programacion/home/menu.png"))); // NOI18N
        jLabel6.setText("jLabel3");
        jPanel10.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        Home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/programacion/home/home.png"))); // NOI18N
        Home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        jPanel10.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 70, 50));

        cursosBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cursosBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/programacion/home/play-button.png"))); // NOI18N
        cursosBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cursosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cursosBtnMouseClicked(evt);
            }
        });
        jPanel10.add(cursosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 70, 50));

        docBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        docBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/programacion/home/docs.png"))); // NOI18N
        docBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        docBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docBtnMouseClicked(evt);
            }
        });
        jPanel10.add(docBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 70, 50));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 760));

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

        jPanel9.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1230, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        jLabel2.setText("Agregar curso");

        jLabel3.setText("Nombre del curso");

        button1.setLabel("button1");

        btnSubmitCourse.setBackground(new java.awt.Color(0, 102, 204));
        btnSubmitCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmitCourse.setText("Agregar");
        btnSubmitCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitCourseMouseClicked(evt);
            }
        });

        selectFile.setText("Seleccionar imagen");
        selectFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectFileMouseClicked(evt);
            }
        });

        descCourse.setColumns(20);
        descCourse.setRows(5);
        jScrollPane1.setViewportView(descCourse);

        jLabel4.setText("Descripción del curso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmitCourse)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(selectFile)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(nameCourse)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(selectFile)
                .addGap(24, 24, 24)
                .addComponent(btnSubmitCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel9.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 400, 410));

        containerCursos.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(null);

        List.setSelectionBackground(new java.awt.Color(0, 102, 204));
        List.setSelectionForeground(new java.awt.Color(0, 102, 204));
        jScrollPane2.setViewportView(List);
        List.getAccessibleContext().setAccessibleName("List");

        btnAddContent.setLabel("Agregar contenido");
        btnAddContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddContentActionPerformed(evt);
            }
        });

        deleteCourse.setLabel("Eliminar Curso");
        deleteCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteCourseMouseClicked(evt);
            }
        });

        jLabel7.setText("Nombre del Contenido");

        jLabel10.setText("Descripcion del contenido");

        fieldDescripcion.setColumns(15);
        fieldDescripcion.setRows(7);
        fieldDescripcion.setToolTipText("Descripcion del contenido");
        jScrollPane3.setViewportView(fieldDescripcion);

        viewCourse.setLabel("Ver Curso");
        viewCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewCourseMouseClicked(evt);
            }
        });

        jLabel11.setText("Url del video");

        javax.swing.GroupLayout containerCursosLayout = new javax.swing.GroupLayout(containerCursos);
        containerCursos.setLayout(containerCursosLayout);
        containerCursosLayout.setHorizontalGroup(
            containerCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerCursosLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(containerCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(containerCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(containerCursosLayout.createSequentialGroup()
                            .addComponent(deleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                            .addComponent(viewCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fieldName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fieldUrl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(64, 64, 64))
        );
        containerCursosLayout.setVerticalGroup(
            containerCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerCursosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(containerCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel9.add(containerCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 730, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void photoProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photoProfileMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_photoProfileMouseClicked

    private void userNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameMouseClicked

    /**
     * Submit button for register new course in DB
     *
     * @param evt
     */
    private void btnSubmitCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitCourseMouseClicked
        // TODO add your handling code here:

        Timer timer = new Timer(2000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                //uploadFileToServer(fileForImageCourse);

                try {
                    EncryptingData ecData = new EncryptingData();

                    String name = ecData.MD5(fileForImageCourse.getName() + "lunainc" + fileForImageCourse.getPath());

                    Admin ad = new Admin(user);

                    /**
                     * generar nombre
                     */
                    File parent = fileForImageCourse.getParentFile();
                    String filename = name + fileForImageCourse.getName().toLowerCase();
                    File doo = new File(parent, filename);
                    fileForImageCourse.renameTo(doo);
                    File newfile = doo;

                    ad.upload(newfile.getPath().toString(), newfile.getName(), true);

                    registerInDBCourse(newfile.getName(), user);

                } catch (IOException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Espere un momento, su archivo esta siendo procesado", "Hola", JOptionPane.INFORMATION_MESSAGE);

            }
        });
        timer.setRepeats(false);
        timer.start();

        System.out.println(fileForImageCourse.getName().toString());

    }//GEN-LAST:event_btnSubmitCourseMouseClicked

    /**
     * Select files for upload in server
     *
     * @param evt
     */
    private void selectFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectFileMouseClicked
        // TODO add your handling code here:

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        jfc.setDialogTitle("Selecciona una imagen");
        jfc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG JPEG JPG", "png", "jpeg", "jpg");
        jfc.addChoosableFileFilter(filter);
        int returnValue = jfc.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {

            File selectedFile = new File(jfc.getSelectedFile().getAbsolutePath());

            fileForImageCourse = selectedFile;

            System.out.println(selectedFile.getAbsolutePath());

            selectFile.setText("Seleccionaste: " + selectedFile.getName());
        }
    }//GEN-LAST:event_selectFileMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:

        goTo("Home");

    }//GEN-LAST:event_HomeMouseClicked

    private void btnAddContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddContentActionPerformed
        // TODO add your handling code here:

        int selectedIndex = List.getSelectedIndex();

        if (selectedIndex != -1) {//validate index list 

            String nameContent = fieldName.getText().toString();
            String urlContent = fieldUrl.getText().toString();
            String descripcion = fieldDescripcion.getText().toString();
            String id_course = model.get(selectedIndex).getId();
            if (!nameContent.isEmpty() && !urlContent.isEmpty() && !descripcion.isEmpty()) {

                Connection conDB = DB.getConection();

                try {

                    String queryInsert = " INSERT INTO contenido (id_curso, nombre, url, descripcion)"
                            + " values (?, ?, ?, ?)";

                    PreparedStatement preparedStmt = conDB.prepareStatement(queryInsert);
                    preparedStmt.setString(1, id_course);
                    preparedStmt.setString(2, nameContent);
                    preparedStmt.setString(3, urlContent);
                    preparedStmt.setString(4, descripcion);

                    //preparedStmt
                    preparedStmt.execute();
                    fieldName.setText("");
                    fieldUrl.setText("");
                    fieldDescripcion.setText("");

                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Se agrego correctamente el contenido al curso: " + model.get(selectedIndex).getNombre(), "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE);

                    conDB.close();//cerrando conexion con la base de datos
                    List.removeAll();
                    model.removeAllElements();

                    createList();

                    goTo("Admin");

                } catch (SQLException err) {
                    System.err.println("Error sql: " + err.getMessage());

                }

            }

            System.out.println(model.get(selectedIndex).getNombre());
        } else {
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Es posible que no exista contenido, o no hayas selecciona un curso ", "¡Upss!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAddContentActionPerformed

    private void deleteCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCourseMouseClicked
        // TODO add your handling code here:
        int selectedIndex = List.getSelectedIndex();

        if (selectedIndex != -1) {//validate index list 
            try {
                String id_course = model.get(selectedIndex).getId();

                Connection bd = DB.getConection();
                Statement state = bd.createStatement();

                String consulta = "DELETE FROM curso WHERE id = '" + id_course + "'";

                PreparedStatement preparedStmt = bd.prepareStatement(consulta);
                // execute the preparedstatement
                preparedStmt.execute();
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Se elimino correctamente el contenido al curso: " + model.get(selectedIndex).getNombre(), "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE);
                model.remove(selectedIndex);
                bd.close();
            } catch (Exception e) {

            }

        } else {
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Es posible que no exista contenido, o no hayas selecciona un curso ", "¡Upss!", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_deleteCourseMouseClicked

    private void viewCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCourseMouseClicked
        // TODO add your handling code here:

        int selectedIndex = List.getSelectedIndex();

        if (selectedIndex != -1) {//validate index list 
            //id_curso
            String id_course = model.get(selectedIndex).getId();
            this.dispose();
            CursoView cv = new CursoView(user, id_course);
            cv.setVisible(true);
        }

    }//GEN-LAST:event_viewCourseMouseClicked

    private void cursosBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cursosBtnMouseClicked
        // TODO add your handling code here:
        goTo("Curso");
    }//GEN-LAST:event_cursosBtnMouseClicked

    private void docBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docBtnMouseClicked
        // TODO add your handling code here:
        goTo("Doc");
    }//GEN-LAST:event_docBtnMouseClicked

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        // TODO add your handling code here:
         String text = fieldSearch.getText().toString();
        if (!text.isEmpty() && !text.equals("Buscar un curso...")) {
            
            dispose();
            Search s = new Search(user,text);
            s.setVisible(true);
            
        }
    }//GEN-LAST:event_searchBtnMouseClicked

    /**
     * Method for register dat in DB
     *
     * @param nameFile
     * @param user
     */
    public void registerInDBCourse(String nameFile, User user) {

        try {
            String nombre = nameCourse.getText().toString();
            String description = descCourse.getText().toString();

            if (!nombre.isEmpty() && !description.isEmpty()) {

                Connection codigoProInsert = DB.getConection();

                String queryInsert = " INSERT INTO curso (nombre, descripcion, autor, estudiantes, img)"
                        + " values (?, ?, ?, ?, ?)";

                PreparedStatement preparedStmt = codigoProInsert.prepareStatement(queryInsert);
                preparedStmt.setString(1, nombre);
                preparedStmt.setString(2, description);
                preparedStmt.setString(3, user.getUsuario());
                preparedStmt.setString(4, "0");
                preparedStmt.setString(5, nameFile);
                //preparedStmt
                preparedStmt.execute();

                codigoProInsert.close();
                nameCourse.setText("");
                descCourse.setText("");
                selectFile.setText("Selecionar imagen");
            }

        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }

    }

    /**
     *
     * @param localSourceFile
     * @param remoteResultFile
     * @param showMessages
     * @return
     * @throws IOException
     */
    public static boolean upload(String localSourceFile,
            String remoteResultFile, boolean showMessages) throws IOException {

        String host = "lunainc.com.mx";
        int port = 21;
        String username = "ftp_codigo_cursos@lunainc.com.mx";
        String password = "Lunainc1199!";
        FTPClient ftpClient = new FTPClient();
        FileInputStream fis = null;
        boolean resultOk = true;

        try {
            ftpClient.connect(host, port);

            if (showMessages) {
                System.out.println(ftpClient.getReplyString());
            }
            resultOk &= ftpClient.login(username, password);
            if (showMessages) {
                System.out.println(ftpClient.getReplyString());
            }

            fis = new FileInputStream(localSourceFile);
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);

            resultOk &= ftpClient.storeFile(remoteResultFile, fis);
            if (showMessages) {
                System.out.println(ftpClient.getReplyString());
            }
            resultOk &= ftpClient.logout();

            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Archivo guardado correctamente", "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE);

            if (showMessages) {
                System.out.println(ftpClient.getReplyString());
            }
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                ftpClient.disconnect();
            } catch (IOException e) {/* nothing to do */
            }
        }

        return resultOk;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    public javax.swing.JList<Curso> List;
    private java.awt.Button btnAddContent;
    private javax.swing.JButton btnSubmitCourse;
    private java.awt.Button button1;
    private javax.swing.JPanel containerCursos;
    private javax.swing.JLabel cursosBtn;
    private java.awt.Button deleteCourse;
    private javax.swing.JTextArea descCourse;
    private javax.swing.JLabel docBtn;
    private javax.swing.JTextArea fieldDescripcion;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldSearch;
    private javax.swing.JTextField fieldUrl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nameCourse;
    private javax.swing.JLabel photoProfile;
    private javax.swing.JLabel searchBtn;
    private javax.swing.JButton selectFile;
    private javax.swing.JLabel userName;
    private java.awt.Button viewCourse;
    // End of variables declaration//GEN-END:variables

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
            case "Curso":
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
}
