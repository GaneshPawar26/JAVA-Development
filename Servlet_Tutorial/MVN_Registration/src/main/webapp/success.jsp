<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
String name=(String)session.getAttribute("name");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Successful</title>

    <style>
        *{
            margin:0;
            padding:0;
            box-sizing:border-box;
            font-family:'Segoe UI',sans-serif;
        }

        body{
            height:100vh;
            display:flex;
            justify-content:center;
            align-items:center;
            background:#f5f5f5;
        }

        .card{
            width:380px;
            background:white;
            padding:40px;
            text-align:center;
            border-radius:20px;
            box-shadow:0 15px 40px rgba(0,0,0,0.1);
        }

        .success-icon{
            width:80px;
            height:80px;
            background:#4CAF50;
            color:white;
            border-radius:50%;
            margin:auto;
            display:flex;
            justify-content:center;
            align-items:center;
            font-size:40px;
            font-weight:bold;
        }

        h1{
            margin-top:20px;
            color:#333;
        }

        p{
            margin-top:15px;
            color:#666;
            line-height:1.6;
        }

        .btn{
            display:inline-block;
            margin-top:25px;
            padding:12px 30px;
            background:#444;
            color:white;
            text-decoration:none;
            border-radius:10px;
            transition:0.3s;
        }

        .btn:hover{
            background:#222;
        }
    </style>
</head>
<body>

<div class="card">

    <div class="success-icon">✓</div>

    <h1>Registration Successful</h1>

    <p>
        Congratulations <b><%=name%></b>! Your account has been
        created successfully. You can now continue to the login page.
    </p>

    <a href="index.html" class="btn">Go To Login</a>

</div>

</body>
</html>