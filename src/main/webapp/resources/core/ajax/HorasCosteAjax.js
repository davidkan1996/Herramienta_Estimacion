function doAjaxSaveHorasCoste() {

    var delivery1 = {};
    delivery1["nombre"] = "gestion";
    delivery1["porcentaje"] = document.getElementById('gestion_por').value;
    delivery1["internaPractica"] = 0;
    delivery1["horas"] =parseInt(document.getElementById('gestion_horas').innerHTML);
    delivery1["coste"] = parseInt(document.getElementById('gestion_coste').innerHTML);

    var delivery2 = {};
    delivery2["nombre"] = "evaluacion";
    delivery2["porcentaje"] = document.getElementById('evaluacion_por').value;
    delivery2["internaPractica"] = 0;
    delivery2["horas"] = parseInt(document.getElementById('evaluacion_horas').innerHTML);
    delivery2["coste"] = parseInt(document.getElementById('evaluacion_coste').innerHTML);

    var delivery3 = {};
    delivery3["nombre"] = "analisis";
    delivery3["porcentaje"] = parseInt(document.getElementById('analisis_por').innerHTML);
    if(document.getElementById('analisis_ip').value==0){
    	delivery3["internaPractica"] = false;
    }else{
    	delivery3["internaPractica"] = true;
    	
    }
    delivery3["horas"] = parseInt(document.getElementById('analisis_horas').innerHTML);
    delivery3["coste"] = parseInt(document.getElementById('analisis_coste').innerHTML);

    var delivery4 = {};
    delivery4["nombre"] = "diseno";
    delivery4["porcentaje"] = document.getElementById('diseno_por').value;
    delivery4["internaPractica"] = 0;
    delivery4["horas"] = parseInt(document.getElementById('diseno_horas').innerHTML);
    delivery4["coste"] = parseInt(document.getElementById('diseno_coste').innerHTML);

    var delivery5 = {};
    delivery5["nombre"] = "construccion";
    delivery5["porcentaje"] = document.getElementById('construccion_por').value;
    delivery5["internaPractica"] = 0;
    delivery5["horas"] = parseInt(document.getElementById('construccion_horas').innerHTML);
    delivery5["coste"] = parseInt(document.getElementById('construccion_coste').innerHTML);;

    var delivery6 = {};
    delivery6["nombre"] = "testing";
    delivery6["porcentaje"] = parseInt(document.getElementById('testing_por').innerHTML);
    if(document.getElementById('testing_ip').value==0){
    	delivery6["internaPractica"] = false;
    }else{
    	delivery6["internaPractica"] = true;
    }
    delivery6["horas"] = parseInt(document.getElementById('testing_horas').innerHTML);
    delivery6["coste"] = parseInt(document.getElementById('testing_coste').innerHTML);

    var gestion1 = {};
    gestion1["nombre"] = "calidad";
    gestion1["nivel"] = document.getElementById('calidad_niv').value;
    gestion1["porcentaje"] = parseInt(document.getElementById('calidad_por').innerHTML);
    if (document.getElementById('testing_ip').value==0) {
    	gestion1["internaPractica"] = false;
    }else{
    	gestion1["internaPractica"] = true;
    }
    gestion1["horas"] = parseInt(document.getElementById('calidad_horas').innerHTML);
    gestion1["coste"] = parseInt(document.getElementById('calidad_coste').innerHTML);

    var gestion2 = {};
    gestion2["nombre"] = "seguridad";
    gestion2["nivel"] = document.getElementById('seguridad_niv').value;
    gestion2["porcentaje"] = parseInt(document.getElementById('seguridad_por').innerHTML);
    if (document.getElementById('seguridad_ip').value==0){
    	gestion2["internaPractica"] = false;
    	
    }else{
    	gestion2["internaPractica"] = true;
    }
    gestion2["horas"] = parseInt(document.getElementById('seguridad_horas').innerHTML);
    gestion2["coste"] = parseInt(document.getElementById('seguridad_coste').innerHTML);

    var gestion3 = {};
    gestion3["nombre"] = "despliegues";
    gestion3["nivel"] = document.getElementById('despliegues_niv').value;
    gestion3["porcentaje"] = parseInt(document.getElementById('despliegues_por').innerHTML);
    if(document.getElementById('despliegues_ip').value==0){
    	gestion3["internaPractica"] = false;    	
    }else{
    	gestion3["internaPractica"] = true;
    }
    gestion3["horas"] =  parseInt(document.getElementById('despliegues_horas').innerHTML);
    gestion3["coste"] =  parseInt(document.getElementById('despliegues_coste').innerHTML);

    var gobierno1 = {};
    gobierno1["nombre"] = "gestionproyecto";
    gobierno1["porcentaje"] = document.getElementById('gestionproyecto_por').value;
    if(document.getElementById('gestionproyecto_ip').value==0){
    	gobierno1["internaPractica"] = false;
    	
    }else{
    	gobierno1["internaPractica"] = true;
    }
    gobierno1["horas"] = parseInt(document.getElementById('gestionproyecto_horas').innerHTML);
    gobierno1["coste"] = parseInt(document.getElementById('gestionproyecto_coste').innerHTML);

    var gobierno2 = {};
    gobierno2["nombre"] = "dm";
    gobierno2["porcentaje"] = document.getElementById('dm_por').value;
    gobierno2["internaPractica"] = 0;
    gobierno2["horas"] = parseInt(document.getElementById('dm_horas').innerHTML);
    gobierno2["coste"] = parseInt(document.getElementById('dm_coste').innerHTML);

    var riesgo = {};
    riesgo["nombre"] = "horascontingencia";
    riesgo["num"] = parseInt(document.getElementById('horascontingencia').innerHTML);

    var valoracionFinal = {};
    valoracionFinal["nombre"] = "totalADMDW";
    valoracionFinal["horas"] = parseInt(document.getElementById('totalhoras_admdw').innerHTML);
    valoracionFinal["coste"] = parseFloat(document.getElementById('totalcoste_admdw').innerHTML);

    var data = {};
    data["delivery1"] = delivery1;
    data["delivery2"] = delivery2;
    data["delivery3"] = delivery3;
    data["delivery4"] = delivery4;
    data["delivery5"] = delivery5;
    data["delivery6"] = delivery6;
    data["gestion1"] = gestion1;
    data["gestion2"] = gestion2;
    data["gestion3"] = gestion3;
    data["gobierno1"] = gobierno1;
    data["gobierno2"] = gobierno2;
    data["riesgo"] = riesgo;
    data["valoracionFinal"] = valoracionFinal;

    console.log(data);
    $.ajax({
        type : "POST",
        url : "costes/save",
        dataType : "json",
        contentType : "application/json; charset=utf-8",
        data : JSON.stringify(data),
        success : function() {

        },
        error : function(e) {
            console.log('Error: ' + e);
        }
    });
}