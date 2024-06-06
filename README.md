# Spring-Boot-Projects


![image](https://github.com/zzahir1978/Spring-Boot-Projects/assets/65801670/e1b7e0c8-b27d-4075-9c8a-beb7243038ef)



## Backend Training
### Prerequisite

Basic Java Knowledge: Ensure you are comfortable with fundamental Java concepts such as object-oriented programming, data types, control structures, exception handling, and collections.

### Training Outline
#### 1. Setup & Study
  - Maven:
    - Learn how to use Maven for project management and build automation.
    - Understand the structure of a pom.xml file and how to define dependencies.
    - Familiarize yourself with common Maven commands (mvn clean install, mvn package, etc.).
    - Download apache maven here: https://maven.apache.org/download.cgi
  - Tomcat:
    - Understand the role of Tomcat as a web server and servlet container.
    - Learn how to configure Tomcat to deploy Spring Boot applications.
    - Explore the basic configuration files (server.xml, context.xml).
    - Download tomcat here: https://tomcat.apache.org/index.html
  - MySQL:
    - Install and configure MySQL database.
    - Learn how to create databases and tables.
    - Understand how to connect a Spring Boot application to MySQL using JDBC or JPA.
    - Download mySQL here: https://www.mysql.com/downloads/
#### 2. SVN, Gitlab
  - SVN:
    - Learn the basics of Subversion (SVN) for version control.
    - Understand how to check out, update, commit, and revert changes.
  - GitLab:
    - Explore GitLab for source code management and CI/CD pipelines.
    - Learn how to clone repositories, create branches, merge requests, and manage projects in GitLab.
#### 3. Java Coding Convention
  - Follow standard Java coding conventions to ensure readability and maintainability.
  - Naming conventions: Classes (PascalCase), methods and variables (camelCase), constants (UPPERCASE).
  - Code structure: Proper indentation, spacing, and use of comments.
  - Best practices: Write clean, modular, and well-documented code.
##### 4. Java Webapp Structure with Spring MVC
  - Package Convention:
    - View: Controllers managing form submissions or API endpoints.
    - Service: Classes containing business logic.
    - Entity: JPA entities, enums, and indexing configurations.
    - Repo: Data access layer using DAOs or JdbcTemplate.
  - Configuration Properties:
    - Use application.properties or application.yml for externalized configuration.
    - Configure database connections, server ports, logging, and other settings.
  - Maven Profile:
    - Learn to create Maven profiles for different environments (development, testing, production).
    - Understand how to activate profiles and manage environment-specific configurations.
  - Messages Properties (Internationalization - i18n):
    - Use messages.properties files to support multiple languages.
    - Implement internationalization in your application to cater to a global audience.
#### 5. Frontend
  - JSP (JavaServer Pages):
    - Jakarta Server Pages (JSP; formerly JavaServer Pages) is a collection of technologies that helps software developers create dynamically generated web pages based on HTML, XML, SOAP, or other document types.
    - Understand how to create dynamic web pages using JSP.
    - Learn to use JSP tags and expressions to embed Java code in HTML.
  - JSTL (JavaServer Pages Standard Tag Library):
    - JavaServer Pages Tag Library (JSTL) is a set of tags that can be used for implementing some common operations such as looping, conditional formatting, and others.
    - Use JSTL for common tasks like iteration, conditionals, and formatting.
  - DisplayTag:
    - Implement DisplayTag for table rendering and pagination in JSP pages.
  - Bootstrap:
    - Use Bootstrap for responsive and mobile-first front-end development.
    - Learn to apply Bootstrap components and CSS classes for styling.
    - Visit bootstrap page here: https://getbootstrap.com/
  - JavaScript:
    - Enhance interactivity and user experience with JavaScript.
    - Learn to manipulate the DOM and handle events.
#### 6. Spring
  - Controller:
    - Define Spring MVC controllers to handle HTTP requests and responses.
    - Use annotations like @Controller and @RequestMapping.
  - Service:
    - Implement service layer for business logic with @Service annotation.
    - Ensure separation of concerns by keeping business logic separate from controllers.
  - Validation:
    - Use @Valid and BindingResult for input validation.
    - Implement custom validators if needed.
  - REST API:
    - Build RESTful APIs using Spring Boot.
    - Test APIs using Postman or similar tools.
#### 7. Spring Data JPA (Hibernate)
  - Entity:
    - Define JPA entities with @Entity annotation.
    - Map entities to database tables using annotations like @Table, @Column.
  - Relationship:
    - Understand and implement entity relationships:
    - One To One: @OneToOne
    - One To Many: @OneToMany
    - Many To One: @ManyToOne
    - Many To Many: @ManyToMany
#### 8. Unit Test
  - Test Resources:
    - Configure test-specific properties in application.properties or application.yml.
  - Test Purpose:
    - Write unit tests to verify the functionality of individual components.
    - Use JUnit and Mockito for testing.
  - Efficiency:
    - Run tests to quickly validate changes without deploying the application.
    - Save time by automating repetitive tasks.
#### 9. Logging
  - Best Practices:
    - Avoid using System.out.println. Use a logging framework like Logback or Log4j.
    - Configure logging levels (DEBUG, INFO, WARN, ERROR) in application.properties.
    - Use placeholders for logging messages to improve performance (logger.debug("Value: {}", value)).

Notes:-
1. In SpringSecurityConfig.java ; username == admin ; password == Def@u1tP@ssw0rd!
