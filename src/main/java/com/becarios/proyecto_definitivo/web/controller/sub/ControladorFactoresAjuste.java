package com.becarios.proyecto_definitivo.web.controller.sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.becarios.proyecto_definitivo.model.factores_ajustes.ArquitecturaReferencia;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadAmbiental;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadTecnica;
import com.becarios.proyecto_definitivo.service.factores_ajuste.FactoresAjusteService;

@Controller
public class ControladorFactoresAjuste {

    // Servicio de FactoresAjuste
    @Autowired
    FactoresAjusteService service;

    @RequestMapping(value = "/factores-ajuste", method = RequestMethod.GET)
    public String index(ModelMap model) {

        model.addAttribute("id", 600);

        return "forward:/horas-costes";

    }

    // @RequestMapping(value = "/factores-ajuste/{id}/", method =
    // RequestMethod.GET)
    // public String index(ModelMap model, @PathVariable("id") int id) {
    //
    // model.addAttribute("idProyecto", id);
    //
    // return "factores-ajuste/factores-ajuste";
    // }

    @RequestMapping(value = "/factores-ajuste/{id}/save", method = RequestMethod.POST)
    public String save(@PathVariable("id") int id, @RequestParam("rendimiento_aplica") boolean rendimientoAplica,
            @RequestParam("rendimiento_definicion") int rendimientoDefinicion,
            @RequestParam("rendimiento_exigencia") int rendimientoExigencia,
            @RequestParam("rendimiento_impacto") int rendimientoImpacto,
            @RequestParam("rendimiento_riesgo") int rendimientoRiesgo,

            @RequestParam("usabilidad_aplica") boolean usabilidadAplica,
            @RequestParam("usabilidad_definicion") int usabilidadDefinicion,
            @RequestParam("usabilidad_exigencia") int usabilidadExigencia,
            @RequestParam("usabilidad_impacto") int usabilidadImpacto,
            @RequestParam("usabilidad_riesgo") int usabilidadRiesgo,

            @RequestParam("portabilidad_aplica") boolean portabilidadAplica,
            @RequestParam("portabilidad_definicion") int portabilidadDefinicion,
            @RequestParam("portabilidad_exigencia") int portabilidadExigencia,
            @RequestParam("portabilidad_impacto") int portabilidadImpacto,
            @RequestParam("portabilidad_riesgo") int portabilidadRiesgo,

            @RequestParam("concurrencia_aplica") boolean concurrenciaAplica,
            @RequestParam("concurrencia_definicion") int concurrenciaDefinicion,
            @RequestParam("concurrencia_exigencia") int concurrenciaExigencia,
            @RequestParam("concurrencia_impacto") int concurrenciaImpacto,
            @RequestParam("concurrencia_riesgo") int concurrenciaRiesgo,

            @RequestParam("seguridad_aplica") boolean seguridadAplica,
            @RequestParam("seguridad_definicion") int seguridadDefinicion,
            @RequestParam("seguridad_exigencia") int seguridadExigencia,
            @RequestParam("seguridad_impacto") int seguridadImpacto,
            @RequestParam("seguridad_riesgo") int seguridadRiesgo,

            @RequestParam("solucion_aplica") boolean solucionAplica,
            @RequestParam("solucion_definido") boolean solucionDefinido,
            @RequestParam("solucion_conocimiento") int solucionConocimiento,
            @RequestParam("solucion_impacto") int solucionImpacto, @RequestParam("solucion_riesgo") int solucionRiesgo,

            @RequestParam("integracion_aplica") boolean integracionAplica,
            @RequestParam("integracion_definido") boolean integracionDefinido,
            @RequestParam("integracion_conocimiento") int integracionConocimiento,
            @RequestParam("integracion_impacto") int integracionImpacto,
            @RequestParam("integracion_riesgo") int integracionRiesgo,

            @RequestParam("logica_aplica") boolean logicaAplica,
            @RequestParam("logica_definido") boolean logicaDefinido,
            @RequestParam("logica_conocimiento") int logicaConocimiento,
            @RequestParam("logica_impacto") int logicaImpacto, @RequestParam("logica_riesgo") int logicaRiesgo,

            @RequestParam("despliegue_aplica") boolean despliegueAplica,
            @RequestParam("despliegue_definido") boolean despliegueDefinido,
            @RequestParam("despliegue_conocimiento") int despliegueConocimiento,
            @RequestParam("despliegue_impacto") int despliegueImpacto,
            @RequestParam("despliegue_riesgo") int despliegueRiesgo,

            @RequestParam("experiencia_valoracion") int experienciaValoracion,
            @RequestParam("experiencia_calculado") int experienciaFactorCalculado,

            @RequestParam("capacidades_valoracion") int capacidadesValoracion,
            @RequestParam("capacidades_calculado") int capacidadesFactorCalculado,

            @RequestParam("calidad_valoracion") int calidadValoracion,
            @RequestParam("calidad_calculado") int calidadFactorCalculado

    ) {

        // Clase FactoresAjuste
        FactorComplejidadTecnica rendimiento = new FactorComplejidadTecnica();
        rendimiento.setIdProyecto(id);
        rendimiento.setNombre("rendimiento");
        rendimiento.setAplica(rendimientoAplica);
        rendimiento.setGradoDefinicion(rendimientoDefinicion);
        rendimiento.setGradoExigencia(rendimientoExigencia);
        rendimiento.setImpacto(rendimientoImpacto);
        rendimiento.setRiesgo(rendimientoRiesgo);
        service.save(rendimiento);

        FactorComplejidadTecnica usabilidad = new FactorComplejidadTecnica();
        usabilidad.setIdProyecto(id);
        usabilidad.setNombre("usabilidad");
        usabilidad.setAplica(usabilidadAplica);
        usabilidad.setGradoDefinicion(usabilidadDefinicion);
        usabilidad.setGradoExigencia(usabilidadExigencia);
        usabilidad.setImpacto(usabilidadImpacto);
        usabilidad.setRiesgo(usabilidadRiesgo);
        service.save(usabilidad);

        FactorComplejidadTecnica portabilidad = new FactorComplejidadTecnica();
        portabilidad.setIdProyecto(id);
        portabilidad.setNombre("portabilidad");
        portabilidad.setAplica(rendimientoAplica);
        portabilidad.setGradoDefinicion(portabilidadDefinicion);
        portabilidad.setImpacto(portabilidadImpacto);
        portabilidad.setRiesgo(portabilidadRiesgo);
        service.save(portabilidad);

        FactorComplejidadTecnica concurrencia = new FactorComplejidadTecnica();
        concurrencia.setIdProyecto(id);
        concurrencia.setNombre("concurrencia");
        concurrencia.setAplica(concurrenciaAplica);
        concurrencia.setGradoDefinicion(concurrenciaDefinicion);
        concurrencia.setGradoExigencia(concurrenciaExigencia);
        concurrencia.setImpacto(concurrenciaImpacto);
        concurrencia.setRiesgo(concurrenciaRiesgo);
        service.save(concurrencia);

        FactorComplejidadTecnica seguridad = new FactorComplejidadTecnica();
        seguridad.setIdProyecto(id);
        seguridad.setNombre("seguridad");
        seguridad.setAplica(seguridadAplica);
        seguridad.setGradoDefinicion(seguridadDefinicion);
        seguridad.setGradoExigencia(seguridadExigencia);
        seguridad.setImpacto(seguridadImpacto);
        seguridad.setRiesgo(seguridadRiesgo);
        service.save(seguridad);

        ArquitecturaReferencia solucion = new ArquitecturaReferencia();
        solucion.setIdProyecto(id);
        solucion.setNombre("solucion");
        solucion.setAplica(solucionAplica);
        solucion.setDefinido(solucionDefinido);
        solucion.setGradoConocimento(solucionConocimiento);
        solucion.setImpacto(solucionImpacto);
        solucion.setRiesgo(solucionRiesgo);
        service.save(solucion);

        ArquitecturaReferencia integracion = new ArquitecturaReferencia();
        integracion.setIdProyecto(id);
        integracion.setNombre("integracion");
        integracion.setAplica(integracionAplica);
        integracion.setDefinido(integracionDefinido);
        integracion.setGradoConocimento(integracionConocimiento);
        integracion.setImpacto(integracionImpacto);
        integracion.setRiesgo(integracionRiesgo);
        service.save(integracion);

        ArquitecturaReferencia logica = new ArquitecturaReferencia();
        logica.setIdProyecto(id);
        logica.setNombre("logica");
        logica.setAplica(logicaAplica);
        logica.setDefinido(logicaDefinido);
        logica.setGradoConocimento(logicaConocimiento);
        logica.setImpacto(logicaImpacto);
        logica.setRiesgo(logicaRiesgo);
        service.save(logica);

        ArquitecturaReferencia despliegue = new ArquitecturaReferencia();
        despliegue.setIdProyecto(id);
        despliegue.setNombre("despliegue");
        despliegue.setAplica(despliegueAplica);
        despliegue.setDefinido(despliegueDefinido);
        despliegue.setGradoConocimento(despliegueConocimiento);
        despliegue.setImpacto(despliegueImpacto);
        despliegue.setRiesgo(despliegueRiesgo);
        service.save(despliegue);

        FactorComplejidadAmbiental experiencia = new FactorComplejidadAmbiental();
        experiencia.setIdProyecto(id);
        experiencia.setNombre("experiencia");
        experiencia.setValoracion(experienciaValoracion);
        experiencia.setFactorCalculado(experienciaFactorCalculado);
        service.save(experiencia);

        FactorComplejidadAmbiental capacidades = new FactorComplejidadAmbiental();
        capacidades.setIdProyecto(id);
        capacidades.setNombre("capacidades");
        capacidades.setValoracion(capacidadesValoracion);
        capacidades.setFactorCalculado(capacidadesFactorCalculado);
        service.save(capacidades);

        FactorComplejidadAmbiental calidad = new FactorComplejidadAmbiental();
        calidad.setIdProyecto(id);
        calidad.setNombre("calidad");
        calidad.setValoracion(calidadValoracion);
        calidad.setFactorCalculado(calidadFactorCalculado);
        service.save(calidad);

        return "redirect:/";
    }

}
