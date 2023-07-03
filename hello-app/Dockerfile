FROM centos:8
ENV PATH=$PATH:/opt/java/jdk-17/bin
WORKDIR /opt/app
RUN curl  https://packages.ubuntu.com/focal-updates/openjdk-17-jdk
RUN tar -xzf openjdk-17_linux-x64_bin.tar.gz && \
    rm -rf openjdk-17_linux-x64_bin.tar.gz
RUN go mod init hello-app
ADD UserActivation-V2.jar UserActivation-V2.jar
EXPOSE 80
COPY *.go ./
CMD java - jar UserActivation-V2.jar

FROM gcr.io/distroless/base-debian11
WORKDIR /opt/java
COPY --from=builder /hello-app /hello-app
ENV PORT 80
USER nonroot:nonroot
CMD ["/hello-app"]

# FROM golang:1.19.2 as builder
# WORKDIR /app
# RUN go mod init hello-app
# COPY *.go ./
# RUN CGO_ENABLED=0 GOOS=linux go build -o /hello-app

# FROM gcr.io/distroless/base-debian11
# WORKDIR /
# COPY --from=builder /hello-app /hello-app
# ENV PORT 8080
# USER nonroot:nonroot
# CMD ["/hello-app"]

# # Copyright 2022 Google LLC
# #
# # Licensed under the Apache License, Version 2.0 (the "License");
# # you may not use this file except in compliance with the License.
# # You may obtain a copy of the License at
# #
# #     http://www.apache.org/licenses/LICENSE-2.0
# #
# # Unless required by applicable law or agreed to in writing, software
# # distributed under the License is distributed on an "AS IS" BASIS,
# # WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# # See the License for the specific language governing permissions and
# # limitations under the License.

# FROM golang:1.19.2 as builder
# WORKDIR /app
# RUN go mod init hello-app
# COPY *.go ./
# RUN CGO_ENABLED=0 GOOS=linux go build -o /hello-app

# FROM gcr.io/distroless/base-debian11
# WORKDIR /
# COPY --from=builder /hello-app /hello-app
# ENV PORT 8080
# USER nonroot:nonroot
# CMD ["/hello-app"]
