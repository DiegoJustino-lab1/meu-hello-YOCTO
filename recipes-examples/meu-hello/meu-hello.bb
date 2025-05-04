# recipes-examples/meu-hello/meu-hello.bb
DESCRIPTION = "Meu exemplo simples Yocto Hello World"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://hello.c;md5=0e4081dfd598fad9e1d324af0d74500f"

PV = "1.0"
PR = "r0"

SRC_URI = "file://hello.c"

S = "${WORKDIR}"

inherit coreutils

# Compila o código C

do_compile() {
    ${CC} ${CFLAGS} -o hello hello.c
}

# Instala o binário em /usr/bin do sistema alvo

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hello ${D}${bindir}/
}

FILES_${PN} = "${bindir}/hello"