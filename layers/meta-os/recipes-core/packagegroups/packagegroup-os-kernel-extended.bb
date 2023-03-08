DESCRIPTION = "Packagegroup used to provide linux kernel modules and tools"
SUMMARY = "OS Packagegroup - Kernel Modules and Tools"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    kernel-modules \
    util-linux \
"
