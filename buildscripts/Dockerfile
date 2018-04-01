FROM maven:3.5.3-jdk-10

# Overwrite with our local build script
ADD build.sh /build.sh
RUN chmod 755 /build.sh

# Make sure our working dir exists
RUN mkdir -p /build
WORKDIR /build

# This entrypoint.sh is defined in the base container
ENTRYPOINT ["/build.sh"]
