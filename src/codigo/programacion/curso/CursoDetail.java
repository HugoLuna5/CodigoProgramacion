/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.programacion.curso;

import codigo.programacion.Documentacion.Documentacion;
import codigo.programacion.Search.Search;
import codigo.programacion.admin.Admin;
import codigo.programacion.conexionDB.DB;
import static codigo.programacion.curso.CursoView.id_contenido;
import static codigo.programacion.curso.CursoView.id_course;
import codigo.programacion.home.Home;
import codigo.programacion.interfaces.Go;
import codigo.programacion.interfaces.init;
import codigo.programacion.model.Contenido;
import codigo.programacion.model.User;
import codigo.programacion.utils.ContenidoRenderer;
import com.sun.javafx.application.PlatformImpl;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author HugoLuna
 */
public class CursoDetail extends javax.swing.JFrame implements Go, init {

    /**
     * Create variables
     */
    public static User user = null;
    public static int id_contenido = 1;
    public static int id_course = 1;

    private Stage stage;
    private WebView browser;
    private WebView webView;
    private JFXPanel jfxPanel;
    private JButton swingButton;
    private WebEngine webEngine;
    String content_Url = "";
    public DefaultListModel<Contenido> model;
    public String url;

    /**
     * Creates new form CursoDetail
     */
    public CursoDetail(int id_course, int id_contenido, User user, String url) {
        this.id_course = id_course;
        this.id_contenido = id_contenido;
        this.user = user;
        this.url = url;
        
        content_Url = "<iframe width=\"570\" height=\"340\" src=\"http://www.youtube.com/embed/" + url + "\" frameborder=\"0\" allowfullscreen></iframe>";;
        initComponents();
        initViews();
    }

    public CursoDetail() {

        initComponents();
        initViews();
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
        cursoBtn = new javax.swing.JLabel();
        docBtn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        photoProfile = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        searchBtn = new javax.swing.JLabel();
        fieldSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        containerCursos = new javax.swing.JPanel();
        imageCourse = new javax.swing.JLabel();
        nameCourse = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        listContentCourse = new javax.swing.JList();
        button1 = new java.awt.Button();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        containerVideo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        cursoBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cursoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/programacion/home/play-button.png"))); // NOI18N
        cursoBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cursoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cursoBtnMouseClicked(evt);
            }
        });
        jPanel10.add(cursoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 70, 50));

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

        containerCursos.setBackground(new java.awt.Color(21, 150, 135));

        imageCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/android.png"))); // NOI18N

        nameCourse.setFont(new java.awt.Font("Lucida Grande", 3, 36)); // NOI18N
        nameCourse.setForeground(new java.awt.Color(255, 255, 255));
        nameCourse.setText("Curso de Desarrollo Android");

        jScrollPane1.setBorder(null);

        listContentCourse.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listContentCourse.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listContentCourse);

        button1.setLabel("button1");

        jButton1.setText("jButton1");

        jCheckBox1.setText("jCheckBox1");

        containerVideo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout containerVideoLayout = new javax.swing.GroupLayout(containerVideo);
        containerVideo.setLayout(containerVideoLayout);
        containerVideoLayout.setHorizontalGroup(
            containerVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        containerVideoLayout.setVerticalGroup(
            containerVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout containerCursosLayout = new javax.swing.GroupLayout(containerCursos);
        containerCursos.setLayout(containerCursosLayout);
        containerCursosLayout.setHorizontalGroup(
            containerCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerCursosLayout.createSequentialGroup()
                .addGroup(containerCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(containerCursosLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(imageCourse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(nameCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerCursosLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(containerVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        containerCursosLayout.setVerticalGroup(
            containerCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerCursosLayout.createSequentialGroup()
                .addGroup(containerCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerCursosLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(imageCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerCursosLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(nameCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addGroup(containerCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(containerCursosLayout.createSequentialGroup()
                        .addComponent(containerVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 147, Short.MAX_VALUE))))
        );

        jPanel9.add(containerCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 1230, 690));

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

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:

        goTo("Home");
    }//GEN-LAST:event_HomeMouseClicked

    private void photoProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photoProfileMouseClicked
        // TODO add your handling code here:
        goTo("Perfil");
    }//GEN-LAST:event_photoProfileMouseClicked

    private void userNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_userNameMouseClicked

    private void cursoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cursoBtnMouseClicked
        // TODO add your handling code here:
        goTo("Curso");
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
            
            this.dispose();
            Search s = new Search(user,text);
            s.setVisible(true);
            
        }
    }//GEN-LAST:event_searchBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private java.awt.Button button1;
    private javax.swing.JPanel containerCursos;
    private javax.swing.JPanel containerVideo;
    private javax.swing.JLabel cursoBtn;
    private javax.swing.JLabel docBtn;
    private javax.swing.JTextField fieldSearch;
    private javax.swing.JLabel imageCourse;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JList listContentCourse;
    private java.awt.Label nameCourse;
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
                break;
            default:
                break;
        }

    }

    @Override
    public void initViews() {
        userName.setText(user.getUsuario());
        model = new DefaultListModel<>();

        try {
            Connection conDB = DB.getConection();
            Statement state = conDB.createStatement();
            Statement state2 = conDB.createStatement();

            String consulta = "SELECT * FROM contenido WHERE id_curso = '" + id_course + "' ORDER BY id ASC";
            ResultSet resultset = state.executeQuery(consulta);

            if (resultset != null) {

                while (resultset.next()) {
                    // get fields
                    Integer id = resultset.getInt("id");
                    Integer id_course = resultset.getInt("id_curso");
                    String nombre = resultset.getString("nombre");
                    String url = resultset.getString("url");
                    String descripcion = resultset.getString("descripcion");
                    String created_at = resultset.getString("created_at");
                    String updated_at = resultset.getString("updated_at");

                    model.addElement(new Contenido(id, id_course, nombre, url, descripcion, created_at, updated_at));

                }

            }

            String con = "SELECT * FROM curso WHERE id = '" + id_course + "'";
            ResultSet rs = state2.executeQuery(con);

            if (rs != null) {
                rs.next();

                nameCourse.setText(rs.getString("nombre"));

                try {
                    Image image = null;
                    URL url = new URL("http://lunainc.com.mx/cursos/" + rs.getString("img"));
                    image = ImageIO.read(url);
                    imageCourse.setIcon(new ImageIcon(image));
                } catch (Exception e) {
                    System.err.println("Error al descargar la imagen: " + e.getMessage());

                }

            }

        } catch (SQLException ex) {

            System.out.println("Error sql: " + ex.getMessage());

        }

        // create JList with model
        listContentCourse.setModel(model);
        // set cell renderer
        listContentCourse.setCellRenderer(new ContenidoRenderer());
        int selectedIndex = listContentCourse.getSelectedIndex();
        if (selectedIndex != -1) {
            id_contenido = model.get(selectedIndex).getId();
        }

      
        MouseListener mouseListener = new MouseAdapter() {
            public void mouseClicked(MouseEvent mouseEvent) {
                listContentCourse = (JList) mouseEvent.getSource();

                if (mouseEvent.getClickCount() == 1) {
                    int index = listContentCourse.locationToIndex(mouseEvent.getPoint());
                    //System.out.println(model.get(index).getNombre());
                }

                if (mouseEvent.getClickCount() == 2) {
                    int index = listContentCourse.locationToIndex(mouseEvent.getPoint());
                    System.out.println(model.get(index).getNombre());
                    int id_con = model.get(index).getId();
                    dispose();
                    String urlD = model.get(index).getUrl();
                    CursoDetail cd = new CursoDetail(id_course,id_con,user,urlD);
                    cd.setVisible(true);
                    
                }
            }
        };
        listContentCourse.addMouseListener(mouseListener);

        /**
         * Add jfxpanel to video youtube
         */
        jfxPanel = new JFXPanel();
        createScene();
        containerVideo.setSize(589, 340);
        containerVideo.setLayout(new BorderLayout());
        containerVideo.add(jfxPanel, BorderLayout.CENTER);

        
        

    }

    public static void main(String... args) {
        // Run this later:
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               CursoDetail d = new CursoDetail();
               d.setVisible(true);
            }
        });
    }

    

    /*
    try {
                            Stage primary = new Stage();
                            Connection conDB = DB.getConection();
                            Statement state = conDB.createStatement();

                            String query = "SELECT * FROM contenido WHERE id = '" + CursoView.id_contenido + "' AND id_curso = '" + CursoView.id_course + "'";
                            System.out.println(query);
                            ResultSet rs = state.executeQuery(query);

                            if (rs != null) {
                                rs.next();

                                String content_Url = "<iframe width=\"700\" height=\"400\" src=\"http://www.youtube.com/embed/" + rs.getString("url") + "\" frameborder=\"0\" allowfullscreen></iframe>";

                                WebView webView = new WebView();
                                WebEngine webEngine = webView.getEngine();
                                webEngine.loadContent(content_Url);
                                StackPane root = new StackPane();
                                root.getChildren().add(webView);
                                Scene scene = new Scene(root, 800, 500);
                                System.out.println(content_Url);
                                primary.setTitle("Video del curso");
                                primary.setScene(scene);
                                primary.show();

                            }

                        } catch (SQLException ex) {
                            System.err.println("Error sql cursod: " + ex.getMessage());
                        }
     */
    private void createScene() {
        PlatformImpl.startup(new Runnable() {
            @Override
            public void run() {

                stage = new Stage();

                stage.setTitle("Video del curso");
                stage.setResizable(true);
                stage.setMinHeight(589);
                stage.setMinWidth(340);

                Group root = new Group();
                //[589, 340]
                Scene scene = new Scene(root, 589, 340);
                stage.setScene(scene);

                webView = new WebView();
                WebEngine webEngine = webView.getEngine();
                webEngine.loadContent(content_Url);

                System.out.println(content_Url);

                /*
                                 // Set up the embedded browser:
                browser = new WebView();
                webEngine = browser.getEngine();
                webEngine.load("http://www.google.com");
                System.out.println(webEngine.getTitle());
                 */
                ObservableList<Node> children = root.getChildren();
                children.add(webView);

                jfxPanel.setScene(scene);
            }
        });
    }

}
