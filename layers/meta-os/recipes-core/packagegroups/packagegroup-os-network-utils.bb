DESCRIPTION = "Packagegroup used to provide network utilities"
SUMMARY = "OS Packagegroup - Network Utils"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    dnsmasq \
    ntp \
    tcpdump \
    traceroute \
    dhcpcd \
    ethtool \
    iputils \
"
