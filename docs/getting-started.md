# firt time steps with using yocto

### env

from home project folder run:

	$ source layers/poky/oe-init-build-env <build_folder_name_here>

### configure sstate-cache and downloads folder

edit conf/local.conf and add:

	MACHINE = "qemux86-64"
	DL_DIR = "${TOPDIR}/../downloads"
	SSTATE_DIR = "${TOPDIR}/../sstate-cache/${MACHINE}"

### configure conf/bblayers.conf to use relative path

edit conf/bblayers.conf and change to:

	${TOPDIR}/..

### start the build

	$ bitbake -k core-image-minimal

### testing

	$ runqemu qemux86-64 nographic

## creating and adding layers

	$ mkdir -p ../layers
	$ bitbake-layers create-layer ../layers/meta-os
	$ bitbake-layers add-layer ../layers/meta-os
	$ bitbake-layers show-layers
