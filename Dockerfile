# Use OpenJDK 21 as the base image
FROM openjdk:21

# Declare build-time arguments
ARG SERVICE_NAME
ARG MAINTAINER
ARG JAR_FILE_PATH
ARG JAR_FILE_NAME

# Set environment variables for runtime
ENV SERVICE_NAME=${SERVICE_NAME}
ENV JAR_FILE_NAME=${JAR_FILE_NAME}
ENV APP_HOME=/opt/${SERVICE_NAME}

# Add maintainer metadata
LABEL maintainer="${MAINTAINER}"

# Create the application directory
RUN mkdir -p ${APP_HOME}

# Copy the JAR file to the application directory
COPY ${JAR_FILE_PATH} ${APP_HOME}/

# Expose the application port
EXPOSE 9000

# Set the working directory
WORKDIR ${APP_HOME}

# Use shell form of ENTRYPOINT so variables are expanded
ENTRYPOINT java -jar /opt/${SERVICE_NAME}/${JAR_FILE_NAME}
