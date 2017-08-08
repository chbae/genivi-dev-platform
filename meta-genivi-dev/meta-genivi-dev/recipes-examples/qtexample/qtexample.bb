# Copyright (C) 2017 GENIVI Alliance

SUMMARY = "QT Example"
LICENSE = "CLOSED"

DEPENDS = "qtbase"

inherit qmake5

SRCREV = "4406420143927df14f29e1fed5f9ae9cc2b4506d"
SRC_URI = "git://github.com/chbae/qtexample"
S = "${WORKDIR}/git"

FILES_${PN} += "\
    ${datadir}/application \
    ${datadir}/icons \
"
