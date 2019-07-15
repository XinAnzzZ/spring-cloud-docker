#!/bin/bash

# 获取当前脚本所在路径，也就是项目根目录
WORK_PATH=$(dirname $(readlink -f $0));

cd ${WORK_PATH}

git pull --rebase origin master

mvn clean install -Dmaven.test.skip

# 停止并删除容器
docker stop service-02-api
docker rm service-02-api

# 删除镜像文件
docker rmi spring-boot/service-02-api

cd ${WORK_PATH}/service-02-api

# 打包镜像文件
mvn docker:build

# 启动
docker run -d -p 9002:9002 --name=service-02-api spring-boot/service-02-api