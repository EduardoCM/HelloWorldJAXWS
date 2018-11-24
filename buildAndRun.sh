#!/bin/sh
mvn clean package && docker build -t com.certificatic/HelloWorldJAXWS .
docker rm -f HelloWorldJAXWS || true && docker run -d -p 8080:8080 -p 4848:4848 --name HelloWorldJAXWS com.certificatic/HelloWorldJAXWS 
