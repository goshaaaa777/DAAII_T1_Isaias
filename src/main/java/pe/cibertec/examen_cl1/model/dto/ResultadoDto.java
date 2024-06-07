package pe.cibertec.examen_cl1.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultadoDto {
    private Boolean respuesta;
    private String mensaje;
}
