# Kinara-Capital-assignment

System Architecture and Technology Stack

The web application was developed using a combination of technologies including Spring MVC, Hibernate, JPA, Servlet, JSP, MySQL, HTML, CSS, and Core Java. Apache Tomcat server was used to deploy the web application, and Maven was used as the automation tool to manage dependencies and plugins.

Hibernate, an ORM (Object-Relational Mapping) framework, was utilized along with JPA (Java Persistence API) to persist student details into the database. The integration of Hibernate and JPA facilitated the mapping of Java objects to relational database tables and streamlined the process of storing and retrieving data.

The Servlet API played a crucial role in managing all HTTP requests through a front controller. It provided a standardized approach to handle incoming requests, process data, and generate appropriate responses. By implementing the front controller pattern using Servlets, the application could effectively handle and route requests to the appropriate components.

All presentation logic was encapsulated within JSP (JavaServer Pages) files. JSP files allowed the mixing of HTML and Java code, enabling the dynamic generation of web content. The presentation logic, such as rendering student details and applying filtering functionality, was implemented within these JSP files, providing a separation between the presentation layer and the business logic layer.

In summary, the web application was built using a stack of technologies, including Spring MVC, Hibernate, JPA, Servlet, JSP, MySQL, HTML, CSS, and Core Java. Apache Tomcat was used as the deployment server, and Maven served as the automation tool for managing dependencies and plugins. Hibernate and JPA were employed for database interaction, while the Servlet API facilitated request handling. The presentation logic was implemented using JSP files, allowing for dynamic web content generation.

WORKING:

Upon launching the web application, the index.jsp page is displayed, presenting a registration form for entering student details. Below the form, there is a button labeled "Click here to display student details." When this button is clicked, all the student details are retrieved from the database and presented in a tabular format.

Underneath the table, an input box is provided to specify the number of students' details to be displayed per page. This allows the user to customize the pagination settings according to their preference. Additionally, there are forward and previous buttons to navigate through the pages of student details.

In summary, the web application's index.jsp page showcases a student registration form. Upon submission, the form data is stored in the database. Clicking the "Click here to display student details" button retrieves all the student details and presents them in a table. The pagination feature allows users to control the number of students displayed per page, and navigation buttons facilitate moving forward and backward through the student details pages.
