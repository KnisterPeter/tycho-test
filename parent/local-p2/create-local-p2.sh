#!/bin/sh

DIR=$(dirname $0)
ECLIPSE_HOME=/home/markusw/apps/eclipse

cd ${DIR}
DIR=$(pwd)
TARGET=${DIR}/local-repo

[ -d ${TARGET} ] && rm -r ${TARGET}

java \
  -jar ${ECLIPSE_HOME}/plugins/org.eclipse.equinox.launcher_1.3.0.v20120522-1813.jar \
  -application org.eclipse.equinox.p2.publisher.FeaturesAndBundlesPublisher \
  -metadataRepository file:${TARGET} \
  -artifactRepository file:${TARGET} \
  -source target-plat \
  -configs gtk.linux.x86 \
  -publishArtifacts
