# 后台监库实现使用方式：
1. build.gradle的 dependencies 增加:

    compile 'com.github.weizeng:SmartServicePublisher:1.0'

2. 工程项目的 build.gradle 设置如下:
minSdkVersion 15
targetSdkVersion 15

否则可能导致闪退

3. 拷贝项目里面的jnilibs里面所有的so到你的项目的app/src/main/Jnilibs目录下。


#发布:
1. 点击github上的release， 点击create a new release 编辑版本号
2. 进入jitpack.io，授权登陆，完成后搜索你刚刚提交的库的名称
3. 点击对应版本，点击git it，稍等片刻，便可在jitpack.io上搜索到我们自己的库，导入到项目中
4. 在Project当前目录下的build.gradle, 增加如下
allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}

然后在对应的模块增加 如
dependencies {
    compile 'com.github.weizeng:SmartServicePublisher:1.2'
}

