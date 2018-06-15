package codigo.programacion.model;

public class User {

    private int id;
    private String nombre;
    private String apellidos;
    private String usuario;
    private String correo;
    private String photo;
    private String photoPortada;
    private String rol;
    private String password;
    private String token;
    private String created_at;
    private String updated_at;


    public User() {
    }

    public User(int id, String nombre, String apellidos, String usuario, String correo, String photo, String photoPortada, String rol, String password, String token, String created_at, String updated_at) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.correo = correo;
        this.photo = photo;
        this.photoPortada = photoPortada;
        this.rol = rol;
        this.password = password;
        this.token = token;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public User(int id, String nombre, String apellidos, String usuario, String correo, String photo, String photoPortada, String rol, String password, String token, String created_at) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.correo = correo;
        this.photo = photo;
        this.photoPortada = photoPortada;
        this.rol = rol;
        this.password = password;
        this.token = token;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhotoPortada() {
        return photoPortada;
    }

    public void setPhotoPortada(String photoPortada) {
        this.photoPortada = photoPortada;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
