# The rest APIs for the conversion between roman numerals and digits  
It is the Rest API for conversion between roman numeral and digit. Each conversion will be saved as a history. 
There is also a rest API to retrieve the whole history. It is ready for pagination in backend. The front is not done yet.
## Local development
 Install locally mysql 5.7.
 
 Create a database called roman-numeral in mysql for local development.
 
 Uncomment the spring.datasource.url and spring.flyway.url for local dev env in application.properties.
 Comment out the spring.datasource.url and spring.flyway.url for Docker config in application.properties.

To run application local, run 

```console
$ mvn spring-boot:run
``` 
## build docker images and run containers in docker

Download the deployment project from github.
Go to deployment project folder
Then follow instructions in readme file.
 
