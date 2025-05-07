SUMMARY = "A console-only image that supports a PCIe endpoint."

LICENSE = "MIT"

CORE_IMAGE_EXTRA_INSTALL += " \
	pciutils pci-ep-scripts \
	nvme-cli nvmetcli ktls-utils \
	tcpdump ethtool \
	blktests \
	strace \
	"

PREFERRED_PROVIDER_virtual/kernel = "linux-yocto-dev"

inherit core-image
