<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!-- Menu Toggle Script -->

<!-- Custom Theme JavaScript -->
<spring:url value="/resources/core/js/custom.min.js" var="coreJs" />

<!-- Selectors -->
<spring:url value="/resources/core/js/criterios/selectors.js" var="selectors" />
<<<<<<< Upstream, based on origin/vista
<spring:url value="/resources/core/js/horas/horasycoste.js" var="control" />
<!-- DataTables JavaScript -->
=======
<spring:url value="/resources/core/js/horas/testing.js" var="control" />
<!-- DataTables JavaScript 
>>>>>>> a725aed Test
<spring:url value="/resources/core/res/metisMenu/metisMenu.min.js" var="metisMenus" />
<spring:url value="/resources/core/res/datatables/js/jquery.dataTables.min.js" var="dataTables" />
<spring:url value="/resources/core/res/datatables-plugins/dataTables.bootstrap.min.js" var="dataTablesBS" />
<spring:url value="/resources/core/res/datatables-responsive/dataTables.responsive.js" var="dataTablesRes" />-->

<spring:url value="/resources/core/js/factores/factores.js" var="factoresJs" />
<spring:url value="/resources/core/js/control.js" var="controlJs" />

<spring:url value="/resources/core/js/lib/big.js/big.min.js" var="bigDecimal" />

<script src="${controlJs}"></script>
<script src="${bigDecimal}"></script>
<script src="${coreJs}"></script>

<script src="${selectors}"></script>
<script src="${control}"></script>
<script src="${factoresJs}"></script>

<!-- <script src="${metisMenu}"></script>
<script src="${dataTables}"></script>
<script src="${dataTablesBS}"></script>
<script src="${dataTablesRes}"></script>
<<<<<<< Upstream, based on origin/vista
 
=======
 -->
>>>>>>> a725aed Test
