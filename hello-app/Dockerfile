FROM registry.access.redhat.com/ubi8/ubi:latest

RUN yum update -y && yum -y install java-17-openjdk && \
    java -version

RUN curl -O https://downloads.apache.org/tomcat/tomcat-10/v10.1.11/bin/apache-tomcat-10.1.11.tar.gz && \
    tar xvf apache-tomcat-10.1.11.tar.gz -C /opt/tomcat/ --strip-components=1

RUN useradd --system -U --create-home --home-dir /opt/tomcat -s /bin/false tomcat && \
    chown -R tomcat:tomcat /opt/tomcat/ && \
    chmod -R u+x /opt/tomcat/bin

USER tomcat
