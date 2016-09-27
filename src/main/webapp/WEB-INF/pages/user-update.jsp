<%-- 
    Document   : updateStudent
    Created on : Jul 4, 2016, 8:12:04 PM
    Author     : KUYLIM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update | Student Management</title>
        <link href="${pageContext.request.contextPath }/resources/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <h1>Update Student 's Information</h1>
            <hr>
            <form action="${pageContext.request.contextPath }/edit" method="POST">
                <fieldset class="form-group">
                    <div>
                        <label> ID : </label>
                        <input type="text" name="id" value="${User.id}" readonly="true" class="form-control">
                    </div>
                    <div>
                        <label> Name : </label>
                        <input type="text" name="name" placeholder="student Name" class="form-control" value="${User.name}">
                    </div>
                    
                    <div>
                        <label> Email : </label>
                        <input type="text" name="email" placeholder="student score" class="form-control" value="${User.email}">
                    </div>
                    
                    <div>
                        <label>User Role :</label>
                        <select name="tmproles" multiple ="multiple" class="form-control">
                            <c:forEach items = "${User.role}" var = "role" varStatus="loop">
                                
                                <c:choose>
                                    <c:when test = "${fn:length(User.role) == 1}">
                                        <c:if test = "${loop.index == 0}" ><option <c:if test = "${role.roleid == '1'}" >selected="selected" </c:if> value="1">User</option></c:if>
                                        <c:if test = "${loop.index == 0}" ><option <c:if test = "${role.roleid == '2'}" >selected="selected" </c:if> value="2">Admin</option></c:if>
                                        <c:if test = "${loop.index == 0}" ><option <c:if test = "${role.roleid == '3'}" >selected="selected" </c:if> value="3">Developer</option></c:if>
                                    </c:when>
                                    <c:when test = "${fn:length(User.role) == 2}">
                                        <c:if test = "${loop.index == 0}" ><option <c:if test = "${role.roleid == '1'}" >selected="selected" </c:if> value="1">User</option></c:if>
                                        <c:if test = "${loop.index == 1}" ><option <c:if test = "${role.roleid == '2'}" >selected="selected" </c:if> value="2">Admin</option></c:if>
                                        <c:if test = "${loop.index == 1}" ><option <c:if test = "${role.roleid == '3'}" >selected="selected" </c:if> value="3">Developer</option></c:if>
                                    </c:when>
                                    <c:otherwise>
                                        <c:if test = "${loop.index == 0}" ><option <c:if test = "${role.roleid == '1'}" >selected="selected" </c:if> value="1">User</option></c:if>
                                        <c:if test = "${loop.index == 1}" ><option <c:if test = "${role.roleid == '2'}" >selected="selected" </c:if> value="2">Admin</option></c:if>
                                        <c:if test = "${loop.index == 2}" ><option <c:if test = "${role.roleid == '3'}" >selected="selected" </c:if> value="3">Developer</option></c:if>
                                    </c:otherwise>
                                    
                                </c:choose>   
                            </c:forEach>   
                                
                        </select>
                    </div>
                    
                    <div>
                        <input type="submit" value="update" class="btn btn-success" style="margin-top: 10px;">
                    </div>
                </fieldset>
            </form>
        </div>
    </body>
</html>
