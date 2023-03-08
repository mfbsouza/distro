DESCRIPTION = "Packagegroup used to provide python 3"
SUMMARY = "OS Packagegroup - Python 3"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    python3-modules \
    python3-dev \
    python3-pip \
"
