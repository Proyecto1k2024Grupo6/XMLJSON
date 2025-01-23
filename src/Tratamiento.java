public class Tratamiento {
    private int duracion;
    private String fechaInicio;
    private String fechaFinal;
    private String efectosSecundarios;

    public Tratamiento(int duracion, String fechaInicio, String fechaFinal, String efectosSecundarios) {
        this.duracion = duracion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.efectosSecundarios = efectosSecundarios;
    }

    public String toJson() {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n")
                .append(" \"duracion\": ").append(duracion).append(",\n")
                .append(" \"fechaInicio\": \"").append(fechaInicio).append("\",\n")
                .append(" \"fechaFinal\": \"").append(fechaFinal).append("\",\n")
                .append(" \"efectosSecundarios\": \"").append(efectosSecundarios).append("\"\n")
                .append("}");
        return jsonBuilder.toString();
    }

    public String toXml() {
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<Tratamiento>\n")
                .append(" <duracion>").append(duracion).append("</duracion>\n")
                .append(" <fechaInicio>").append(fechaInicio).append("</fechaInicio>\n")
                .append(" <fechaFinal>").append(fechaFinal).append("</fechaFinal>\n")
                .append(" <efectosSecundarios>").append(efectosSecundarios).append("</efectosSecundarios>\n")
                .append("</Tratamiento>");
        return xmlBuilder.toString();
    }
}
