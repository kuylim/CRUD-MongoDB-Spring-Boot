<%-- 
    Document   : user-delete
    Created on : Jul 5, 2016, 8:03:26 PM
    Author     : KUYLIM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add | User Management</title>
        <link href="${pageContext.request.contextPath }/resources/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container" style="margin-top: 10px;">
            <h3 style="display: inline;">Welcome to User management</h3>
            
            <hr>
            <form action="save" method="post" id="user">
                <fieldset class="form-group">             
                    <div>
                        <label>Name : </label>
                        <input type="text" name="name" placeholder="Name" class="form-control">
                    </div>
                    
                    <div>
                        <label>Email : </label>
                        <input type="email" placeholder="email" class="form-control" name="email">
                    </div>

                    <div>
                        <label>User Role :</label>
                        <select name="tmproles" multiple ="multiple" class="form-control">
                            <option value="1">User</option>
                            <option value="2">Admin</option> 
                            <option value="3">Developer</option>
                        </select>
                    </div>
                    <div>
                        <input type="submit" value="Add" class="btn btn-success" style="margin-top: 10px;" >
                    </div>
                </fieldset>
            </form>
        </div>
    </body>
</html>
