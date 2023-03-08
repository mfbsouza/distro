SUMMARY = "Basic OS image recipe"
LICENSE = "MIT"

inherit core-image

# image features
IMAGE_FEATURES += " \
    debug-tweaks \
    tools-profile \
    tools-debug \
    package-management \
    ssh-server-openssh \
    "

# core image installs
CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-core-full-cmdline \
    packagegroup-os-shell-utils \
    "

# image file system type
#IMAGE_FSTYPES += "iso"

add_rootfs_version () {
    printf "CORE OS \\\n \\\l\n" > ${IMAGE_ROOTFS}/etc/issue
    printf "CORE OS %%h\n" > ${IMAGE_ROOTFS}/etc/issue.net
}

# add the rootfs version to the welcome banner
ROOTFS_POSTPROCESS_COMMAND += " add_rootfs_version;"
