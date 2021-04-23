package com.github.surzia.proxy.codec;

public class RemoteImage implements Image {

    private String remoteHost;
    protected String fileNameWithPath;

    public RemoteImage(String remoteHost, String fileNameWithPath) {
        this.remoteHost = remoteHost;
        this.fileNameWithPath = fileNameWithPath;
        load();
    }

    @Override
    public void load() {
        System.out.printf("RemoteImage: Loading image: 'smb:\\\\%s\\%s'.\n", remoteHost, fileNameWithPath);
    }

    @Override
    public void show() {
        System.out.printf("RemoteImage: Showing image: 'smb:\\\\%s\\%s'.\n", remoteHost, fileNameWithPath);
    }

    @Override
    public void showSummary() {
        System.out.printf("RemoteImage: Showing Summary of image: 'smb:\\\\%s\\%s'.\n", remoteHost, fileNameWithPath);
    }

    @Override
    public void resize() {
        System.out.printf("RemoteImage: Resizing image: 'smb:\\\\%s\\%s'.\n", remoteHost, fileNameWithPath);
    }

    @Override
    public void remove() {
        System.out.printf("RemoteImage: Removing image: 'smb:\\\\%s\\%s'.\n", remoteHost, fileNameWithPath);
    }

    @Override
    public void close() {
        System.out.printf("RemoteImage: Closing image: 'smb:\\\\%s\\%s'.\n", remoteHost, fileNameWithPath);
    }

    public String getRemoteHost() {
        return remoteHost;
    }

    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
    }

    public String getFileNameWithPath() {
        return fileNameWithPath;
    }

    public void setFileNameWithPath(String fileNameWithPath) {
        this.fileNameWithPath = fileNameWithPath;
    }
}
