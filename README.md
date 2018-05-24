# MS3TechnicalChallenge
A client has requested a web application that calls an API-enabled backend utilizing an algorithm.  The backend algorithm takes in 2 integers representing a range, and converts each number in the range. Multiples of 7 convert to “MS3”, multiples of 3 convert to “ME”, and multiples of both 7 and 3 convert to “MS3 and ME”.  The algorithm should be created in the most optimized way possible. The input range has a limit from a minimum of 1 to a maximum of 200. Ideally, users should be able to query inputs HTTP API calls

## Getting Started

### Prerequisites
* Git
* JDK 8 or later
* Maven 3.0 or later

### Clone
To get started you can simply clone this repository using git:
```
git clone https://github.com/naresh228159/MS3TechnicalChallenge
cd MS3TechnicalChallenge-template
```
### Build an executable JAR
You can run the application from the command line using:
```
mvn spring-boot:run
```
Or you can build a single executable JAR file that contains all the necessary dependencies, classes, and resources with:
```
mvn clean package
```
Then you can run the JAR file with:
```
java -jar target/*.jar
