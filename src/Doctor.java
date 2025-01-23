public class Doctor {
    private String nombre;
    private String especialidad;
    private int telefono;
    private String email;
    private String dni;

    public Doctor(String nombre, String especialidad, int telefono, String email, String dni) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.email = email;
        this.dni = dni;
    }

    public String toJson() {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n")
                .append(" \"nombre\": \"").append(nombre).append("\",\n")
                .append(" \"especialidad\": \"").append(especialidad).append("\",\n")
                .append(" \"telefono\": ").append(telefono).append(",\n")
                .append(" \"email\": \"").append(email).append("\",\n")
                .append(" \"dni\": \"").append(dni).append("\"\n")
                .append("}");
        return jsonBuilder.toString();
    }

    public String toXml() {
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<Doctor>\n")
                .append(" <nombre>").append(nombre).append("</nombre>\n")
                .append(" <especialidad>").append(especialidad).append("</especialidad>\n")
                .append(" <telefono>").append(telefono).append("</telefono>\n")
                .append(" <email>").append(email).append("</email>\n")
                .append(" <dni>").append(dni).append("</dni>\n")
                .append("</Doctor>");
        return xmlBuilder.toString();
    }
}