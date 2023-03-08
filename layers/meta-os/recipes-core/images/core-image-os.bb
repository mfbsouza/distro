SUMMARY = "Basic OS image recipe"
LICENSE = "MIT"

# core files fo basic console boot
IMAGE_INSTALL = " \
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    packagegroup-core-ssh-openssh \
    packagegroup-base \
    ${CORE_IMAGE_EXTRA_INSTALL}"

# image features
#IMAGE_FEATURES += " package-management"
EXTRA_IMAGE_FEATURES ?= "allow-empty-password"

# image file system type
#IMAGE_FSTYPES += "iso"

add_rootfs_version () {
    printf "CORE OS \\\n \\\l\n" > ${IMAGE_ROOTFS}/etc/issue
    printf "CORE OS %%h\n" > ${IMAGE_ROOTFS}/etc/issue.net
}

# add the rootfs version to the welcome banner
ROOTFS_POSTPROCESS_COMMAND += " add_rootfs_version;"

inherit core-image
