SUMMARY = "AGL GSoC 2026 Flutter Quiz App"
DESCRIPTION = "Flutter app showing AGL version, name, image and sound"
AUTHOR = "Nayanjyoti Das"
HOMEPAGE = "https://github.com/n0y0nD/agl-flutter-quiz-app"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0"

SRC_URI = "git://github.com/n0y0nD/agl-flutter-quiz-app.git;protocol=https;branch=main"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

inherit flutter-app

FLUTTER_APPLICATION_PATH = "."
FLUTTER_BUILD_ARGS = "bundle"

RDEPENDS:${PN} += "mpg123"

FILES:${PN} += "${datadir}/agl-flutter-quiz"
