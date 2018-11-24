FROM airhacks/glassfish
COPY ./target/HelloWorldJAXWS.war ${DEPLOYMENT_DIR}
