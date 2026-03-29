import javax.swing.*;
import java.time.LocalDateTime;

public class Consulta {
    private LocalDateTime data;
    private double valorDaConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta(LocalDateTime data, double valorDaConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        this.valorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "data=" + data +
                ", valorDaConsulta=" + valorDaConsulta +
                ", medico=" + medico.getNome() +
                ", paciente=" + paciente.getNome() +
                '}';
    }
}
