<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>

        <title>EF - Home</title>
    </head>

    <body>
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Gestor de proyectos</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default ">
                        <!--  <div class="panel-heading ">
                    Lista de proyectos 
                  </div>-->
                        <!-- /.panel-heading -->

                        <table width="100%" class="table table-striped tableForm" id="dataTables-example">
                            <thead>
                                <tr class="custom-color panel-heading-custom">
                                    <th colspan="3">Gestor de proyectos</th>
                                </tr>
                                <tr>
                                    <th class="col-xs-4">Nombre de proyecto</th>
                                    <th class="col-xs-2">Código</th>
                                    <th class="col-xs-5">Descripción</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <spring:url value="/criterios/saveRow" var="saveUrl" />
                                    <td>
                                        <input class="form-control" type="text" value="${proyecto.nombre}" />
                                    </td>
                                    <td>
                                        <input class="form-control" type="text" value="${proyecto.codigo}" />
                                    </td>
                                    <td>
                                        <input class="form-control" type="text" value="${proyecto.descripcion}" />

                                        <spring:url value="/index/${proyecto.codigo}/delete" var="deleteProjectUrl" />

                                        <div style="float:right">
                                            <form name="deleteRow" action="${deleteProjectUrl}" method="POST">
                                                <button type="submit" class="button delete glyphicon glyphicon-trash" />
                                            </form>
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                        <!-- </div>
                   /.panel-body -->

                        <div class="panel-footer table-footer-fix clearfix">
                            <span style="float:left">
                        <form name="row" action="/proyecto-definitivo/index/addRow" method="POST">
                           <button type="submit" class="custom-color left-button corner-button">
                           <i class="glyphicon glyphicon-plus"></i> Crear Proyecto
                           </button>
                        </form>
                     </span>
                        </div>
                        <!--  /.panel-footer -->
                    </div>
                    <!--  /.panel-default -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
        </div>
    </body>

    </html>