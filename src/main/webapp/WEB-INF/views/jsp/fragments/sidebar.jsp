<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

	<spring:url value="/resources/core/res/custom/custom.css" var="coreCss" />
	<spring:url value="/resources/core/res/bootstrap/css/bootstrap.min.css" var="bootstrapCss" />
	<link href="${bootstrapCss}" rel="stylesheet" />
	<link href="${coreCss}" rel="stylesheet" />
<<<<<<< Upstream, based on origin/marius
<<<<<<< Upstream, based on origin/marius
=======
=======
>>>>>>> 8e71248 a
<<<<<<< Upstream, based on origin/marius

>>>>>>> 5232b94 a
	<!-- Bootstrap Core JavaScript -->
<spring:url value="/resources/core/res/bootstrap/js/bootstrap.min.js" var="bootstrapJs" />

<spring:url value="/resources/core/res/jquery/jquery.min.js" var="jQuery" />
<script src="${jQuery}"></script>
<script src="${bootstrapJs}"></script>



=======
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
	<script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
	<script src="/resources/core/js/datatable.js"></script>
>>>>>>> 9adbb87 added control.js
=======
	<!-- Bootstrap Core JavaScript -->
<spring:url value="/resources/core/res/bootstrap/js/bootstrap.min.js" var="bootstrapJs" />

<spring:url value="/resources/core/res/jquery/jquery.min.js" var="jQuery" />
<script src="${jQuery}"></script>
<script src="${bootstrapJs}"></script>



>>>>>>> 2cb83f4 some changes
</head>

<body onload="check()">
<c:set var="url" value="${ pageContext.request.requestURI }" />
	<div id="wrapper">
<<<<<<< Upstream, based on origin/marius
		<div class="nav-side-menu">
=======
    	<div class="nav-side-menu">
<<<<<<< Upstream, based on origin/marius
<<<<<<< Upstream, based on origin/marius
>>>>>>> a308922 New Sidebar Progress
        	<div class="brand"><a href="/proyecto-definitivo/">USUARIO</a></div>
         	<i class="glyphicon glyphicon-menu-hamburger toggle-btn" data-toggle="collapse" data-target="#menu-content"></i>
         	<div class="menu-list">
            	<ul id="menu-content" class="menu-content collapse out">

					<li>
    	                             
    	      			<a href="#" id="collapsable" data-toggle="collapse" data-target="#toggleDemo" class="collapsed" aria-expanded="false">
    	      				<b>Proyectos</b> <span class="fa arrow"></span>
    	      			</a>
    	      			<div class="collapse" id="toggleDemo" style="height: 0px;">
    	       				<ul class="expandibles">
								<c:forEach var="proyecto" items="${proyectos}">
    	          					<li><a href="/proyecto-definitivo/cargar/${proyecto.codigo}">${proyecto.nombre} (${proyecto.codigo})</a></li>
								</c:forEach>
								</ul>
								<ul>
							<li>
                        <form name="row" action="/proyecto-definitivo/addProject" method="GET">
                           <button type="submit" class="custom-color left-button menu-button">
                           <i class="glyphicon glyphicon-plus"></i> Crear Proyecto
                           </button>
                        </form>
</li>
</ul>
        	    			</ul>
        	    		</div>
        			</li>
           			
        		</ul>
        		

=======
        	<div class="brand"><a href="/proyecto-definitivo/index/">Estimación funcionalidades</a></div>
=======
        	<div class="brand"><a href="/proyecto-definitivo/index/">USUARIO</a></div>
>>>>>>> 2cb83f4 some changes
         	<i class="glyphicon glyphicon-menu-hamburger toggle-btn" data-toggle="collapse" data-target="#menu-content"></i>
         	<div class="menu-list">
            	<ul id="menu-content" class="menu-content collapse out">

					<li>
    	                             
    	      			<a href="#" id="collapsable" data-toggle="collapse" data-target="#toggleDemo" class="collapsed" aria-expanded="false">
    	      				<b>Proyectos</b> <span class="fa arrow"></span>
    	      			</a>
    	      			<div class="collapse" id="toggleDemo" style="height: 0px;">
    	       				<ul class="expandibles">
								<c:forEach var="proyecto" items="${proyectos}">
    	          					<li><a href="#">${proyecto.nombre} (${proyecto.codigo})</a></li>
								</c:forEach>
								</ul>
								<ul>
							<li>
                        <form name="row" action="/proyecto-definitivo/index/addRow" method="POST">
                           <button type="submit" class="custom-color left-button menu-button">
                           <i class="glyphicon glyphicon-plus"></i> Crear Módulo
                           </button>
                        </form>
</li>
</ul>
        	    			</ul>
        	    		</div>
        			</li>
           			
        		</ul>
<<<<<<< Upstream, based on origin/marius
>>>>>>> be54e77 New Sidebar Progress
=======
        		

>>>>>>> 2cb83f4 some changes
     		</div>
  		</div>
	</div>
