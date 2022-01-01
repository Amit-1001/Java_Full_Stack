<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<html>
    <head>

    </head>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <style>
    table, th, td {
      border:1px solid black;
    }
    </style>

    <body>
        <sql:setDataSource var = "snapshot" driver = "com.mysql.cj.jdbc.Driver"
                      url = "jdbc:mysql://localhost:3306/studentmarks"
                      user = "root"  password = "root"/>
        <sql:query dataSource = "${snapshot}" var = "result">
                 SELECT * FROM studentmarks ORDER BY percentage DESC;
        </sql:query>

        <div class="background-box">
            <h2>Student Information</h2>
            <table id="exam" class="table" border=1>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">Semester</th>

                    <th>Percentage</th>
                </tr>

                <c:forEach var = "row" items = "${result.rows}">
                    <tr>
                        <td><c:out value = "${row.id}"/></td>
                        <td><c:out value = "${row.firstName}"/></td>
                        <td><c:out value = "${row.lastName}"/></td>
                        <td><c:out value = "${row.semester}"/></td>
                        <td><c:out value = "${row.percentage}"/></td>
                    </tr>
                </c:forEach>
            </table>
        </div>



    </body>
</html>