public class Medicamento {
    private int id;
    private String nombre;
    private String dosis;
    private String frecuencia;
    private String observaciones;

    public Medicamento(int id, String nombre, String dosis, String frecuencia, String observaciones) {
        this.id = id;
        this.nombre = nombre;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.observaciones = observaciones;
    }

    public String toJson() {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n")
                .append(" \"id\": ").append(id).append(",\n")
                .append(" \"nombre\": \"").append(nombre).append("\",\n")
                .append(" \"dosis\": \"").append(dosis).append("\",\n")
                .append(" \"frecuencia\": \"").append(frecuencia).append("\",\n")
                .append(" \"observaciones\": \"").append(observaciones).append("\"\n")
                .append("}");
        return jsonBuilder.toString();
    }

    public String toXml() {
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<Medicamento>\n")
                .append(" <id>").append(id).append("</id>\n")
                .append(" <nombre>").append(nombre).append("</nombre>\n")
                .append(" <dosis>").append(dosis).append("</dosis>\n")
                .append(" <frecuencia>").append(frecuencia).append("</frecuencia>\n")
                .append(" <observaciones>").append(observaciones).append("</observaciones>\n")
                .append("</Medicamento>");
        return xmlBuilder.toString();
    }
}
