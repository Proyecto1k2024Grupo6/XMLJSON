public class Principal {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Perez", "Cardiología", 123456789, "drperez@hospital.com", "ABC123");
        Paciente paciente = new Paciente(12345, "Juan López", "XYZ987", "987654321", "1985-04-23");
        Medicamento medicamento = new Medicamento(1, "Ibuprofeno", "200mg", "Cada 8 horas", "Ninguna");
        Tratamiento tratamiento = new Tratamiento(7, "2025-01-20", "2025-01-27", "Mareos");

        System.out.println("Doctor en JSON:\n" + doctor.toJson());
        System.out.println("\nDoctor en XML:\n" + doctor.toXml());

        System.out.println("\nPaciente en JSON:\n" + paciente.toJson());
        System.out.println("\nPaciente en XML:\n" + paciente.toXml());

        System.out.println("\nMedicamento en JSON:\n" + medicamento.toJson());
        System.out.println("\nMedicamento en XML:\n" + medicamento.toXml());

        System.out.println("\nTratamiento en JSON:\n" + tratamiento.toJson());
        System.out.println("\nTratamiento en XML:\n" + tratamiento.toXml());
    }
}
