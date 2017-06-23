# 后台监库实现使用方式：
1. build.gradle的 dependencies 增加:

    compile 'com.github.weizeng:SmartServicePublisher:1.0'

2. 工程项目的 build.gradle 设置如下:
minSdkVersion 15
targetSdkVersion 15

否则可能导致闪退

3. 拷贝项目里面的jnilibs里面所有的so到你的项目的app/src/main/Jnilibs目录下。
