FROM alpine
WORKDIR /home/deepthigadiraju
COPY WordCount.java /home/deepthigadiraju

#ADD data/ /home/data

RUN apk add openjdk8
ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV PATH $PATH:$JAVA_HOME/bin

RUN mkdir -p /home/output

RUN javac WordCount.java

#ENTRYPOINT java WordCount

ENTRYPOINT java WordCount 