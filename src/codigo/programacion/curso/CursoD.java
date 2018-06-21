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
    Stage primary;

    /**
     * Creates new form Curso
     */
    public CursoD() {

    }

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void init() throws Exception {

        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primary = primaryStage;

    }
}
