<%@ page import="java.sql.Array" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Materias</title>
</head>
<body>

  <h1>Materias desde JSP</h1>

  <%
      // iterando
      String [] materias =  new String[3];
      materias[0] = "Ces3";
      materias[1] = "Analisis";
      materias[2] = "Bases de datos";


      // sin iterar
      String materia1 = "matematicas";
      String materia2 = "espaniol";
      String materia3 = "ingles";
    %>
      <ul>
        <li> <%= materia1 %></li>
        <li> <%= materia2 %></li>
        <li> <%= materia3 %></li>
      </ul>
    <%

    %>

      <ul>
        <%
           for (int i =0; i < materias.length; i++){
             %>
                <li>
                  <%= materias[i]%>
                </li>
            <%;
           }
        %>
      </ul>
    <%

  %>

</body>
</html>
