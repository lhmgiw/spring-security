# Spring Security
This repository contains a Spring application that demonstrates the implementation of Spring Security, a powerful framework for securing your Spring-based applications.

## Introduction
Spring Security is a highly customizable and robust security framework that helps protect your application from various security threats. It provides a wide range of security features, including authentication, authorization, and protection against common web vulnerabilities.

This repository contains a sample Spring application that demonstrates the integration of Spring Security. The application showcases basic user authentication, allowing you to customize and build upon it for your specific security requirements.

## Branches
This repository has multiple branches to demonstrate different user implementations:

1. hardcode-user: This branch demonstrates the hardcoding of user details directly into the application. Check out this branch to see how to configure an in-memory user details manager with hardcoded user information.

2. db-user: This branch showcases loading user details from a database. You can explore this branch to understand how to integrate Spring Security with a database for user authentication.

3. OAuth2: This branch illustrates the implementation of OAuth2 for securing your application with token-based authentication. You can use this branch to learn how to set up OAuth2 authentication with a third-party provider.

Switch between branches to see the differences in user implementations and security configurations

## Dependencies used
* Spring Boot Starter Security
* Spring Data JPA
* Tomcat Jasper
* MySQL Connector Java
* Lombok
* Spring Security Oauth2 Autoconfigure

## Prerequisites
1. To run this project, you need to install;
* Java 8
* IDE like InteliJ idea
* MySQL Workbench
2. Create database called "test_db"
3. Create user table and add a user mannually

## Features
* User authentication with username and password.
* User autheticaton by using Gmail.

## Contributing
Welcome contributions to enhance the functionality and security of this Spring application. If you find any issues or want to add new features, feel free to open an issue or submit a pull request. Your contributions are greatly appreciated.

## License
[MIT](https://choosealicense.com/licenses/mit/)
