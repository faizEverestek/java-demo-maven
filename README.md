# MICRO_SERVICE_NAME

## Prerequisites

Ensure you have the following installed on your system:

1. **Java 21**

   Verify Java installation:
   ```bash
   java -version
   ```

2. **Maven** (if you are using Maven as the build tool):

   Verify Maven installation:
   ```bash
   mvn -v
   ```

3. **Gradle** (if you are using Gradle as the build tool):

   Verify Gradle installation:
   ```bash
   gradle -v
   ```

## Clone the Repository

Use the following command to clone the Git repository:
```bash
git clone <repository_url>
```

Replace `<repository_url>` with the URL of your Git repository.

## Build the Project

You can build the project using either Maven or Gradle. Choose the one you prefer or have installed.

### Using Maven:
```bash
./mvnw clean install
```

### Using Gradle:
```bash
./gradlew build
```

## Run the Project

After building the project, use the following command to run the application:

### Using Maven:
```bash
java -jar target/<JAR_FILE_NAME>.jar
```
### Using Gradle:
```bash
java -jar build/libs/<JAR_FILE_NAME>.jar
```

Replace `<version>` with the actual version of the built jar file (e.g., `1.0.0`).

## Access Swagger UI

Once the application is running, you can access the Swagger UI in your browser at:
```
http://localhost:8080/swagger-ui/index.html
```

## Integrate with CircleCI

To integrate the project with CircleCI and test it, follow these steps:

1. **Update the Existing `.circleci/config.yml` File**:

   Ensure it includes jobs for building and testing your project.

2. **Add the Repository to CircleCI**:

   - Log in to [CircleCI](https://circleci.com/).
   - Add your Git repository to CircleCI.

3. **Push Changes to Trigger the Build**:

   Commit and push updates to your `.circleci/config.yml` file if necessary:
   ```bash
   git add .circleci/config.yml
   git commit -m "Update CircleCI configuration"
   git push origin <branch_name>
   ```

   Replace `<branch_name>` with the branch you want to push to.

4. **Verify Build and Tests**:

   CircleCI will automatically start the pipeline for your project. Check the status of your builds and tests in the CircleCI dashboard.
