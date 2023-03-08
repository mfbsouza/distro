DESCRIPTION = "Packagegroup providing some useful shell programs"
SUMMARY = "OS packagegroup - shell utilities"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    vim \
    tmux \
    curl \
    wget \
    sed \
    gawk \
    rsync \
"
