public class Prestamo {
    private String codigo;
    private String fechaPrestamos;
    private String fechaDevolucion;
    private Usuario usuario;
    private Libro libro;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaPrestamos() {
        return fechaPrestamos;
    }

    public void setFechaPrestamos(String fechaPrestamos) {
        this.fechaPrestamos = fechaPrestamos;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
