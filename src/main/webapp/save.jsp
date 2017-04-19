<%-- 
    Document   : save
    Created on : 21 Mar, 2017, 10:21:35 PM
    Author     : Pranav
--%>

<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="javax.transaction.TransactionManager"%>
<%@page import="org.jboss.logging.Logger" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Persisting Data </title>
    </head>
    <body>
        <jsp:useBean id="ob" class="com.psx.minortest.Person"></jsp:useBean>
        <jsp:setProperty property="*" name="ob"/>
        <%
            TransactionManager transactionManager = com.arjuna.ats.jta.TransactionManager.transactionManager();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("personogm");
            EntityManager em = emf.createEntityManager();
            transactionManager.begin();
            em.persist(ob);
            if (em.contains(ob)){
                %>
                <span>Data Saved Successfully</span>
        <%
            }
            else {
                %>
                <span>Data Could not be saved. Try Again.</span>
        <%
            }
            em.flush();
            em.close();
            transactionManager.commit();
            emf.close();            
        %>
    </body>
</html>
