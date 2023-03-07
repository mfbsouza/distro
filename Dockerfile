FROM debian:unstable

LABEL desc="This images is used to build the OS using Yocto \
it's meant to have all build dependencies pre-installed"

# set user to root
USER root

# update the system
RUN apt update && apt upgrade -y

# install dependencies
RUN apt install -y gawk wget git diffstat unzip texinfo gcc \
	build-essential chrpath socat cpio python3 python3-pip \
	python3-pexpect xz-utils debianutils iputils-ping python3-git \
	python3-jinja2 libegl1-mesa libsdl1.2-dev pylint \
	python3-subunit mesa-common-dev zstd liblz4-tool \
	locales php-dev libpq-dev php-pgsql

# locale
RUN localedef -i en_US -f UTF-8 en_US.UTF-8
ENV LANG en_US.UTF-8

# create builder user with uid 1000
RUN useradd -u 1000 builder

USER builder
WORKDIR /opt/Yocto-4.0-UTM-2.3
CMD ./scripts/build-utm-image-genericx86-64.sh
