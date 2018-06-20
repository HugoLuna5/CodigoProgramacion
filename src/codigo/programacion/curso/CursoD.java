package codigo.programacion.curso;

import codigo.programacion.conexionDB.DB;
import static codigo.programacion.curso.CursoDetail.id_contenido;
import static codigo.programacion.curso.CursoDetail.id_course;
import codigo.programacion.model.Contenido;
import codigo.programacion.model.User;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CursoD extends Application {

    public static int id_contenido;
    public static String id_course;

    /**
     * Creates new form Curso
     */
    public CursoD() {
    }

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {

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
                primaryStage.setTitle("Video del curso");
                primaryStage.setScene(scene);
                primaryStage.show();

            }

        } catch (SQLException ex) {
            System.err.println("Error sql cursod: " + ex.getMessage());
        }

    }
}
