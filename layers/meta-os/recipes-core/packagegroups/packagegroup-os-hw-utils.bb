DESCRIPTION = "Packagegroup providing some useful hardware profiling tools"
SUMMARY = "OS packagegroup - hardware tools"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    lshw \
    lmsensors \
"
