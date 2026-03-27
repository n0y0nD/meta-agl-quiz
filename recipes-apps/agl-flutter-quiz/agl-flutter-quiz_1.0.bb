SUMMARY = "AGL Flutter Quiz App"
DESCRIPTION = "Flutter quiz App"
LICENSE = "MIT"

SRC_URI = "file://."

S = "${WORKDIR}"

do_install() {
    install -d ${D}/opt/agl-flutter-quiz
    cp -r ${WORKDIR}/* ${D}/opt/agl-flutter-quiz
}

FILES:${PN} += "/opt/agl-flutter-quiz"

