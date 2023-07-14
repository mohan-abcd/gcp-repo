FROM rhel7
RUN apt update
RUN mkdir /home/mohan
RUN cd /home/mohan
COPY ./home/mohan
WORKDIR /home/mohan
EXPOSE 80
CMD ["java", "-jar","hello.jar"]
