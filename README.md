
# Monitoring K8s

This project is an application to provide a global and simple view of what is on a Kubernetes cluster. 

Currently in development

# Steps to run the project locally

 1. Fork the project
 2. Install Maven/Java
 3. Run the project
 4. Verify the application is up

# Fork the project

Clone the Gitlab project on your local machine using:
> $ cd /Users/your-user/Documents/Projects
> $ git clone git@github.com:nonoswz/monitoring-k8s.git

## Install Maven/Java
Follow the Maven documentation to install Maven [http://maven.apache.org/install.html](http://maven.apache.org/install.html)

Follow the Oracle documentation to install Java 11 [https://www.oracle.com/ca-en/java/technologies/javase-jdk11-downloads.html](https://www.oracle.com/ca-en/java/technologies/javase-jdk11-downloads.html)



## Run the project

Go to the project and start the application with Maven as follows

> $ cd monitoring-k8s
> $ ./mvnw spring-boot:run


## Verify the application is up

You can verify the application is up and running by checking the status 
> $  curl localhost:8080/actuator/health
{"status":"UP"}