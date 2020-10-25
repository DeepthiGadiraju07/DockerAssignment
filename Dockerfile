#For a light weight image size, we are using alpine
FROM alpine
WORKDIR /home/deepthigadiraju
COPY WordCount.java /home/deepthigadiraju

#Here we are setting up Java 

RUN apk add openjdk8
ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV PATH $PATH:$JAVA_HOME/bin
#creating the folder to save the result text file
RUN mkdir -p /home/output

RUN javac WordCount.java

ENTRYPOINT java WordCount 