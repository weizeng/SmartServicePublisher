package com.daniulive.smartpublisher;

/**
 * Created by leo on 17/6/23.
 */

public class MonitorParamsKey {
    // 推送类型， 0: screenType 1: camera
    public final static String pushType = "PUSHTYPE";
    // 视频宽
    public final static String camerawidth = "CAMERAWIDTH";
    // 视频高
    public final static String cameraheight = "CAMERAHEIGHT";
    // 截屏分辨率
    public final static String screenresolution = "SCREENRESOLUTION";
    // 前后摄像头 1：前置摄像头标记 2:后置摄像头标记
    public final static String switchcamera = "SWITCHCAMERA";
    // 推送地址
    public final static String publishurl = "PUBLISHURL";
    // 是否本地保存录制
    public final static String recorder = "RECORDER";
    // 是否硬解码 true: 硬解码 false: 软解码
    public final static String hwencoder = "HWENCODER";
    // 录制音屏地址
    public final static String recoderDir = "RecoderDir";
}
