<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>EF - Factores de Ajuste</title>
</head>
<body>
<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">Factores de Ajuste</h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="panel panel-default">
			<div class="panel-heading"></div>
			<form name="row"
						action="/proyecto-definitivo/factores-ajuste/${id}/save"
						method="POST">
			<div class="panel-body">
				<div class="col-lg-12">
					
					<jsp:include page="./data.jsp"></jsp:include>
					

				</div>
			</div>
<<<<<<< Upstream, based on origin/vista

=======
			<div class="panel-footer table-footer-fix clearfix">
				<span style="float: right">
					
						<button type="submit"
							class="custom-color right-button corner-button">
							<i class="glyphicon glyphicon-floppy-save"></i> Guardar Proyecto
						</button>
					
				</span>
			</div>
			</form>
>>>>>>> 99c06fb Controlador factoresAjuste Fixed!
		</div>
	</div>



</div>
<!-- /.page-wrapper -->
</body>

</html>