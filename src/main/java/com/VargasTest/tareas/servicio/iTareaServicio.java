package com.VargasTest.tareas.servicio;

import com.VargasTest.tareas.modelo.Tarea;

import java.util.List;

public interface iTareaServicio {
    public List<Tarea> listarTareas();

    public Tarea buscarTareaPorId(Integer idTarea);

    public void guardarTarea(Tarea tarea);

    public void eliminarTarea(Tarea tarea);


}
