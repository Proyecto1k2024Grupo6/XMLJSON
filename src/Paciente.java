public class Paciente {
    private int sip;
    private String nombre;
    private String dni;
    private String telefono;
    private String nac;

    public Paciente(int sip, String nombre, String dni, String telefono, String nac) {
        this.sip = sip;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.nac = nac;
    }

    public String toJson() {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n")
                .append(" \"sip\": ").append(sip).append(",\n")
                .append(" \"nombre\": \"").append(nombre).append("\",\n")
                .append(" \"dni\": \"").append(dni).append("\",\n")
                .append(" \"telefono\": \"").append(telefono).append("\",\n")
                .append(" \"nac\": \"").append(nac).append("\"\n")
                .append("}");
        return jsonBuilder.toString();
    }

    public String toXml() {
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<Paciente>\n")
                .append(" <sip>").append(sip).append("</sip>\n")
                .append(" <nombre>").append(nombre).append("</nombre>\n")
                .append(" <dni>").append(dni).append("</dni>\n")
                .append(" <telefono>").append(telefono).append("</telefono>\n")
                .append(" <nac>").append(nac).append("</nac>\n")
                .append("</Paciente>");
        return xmlBuilder.toString();
    }
}