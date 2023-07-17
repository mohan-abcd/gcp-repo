# FROM rhel7
# RUN apt update
# RUN mkdir /home/mohan
# RUN cd /home/mohan
# COPY ./home/mohan
# WORKDIR /home/mohan
# EXPOSE 80
# CMD ["java", "-jar","hello.jar"]

FROM registry.access.redhat.com/rhel7
#RUN  yum update
RUN mkdir /home/mohan
#RUN cd /home/mohan
#COPY ./home/mohan 
#COPY /home/mohan_gurrampati/gcp-repo/hello-app/hello.jar /app/service.jar
COPY hello.jar hello.jar
WORKDIR /home/mohan
EXPOSE 80
CMD ["java", "-jar","/app/hello.jar"]
